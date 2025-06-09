package MaquinaExpendedora;

import java.util.ArrayList;
import java.util.List;

public class Bebidas {
    private static final List<Bebida> bebidas;

    static {
        bebidas = new ArrayList<>();
        bebidas.add(new Bebida("Agua", 20));
    }

    public static void agregarBebida(Bebida bebida){
        bebidas.add(bebida);
    }

    public static void mostrarBebidas(){
        System.out.println("--- Bebidas en el Inventario ---");
        bebidas.forEach(System.out::println);
    }

    public static List<Bebida> getBebidas(){
        return bebidas;
    }
}
