package Dakar;

import java.util.List;

public class Carrera {
    private Double distancia;
    private Integer premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private List<Vehiculo> vehiculoList;

    public Carrera(Double distancia, Integer premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos, List<Vehiculo> vehiculoList) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.vehiculoList = vehiculoList;
    }


    public void darDeAltaAuto(int velocidad, double aceleracion, double AnguloDeGiro, String patente){

    }

    public void darDeAltaMoto(int velocidad, double aceleracion, double AnguloDeGiro, String patente){

    }

    public void eliminarVehiculo(Vehiculo v){
        vehiculoList.remove(v);
    }

    public void eliminarVehiculoConPatente(String unaPatente){
        Vehiculo vehiculoABuscar = (Vehiculo) vehiculoList.stream().filter(vehiculo -> vehiculo.getPatente().compareTo(unaPatente) == 0);
        eliminarVehiculo(vehiculoABuscar);
    }
}
