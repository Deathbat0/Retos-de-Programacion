//DeathbatO

#include <iostream>

int main() {
    try {
        // Intenta dividir 10 por 0
        int resultado = 10 / 0;
    } catch (std::exception& e) {
        // Captura el error y muestra un mensaje personalizado
        std::cout << "Error: " << e.what() << std::endl;
        std::cout << "No se puede dividir por cero." << std::endl;
    }

    try {
        // Intenta acceder a un índice no existente de un array
        int lista[] = {1, 2, 3};
        int elemento = lista[4];
    } catch (std::exception& e) {
        // Captura el error y muestra un mensaje personalizado
        std::cout << "Error: " << e.what() << std::endl;
        std::cout << "Índice fuera de rango." << std::endl;
    }

    std::cout << "El programa continúa después de manejar las excepciones." << std::endl;

    return 0;
}
