//DeathbatO

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Agenda {

    private static Map<String, String> agenda = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    //Funcion para buscar contacto
    public static void buscar() {
        System.out.print("Introduce el nombre del contacto a buscar: ");
        String nombre = sc.nextLine();
        if (agenda.containsKey(nombre)) {
            System.out.println("Telefono de " + nombre + ": " + agenda.get(nombre));
        } else {
            System.out.println(nombre + " no se encuentra en la agenda.");
        }
    }

    //Funcion para agregar contacto
    public static void agregar() {
        System.out.print("Introduce el nombre del nuevo contacto: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce el numero de telefono: ");
        String telefono = sc.nextLine();

        // Validar que el número de teléfono sea numérico y tenga la longitud deseada
        if (telefono.matches("\\d+") && telefono.length() <= 11) {
            agenda.put(nombre, telefono);
            System.out.println("Contacto " + nombre + " agregado correctamente.");
        } else {
            System.out.println("Numero de telefono no valido. Debe ser numérico y tener como maximo 11 digitos.");
        }
    }

    //Funcion para actualizar contacto
    public static void actualizar() {
        System.out.print("Introduce el nombre del contacto a actualizar: ");
        String nombre = sc.nextLine();
        if (agenda.containsKey(nombre)) {
            System.out.print("Introduce el nuevo numero de teléfono: ");
            String nuevoTelefono = sc.nextLine();

            // Validar que el número de teléfono sea numérico y tenga la longitud deseada
            if (nuevoTelefono.matches("\\d+") && nuevoTelefono.length() <= 11) {
                agenda.put(nombre, nuevoTelefono);
                System.out.println("Contacto " + nombre + " actualizado correctamente.");
            } else {
                System.out.println("Numero de teléfono no valido. Debe ser numerico y tener como maximo 11 dígitos.");
            }
        } else {
            System.out.println(nombre + " no se encuentra en la agenda.");
        }
    }

    //Funcion para eliminar un contacto
    public static void eliminar() {
        System.out.print("Introduce el nombre del contacto a eliminar: ");
        String nombre = sc.nextLine();
        if (agenda.containsKey(nombre)) {
            agenda.remove(nombre);
            System.out.println("Contacto " + nombre + " eliminado correctamente.");
        } else {
            System.out.println(nombre + " no se encuentra en la agenda.");
        }
    }

    //Funcion para mostrar los contactos en la agenda
    public static void mostrar() {
        System.out.println("\nAgenda de Contactos:");
        for (Map.Entry<String, String> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        while (true) {
            //Menu de opciones
            System.out.println("\nOperaciones disponibles:");
            System.out.println("1. Buscar contacto");
            System.out.println("2. Agregar contacto");
            System.out.println("3. Actualizar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Mostrar agenda");
            System.out.println("6. Salir");

            System.out.print("Selecciona una opcion (1-6): ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    buscar();
                    break;
                case "2":
                    agregar();
                    break;
                case "3":
                    actualizar();
                    break;
                case "4":
                    eliminar();
                    break;
                case "5":
                    mostrar();
                    break;
                case "6":
                    System.out.println("¡Hasta luego!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no valida. Por favor, elige una opcion del 1 al 6.");
            }
        }
    }
    
}
