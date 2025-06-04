package Basico_Intermedio;

import java.util.Scanner;

public class PositivoNegativoCero {

    private int num;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número para ver si es positivo, negativo o cero: ");
        int num = scanner.nextInt();

        scanner.close();

    PositivoNegativoCero numeroCalculado = new PositivoNegativoCero(num);
    String resultado = numeroCalculado.calcularNumero(num);
    System.out.println(resultado);

    }

    public PositivoNegativoCero(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String calcularNumero(int num) {
        if (num < 0) {
            return "El número es negativo";
        } else if (num > 0) {
            return "El número es positivo";
        } else {
            return "El número es 0";
        }
    }
}
