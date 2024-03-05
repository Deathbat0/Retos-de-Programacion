## DeathbatO

class Animal:
    def __init__(self, nombre):
        self.nombre = nombre

    def hacer_sonido(self):
        pass  # Este método será implementado por las subclases


class Perro(Animal):
    def hacer_sonido(self):
        return "¡Guau!"


class Gato(Animal):
    def hacer_sonido(self):
        return "¡Miau!"


def imprimir_sonido(animal):
    print(f"{animal.nombre} hace: {animal.hacer_sonido()}")


# Ejemplo de uso
mi_perro = Perro("Buddy")
mi_gato = Gato("Whiskers")

imprimir_sonido(mi_perro)  # Salida: Buddy hace: ¡Guau!
imprimir_sonido(mi_gato)   # Salida: Whiskers hace: ¡Miau!
