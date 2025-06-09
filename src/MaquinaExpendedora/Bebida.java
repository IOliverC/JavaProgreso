package MaquinaExpendedora;

import java.io.Serializable;
import java.util.Objects;

public class Bebida implements Serializable {
    private static int contadorBebidas = 0;
    private int idBebida;
    private String nombre;
    private double precio;

    public Bebida(){
        this.idBebida = ++Bebida.contadorBebidas;
    }

    public Bebida(String nombre, double precio){
        this(); // Llamada al constructor sin parámetros
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdBebida() {
        return idBebida;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "idBebida=" + idBebida +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
