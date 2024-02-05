## DeathbatO

def num_Recursivo(num):
    # Caso base: cuando el numero llega a 0, se detiene la recursion
    if num < 0:
        return
    else:
        # Imprime por consola el numero actual
        print(num)
        # Llama recursivamente a la funcion con el numero decrecido en 1
        num_Recursivo(num-1)
# Llamada inicial a la funcion con el numero inicial 100
num_Recursivo(100)