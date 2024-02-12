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
            return None

    def peek(self):
        if not self.is_empty():
            return self.items[-1]
        else:
            return None

    def size(self):
        return len(self.items)


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
            return None

    def peek(self):
        if not self.is_empty():
            return self.items[0]
        else:
            return None

    def size(self):
        return len(self.items)


# Ejemplo de uso
stack = Stack()
stack.push(1)
stack.push(2)
stack.push(3)
print("Pila:")
while not stack.is_empty():
    print(stack.pop())

queue = Queue()
queue.enqueue(1)
queue.enqueue(2)
queue.enqueue(3)
print("\nCola:")
while not queue.is_empty():
    print(queue.dequeue())