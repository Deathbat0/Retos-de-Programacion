import java.util.Stack;

public class MyStack {
    private Stack<Integer> stack;

    public MyStack() {
        stack = new Stack<>();
    }

    public void push(int item) {
        stack.push(item);
    }

    public int pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            System.out.println("La pila está vacía");
            return -1; // Valor por defecto en caso de pila vacía
        }
    }

    public int peek() {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            System.out.println("La pila está vacía");
            return -1; // Valor por defecto en caso de pila vacía
        }
    }

    public int size() {
        return stack.size();
    }

    public void printStack() {
        System.out.println("Contenido de la pila:");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }
}