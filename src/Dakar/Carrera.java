package Dakar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Carrera {
    private Double distancia;
    private Integer premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private List<Vehiculo> vehiculoList;
    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;

    public Carrera(Double distancia, Integer premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.vehiculoList = new ArrayList<>();
        this.socorristaAuto = new SocorristaAuto();
        this.socorristaMoto = new SocorristaMoto();
    }


    public void darDeAltaAuto(int velocidad, double aceleracion, double AnguloDeGiro, String patente){
        if(cantidadDeVehiculosPermitidos > vehiculoList.size()){
            vehiculoList.add(new Auto(velocidad, aceleracion, AnguloDeGiro, patente));
        } else {
            throw new RuntimeException("No se puede agregar mas vehiculos");
        }
    }

    public void darDeAltaMoto(int velocidad, double aceleracion, double AnguloDeGiro, String patente){
        if(cantidadDeVehiculosPermitidos > vehiculoList.size()){
            vehiculoList.add(new Moto(velocidad, aceleracion, AnguloDeGiro, patente));
        } else {
            throw new RuntimeException("No se puede agregar mas vehiculos");
        }
    }

    public void eliminarVehiculo(Vehiculo v){
        vehiculoList.remove(v);
    }

    public void eliminarVehiculoConPatente(String unaPatente){
        Vehiculo vehiculoABuscar = vehiculoList.stream().filter(vehiculo -> vehiculo.getPatente().compareTo(unaPatente) == 0).collect(Collectors.toList()).get(0);

        eliminarVehiculo(vehiculoABuscar);
    }

    public Vehiculo getGanador(){

        //FORMULA =  Velocidad * 1⁄2 Aceleracion / (AnguloDeGiro*(Peso-Cantidad de Ruedas * 100)

        Map<Double, Vehiculo> results = new HashMap<>();

        for (Vehiculo vehiculo : vehiculoList){
            double result = vehiculo.getVelocidad() * 0.5 * vehiculo.getAceleracion() / (vehiculo.getAnguloDeGiro()* (vehiculo.getPeso() - vehiculo.getRuedas() * 100));
            results.put(result, vehiculo);
        }

        double max = results.keySet().stream().max(Double::compare).get();

        return results.get(max);
    }

    public void socorrerAuto(String patente){
        Auto vehiculoABuscar = (Auto) buscarPorPatente(patente);
        socorristaAuto.socorrer(vehiculoABuscar);
    }

    public void socorrerMoto(String patente){
        Moto vehiculoABuscar = (Moto) buscarPorPatente(patente);
        socorristaMoto.socorrer(vehiculoABuscar);
    }

    public Vehiculo buscarPorPatente(String patente){
        return vehiculoList.stream().filter(vehiculo -> vehiculo.getPatente().compareTo(patente) == 0).collect(Collectors.toList()).get(0);
    }

}
