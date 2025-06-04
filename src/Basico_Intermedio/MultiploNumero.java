package Basico_Intermedio;
import java.util.Scanner;

public class MultiploNumero {

    private int num1;
    private int num2;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        scanner.close();

        MultiploNumero multiplo = new MultiploNumero(num1, num2);
        String resultado = multiplo.calcularMultiplo();
        System.out.println(resultado);
    }

    public MultiploNumero(int num1, int num2) {
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

    public String calcularMultiplo(){

        if (this.num1 % this.num2 == 0){
            return this.num1 + " es múltiplo de " + this.num2;
        }else{
            return this.num1 + " no es múltiplo de " + this.num2;
        }
    }

}
