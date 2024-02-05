//DeathbatO

public class Extra {
    
    public static double calcFactorial(int num){
        if(num == 0){
            return 1;
        }else{
            return num * calcFactorial(num-1);
        }
    }

    public static double calcFibonacci(int num){
        if(num == 0){
            return 0;
        }else if(num == 1){
            return 1;
        }else{
            return num + calcFibonacci(num-1);
        }
    }

    public static void main(String[] args) {
        
        int numero = 10;

        System.out.println("El factorial de "+numero+" es "+calcFactorial(numero));
        System.out.println("El Fibonacci hasta el "+numero+" es "+calcFibonacci(numero));
    }
}
