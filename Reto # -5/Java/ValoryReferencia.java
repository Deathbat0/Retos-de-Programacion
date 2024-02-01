// DeathbatO

import java.util.ArrayList;
import java.util.List;

public class ValoryReferencia {
    
    public static void main(String[] args){
        ///---Por valor--///

        int x = 5;
        int y = x;
        
        x = 10; // Modificacion de x no altera a y
        System.out.println(y);


        //--Por Referencia--//

        List<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);

        List<Integer> lista2 = lista1;

        lista1.add(4);//Modificacion en lista1 afecta a lista2
        System.out.println(lista2);


        //--Por Valor usando funcion--//
        int a = 5;
        modValor(a);
        System.out.println(a); // Salida: 5 (sin cambios)


        //--Por Referencia usando funcion--//
        List<Integer> miLista = new ArrayList<>();
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);

        modLista(miLista);
        System.out.println(miLista); // Salida: [1, 2, 3, 4] (modificada)
    }
    //--Funcion para asignacion por valor
    public static void modValor(int num){
        num = 10;
    }
    //--Funcion para asignacion por Referencia
    public static void modLista(List<Integer> lista){
        lista.add(4);
    }
}
