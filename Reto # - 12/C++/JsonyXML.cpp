#include <iostream>
#include <fstream>
#include <jsoncpp/json/json.h>

void crearArchivoJSON(const Json::Value& datos) {
    std::ofstream archivo("datos.json");
    archivo << datos;
    archivo.close();
}

void mostrarContenidoArchivo(const std::string& nombreArchivo) {
    std::ifstream archivo(nombreArchivo);
    std::string linea;
    while (std::getline(archivo, linea)) {
        std::cout << linea << std::endl;
    }
    archivo.close();
}

void borrarArchivo(const std::string& nombreArchivo) {
    if (std::remove(nombreArchivo.c_str()) == 0) {
        std::cout << "El archivo " << nombreArchivo << " ha sido borrado exitosamente." << std::endl;
    } else {
        std::cerr << "No se pudo borrar el archivo " << nombreArchivo << std::endl;
    }
}

int main() {
    // Datos de ejemplo
    Json::Value datos;
    datos["Nombre"] = "Daniel";
    datos["Edad"] = 25;
    datos["Fecha de nacimiento"] = "1998-09-13";
    Json::Value lenguajes;
    lenguajes.append("C++");
    lenguajes.append("Java");
    lenguajes.append("Python");
    datos["Lenguajes de programación"] = lenguajes;

    // Crear archivo JSON
    crearArchivoJSON(datos);

    // Mostrar contenido del archivo JSON
    std::cout << "Contenido del archivo JSON:" << std::endl;
    mostrarContenidoArchivo("datos.json");

    // Borrar archivo JSON
    borrarArchivo("datos.json");

    return 0;
}
