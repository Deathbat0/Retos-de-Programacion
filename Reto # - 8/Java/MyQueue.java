import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    private Queue<Integer> queue;

    public MyQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(int item) {
        queue.add(item);
    }

    public int dequeue() {
        if (!queue.isEmpty()) {
            return queue.poll();
        } else {
            System.out.println("La cola está vacía");
            return -1; // Valor por defecto en caso de cola vacía
        }
    }

    public int size() {
        return queue.size();
    }

    public void printQueue() {
        System.out.println("Contenido de la cola:");
        for (Integer item : queue) {
            System.out.println(item);
        }
    }
}