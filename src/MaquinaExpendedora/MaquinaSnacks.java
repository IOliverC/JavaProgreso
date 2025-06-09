package MaquinaExpendedora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        iniciarMaquina();
    }

    public static void iniciarMaquina() {
        var salir = false;
        var consola = new Scanner(System.in);
        List<Snack> productos = new ArrayList<>();
        List<Bebida> bebidasCompradas = new ArrayList<>();

        System.out.println("* Maquina Expendedora *");
        Snacks.mostrarSnacks();
        Bebidas.mostrarBebidas();

        while (!salir) {
            try {
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos, bebidasCompradas);
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            } finally {
                System.out.println(); // Salto de línea
            }
        }
    }

    private static int mostrarMenu(Scanner consola) {
        System.out.print("""
                Menu:
                1. Comprar snack
                2. Comprar bebida
                3. Mostrar ticket
                4. Agregar nuevo snack
                5. Agregar nueva bebida
                6. Salir
                Elige una opción: """);
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner consola,
                                            List<Snack> productos, List<Bebida> bebidas) {
        var salir = false;
        switch (opcion) {
            case 1 -> comprarSnack(consola, productos);
            case 2 -> comprarBebida(consola, bebidas);
            case 3 -> mostrarTicket(productos, bebidas);
            case 4 -> agregarSnack(consola);
            case 5 -> agregarBebida(consola);
            case 6 -> {
                System.out.println("Regresa pronto!");
                salir = true;
            }
            default -> System.out.println("Opción inválida: " + opcion);
        }
        return salir;
    }

    private static void comprarSnack(Scanner consola, List<Snack> productos) {
        System.out.print("¿Qué snack quieres comprar (id)? ");
        var idSnack = Integer.parseInt(consola.nextLine());
        var snackEncontrado = false;
        for (var snack : Snacks.getSnacks()) {
            if (idSnack == snack.getIdSnack()) {
                productos.add(snack);
                System.out.println("Snack agregado: " + snack);
                snackEncontrado = true;
                break;
            }
        }
        if (!snackEncontrado) {
            System.out.println("Id de snack no encontrado: " + idSnack);
        }
    }

    private static void comprarBebida(Scanner consola, List<Bebida> bebidas) {
        System.out.print("¿Qué bebida quieres comprar (id)? ");
        var idBebida = Integer.parseInt(consola.nextLine());
        var bebidaEncontrada = false;
        for (var bebida : Bebidas.getBebidas()) {
            if (idBebida == bebida.getIdBebida()) {
                bebidas.add(bebida);
                System.out.println("Bebida agregada: " + bebida);
                bebidaEncontrada = true;
                break;
            }
        }
        if (!bebidaEncontrada) {
            System.out.println("Id de bebida no encontrado: " + idBebida);
        }
    }

    private static void mostrarTicket(List<Snack> productos, List<Bebida> bebidas) {
        var ticket = "* Ticket de Venta *";
        var total = 0.0;

        for (var producto : productos) {
            ticket += "\n\t- " + producto.getNombre() + " - $" + producto.getPrecio();
            total += producto.getPrecio();
        }
        for (var bebida : bebidas) {
            ticket += "\n\t- " + bebida.getNombre() + " - $" + bebida.getPrecio();
            total += bebida.getPrecio();
        }

        ticket += "\n\tTotal -> $" + total;
        System.out.println(ticket);
    }

    private static void agregarSnack(Scanner consola) {
        System.out.print("Nombre del snack: ");
        var nombre = consola.nextLine();
        System.out.print("Precio del snack: ");
        var precio = Double.parseDouble(consola.nextLine());
        Snacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Snack agregado correctamente.");
        Snacks.mostrarSnacks();
    }

    private static void agregarBebida(Scanner consola) {
        System.out.print("Nombre de la bebida: ");
        var nombre = consola.nextLine();
        System.out.print("Precio de la bebida: ");
        var precio = Double.parseDouble(consola.nextLine());
        Bebidas.agregarBebida(new Bebida(nombre, precio));
        System.out.println("Bebida agregada correctamente.");
        Bebidas.mostrarBebidas();
    }
}
