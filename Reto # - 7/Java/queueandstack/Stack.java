
public class Stack{
    private int[] array;
    private int top;
    private int capacity;

    public Stack(int size) {
        capacity = size;
        array = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("La pila está llena");
            return;
        }
        array[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return -1;
        }
        return array[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return -1;
        }
        return array[top];
    }
}
