// DeathbatO

#include <iostream>
#include <algorithm>
#include <unordered_set>

using namespace std;

bool esPalindromo(const string& palabra) {
    string palabraInvertida = palabra;
    reverse(palabraInvertida.begin(), palabraInvertida.end());
    return palabra == palabraInvertida;
}

bool esAnagrama(const string& palabra1, const string& palabra2) {
    string copiaPalabra1 = palabra1;
    string copiaPalabra2 = palabra2;

    sort(copiaPalabra1.begin(), copiaPalabra1.end());
    sort(copiaPalabra2.begin(), copiaPalabra2.end());

    return copiaPalabra1 == copiaPalabra2;
}

bool esIsograma(const string& palabra) {
    unordered_set<char> caracteres;
    for (char c : palabra) {
        if (!caracteres.insert(c).second) {
            return false;
        }
    }
    return true;
}

int main(){
    string word, pal1, pal2;

    cout<<"Por favor ingrese una palabra para comprobar si es palindromo. "<<endl;
    cin>>word;

    if(esPalindromo(word)){
        cout<<"La palabra "<<word<<" es palindromo."<<endl;
    }else{
        cout<<"La palabra "<<word<<" NO es palindromo."<<endl;
    }

    cout<<"Por favor ingrese la primera palabra para comprobar si es anagrama: "<<endl;
    cin>>pal1;
    cout<<"Por favor ingrese la segunda palabra para comprobar si es anagrama: "<<endl;
    cin>>pal2;

    if(esAnagrama(pal1, pal2)){
        cout<<"Las palbras "<<pal1<<" y "<<pal2<<" son un anagrama"<<endl;
    }else{
        cout<<"Las palbras "<<pal1<<" y "<<pal2<<" NO son un anagrama"<<endl;
    }

    cout<<"Por favor ingrese una palabra para comprobar si es isograma: "<<endl;
    cin>>word;

    if(esIsograma(word)){
        cout<<"La palabra "<<word<<" es un isograma."<<endl;
    }else{
        cout<<"La palabra "<<word<<" NO es un isograma."<<endl;
    }

}
