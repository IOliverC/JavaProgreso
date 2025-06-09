package Basico_Intermedio;

import java.util.Scanner;

public class TablaMultiplicar2 {

    private int num;
    private int numeroTabla;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número: ");
        int num = scanner.nextInt();
        System.out.println("Ingrese hasta que número quieres calcular: ");
        int numeroTabla = scanner.nextInt();

        scanner.close();

        TablaMultiplicar2 numero = new TablaMultiplicar2(num, numeroTabla);
        String numeroResultado = numero.calcularTabla();

        System.out.println(numeroResultado);

    }

    public TablaMultiplicar2(int num, int numeroTabla) {
        this.num = num;
        this.numeroTabla = numeroTabla;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNumeroTabla() {
        return numeroTabla;
    }

    public void setNumeroTabla(int numeroTabla) {
        this.numeroTabla = numeroTabla;
    }

    public String calcularTabla(){

        String respuesta = "";

        for(int i = 1; i <= this.numeroTabla; i++){
            int multiplicacion = this.num *i;
            respuesta += String.format("%d x %2d = %d\n", this.num, i, multiplicacion);
        }
        return respuesta;
    }
}
