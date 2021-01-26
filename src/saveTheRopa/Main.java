package saveTheRopa;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Prenda> prendasAGuardar = new ArrayList<>();
        Prenda p1 = new Prenda("Adidas", "Buzo");
        Prenda p2 = new Prenda("Reebok", "Remera");

        prendasAGuardar.add(p1);
        prendasAGuardar.add(p2);

        GuardaRopa guardaropa = new GuardaRopa();
        Integer codigo = guardaropa.guardarPrendas(prendasAGuardar);
        System.out.println("Se guardaron sus prendas, el código para la devolución es: " + codigo);
        guardaropa.devolverPrendas(codigo);
        System.out.println("Sus prendas fueron devueltas");
    }
}
