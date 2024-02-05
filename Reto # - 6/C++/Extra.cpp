//DeathbatO

#include <iostream>

using namespace std;

unsigned long long calcFact(int num){
    if(num == 0){
        return 1;
    }else{
        return num * calcFact(num-1);
    }
}

unsigned long long calcFibo(int num){
    if(num == 0){
        return 0;
    }else if(num == 1){
        return 1;
    }else{
        return num + calcFibo(num-1);
    }
}

int main(){

    int numero = 10;

    cout<<"El factorial de "<<numero<<" es "<<calcFact(numero)<<endl;
    cout<<"El fibonacci hasta el "<<numero<<" es "<<calcFibo(numero)<<endl;
}