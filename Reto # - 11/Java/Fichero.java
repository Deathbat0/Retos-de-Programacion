/**
 * @author DeathbatO
 */

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Fichero {
    public static void main(String[] args) {
        String nombreArchivo = "Deathbat0.txt";

        // Crear el archivo
        crearArchivo(nombreArchivo);

        // Imprimir el contenido del archivo
        imprimirContenido(nombreArchivo);

        // Borrar el archivo
        borrarArchivo(nombreArchivo);
    }

    public static void crearArchivo(String nombreArchivo) {
        try {
            FileWriter archivo = new FileWriter(nombreArchivo);
            archivo.write("Nombre: Daniel\n");
            archivo.write("Edad: 25\n");
            archivo.write("Lenguaje de programación favorito: Java\n");
            archivo.close();
            System.out.println("El archivo " + nombreArchivo + " ha sido creado.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo: " + e.getMessage());
        }
    }

    public static void imprimirContenido(String nombreArchivo) {
        try {
            BufferedReader archivo = new BufferedReader(new FileReader(nombreArchivo));
            System.out.println("Contenido del archivo:");
            String linea;
            while ((linea = archivo.readLine()) != null) {
                System.out.println(linea);
            }
            archivo.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }

    public static void borrarArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            if (archivo.delete()) {
                System.out.println("El archivo " + nombreArchivo + " ha sido borrado.");
            } else {
                System.out.println("No se pudo borrar el archivo " + nombreArchivo + ".");
            }
        } else {
            System.out.println("El archivo " + nombreArchivo + " no existe.");
        }
    }
}
