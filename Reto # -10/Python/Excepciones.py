## DeathbatO
# Manejo de excepciones en Python

try:
    # Intenta dividir 10 por 0
    resultado = 10 / 0
except ZeroDivisionError as error:
    # Captura el error y muestra un mensaje personalizado
    print("Error:", error)
    print("No se puede dividir por cero.")

try:
    # Intenta acceder a un índice no existente de un listado
    lista = [1, 2, 3]
    elemento = lista[4]
except IndexError as error:
    # Captura el error y muestra un mensaje personalizado
    print("Error:", error)
    print("Índice fuera de rango.")

print("El programa continúa después de manejar las excepciones.")
