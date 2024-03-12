// DeathbatO

#include <iostream>
#include <fstream>
#include <cstdlib>

void crearArchivo(const std::string& nombreArchivo) {
    std::ofstream archivo(nombreArchivo.c_str());
    if (archivo.is_open()) {
        archivo << "Nombre: Daniel\n";
        archivo << "Edad: 25\n";
        archivo << "Lenguaje de programación favorito: Python\n";
        archivo.close();
        std::cout << "El archivo " << nombreArchivo << " ha sido creado." << std::endl;
    } else {
        std::cerr << "Error al crear el archivo." << std::endl;
        exit(1);
    }
}

void imprimirContenido(const std::string& nombreArchivo) {
    std::ifstream archivo(nombreArchivo.c_str());
    if (archivo.is_open()) {
        std::cout << "Contenido del archivo:" << std::endl;
        std::string linea;
        while (std::getline(archivo, linea)) {
            std::cout << linea << std::endl;
        }
        archivo.close();
    } else {
        std::cerr << "Error al abrir el archivo." << std::endl;
        exit(1);
    }
}

void borrarArchivo(const std::string& nombreArchivo) {
    if (std::remove(nombreArchivo.c_str()) == 0) {
        std::cout << "El archivo " << nombreArchivo << " ha sido borrado." << std::endl;
    } else {
        std::cerr << "Error al borrar el archivo." << std::endl;
    }
}

int main() {
    std::string nombreArchivo = "Deathbat0.txt";

    // Crear el archivo
    crearArchivo(nombreArchivo);

    // Imprimir el contenido del archivo
    imprimirContenido(nombreArchivo);

    // Borrar el archivo
    borrarArchivo(nombreArchivo);

    return 0;
}
