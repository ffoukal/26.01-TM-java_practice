package Dakar;

public class Auto extends  Vehiculo{
    public Auto(int velocidad, double aceleracion, double anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente, 1000, 4);
    }

    @Override
    public String toString() {
        return "Auto: " +
                "velocidad=" + super.getVelocidad() +
                ", aceleracion=" + super.getAceleracion() +
                ", anguloDeGiro=" + super.getAnguloDeGiro() +
                ", patente='" + super.getPatente() + '\'' +
                ", peso=" + super.getPeso() +
                ", ruedas=" + super.getRuedas();
    }
}
