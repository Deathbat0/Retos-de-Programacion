## DeathbatO

###  Funciones Basicas  ###

# Funcion sin parametros
def fun_sin_params():
    print("Impresion de una funcion sin parametros")

# Funcion con parametros sin retorno
def fun_con_params_sin_retorno(param1, param2):
    print(f"Impresion de funcion con parametros (parametro 1 : {param1}, parametro 2: {param2})")

# Funcion con retorno
def fun_con_retorno(a, b):
    return a + b

# Funcion dentro de funcion
def fun_big(b, c):
    a = 2
    def fun_small(d, c):
        return d * c
    return fun_small(b, c) + a

# Funcion ya creada dentro el lenguaje
def fun_creada(a, y):
    return pow(a, y)

# Variable global y local
var_glo = "Soy una vaiable global"
def var_loc():
    var_loc = "Soy una variable local"
    print(var_loc)


### Dificultad Extra ###
    
def funcion(string1, string2):
    count = 0
    for i in range(1, 101):
        if i % 3 == 0 and i % 5 == 0:
            print(string1+string2)
        elif i % 3 == 0:
            print(string1)
        elif i % 5 == 0:
            print(string2)
        else:
            print(i)
            count+=1
    print(f"Numero de veces que se imprimio el numero en lugar del texto: {count}")


fun_sin_params()

fun_con_params_sin_retorno("HOLA", 23)

fun_con_retorno(4, 6)       

print(fun_big(5, 5))

print(fun_creada(3, -2))

# Para impirmir la variable local invocamos la funcion
# como es local, solo se puede manipular dentro de la funcion
var_loc()
# Para impirmir la variable global simplemente la metemos en un print
# como es global se puede modificar o mostrar en cualquier parte del codigo
print(var_glo)

funcion("Fizz ", "Buzz ")

