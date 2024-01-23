## DeathbatO

def es_Palindromo(word):
    return word == word[::-1]

def es_Anagrama(word1, word2):
    return sorted(word1) == sorted(word2)

def es_Isograma(word):
    return len(set(word)) == len(word)

palabra1 = input("Por favor ingrese la primera palabra: ")
palabra2 = input("Por favor ingrese la segunda palabra: ")

if es_Palindromo(palabra1):
    print(f"La palabra {palabra1} es palindromo.")
else: 
    print(f"La palabra {palabra1} no es palindromo.")

if es_Palindromo(palabra2):
    print(f"La palabra {palabra2} es palindromo.")
else: 
    print(f"La palabra {palabra2} no es palindromo.")

if es_Anagrama(palabra1, palabra2):
    print(f"Las palabras {palabra1} y {palabra2} son un anagrama.")
else: 
    print(f"Las palabras {palabra1} y {palabra2} no son un anagrama.")

if es_Isograma(palabra1):
    print(f"La palabra {palabra1} es un isograma.")
else: 
    print(f"La palabra {palabra1} no es un isograma.")

if es_Isograma(palabra2):
    print(f"La palabra {palabra2} es un isograma.")
else: 
    print(f"La palabra {palabra2} no es un isograma.")
