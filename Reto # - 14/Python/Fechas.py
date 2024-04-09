from datetime import datetime

## DeathbatO
# Función para obtener la fecha actual
def get_current_date():
    return datetime.now()

# Función para calcular la edad
def calculate_age(birth_date, current_date):
    age = current_date.year - birth_date.year
    if (current_date.month, current_date.day) < (birth_date.month, birth_date.day):
        age -= 1
    return age

def main():
    # Obtener la fecha actual
    current_date = get_current_date()

    # Especificar tu fecha de nacimiento
    birth_date = datetime(1990, 4, 1)  # Por ejemplo, 1 de abril de 1990

    # Calcular la edad
    age = calculate_age(birth_date, current_date)

    # Imprimir el resultado
    print(f"Han transcurrido {age} años desde tu nacimiento.")

if __name__ == "__main__":
    main()
