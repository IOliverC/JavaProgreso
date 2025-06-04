package Basico_Intermedio;

import java.util.Scanner;

public class NotaResultado {

    private double nota;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la nota: ");
        double nota = scanner.nextDouble();

        scanner.close();

        NotaResultado notaCalculada = new NotaResultado(nota);
        String resultado = notaCalculada.calcularNota();
        System.out.println(resultado);

    }

    public NotaResultado(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String calcularNota (){
        if(this.nota < 0 || this.nota > 10) {
            return this.nota + " no es una nota válida";
        }else if(this.nota <= 4 ){
            return this.nota + " es suspenso, no pasas";
        }else if (this.nota == 5){
            return this.nota + " es aprobado justo";
        }else if(this.nota == 6){
            return this.nota + " es bien";
        }else if(this.nota >=7 && this.nota <= 8){
            return this.nota + " es notable";
        }else{
            return this.nota + " es sobresaliente";
        }
    }
}
