//DeathbatO
 
 #include <iostream>

 using namespace std;

int numRecursivo(int num){
    //Caso base: cuando el numero llega a 0, se detiene la recursion.
    if(num < 0){
        return;
    }else{
        //Imprime por consola el numero actual
        cout<<num<<endl;
        //Llama recursivamente a la funcion con el numero decrecido en 1
        numRecursivo(num-1);
    }
}

 int main(){

    //Llamada inicial de la funcion con el numero inicial 100
    numRecursivo(100);

 }