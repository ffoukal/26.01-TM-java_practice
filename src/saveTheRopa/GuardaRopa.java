package saveTheRopa;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {

    private Map<Integer, List<Prenda>> diccionario;
    private Integer contador;

    public GuardaRopa() {
        this.contador = 1;
        this.diccionario = new HashMap<>();
    }

    public Integer guardarPrendas(List<Prenda> listaDePrenda){
        this.diccionario.put(contador, listaDePrenda);
        return contador++;
    }

    public void mostrarPrendas(){
        for (Map.Entry<Integer, List<Prenda>> entry : diccionario.entrySet()){
            System.out.println( "GuardaRopa N" + entry.getKey() + " - " + entry.getValue().toString());
        }
    }

    public List<Prenda> devolverPrendas(Integer numero){
        return diccionario.remove(numero);
    }




}
