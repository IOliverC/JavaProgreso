package Basicos;

import java.util.Scanner;

public class ParImpar {

    private int num1;
    private boolean par;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num1 = scanner.nextInt();

        ParImpar numeroNuevo = new ParImpar(num1);

        if(numeroNuevo.isPar()){
            System.out.println("El número que has ingresado es par");
        } else {
            System.out.println("El número que has ingresado es impar");
        }
    }

    public ParImpar(int num1) {
        this.num1 = num1;
        this.par = calcularPar(num1);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public boolean isPar() {
        return par;
    }

    public void setPar(boolean par) {
        this.par = par;
    }

    public boolean calcularPar(int num1) {
        return num1 % 2 == 0;
    }
}
