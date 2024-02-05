## DeathabtO

def cambiar_referencia(a, b):
    a[0], b[0] = b[0], a[0]
    return a, b

a_original = [45]
b_original = [34]

nuevo_a, nuevo_b = cambiar_referencia(a_original,b_original)


print("Por valor:")
print("Original: a =", a_original, "b =", b_original)
print("Nuevos: a =", nuevo_a, "b =", nuevo_b)

