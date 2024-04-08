#include <iostream>
#include <ctime>

//DeathbatO

using namespace std;

struct Date {
    int day, month, year, hour, minute, second;
};

// Función para obtener la fecha actual
Date getCurrentDate() {
    time_t now = time(0);
    tm *ltm = localtime(&now);

    Date currentDate;
    currentDate.day = ltm->tm_mday;
    currentDate.month = 1 + ltm->tm_mon;
    currentDate.year = 1900 + ltm->tm_year;
    currentDate.hour = ltm->tm_hour;
    currentDate.minute = ltm->tm_min;
    currentDate.second = ltm->tm_sec;

    return currentDate;
}

// Función para calcular la diferencia de años entre dos fechas
int calculateAge(Date birthDate, Date currentDate) {
    int age = currentDate.year - birthDate.year;

    // Verificar si el cumpleaños ya pasó este año
    if (birthDate.month > currentDate.month ||
        (birthDate.month == currentDate.month && birthDate.day > currentDate.day)) {
        age--;
    }

    return age;
}

int main() {
    // Obtener la fecha actual
    Date currentDate = getCurrentDate();

    // Especificar tu fecha de nacimiento
    Date birthDate = {1, 4, 1990, 0, 0, 0}; // Por ejemplo, 1 de abril de 1990

    // Calcular la diferencia de años entre las dos fechas
    int yearsPassed = calculateAge(birthDate, currentDate);

    // Imprimir el resultado
    cout << "Han transcurrido " << yearsPassed << " años desde tu nacimiento." << endl;

    return 0;
}
