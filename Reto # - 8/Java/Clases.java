import MyStack.MyStack
import MyQueue.MyQueue;

/**
 * @author DeathbatO
 */

public class Clases {

    private String param1;
    private String param2;
    
    public Clases(String param1, String param2) {
        this.param1 = param1;
        this.param2 = param2;
    }
    
    public void printParams() {
        System.out.println("Param 1: " + param1);
        System.out.println("Param 2: " + param2);
    }

    public static void main(String[] args) {
        // Crear instancia de la clase
        Clases myObject = new Clases("Value 1", "Value 2");

        // Imprimir los parámetros
        myObject.printParams();

        // Modificar los parámetros
        myObject.param1 = "New Value 1";
        myObject.param2 = "New Value 2";

        // Imprimir los parámetros modificados
        myObject.printParams();


        //Stack
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.printStack();

        System.out.println("Tamaño de la pila: " + stack.size());
        System.out.println("Elemento superior de la pila: " + stack.peek());

        System.out.println("Elemento eliminado de la pila: " + stack.pop());
        stack.printStack();

        //Queue
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.printQueue();

        System.out.println("Tamaño de la cola: " + queue.size());

        System.out.println("Elemento eliminado de la cola: " + queue.dequeue());
        queue.printQueue();
    }
}

