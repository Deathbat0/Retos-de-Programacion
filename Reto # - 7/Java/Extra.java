import java.util.Scanner;

// Clase para simular un navegador web
class WebBrowser {
    private Stack backStack;
    private Stack forwardStack;
    private String currentWebPage;

    public WebBrowser() {
        backStack = new Stack(10); // Tamaño máximo de la pila para historial atrás
        forwardStack = new Stack(10); // Tamaño máximo de la pila para historial adelante
        currentWebPage = "Inicio";
    }

    public void navigate(String input) {
        if (input.equals("atras")) {
            if (!backStack.isEmpty()) {
                forwardStack.push(currentWebPage);
                currentWebPage = backStack.pop();
            } else {
                System.out.println("No hay páginas para retroceder.");
            }
        } else if (input.equals("adelante")) {
            if (!forwardStack.isEmpty()) {
                backStack.push(currentWebPage);
                currentWebPage = forwardStack.pop();
            } else {
                System.out.println("No hay páginas para avanzar.");
            }
        } else {
            backStack.push(currentWebPage);
            currentWebPage = input;
            forwardStack.clear(); // Limpiar historial adelante
        }

        System.out.println("Página actual: " + currentWebPage);
    }
}

// Clase para simular una impresora compartida
class Printer {
    private Queue printQueue;

    public Printer() {
        printQueue = new Queue(10); // Tamaño máximo de la cola para documentos a imprimir
    }

    public void receiveDocument(String document) {
        printQueue.enqueue(document);
        System.out.println("Documento \"" + document + "\" agregado a la cola de impresión.");
    }

    public void printDocument() {
        if (!printQueue.isEmpty()) {
            String document = printQueue.dequeue();
            System.out.println("Imprimiendo documento: " + document);
        } else {
            System.out.println("No hay documentos para imprimir.");
        }
    }
}

public class Extra{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulación de navegador web
        WebBrowser browser = new WebBrowser();

        // Simulación de impresora compartida
        Printer printer = new Printer();

        System.out.println("Bienvenido al simulador de navegador web e impresora compartida.");
        System.out.println("Puede navegar a páginas web escribiendo su nombre, o usar 'atras' o 'adelante'.");
        System.out.println("Para imprimir un documento, escriba 'imprimir' seguido del nombre del documento.");

        while (true) {
            System.out.print("\nIngrese un comando: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("salir")) {
                System.out.println("¡Hasta luego!");
                break;
            } else if (input.startsWith("imprimir ")) {
                String document = input.substring(9);
                printer.receiveDocument(document);
            } else {
                browser.navigate(input);
            }
        }

        scanner.close();
    }
}