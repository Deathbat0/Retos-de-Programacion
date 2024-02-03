//DeathbatO

#include <iostream>

// Función para intercambiar valores por valor
void intercambiarValor(int a, int b, int &nuevoA, int &nuevoB) {
    // Intercambiar valores
    int temp = a;
    nuevoA = b;
    nuevoB = temp;
}

int main() {
    // Definir variables
    int originalA = 5;
    int originalB = 10;

    // Llamar a la función e imprimir resultados
    int nuevoA, nuevoB;
    intercambiarValor(originalA, originalB, nuevoA, nuevoB);

    std::cout << "Por valor:" << std::endl;
    std::cout << "Original: a = " << originalA << ", b = " << originalB << std::endl;
    std::cout << "Nuevos:   a = " << nuevoA << ", b = " << nuevoB << std::endl;

    return 0;
}