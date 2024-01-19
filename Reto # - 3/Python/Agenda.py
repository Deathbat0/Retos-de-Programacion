##DeathbatO

##--Agenda de contactos

agenda = {}

#Funcion para buscar dentro de los contactos
def buscar():
    nombre = input("Introduce el nombre del contacto a buscar: ")
    if nombre in agenda:
        print(f"Telefono de {nombre}: {agenda[nombre]}")
    else:
        print(f"{nombre} no se encuentra en la agenda.")

#Funcion para agregar contacto
def agregar():
    nombre = input("Introduce el nombre del nuevo contacto: ")
    telefono = input("Introduce el numero de telefono: ")
    
    # Validar que el numero de teléfono sea numérico y tenga la longitud deseada
    if telefono.isdigit() and len(telefono) <= 11:
        agenda[nombre] = telefono
        print(f"Contacto {nombre} agregado correctamente.")
    else:
        print("Numero de telefono no valido. Debe ser numerico y tener como maximo 11 digitos.")

#Funcion para actualizar contacto
def actualizar():
    nombre = input("Introduce el nombre del contacto a actualizar: ")
    if nombre in agenda:
        nuevo_telefono = input("Introduce el nuevo numero de telefono: ")
        
        # Validar que el número de teléfono sea numérico y tenga la longitud deseada
        if nuevo_telefono.isdigit() and len(nuevo_telefono) <= 11:
            agenda[nombre] = nuevo_telefono
            print(f"Contacto {nombre} actualizado correctamente.")
        else:
            print("Número de telefono no valido. Debe ser numerico y tener como maximo 11 dígitos.")
    else:
        print(f"{nombre} no se encuentra en la agenda.")

#Funcion para eliminar contacto
def eliminar():
    nombre = input("Introduce el nombre del contacto a eliminar: ")
    if nombre in agenda:
        del agenda[nombre]
        print(f"Contacto {nombre} eliminado correctamente.")
    else:
        print(f"{nombre} no se encuentra en la agenda.")

#Funcion para mostrar los contactos de la agenda
def mostrar():
    print("\nAgenda de Contactos:")
    for nombre, telefono in agenda.items():
        print(f"{nombre}: {telefono}")
    print()


while True:
    ## Menu de opciones
    print("\nOperaciones disponibles:")
    print("1. Buscar contacto")
    print("2. Agregar contacto")
    print("3. Actualizar contacto")
    print("4. Eliminar contacto")
    print("5. Mostrar agenda")
    print("6. Salir")

    opcion = input("Selecciona una opcion (1-6): ")

    if opcion == '1':
        buscar()
    elif opcion == '2':
        agregar()
    elif opcion == '3':
        actualizar()
    elif opcion == '4':
        eliminar()
    elif opcion == '5':
        mostrar()
    elif opcion == '6':
        print("¡Hasta luego!")
        break
    else:
        print("Opción no valida. Por favor, elige una opcion del 1 al 6.")