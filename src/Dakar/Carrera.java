package Dakar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrera {
    private Double distancia;
    private Integer premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private List<Vehiculo> vehiculoList;

    public Carrera(Double distancia, Integer premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.vehiculoList = new ArrayList<>();
    }


    public void darDeAltaAuto(int velocidad, double aceleracion, double AnguloDeGiro, String patente){
        if(cantidadDeVehiculosPermitidos > vehiculoList.size()){
            vehiculoList.add(new Auto(velocidad, aceleracion, AnguloDeGiro, patente));
        }
    }

    public void darDeAltaMoto(int velocidad, double aceleracion, double AnguloDeGiro, String patente){
        if(cantidadDeVehiculosPermitidos > vehiculoList.size()){
            vehiculoList.add(new Moto(velocidad, aceleracion, AnguloDeGiro, patente));
        }
    }

    public void eliminarVehiculo(Vehiculo v){
        vehiculoList.remove(v);
    }

    public void eliminarVehiculoConPatente(String unaPatente){
        Vehiculo vehiculoABuscar = (Vehiculo) vehiculoList.stream().filter(vehiculo -> vehiculo.getPatente().compareTo(unaPatente) == 0);
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

}
