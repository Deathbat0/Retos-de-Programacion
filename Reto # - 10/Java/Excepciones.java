/**
 * @author DeathbatO
 */

public class Excepciones {
    public static void main(String[] args) {
        try {
            // Intenta dividir 10 por 0
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            // Captura el error y muestra un mensaje personalizado
            System.out.println("Error: " + e.getMessage());
            System.out.println("No se puede dividir por cero.");
        }

        try {
            // Intenta acceder a un índice no existente de un listado
            int[] lista = {1, 2, 3};
            int elemento = lista[4];
        } catch (ArrayIndexOutOfBoundsException e) {
            // Captura el error y muestra un mensaje personalizado
            System.out.println("Error: " + e.getMessage());
            System.out.println("Índice fuera de rango.");
        }

        System.out.println("El programa continúa después de manejar las excepciones.");
    }
}
