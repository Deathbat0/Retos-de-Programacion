// DeathabtO

#include <iostream>
#include <vector>

// Asignacion por valor
int main() {
    int x = 5;
    int y = x;

    // Modificacion de y no afecta el valor de x
    x = 10;
    std::cout << "Valor de X: " << x << " y Valor de Y: " << y << std::endl;

    // Asignacion por referencia
    std::vector<int> lista1 = {1, 2, 3};
    std::vector<int>& lista2 = lista1;

    // Modificacion de la lista1 afecta a la lista2
    lista1.push_back(4);
    for (const auto& element : lista2) {
        std::cout << element << " ";
    }
    std::cout << std::endl;

    // Funciones con parámetros por valor y referencia
    // Por Valor
    int x_valor = 5;
    int resultado_valor = modValor(x_valor);
    std::cout << "Modifica el valor: " << resultado_valor << std::endl;
    std::cout << "El valor de x sigue siendo: " << x_valor << std::endl;

    // Por Referencia
    std::vector<int> listaejemplo = {1, 2, 3};
    modList(listaejemplo);
    for (const auto& element : listaejemplo) {
        std::cout << element << " ";
    }
    std::cout << std::endl;

    return 0;
}

// Por Valor
int modValor(int num) {
    num = 10;
    return num;
}

// Por Referencia
void modList(std::vector<int>& lista) {
    lista.push_back(4);
}