
# DeathbatO

### Operadores ###

# Aritmeticos
a = 5
b = 10
suma = a + b
resta = a - b
mult = a * b
division = a / b
divEntera = a // b
modulo = a % b
potencia = a ** b
# El siguiente print muestra en consola el resultado de la resta como ejemplo
print(f"Ejemplo de operador aritmetico (operacion entre {a} y {b}): {resta}")


## Comparacion
c = 9
d = 11
igualdad = (c == d)
desigualdad = (c != d)
mayorque = (c > d)
menorque = (c < d)
mayoroigual = (c >= d)
menoroigual = (c <= d)
# El siguiente print muestra por consola el resultado de desigualdad como ejemplo
print(f"Ejemplo de Comparacion (Desigualdad): {desigualdad}") #True


## Operadores Logicos
bite1 = True
bite2 = False
operadorAnd = bite1 and bite2 #False
operadorOr = bite1 or bite2 #True
operadorNot = not bite1 #False
# El siguiente print muestra por consola el resultado de la operacion And
print(f"Ejemplo de operadores logicos (And): {operadorAnd}")


## Operadores de asignacion
#Asignacion simple
t = 100 # se asigna un valor de 100 a la variable 't'
#Asignacion de suma
t += 2 # Toma el valor que ya tenia y le suma 2
#Asignacion de resta
t -= 2 # Toma el valor que ya tenia y le resta 2
#Asignacion de multiplicacion
t *= 2 # Toma el valor que ya tenia y le multiplica 2
#Asignacion de division
t /= 2 # Toma el valor que ya tiene y lo divide entre 2
#Asignacion de divicion entera
t //= 2 # Toma el valor que ya tiene y hace la division entera entre 2
#Asignacion de potencia
t **= 2 #Toma el valor que ya tiene y hace la potencia al cuadrado


## Operadores de identidad
obj1 = 2
obj2 = 1

operdorIs = obj1 is obj1 # True por que son el mismo objeto
operdorIs2 = obj1 is obj2 # False por que no son el mismo objeto
operdaorIsnot = obj1 is not obj1 # False por que son el mismo objeto
operadorIsNot2 = obj1 is not obj2 # True por que no son el mismo objeto
# Este print muestra por consola el ejemplo del operadorIsNot2 (True)
print(f"Ejemplo de operador de identidad (Is Not): {operadorIsNot2}")


## Operadores de pertenencia
lista = [10,50,40,20,30]
operdorIn = (15 in lista) #False por que el elemento 15 no esta en la lista
opeadorNotIn = (25 not in lista) #True por que el elemento 25 no esta en la lista
print(f"Ejemplo de operdaor de pertenencia (Operdaor In): {operdorIn}")


## Operdaores de Bits
a = 1
b = 1

OpBitAnd = a & b
OpBitOr = a | b
OpBitNot = ~a
OpBitXor = a ^ b
OpBitLS = a << 2 # Left Shift (Desplazamiento a la izquierda)
OpBitsRS = b >> 2 # Rigth Shift (Desplazamiento a la derecha)
print(f"Ejemplo de operador de Bits (Or): {OpBitOr}")


### Estructuras de Control ###

## Condicionales
num = int(input("Ingrese un numero para compararlo con el numero 20: "))

if num > 20:
    print("El numero es mayor a 20")
elif num < 20:
    print("El numero es menor a 20")
else:
    print("El numero es 20")

## Iterativas
    
for i in range(10):
    print(i)

j = 5; 
while j > 0:
    print(j)
    j-=1

## Excepciones
    
while True:
    # try, except, finally
    try:
        x = int(input("Por favor ingrese un numero: "))
        break
    except ValueError:
        print("No ingresaste un numero, por favor digitalo bien")
    finally:
        print("Ahora si, continuamos")

    # Raise    
    x = "Entrada de texto"
    if not type(x) is int:
        raise TypeError("Solo se permiten numeros enteros")


### Reto Extra ###

## Ejercicio con for
    
for e in range(10, 56):
    if e % 2 == 0 and e != 16 and e % 3 ==0:
        print(e)

## Ejercicio con while
k = 10
while k <= 55:
    if k % 2 == 0 and k != 16 and k % 3 ==0:
        print(k)
    k += 1