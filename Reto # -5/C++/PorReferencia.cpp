// DeathbatO

#include <iostream>

// Función para intercambiar valores por referencia
void intercambiarReferencia(int &a, int &b) {
    // Intercambiar valores
    int temp = a;
    a = b;
    b = temp;
}

int main() {
    // Definir variables
    int originalA = 5;
    int originalB = 10;

    // Llamar a la función e imprimir resultados
    intercambiarReferencia(originalA, originalB);

    std::cout << "\nPor referencia:" << std::endl;
    std::cout << "Original: a = " << originalA << ", b = " << originalB << std::endl;

    return 0;
}