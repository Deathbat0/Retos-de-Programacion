public class Queue{
    private int[] array;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public Queue(int size) {
        capacity = size;
        array = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("La cola está llena");
            return;
        }
        rear = (rear + 1) % capacity;
        array[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("La cola está vacía");
            return -1;
        }
        int item = array[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("La cola está vacía");
            return -1;
        }
        return array[front];
    }
}