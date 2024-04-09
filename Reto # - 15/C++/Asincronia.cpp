#include <iostream>
#include <future>
#include <chrono>
#include <string>

//DeathbatO

// Función para ejecutar una tarea con un nombre y una duración específica
void ejecutar_tarea(const std::string& nombre, int segundos) {
    std::cout << "Tarea '" << nombre << "' empezando." << std::endl;
    std::cout << "Tarea '" << nombre << "' durará " << segundos << " segundo(s)." << std::endl;
    std::this_thread::sleep_for(std::chrono::seconds(segundos));
    std::cout << "Tarea '" << nombre << "' finalizada." << std::endl;
}

int main() {
    // Ejecutar las funciones C, B y A en paralelo
    auto tarea_c = std::async(std::launch::async, ejecutar_tarea, "C", 3);
    auto tarea_b = std::async(std::launch::async, ejecutar_tarea, "B", 2);
    auto tarea_a = std::async(std::launch::async, ejecutar_tarea, "A", 1);

    // Esperar a que las funciones C, B y A hayan finalizado
    tarea_c.wait();
    tarea_b.wait();
    tarea_a.wait();

    // Ejecutar la función D después de que las funciones C, B y A han finalizado
    ejecutar_tarea("D", 1);

    return 0;
}
