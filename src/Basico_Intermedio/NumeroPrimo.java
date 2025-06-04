package Basico_Intermedio;

import java.util.Scanner;

public class NumeroPrimo {

    private int num;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número: ");
        int num= scanner.nextInt();

        scanner.close();

        NumeroPrimo calcularResultado = new NumeroPrimo(num);
        String resultado = calcularResultado.calcularPrimo();
        System.out.println(resultado);
    }

    public NumeroPrimo(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String calcularPrimo() {
        if (this.num < 2) {
            return this.num + " no es primo";
        }
        for (int i = 2; i < this.num; i++) {
            if (this.num % i == 0) {
                return this.num + " no es primo";
            }
        }
        return this.num + " es primo";
    }
}
