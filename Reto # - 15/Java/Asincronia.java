import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
//*
* @author DeathbatO
*/

class Asincronia implements Runnable {
    private String nombre;
    private int segundos;

    public Tarea(String nombre, int segundos) {
        this.nombre = nombre;
        this.segundos = segundos;
    }

    @Override
    public void run() {
        System.out.println("Tarea '" + nombre + "' empezando.");
        System.out.println("Tarea '" + nombre + "' durará " + segundos + " segundo(s).");
        try {
            TimeUnit.SECONDS.sleep(segundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tarea '" + nombre + "' finalizada.");
    }
}

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Ejecutar las funciones C, B y A en paralelo
        Future<?> tareaC = executor.submit(new Tarea("C", 3));
        Future<?> tareaB = executor.submit(new Tarea("B", 2));
        Future<?> tareaA = executor.submit(new Tarea("A", 1));

        // Esperar a que las funciones C, B y A hayan finalizado
        try {
            tareaC.get();
            tareaB.get();
            tareaA.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Ejecutar la función D después de que las funciones C, B y A han finalizado
        executor.submit(new Tarea("D", 1));

        executor.shutdown();
    }
}
