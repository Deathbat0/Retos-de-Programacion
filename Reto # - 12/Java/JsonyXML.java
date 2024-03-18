import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonyXML{

    public static void main(String[] args) {
        // Datos de ejemplo
        JSONObject datos = new JSONObject();
        datos.put("Nombre", "Daniel");
        datos.put("Edad", 25);
        datos.put("Fecha de nacimiento", "1998-09-13");

        JSONArray lenguajes = new JSONArray();
        lenguajes.put("Java");
        lenguajes.put("Python");
        lenguajes.put("C++");
        datos.put("Lenguajes de programación", lenguajes);

        // Crear archivo JSON
        crearArchivoJSON(datos);

        // Mostrar contenido del archivo JSON
        System.out.println("Contenido del archivo JSON:");
        mostrarContenidoArchivo("datos.json");

        // Borrar archivo JSON
        borrarArchivo("datos.json");
    }

    public static void crearArchivoJSON(JSONObject datos) {
        try (FileWriter file = new FileWriter("datos.json")) {
            file.write(datos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void mostrarContenidoArchivo(String nombreArchivo) {
        try {
            java.nio.file.Files.lines(java.nio.file.Paths.get(nombreArchivo)).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void borrarArchivo(String nombreArchivo) {
        java.io.File archivo = new java.io.File(nombreArchivo);
        if (archivo.delete()) {
            System.out.println("El archivo " + nombreArchivo + " ha sido borrado exitosamente.");
        } else {
            System.out.println("No se pudo borrar el archivo " + nombreArchivo);
        }
    }
}
