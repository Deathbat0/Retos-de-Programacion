//DeathbatO

public class PorValor {

    public static void main(String[] args) {
        // Definir variables
        int originalA = 5;
        int originalB = 10;

        // Llamar a la función e imprimir resultados
        int[] nuevosValores = intercambiarValor(originalA, originalB);
        int nuevoA = nuevosValores[0];
        int nuevoB = nuevosValores[1];

        System.out.println("Por valor:");
        System.out.println("Original: a = " + originalA + ", b = " + originalB);
        System.out.println("Nuevos:   a = " + nuevoA + ", b = " + nuevoB);
    }

    public static int[] intercambiarValor(int a, int b) {
        // Intercambiar valores
        int temp = a;
        a = b;
        b = temp;
        // Retornar los nuevos valores
        return new int[]{a, b};
    }
}