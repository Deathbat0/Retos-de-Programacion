
//DeathbatO

#include <iostream>

using namespace std;

int main(){
    // Declaracion de variables que se usaran en el codigo
    int a, b, c, d, t, x, k, num, divi;
    bool bite1, bite2;
    char vocal;

    ////-------- Operadores ---------////

    //-- Aritmeticos --//
    a = 5;
    b = 10;
    short sum = a + b;
    short res = a - b;
    short mult = a * b;
    short div = a / b;
    short mod = a % b;
    /* Con el siguiente print se podra visualizar el resultado de cualquier
    operacion realizada en esta seccion reemplazando la que esta como ejemplo*/
    cout<<"Ejemplo de Operador Aritmetico (Modulo): "<<mod<<endl;


    //-- Comparativos --//
    c = 6;
    d = 7;
    bool OperadorIgual = (c == d);
    bool OperadorDesigual = (c != d);
    bool OperadorMayor = (c > d);
    bool OperadorMenor = (c < d);
    bool OperadorMayoroIgual = (c >= d);
    bool OperadorMenoroIgual = (c <= d);
    /* Con el siguiente print se podra visualizar el resultado de cualquier
    operacion realizada en esta seccion reemplazando la que esta como ejemplo*/
    cout<<"Ejemplo de operador comparativo (Menor): "<<OperadorMenor<<endl;//True (1)


    //-- Logicos --//
    bite1 = true;
    bite2 = false;
    bool OperadorAnd = (bite1 && bite2);
    bool OperadorOr = (bite1 || bite2);
    bool OperadorNot = (!bite1);
    /* Con el siguiente print se podra visualizar el resultado de cualquier
    operacion realizada en esta seccion reemplazando la que esta como ejemplo*/
    cout<<"Ejemplo de operador logico (And): "<<OperadorAnd<<endl;//False (0)


    //-- Bits --//
    short OpBitsRS = 10 << 2; // Rigth Shift (Desplazamiento a la derecha)
    short OpBitsLS = 10 >> 2; // Left Shift (Desplazamiento a la izquierda)
    short OpBitsXor = 10 ^ 2; // Operador XOR 4 ^ 2 = 6
    /* Con el siguiente print se podra visualizar el resultado de cualquier
    operacion realizada en esta seccion reemplazando la que esta como ejemplo*/
    cout<<"Ejemplo de operador de Bits (OpBitsXor): "<<OpBitsXor<<endl;


    ////-------- Estructuras de control ---------////

    //-- Condicionales --//
    cout<<"Por favor digita un numero entero para compararlo con 20: ";
    cin>>t;
    if(t > 20){
        cout<<"El numero es mayor a 20"<<endl;
    }else if(t < 20){
        cout<<"El numero es menor a 20"<<endl;
    }else{
        cout<<"El numero es 20"<<endl;
    }


    cout<<"Por favor ingresa una vocal en mayuscula: ";
    cin>>vocal;

    switch (vocal){
    case 'A':
        cout<<"Vocal A"<<endl;
        break;
    case 'E':
        cout<<"Vocal E"<<endl;
        break;
    case 'I':
        cout<<"Vocal I"<<endl;
        break;
    case 'O':
        cout<<"Vocal O"<<endl;
        break;
    case 'U':
        cout<<"Vocal U"<<endl;
        break;
    
    default:
        cout<<"Eso no era una vocal o no estaba en mayuscula: "<<endl;
        break;
    }


    //-- Iterativas --//
    //Imprime los numero pares desde el 0 hasta el 12
    for(int i = 0; i <= 12; i++){
        if(i % 2 == 0){
            cout<<i<<" ";
        }
    }
    cout<<""<<endl;

    //Imprime los numeros multiplos de 3 desde el 0 hasta el 15
    k = 0;
    while(k <= 15){
        if(k % 3 == 0){
            cout<<k<<" ";
        }
        k++;
    }
    cout<<""<<endl;


    //-- Excepciones --//
    cout<<"Ingresa un numero para que 10 sea dividido por el: "<<endl;
    cin>>num;
    try{
        if(num == 0){
            throw std::runtime_error("No podemos dividir entre 0");
        }
        divi = 10 / num;
        cout<<"El resultado de la divicion es: "<<divi<<endl;
    }catch(const std::exception& e){
        std::cerr<<"Error: "<<e.what()<<"\n"<<endl;
    }


    ////-------- Reto Extra ---------////

    //-- Ejercicio con For --//

    cout<<"Ejercicio con For: "<<endl;
    for(int i = 10; i < 56; i++){
        if(i % 2 == 0 && i != 16 && i % 3 == 0){
            cout<<i<<" ";
        }
    }
    cout<<""<<endl;

    //-- Ejercicio con while --//
    cout<<"Ejercicio con While: "<<endl;
    k = 10;
    while(k < 56){
        if(k % 2 == 0 && k != 16 && k % 3 == 0){
            cout<<k<<" ";
        }
        k++;
    }

}