// DeathbatO

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Extra {
    public static boolean esPalindromo(String palabra) {
        return palabra.equals(new StringBuilder(palabra).reverse().toString());
    }

    public static boolean esAnagrama(String palabra1, String palabra2) {
        char[] arrayPalabra1 = palabra1.toCharArray();
        char[] arrayPalabra2 = palabra2.toCharArray();

        Arrays.sort(arrayPalabra1);
        Arrays.sort(arrayPalabra2);

        return Arrays.equals(arrayPalabra1, arrayPalabra2);
    }

    public static boolean esIsograma(String palabra) {
        Set<Character> caracteres = new HashSet<>();
        for (char c : palabra.toCharArray()) {
            if (!caracteres.add(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word, pal1, pal2;

        System.out.print("Por favor ingrese una palabra para comprobar si es palindromo: ");
        word = sc.nextLine();

        if(esPalindromo(word)){
            System.out.print("La palabra "+word+" es un palindromo\n");
        }else{
            System.out.print("La palabra "+word+" NO es un palindromo\n");
        }

        System.out.print("Ingrese la primera palabra para comprobar si son anagrama: ");
        pal1 = sc.nextLine();
        System.out.print("Ingrese la segunda palabra para comprobar si son anagrama: ");
        pal2 = sc.nextLine();

        if(esAnagrama(pal1, pal2)){
            System.out.print("Las palabras "+pal1+" , "+pal2+" son un anagrama.\n");
        }else{
            System.out.print("Las palabras "+pal1+" , "+pal2+" NO son un anagraman.\n");
        }

        System.out.print("Por favor una primera palabra para comprobar si es isograma: ");
        word = sc.nextLine();

        if(esIsograma(word)){
            System.out.print("La palabra "+word+" es un isograma.\n");
        }else{
            System.out.print("La palabra "+word+" es un isograma.\n");
        }

        sc.close();
    }
}
