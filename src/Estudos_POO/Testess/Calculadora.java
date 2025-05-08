package Estudos_POO.Testess;

import java.util.ArrayList;

public class Calculadora {

    public void somaVarArgs(ArrayList<Integer> numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
