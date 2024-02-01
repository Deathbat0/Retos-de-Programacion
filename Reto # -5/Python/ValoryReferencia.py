## DeathbatO

###---- Tipos Inmutables ---###

##- Asignacion por valor

x = 5
y = x

#Modificacion de y no afecta el valor de x
x = 10
print(f"Valor de X: {x} y Valor de Y: {y}")

##- Asignacion por referecia

lista1 = [1, 2, 3]
lista2 = lista1

#Modificacion de la lista1 afecta a las lista2
lista1.append(4)
print(lista2)

###--- Funciones Con parametros por valor y referencia ---###

##--Por Valor--##

def modValor(num):
    num = 10
    return num

x = 5
print(modValor(x)) # Modifica el valor
print(x) # El valro de x sigue siendo 5

##--Por Referencia--##

def modList(lista):
    lista.append(4)

listaejemplo = [1, 2, 3]
modList(listaejemplo)
print(listaejemplo)