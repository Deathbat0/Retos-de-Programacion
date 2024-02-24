class MyClass:
    def __init__(self, param1, param2):
        self.param1 = param1
        self.param2 = param2
    
    def print_params(self):
        print("Param 1:", self.param1)
        print("Param 2:", self.param2)

# Crear instancia de la clase
my_object = MyClass("Value 1", "Value 2")

# Imprimir los parámetros
my_object.print_params()

# Modificar los parámetros
my_object.param1 = "New Value 1"
my_object.param2 = "New Value 2"

# Imprimir los parámetros modificados
my_object.print_params()


class Stack:
    def __init__(self):
        self.items = []

    def is_empty(self):
        return len(self.items) == 0

    def push(self, item):
        self.items.append(item)

    def pop(self):
        if not self.is_empty():
            return self.items.pop()
        else:
            print("La pila está vacía")

    def peek(self):
        if not self.is_empty():
            return self.items[-1]
        else:
            print("La pila está vacía")

    def size(self):
        return len(self.items)

    def print_stack(self):
        print("Contenido de la pila:")
        for item in reversed(self.items):
            print(item)


# Ejemplo de uso de la clase Pila
stack = Stack()
stack.push(1)
stack.push(2)
stack.push(3)

stack.print_stack()

print("Tamaño de la pila:", stack.size())
print("Elemento superior de la pila:", stack.peek())

print("Elemento eliminado de la pila:", stack.pop())
stack.print_stack()

class Queue:
    def __init__(self):
        self.items = []

    def is_empty(self):
        return len(self.items) == 0

    def enqueue(self, item):
        self.items.append(item)

    def dequeue(self):
        if not self.is_empty():
            return self.items.pop(0)
        else:
            print("La cola está vacía")

    def size(self):
        return len(self.items)

    def print_queue(self):
        print("Contenido de la cola:")
        for item in self.items:
            print(item)


# Ejemplo de uso de la clase Cola
queue = Queue()
queue.enqueue(1)
queue.enqueue(2)
queue.enqueue(3)

queue.print_queue()

print("Tamaño de la cola:", queue.size())

print("Elemento eliminado de la cola:", queue.dequeue())
queue.print_queue()

