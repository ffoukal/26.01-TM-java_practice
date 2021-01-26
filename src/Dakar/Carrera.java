package Dakar;

import java.util.ArrayList;
import java.util.List;

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
            vehiculoList.add(new Auto(velocidad, aceleracion, AnguloDeGiro, patente, 0, 0));
        }
    }

    public void darDeAltaMoto(int velocidad, double aceleracion, double AnguloDeGiro, String patente){
        if(cantidadDeVehiculosPermitidos > vehiculoList.size()){
            vehiculoList.add(new Moto(velocidad, aceleracion, AnguloDeGiro, patente));
        }
    }

}
