//DeathbatO

public class Reto3 {

    ///---- Funciones Basicas ----///

    //--Funcion sin parametros
    public static void funSinParams(){
        System.out.println("Impresion de una funcion sin parametros");
    }
    //--Funcion con parametros sin retorno
    public static void funConParamsSinRetorno(String param1, String param2){
        System.out.println("Impresion de funcion con parametros (parametro 1 : "+param1+", parametro 2: "+param2);
    }
    //--Funcion con retorno tipo entero
    public static int funConRetornoEntero(int a, int b){
        return a + b; 
    }
    //--Funcion ya creada dentro el lenguaje
    public static double funExp(double a, double b){
        return Math.pow(a, b);
    }
    
    //--Variable local y global
    static String varGlo = "Soy una variable global";
    public static void funVarLocal(){
        String varLocal = "Soy una variable local";
        System.out.println(varLocal);
    }

    ///---- Dificultad Extra  ---///
    public static void funcion(String string1, String string2){
        int count = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(string1+string2);
            }else if(i % 3 == 0){
                System.out.println(string1);
            }else if(i % 5 == 0){
                System.out.println(string2);
            }else{
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Cantidad de veces que se imprimio el numero en lugar de texto: "+count);
    }

    public static void main(String[] args) {
        
        funSinParams();
        funConParamsSinRetorno("Hola ", "Java");
        funConRetornoEntero(4, 5);
        System.out.println(funExp(2, 3));
        /*Para impirmir la variable local invocamos la funcion
        como es local, solo se puede manipular dentro de la funcion*/
        funVarLocal();
        /*Para impirmir la variable global simplemente la metemos en un print
        como es global se puede modificar o mostrar en cualquier parte del codigo*/
        System.out.println(varGlo);

        funcion("Fizz ", "Buzz");
    }
}
