package Basico_Intermedio;

import java.util.Scanner;

public class NumerosPares {

    private int num;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número: ");
        int num = scanner.nextInt();

        scanner.close();

        NumerosPares numero = new NumerosPares(num);
        String numeroResultado = numero.calcularNumeros();

        System.out.println(numeroResultado);

    }

    public NumerosPares(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String calcularNumeros() {

        if (this.num >= 0) {
            String resultado = "Números pares hasta " + this.num + ": ";

            for (int i = 0; i <= this.num; i++) {
                if (i % 2 == 0) {
                    resultado += i + " ";
                }
            }

            return resultado;
        } else {
            return "Número negativo. No se pueden calcular pares.";
        }
    }
}