## DeathbatO

import json
import xml.etree.ElementTree as ET
import os

def crear_archivo_xml(datos):
    root = ET.Element("Datos")
    for clave, valor in datos.items():
        if isinstance(valor, list):
            elem = ET.SubElement(root, clave)
            for item in valor:
                ET.SubElement(elem, "lenguaje").text = item
        else:
            ET.SubElement(root, clave).text = str(valor)
    tree = ET.ElementTree(root)
    tree.write("datos.xml")

def crear_archivo_json(datos):
    with open("datos.json", "w") as json_file:
        json.dump(datos, json_file, indent=4)

def mostrar_contenido_archivo(nombre_archivo):
    with open(nombre_archivo, "r") as file:
        print(file.read())

# Datos de ejemplo
datos = {
    "Nombre": "Daniel",
    "Edad": 25,
    "Fecha de nacimiento": "1998-09-13",
    "Lenguajes de programacion": ["Python", "Java", "C++"]
}

# Crear archivo XML
crear_archivo_xml(datos)
# Crear archivo JSON
crear_archivo_json(datos)

# Mostrar contenido de los archivos
print("Contenido del archivo XML:")
mostrar_contenido_archivo("datos.xml")
print("\nContenido del archivo JSON:")
mostrar_contenido_archivo("datos.json")

# Borrar archivos
os.remove("datos.xml")
os.remove("datos.json")
