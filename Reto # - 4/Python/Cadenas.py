##DeathbatO

# Declaracion de cadenas
cadena1 = "Ejemplo de cadena numero 1"
cadena2 = "Segundo ejemplo de cadena"

# Acceso a caracteres especificos
primer_caracter = cadena1[0]
print("Primer caracter:", primer_caracter)

# Subcadenas
subcadena = cadena1[1:3]
print("Subcadena:", subcadena)

# Longitud de la cadena
longitud = len(cadena1)
print("Longitud de la cadena:", longitud)

# Concatenacion
concatenacion = cadena1 + " " + cadena2
print("Concatenación:", concatenacion)

# Repeticion
repetida = cadena1 * 3
print("Repetición:", repetida)

# Recorrido de la cadena
for caracter in cadena1:
    print("Caracter:", caracter)

# Conversion a mayúsculas y minúsculas
mayusculas = cadena1.upper()
minusculas = cadena2.lower()
print("Mayúsculas:", mayusculas)
print("Minúsculas:", minusculas)

# Reemplazo
reemplazada = cadena1.replace('o', '0')
print("Reemplazo:", reemplazada)

# Division
partes = cadena1.split(' ')
print("División:", partes)

# Union
palabras = ["Python", "es", "genial"]
union = ' '.join(palabras)
print("Unión:", union)

# Interpolacion
nombre = "Daniel"
edad = 25
mensaje = f"Hola, soy {nombre} y tengo {edad} años."
print("Interpolación:", mensaje)

# Verificacion
contiene = "nu" in cadena1
print("Contiene 'la':", contiene)