#include <iostream>
#include <vector>

using namespace std;

class Stack {
private:
    vector<int> elements;

public:
    void push(int item) {
        elements.push_back(item);
    }

    int pop() {
        if (isEmpty()) {
            cout << "La pila está vacía" << endl;
            return -1; // Valor de retorno por defecto en caso de pila vacía
        }
        int topElement = elements.back();
        elements.pop_back();
        return topElement;
    }

    int peek() {
        if (isEmpty()) {
            cout << "La pila está vacía" << endl;
            return -1; // Valor de retorno por defecto en caso de pila vacía
        }
        return elements.back();
    }

    bool isEmpty() {
        return elements.empty();
    }
};

class Queue {
private:
    vector<int> elements;

public:
    void enqueue(int item) {
        elements.push_back(item);
    }

    int dequeue() {
        if (isEmpty()) {
            cout << "La cola está vacía" << endl;
            return -1; // Valor de retorno por defecto en caso de cola vacía
        }
        int frontElement = elements.front();
        elements.erase(elements.begin());
        return frontElement;
    }

    int peek() {
        if (isEmpty()) {
            cout << "La cola está vacía" << endl;
            return -1; // Valor de retorno por defecto en caso de cola vacía
        }
        return elements.front();
    }

    bool isEmpty() {
        return elements.empty();
    }
};

int main() {
    // Ejemplo de uso de la pila (stack)
    Stack stack;
    stack.push(10);
    stack.push(20);
    stack.push(30);

    cout << "Elemento sacado de la pila: " << stack.pop() << endl;
    cout << "Elemento en la parte superior de la pila: " << stack.peek() << endl;

    // Ejemplo de uso de la cola (queue)
    Queue queue;
    queue.enqueue(100);
    queue.enqueue(200);
    queue.enqueue(300);

    cout << "Elemento sacado de la cola: " << queue.dequeue() << endl;
    cout << "Elemento al frente de la cola: " << queue.peek() << endl;

    return 0;
}
