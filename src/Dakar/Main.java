package Dakar;

public class Main {

    public static void main(String[] args) {
        /*Auto a1 = new Auto(80, 2.5, 45, "AUTO_1");
        Auto a2 = new Auto(100, 1.8, 30, "AUTO_2");

        Moto m1 = new Moto(85, 1.5, 75, "MOTO_1");
        Moto m2 = new Moto(120, 0.8, 40, "MOTO_2");*/

        Carrera c = new Carrera(1000.05, 5000, "Grand Tour", 3);

        c.darDeAltaAuto(80, 2.5, 45, "AUTO_1");
        c.darDeAltaAuto(300, 1.8, 30, "AUTO_2");
        c.darDeAltaMoto(120, 0.8, 40, "MOTO_2");

        c.eliminarVehiculoConPatente("AUTO_1");
        c.socorrerAuto("AUTO_2");
        c.socorrerMoto("MOTO_2");
        System.out.println("GANADOR! " + c.getGanador());
    }
}
