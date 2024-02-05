## DeathbatO

def calc_factorial(num):
    if num == 0:
        return 1
    else:
        return num * calc_factorial(num-1)

def calc_fibo(num):
    if num == 0:
        return 0
    elif num == 1:
        return 1
    else:
        return num + calc_fibo(num-1)

numero = 10

print(f"El factorial de {numero} es: {calc_factorial(numero)}")
print(f"El fibonacci hasta el {numero} es: {calc_fibo(numero)}")

