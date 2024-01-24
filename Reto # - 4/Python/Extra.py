## DeathbatO

def es_Palindromo(word):
    return word == word[::-1]

def es_Anagrama(word1, word2):
    return sorted(word1) == sorted(word2)

def es_Isograma(word):
    return len(set(word)) == len(word)

palabra = input("Por favor ingrese una palabra para comprobar si es palindromo: ")

if es_Palindromo(palabra):
    print(f"La palabra {palabra} es palindromo.")
else: 
    print(f"La palabra {palabra} no es palindromo.")

palabra1 = input("Ingrese la primera palabra para comprobar si son anagrama: ")
palabra2 = input("Ingrese la segunda palabra para comprobar si son anagrama: ")

if es_Anagrama(palabra1, palabra2):
    print(f"Las palabras {palabra1} y {palabra2} son un anagrama.")
else: 
    print(f"Las palabras {palabra1} y {palabra2} no son un anagrama.")

palabra = input("Por favor ingrese una palabra para comprobar si es isograma: ")

if es_Isograma(palabra):
    print(f"La palabra {palabra} es un isograma.")
else: 
    print(f"La palabra {palabra} no es un isograma.")

