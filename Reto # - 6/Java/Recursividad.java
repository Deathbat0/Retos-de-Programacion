//DeathbatO

public class Recursividad {
    
    public static void numRecursivo(int numero) {
        // Caso base: cuando el numero llega a 0, se detiene la recursion.
        if (numero < 0) {
            return;
        } else {
            // Imprime por consola el numero actual
            System.out.println(numero);
            // Llama recursivamente a la funcion con el número decrecido en 1
            numRecursivo(numero - 1);
        }
    }
    public static void main(String[] args) {
        // Llamada inicial a la funcion con el numero inicial 100
        numRecursivo(100);
    }
}
