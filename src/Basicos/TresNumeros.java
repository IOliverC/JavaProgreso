package Basicos;

import java.util.Scanner;

public class TresNumeros {

    private int num1;
    private int num2;
    private int num3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        TresNumeros numeros = new TresNumeros(num1, num2, num3);
        int mayor = numeros.calcularMayor(num1, num2, num3);

        System.out.println("El número mayor de los tres es el: " + mayor);

        scanner.close();

    }

    public TresNumeros(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int calcularMayor(int num1, int num2, int num3) {
        int mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        return mayor;
    }
}
