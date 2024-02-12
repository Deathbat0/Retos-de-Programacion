import queueandstack.Stack;
import queueandstack.Queue;

public class PilasyColas{
  
    public static void main(String[] args) {
        // Ejemplo de uso de la clase Stack
        Stack stack = new Stack(5); // Crear una pila con capacidad para 5 elementos
        
        // Comprobación si la pila está vacía
        System.out.println("¿La pila está vacía?: " + stack.isEmpty());
        
        // Agregar elementos a la pila
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Comprobación si la pila está llena
        System.out.println("¿La pila está llena?: " + stack.isFull());
        
        // Mostrar el elemento en la parte superior de la pila (sin sacarlo)
        System.out.println("Elemento en la parte superior de la pila: " + stack.peek());
        
        // Sacar elementos de la pila
        System.out.println("Elemento sacado de la pila: " + stack.pop());
        System.out.println("Elemento sacado de la pila: " + stack.pop());
        
        // Ejemplo de uso de la clase Queue
        Queue queue = new Queue(5); // Crear una cola con capacidad para 5 elementos
        
        // Comprobación si la cola está vacía
        System.out.println("\n¿La cola está vacía?: " + queue.isEmpty());
        
        // Agregar elementos a la cola
        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);
        
        // Comprobación si la cola está llena
        System.out.println("¿La cola está llena?: " + queue.isFull());
        
        // Mostrar el elemento al frente de la cola (sin sacarlo)
        System.out.println("Elemento al frente de la cola: " + queue.peek());
        
        // Sacar elementos de la cola
        System.out.println("Elemento sacado de la cola: " + queue.dequeue());
        System.out.println("Elemento sacado de la cola: " + queue.dequeue());
    }
}


