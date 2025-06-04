package Basico_Intermedio;

import java.util.Scanner;

public class NumerosIguales {

    private int num1;
    private int num2;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        scanner.close();

        NumerosIguales calculoIguales = new NumerosIguales(num1, num2);
        String resultado = calculoIguales.calcularIguales();

        System.out.println(resultado);
    }

    public NumerosIguales(int num1, int num2) {
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

    public String calcularIguales(){
        if(this.num1 == this.num2) {
            return this.num1 + " es igual que " + this.num2;
        }else{
            return this.num1 + " no es igual que " + this.num2;
        }
    }
}
