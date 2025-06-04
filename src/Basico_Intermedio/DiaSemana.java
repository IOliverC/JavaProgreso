package Basico_Intermedio;

import java.util.Scanner;

public class DiaSemana {

    private int dia;
    private String diaSemana;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número: ");
        int dia= scanner.nextInt();

        scanner.close();

        DiaSemana diaResuelto = new DiaSemana(dia);
        String resultado = diaResuelto.obtenerDiaSemana();

        System.out.println(resultado);

    }

    public DiaSemana(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String obtenerDiaSemana(){

        switch (dia){
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Número inválido, selecciona un número del 1 al 7";
        }
        return diaSemana;
    }
}
