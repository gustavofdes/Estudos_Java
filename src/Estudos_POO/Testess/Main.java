package Estudos_POO.Testess;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(11);
        listaNumeros.add(20);
        listaNumeros.add(33);

        calculadora.somaVarArgs(listaNumeros);
    }
}
