package Dakar;

public class Moto extends Vehiculo{

    public Moto(int velocidad, double aceleracion, double anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente, 300, 2);
    }

    @Override
    public String toString() {
        return "Moto: \n" +
                "velocidad=" + super.getVelocidad() +
                ", aceleracion=" + super.getAceleracion() +
                ", anguloDeGiro=" + super.getAnguloDeGiro() +
                ", patente='" + super.getPatente() + '\'' +
                ", peso=" + super.getPeso() +
                ", ruedas=" + super.getRuedas();
    }
}
