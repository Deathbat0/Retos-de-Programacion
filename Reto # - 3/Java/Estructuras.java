// DeathbatO
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;


public class Estructuras {
    public static void main(String[] args){
        ///---- Estructuras -----///

        //--Arrays--//
        
        // Creación de un array de enteros
        int[] numeros = {4, 2, 8, 1, 5};

        // Actualización de un elemento
        numeros[2] = 10;

        // Borrado de un elemento (no es tan directo en un array, pero puedes asignar un valor nulo)
        numeros[3] = 0;

        // Ordenación del array
        Arrays.sort(numeros);

        // Imprimir el array
        System.out.println(Arrays.toString(numeros));


        //--ArrayList--//

        // Creación de un ArrayList de Strings
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Juan");
        nombres.add("María");

        // Inserción de un elemento
        nombres.add(1, "Carlos");

        // Actualización de un elemento
        nombres.set(2, "Laura");

        // Borrado de un elemento
        nombres.remove("Juan");

        // Ordenación del ArrayList
        Collections.sort(nombres);

        // Imprimir el ArrayList
        System.out.println(nombres);


        //--HashSeet--//

        // Creación de un HashSet de enteros
        HashSet<Integer> numerosSet = new HashSet<>();
        numerosSet.add(4);
        numerosSet.add(2);
        numerosSet.add(8);

        // Inserción de un elemento
        numerosSet.add(10);

        // Borrado de un elemento
        numerosSet.remove(2);

        // No hay actualización directa en un HashSet, se añade el nuevo valor y se elimina el antiguo si es necesario

        // No hay ordenación en un HashSet, ya que no mantiene un orden específico

        // Imprimir el HashSet
        System.out.println(numerosSet);


        //--HashMap--//

        // Creación de un HashMap de String a Integer
        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Juan", 25);
        edades.put("María", 30);
        edades.put("Carlos", 22);

        // Inserción de un elemento
        edades.put("Ana", 28);

        // Actualización de un elemento
        edades.put("Carlos", 23);

        // Borrado de un elemento
        edades.remove("María");

        // No hay ordenación en un HashMap, ya que no mantiene un orden específico

        // Imprimir el HashMap
        System.out.println(edades);

        //--Strings--//

        // Creación de una cadena
        String mensaje = "Hola, mundo!";

        // Concatenación de cadenas
        String nuevaCadena = mensaje + " Soy Java.";

        /*  No hay actualización directa en Strings, pero puedes crear una nueva cadena,
        No hay borrado directo en Strings, pero puedes crear una nueva cadena sin el elemento,
        No hay ordenación directa en Strings, pero puedes usar compareTo() o compareToIgnoreCase()*/

        // Imprimir la cadena
        System.out.println(nuevaCadena);

    }
}
