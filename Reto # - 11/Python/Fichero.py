## DeathbatO

import os

def crear_archivo(nombre_archivo):
    with open(nombre_archivo, 'w') as archivo:
        archivo.write("Nombre: Daniel\n")
        archivo.write("Edad: 25\n")
        archivo.write("Lenguaje de programación favorito: Python\n")

def imprimir_contenido(nombre_archivo):
    with open(nombre_archivo, 'r') as archivo:
        contenido = archivo.read()
        print("Contenido del archivo:")
        print(contenido)

def borrar_archivo(nombre_archivo):
    if os.path.exists(nombre_archivo):
        os.remove(nombre_archivo)
        print(f"El archivo {nombre_archivo} ha sido borrado.")
    else:
        print(f"El archivo {nombre_archivo} no existe.")

# Nombre de usuario de GitHub para el nombre del archivo
nombre_archivo = "Deathbat0.txt"

# Crear el archivo
crear_archivo(nombre_archivo)

# Imprimir el contenido del archivo
imprimir_contenido(nombre_archivo)

# Borrar el archivo
borrar_archivo(nombre_archivo)
