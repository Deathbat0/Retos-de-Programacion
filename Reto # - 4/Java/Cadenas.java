//Deathbato

import java.util.Arrays;

public class Cadenas {
    public static void main(String[] args) {
        // Declaracion de cadenas
        String cadena1 = "Ejemplo de cadena 1";
        String cadena2 = "Segundo ejemplo de cadena";

        // Acceso a caracteres especificos
        char primerCaracter = cadena1.charAt(0);
        System.out.println("Primer caracter: " + primerCaracter);

        // Subcadenas
        String subcadena = cadena1.substring(1, 7);
        System.out.println("Subcadena: " + subcadena);

        // Longitud de la cadena
        int longitud = cadena1.length();
        System.out.println("Longitud de la cadena: " + longitud);

        // Concatenacion
        String concatenacion = cadena1 + " " + cadena2;
        System.out.println("Concatenacion: " + concatenacion);

        // Repeticion
        String repetida = cadena1.repeat(3);
        System.out.println("Repeticion: " + repetida);

        // Recorrido de la cadena
        for (char caracter : cadena1.toCharArray()) {
            System.out.println("Caracter: " + caracter);
        }

        // Conversión a mayusculas y minusculas
        String mayusculas = cadena1.toUpperCase();
        String minusculas = cadena2.toLowerCase();
        System.out.println("Mayusculas: " + mayusculas);
        System.out.println("Minusculas: " + minusculas);

        // Reemplazo
        String reemplazada = cadena1.replace('o', '0');
        System.out.println("Reemplazo: " + reemplazada);

        // Division
        String[] partes = cadena1.split(" ");
        System.out.println("Division: " + Arrays.toString(partes));

        // Unión
        String[] palabras = {"Java", "es", "genial"};
        String union = String.join(" ", palabras);
        System.out.println("Unión: " + union);

        // Interpolacion
        String nombre = "Daniel";
        int edad = 25;
        String mensaje = String.format("Hola, soy %s y tengo %d años.", nombre, edad);
        System.out.println("Interpolacion: " + mensaje);

        // Verificacion
        boolean contiene = cadena1.contains("lo");
        System.out.println("Contiene 'la': " + contiene);
    }
}
