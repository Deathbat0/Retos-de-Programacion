#include <iostream>
#include <string>
#include <vector>
#include <queue>

class MyClass {
private:
    std::string param1;
    std::string param2;

public:
    MyClass(std::string param1, std::string param2) : param1(param1), param2(param2) {}

    void printParams() {
        std::cout << "Param 1: " << param1 << std::endl;
        std::cout << "Param 2: " << param2 << std::endl;
    }
};


class Stack {
private:
    std::vector<int> items;

public:
    bool isEmpty() {
        return items.empty();
    }

    void push(int item) {
        items.push_back(item);
    }

    int pop() {
        if (!isEmpty()) {
            int top = items.back();
            items.pop_back();
            return top;
        } else {
            std::cout << "La pila está vacía" << std::endl;
            return -1; // Retorno de valor por defecto en caso de pila vacía
        }
    }

    int peek() {
        if (!isEmpty()) {
            return items.back();
        } else {
            std::cout << "La pila está vacía" << std::endl;
            return -1; // Retorno de valor por defecto en caso de pila vacía
        }
    }

    int size() {
        return items.size();
    }

    void printStack() {
        std::cout << "Contenido de la pila:" << std::endl;
        for (auto it = items.rbegin(); it != items.rend(); ++it) {
            std::cout << *it << std::endl;
        }
    }
};


class Queue {
private:
    std::queue<int> items;

public:
    bool isEmpty() {
        return items.empty();
    }

    void enqueue(int item) {
        items.push(item);
    }

    int dequeue() {
        if (!isEmpty()) {
            int front = items.front();
            items.pop();
            return front;
        } else {
            std::cout << "La cola está vacía" << std::endl;
            return -1; // Retorno de valor por defecto en caso de cola vacía
        }
    }

    int size() {
        return items.size();
    }

    void printQueue() {
        std::cout << "Contenido de la cola:" << std::endl;
        std::queue<int> temp = items;
        while (!temp.empty()) {
            std::cout << temp.front() << std::endl;
            temp.pop();
        }
    }
};



int main() {
    // Crear instancia de la clase
    MyClass myObject("Value 1", "Value 2");

    // Imprimir los parámetros
    myObject.printParams();

    // Modificar los parámetros
    myObject.param1 = "New Value 1";
    myObject.param2 = "New Value 2";

    // Imprimir los parámetros modificados
    myObject.printParams();


    //Stack
    Stack stack;
    stack.push(1);
    stack.push(2);
    stack.push(3);

    stack.printStack();

    std::cout << "Tamaño de la pila: " << stack.size() << std::endl;
    std::cout << "Elemento superior de la pila: " << stack.peek() << std::endl;

    std::cout << "Elemento eliminado de la pila: " << stack.pop() << std::endl;
    stack.printStack();

    //Queue

    Queue queue;
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    queue.printQueue();

    std::cout << "Tamaño de la cola: " << queue.size() << std::endl;

    std::cout << "Elemento eliminado de la cola: " << queue.dequeue() << std::endl;
    queue.printQueue();

    return 0;
}