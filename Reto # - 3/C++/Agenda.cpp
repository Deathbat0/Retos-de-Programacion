#include <iostream>
#include <map>
#include <algorithm>

//Creacion de la Agenda
std::map<std::string, std::string> agenda;

//Funcion para buscar contacto
void buscar() {
    std::string nombre;
    std::cout << "Introduce el nombre del contacto a buscar: ";
    std::cin >> nombre;

    auto it = agenda.find(nombre);
    if (it != agenda.end()) {
        std::cout << "Telefono de " << nombre << ": " << it->second << std::endl;
    } else {
        std::cout << nombre << " no se encuentra en la agenda." << std::endl;
    }
}

//Funcion para agregar contacto
void agregar() {
    std::string nombre, telefono;
    std::cout << "Introduce el nombre del nuevo contacto: ";
    std::cin >> nombre;
    std::cout << "Introduce el numero de teléfono: ";
    std::cin >> telefono;

    // Validar que el número de teléfono sea numérico y tenga la longitud deseada
    if (std::all_of(telefono.begin(), telefono.end(), ::isdigit) && telefono.length() <= 11) {
        agenda[nombre] = telefono;
        std::cout << "Contacto " << nombre << " agregado correctamente." << std::endl;
    } else {
        std::cout << "Numero de telefono no válido. Debe ser numerico y tener como maximo 11 digitos." << std::endl;
    }
}

//Funcion para actualizar contacto
void actualizar() {
    std::string nombre, nuevoTelefono;
    std::cout << "Introduce el nombre del contacto a actualizar: ";
    std::cin >> nombre;

    auto it = agenda.find(nombre);
    if (it != agenda.end()) {
        std::cout << "Introduce el nuevo numero de telefono: ";
        std::cin >> nuevoTelefono;

        // Validar que el número de teléfono sea numérico y tenga la longitud deseada
        if (std::all_of(nuevoTelefono.begin(), nuevoTelefono.end(), ::isdigit) && nuevoTelefono.length() <= 11) {
            it->second = nuevoTelefono;
            std::cout << "Contacto " << nombre << " actualizado correctamente." << std::endl;
        } else {
            std::cout << "Numero de teléfono no valido. Debe ser numerico y tener como maximo 11 digitos." << std::endl;
        }
    } else {
        std::cout << nombre << " no se encuentra en la agenda." << std::endl;
    }
}

//Funcion para eliminar contacto
void eliminar() {
    std::string nombre;
    std::cout << "Introduce el nombre del contacto a eliminar: ";
    std::cin >> nombre;

    auto it = agenda.find(nombre);
    if (it != agenda.end()) {
        agenda.erase(it);
        std::cout << "Contacto " << nombre << " eliminado correctamente." << std::endl;
    } else {
        std::cout << nombre << " no se encuentra en la agenda." << std::endl;
    }
}

//Funcion para mostrar los contactos en la agenda
void mostrar() {
    std::cout << "\nAgenda de Contactos:" << std::endl;
    for (const auto& entry : agenda) {
        std::cout << entry.first << ": " << entry.second << std::endl;
    }
    std::cout << std::endl;
}

int main() {
    while (true) {
        //Menu de opciones
        std::cout << "\nOperaciones disponibles:" << std::endl;
        std::cout << "1. Buscar contacto" << std::endl;
        std::cout << "2. Agregar contacto" << std::endl;
        std::cout << "3. Actualizar contacto" << std::endl;
        std::cout << "4. Eliminar contacto" << std::endl;
        std::cout << "5. Mostrar agenda" << std::endl;
        std::cout << "6. Salir" << std::endl;

        int opcion;
        std::cout << "Selecciona una opcion (1-6): ";
        std::cin >> opcion;

        switch (opcion) {
            case 1:
                buscar();
                break;
            case 2:
                agregar();
                break;
            case 3:
                actualizar();
                break;
            case 4:
                eliminar();
                break;
            case 5:
                mostrar();
                break;
            case 6:
                std::cout << "¡Hasta luego!" << std::endl;
                return 0;
            default:
                std::cout << "Opción no valida. Por favor, elige una opcion del 1 al 6." << std::endl;
        }
    }
}