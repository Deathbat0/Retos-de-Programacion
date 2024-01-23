//DeathbatO

#include <iostream>
#include <string>

int main() {
    // Declaración de cadenas
    std::string cadena1 = "Hola";
    std::string cadena2 = "Mundo";

    // Acceso a caracteres específicos
    char primerCaracter = cadena1[0];
    std::cout << "Primer caracter: " << primerCaracter << std::endl;

    // Subcadenas
    std::string subcadena = cadena1.substr(1, 2);
    std::cout << "Subcadena: " << subcadena << std::endl;

    // Longitud de la cadena
    int longitud = cadena1.length();
    std::cout << "Longitud de la cadena: " << longitud << std::endl;

    // Concatenación
    std::string concatenacion = cadena1 + " " + cadena2;
    std::cout << "Concatenación: " << concatenacion << std::endl;

    // Repetición
    std::string repetida;
    for (int i = 0; i < 3; ++i) {
        repetida += cadena1;
    }
    std::cout << "Repetición: " << repetida << std::endl;

    // Recorrido de la cadena
    for (char caracter : cadena1) {
        std::cout << "Caracter: " << caracter << std::endl;
    }

    // Conversión a mayúsculas y minúsculas
    std::transform(cadena1.begin(), cadena1.end(), cadena1.begin(), ::toupper);
    std::transform(cadena2.begin(), cadena2.end(), cadena2.begin(), ::tolower);
    std::cout << "Mayúsculas: " << cadena1 << std::endl;
    std::cout << "Minúsculas: " << cadena2 << std::endl;

    // Reemplazo
    size_t pos = cadena1.find('o');
    if (pos != std::string::npos) {
        cadena1.replace(pos, 1, "0");
    }
    std::cout << "Reemplazo: " << cadena1 << std::endl;

    // División
    size_t found = cadena1.find('l');
    std::string parte1 = cadena1.substr(0, found);
    std::string parte2 = cadena1.substr(found + 1);
    std::cout << "División: " << parte1 << ", " << parte2 << std::endl;

    // Unión
    std::string palabras[] = {"C++", "es", "poderoso"};
    std::string unionStr = std::accumulate(std::begin(palabras), std::end(palabras), std::string(),
                                           [](const std::string &a, const std::string &b) {
                                               return a + ' ' + b;
                                           });
    std::cout << "Unión: " << unionStr << std::endl;

    // Interpolación
    std::string nombre = "Juan";
    int edad = 25;
    std::string mensaje = "Hola, soy " + nombre + " y tengo " + std::to_string(edad) + " años.";
    std::cout << "Interpolación: " << mensaje << std::endl;

    // Verificación
    bool contiene = (cadena1.find("la") != std::string::npos);
    std::cout << "Contiene 'la': " << std::boolalpha << contiene << std::endl;

    return 0;
}