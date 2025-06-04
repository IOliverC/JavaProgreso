package Basico_Intermedio;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FactorialNumero {

    private int n;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número: ");
        int n= scanner.nextInt();

        scanner.close();

        FactorialNumero numero = new FactorialNumero(n);
        String numeroResultado = numero.calcularFactorial();

        System.out.println(numeroResultado);

    }

    public FactorialNumero(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String calcularFactorial(){

        int resultado = 1;

        if (this.n >= 0){

            for(int i = 1; i <= this.n; i++){
                resultado *= i;
            }
            return "El factorial de " + n + " es: " + resultado;
        }else{
            return "El número es negativo";
        }
    }
}
