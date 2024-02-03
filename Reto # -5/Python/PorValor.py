## DeathbatO

def cambiar_valor(a, b):
    temp = a
    a = b
    b = temp

    return a, b

a_original = 24
b_original = 56

nuevo_a, nuevo_b = cambiar_valor(a_original, b_original)

print("Por valor:")
print("Original: a =", a_original, "b =", b_original)
print("Nuevos: a =", nuevo_a, "b =", nuevo_b)