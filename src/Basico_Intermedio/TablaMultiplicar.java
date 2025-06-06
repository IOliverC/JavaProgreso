package Basico_Intermedio;

import java.util.Scanner;

public class TablaMultiplicar {

    private int num;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número: ");
        int num = scanner.nextInt();

        scanner.close();

        TablaMultiplicar numero = new TablaMultiplicar(num);
        String numeroResultado = numero.calcularTabla();

        System.out.println(numeroResultado);

    }

    public TablaMultiplicar(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String calcularTabla(){

        String respuesta = "";

        for(int i = 1; i <= 10; i++){
            int multiplicacion = this.num *i;
            respuesta += this.num + " x " + i + " = " + multiplicacion + "\n";
        }
        return respuesta;
    }

}
