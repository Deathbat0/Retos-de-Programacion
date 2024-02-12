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


class WebBrowser:
    def __init__(self):
        self.back_stack = Stack()
        self.forward_stack = Stack()
        self.current_web_page = "Inicio"

    def navigate(self, input):
        if input == "atras":
            if not self.back_stack.is_empty():
                self.forward_stack.push(self.current_web_page)
                self.current_web_page = self.back_stack.pop()
            else:
                print("No hay páginas para retroceder.")
        elif input == "adelante":
            if not self.forward_stack.is_empty():
                self.back_stack.push(self.current_web_page)
                self.current_web_page = self.forward_stack.pop()
            else:
                print("No hay páginas para avanzar.")
        else:
            self.back_stack.push(self.current_web_page)
            self.current_web_page = input
            self.forward_stack = Stack()  # Limpiar historial adelante
        print("Página actual:", self.current_web_page)


class Printer:
    def __init__(self):
        self.print_queue = Queue()

    def receive_document(self, document):
        self.print_queue.enqueue(document)
        print(f"Documento \"{document}\" agregado a la cola de impresión.")

    def print_document(self):
        if not self.print_queue.is_empty():
            document = self.print_queue.dequeue()
            print("Imprimiendo documento:", document)
        else:
            print("No hay documentos para imprimir.")


def main():
    browser = WebBrowser()
    printer = Printer()

    print("Bienvenido al simulador de navegador web e impresora compartida.")
    print("Puede navegar a páginas web escribiendo su nombre, o usar 'atras' o 'adelante'.")
    print("Para imprimir un documento, escriba 'imprimir' seguido del nombre del documento.")

    while True:
        input_command = input("\nIngrese un comando: ").strip().lower()

        if input_command == "salir":
            print("¡Hasta luego!")
            break
        elif input_command.startswith("imprimir "):
            document = input_command[9:]
            printer.receive_document(document)
        else:
            browser.navigate(input_command)


if __name__ == "__main__":
    main()