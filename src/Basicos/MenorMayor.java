package Basicos;

import java.util.Scanner;

public class MenorMayor {

    private int num1;
    private int num2;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese otro numero: ");
        int num2 = scanner.nextInt();

        calcularMayor(num1, num2);

        scanner.close();
    }

    public MenorMayor(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
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

    public static void calcularMayor(int num1, int num2){

        if (num1 < num2){
            System.out.println("El número " + num2 + " es mayor");
        } else if (num1 > num2){
            System.out.println("El número " + num1 + " es mayor");
        } else {
            System.out.println("Ambos números son iguales");
        }
    }
}
