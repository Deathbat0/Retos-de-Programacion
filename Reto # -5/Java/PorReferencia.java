//DeathbatO

public class PorReferencia {

    public static void main(String[] args) {
        // Definir variables
        int[] originalA = {5};
        int[] originalB = {10};

        // Llamar a la función e imprimir resultados
        int[] nuevosValores = intercambiarReferencia(originalA, originalB);
        int nuevoA = nuevosValores[0];
        int nuevoB = nuevosValores[1];

        System.out.println("\nPor referencia:");
        System.out.println("Original: a = " + originalA[0] + ", b = " + originalB[0]);
        System.out.println("Nuevos:   a = " + nuevoA + ", b = " + nuevoB);
    }

    public static int[] intercambiarReferencia(int[] a, int[] b) {
        // Intercambiar valores
        int temp = a[0];
        a[0] = b[0];
        b[0] = temp;
        // Retornar los nuevos valores
        return new int[]{a[0], b[0]};
    }
}