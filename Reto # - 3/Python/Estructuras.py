## DeathbatO

###---- Estructuras -----###

##--Listas--##

# Creación de una lista
lista = [1, 2, 3, 4, 5]

# Inserción de un elemento al final
lista.append(6)

# Inserción de un elemento en una posición específica
lista.insert(2, 10)

# Actualización de un elemento
lista[3] = 8

# Borrado de un elemento por valor
lista.remove(4)

# Borrado de un elemento por índice
del lista[0]

# Ordenación de la lista
lista.sort()

print(lista)

##--Tuplas--##

# Creación de una tupla
tupla = (1, 2, 3, 4, 5)

# Acceso a elementos por índice
elemento = tupla[2]

# Desempaquetado de tupla
a, b, *resto = tupla

print(elemento, a, b, resto)

##--Conjuntos--##

# Creación de un conjunto
conjunto = {1, 2, 3, 4, 5}

# Inserción de un elemento
conjunto.add(6)

# Eliminación de un elemento
conjunto.remove(3)

# Operaciones de conjuntos
otro_conjunto = {4, 5, 6}
union = conjunto.union(otro_conjunto)
interseccion = conjunto.intersection(otro_conjunto)

print(union, interseccion)

##--Diccionarios--##

# Creación de un diccionario
mi_diccionario = {'a': 1, 'b': 2, 'c': 3}

# Acceso a un valor por clave
valor = mi_diccionario['b']

# Actualización de un valor
mi_diccionario['c'] = 4

# Inserción de un nuevo par clave-valor
mi_diccionario['d'] = 5

# Eliminación de un par clave-valor
del mi_diccionario['a']

print(mi_diccionario)

##--Cadenas de texto--##
# Creación de una cadena
mi_cadena = "Hola, mundo!"

# Concatenación de cadenas
nueva_cadena = mi_cadena + " Soy Python."

# Obtener longitud de la cadena
longitud = len(nueva_cadena)

# Mayúsculas y minúsculas
mayusculas = nueva_cadena.upper()
minusculas = nueva_cadena.lower()

print(nueva_cadena, longitud, mayusculas, minusculas)