package Basico_Intermedio;

import java.util.Scanner;

public class AñoBisiesto {

    private boolean year;
    private int usuarioYear;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un año: ");
        int usuarioYear = scanner.nextInt();

        scanner.close();

        AñoBisiesto añoBisiesto = new AñoBisiesto (usuarioYear);
        boolean esBisiesto = añoBisiesto.calcularBisiesto(usuarioYear);

        if (esBisiesto) {
            System.out.println("El año " + usuarioYear + " es bisiesto.");
        } else {
            System.out.println("El año " + usuarioYear + " no es bisiesto.");
        }
    }

    public AñoBisiesto(int usuarioYear) {
        this.year = false;
        this.usuarioYear = usuarioYear;
    }

    public boolean isYear() {
        return year;
    }

    public void setYear(boolean year) {
        this.year = year;
    }

    public int getUsuarioYear() {
        return usuarioYear;
    }

    public void setUsuarioYear(int usuarioYear) {
        this.usuarioYear = usuarioYear;
    }

    public boolean calcularBisiesto (int usuarioYear){


        if(usuarioYear % 4 == 0 && usuarioYear % 100 != 0 || usuarioYear % 400 == 0 ){
            this.year = true;
        }else{
            this.year = false;
        }
        return this.year;
    }
}
