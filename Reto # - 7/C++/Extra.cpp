#include <iostream>
#include <stack>
#include <queue>
#include <string>

using namespace std;

class WebBrowser {
private:
    stack<string> backStack;
    stack<string> forwardStack;
    string currentWebPage;

public:
    WebBrowser() {
        currentWebPage = "Inicio";
    }

    void navigate(const string& input) {
        if (input == "atras") {
            if (!backStack.empty()) {
                forwardStack.push(currentWebPage);
                currentWebPage = backStack.top();
                backStack.pop();
            } else {
                cout << "No hay páginas para retroceder." << endl;
            }
        } else if (input == "adelante") {
            if (!forwardStack.empty()) {
                backStack.push(currentWebPage);
                currentWebPage = forwardStack.top();
                forwardStack.pop();
            } else {
                cout << "No hay páginas para avanzar." << endl;
            }
        } else {
            backStack.push(currentWebPage);
            currentWebPage = input;
            while (!forwardStack.empty()) {
                forwardStack.pop();
            }
        }
        cout << "Página actual: " << currentWebPage << endl;
    }
};

class Printer {
private:
    queue<string> printQueue;

public:
    void receiveDocument(const string& document) {
        printQueue.push(document);
        cout << "Documento \"" << document << "\" agregado a la cola de impresión." << endl;
    }

    void printDocument() {
        if (!printQueue.empty()) {
            string document = printQueue.front();
            printQueue.pop();
            cout << "Imprimiendo documento: " << document << endl;
        } else {
            cout << "No hay documentos para imprimir." << endl;
        }
    }
};

int main() {
    WebBrowser browser;
    Printer printer;

    cout << "Bienvenido al simulador de navegador web e impresora compartida." << endl;
    cout << "Puede navegar a páginas web escribiendo su nombre, o usar 'atras' o 'adelante'." << endl;
    cout << "Para imprimir un documento, escriba 'imprimir' seguido del nombre del documento." << endl;

    while (true) {
        string inputCommand;
        cout << "\nIngrese un comando: ";
        getline(cin, inputCommand);

        if (inputCommand == "salir") {
            cout << "¡Hasta luego!" << endl;
            break;
        } else if (inputCommand.find("imprimir ") == 0) {
            string document = inputCommand.substr(9);
            printer.receiveDocument(document);
        } else {
            browser.navigate(inputCommand);
        }
    }

    return 0;
}
