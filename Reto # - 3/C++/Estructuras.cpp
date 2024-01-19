// DeathbatO

#include <iostream>
#include <algorithm>
#include <vector>
#include <set>
#include <map>

///---- Estructuras -----///

int main(){
    //--Arrays--//

    // Creación de un array de enteros
    int numeros[] = {4, 2, 8, 1, 5};
    int size = sizeof(numeros) / sizeof(numeros[0]);

    // Actualización de un elemento
    numeros[2] = 10;

    // Borrado de un elemento (no es tan directo en un array, pero puedes asignar un valor nulo)
    numeros[3] = 0;

    // Ordenación del array
    std::sort(numeros, numeros + size);

    // Imprimir el array
    for (int i = 0; i < size; ++i) {
        std::cout << numeros[i] << " ";
    }

    //--Vectores--//

    // Creación de un vector de enteros
    std::vector<int> numeros = {4, 2, 8, 1, 5};

    // Inserción de un elemento
    numeros.insert(numeros.begin() + 1, 10);

    // Actualización de un elemento
    numeros[2] = 7;

    // Borrado de un elemento
    numeros.erase(std::remove(numeros.begin(), numeros.end(), 8), numeros.end());

    // Ordenación del vector
    std::sort(numeros.begin(), numeros.end());

    // Imprimir el vector
    for (int num : numeros) {
        std::cout << num << " ";
    }

    //--Set--//

    // Creación de un set de enteros
    std::set<int> numeros = {4, 2, 8};

    // Inserción de un elemento
    numeros.insert(10);

    // Borrado de un elemento
    numeros.erase(2);

    // No hay actualización directa en un set, se añade el nuevo valor y se elimina el antiguo si es necesario

    // No hay ordenación en un set, ya que se mantiene ordenado automáticamente

    // Imprimir el set
    for (int num : numeros) {
        std::cout << num << " ";
    }

    //--Map--//

    // Creación de un map de String a Integer
    std::map<std::string, int> edades;
    edades["Juan"] = 25;
    edades["María"] = 30;
    edades["Carlos"] = 22;

    // Inserción de un elemento
    edades["Ana"] = 28;

    // Actualización de un elemento
    edades["Carlos"] = 23;

    // Borrado de un elemento
    edades.erase("María");

    // No hay ordenación en un map, ya que se mantiene ordenado automáticamente

    // Imprimir el map
    for (const auto& pair : edades) {
        std::cout << pair.first << ": " << pair.second << " ";
    }

    return 0; 

}