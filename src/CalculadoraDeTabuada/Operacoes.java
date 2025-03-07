package CalculadoraDeTabuada;

public class Operacoes {

    public void multiplicar(int numeroEscolhido, String opEscolhida){

        for (int i = 1; i <= 10; i++){
            int resultado = (numeroEscolhido*i);
            System.out.println(numeroEscolhido +" " + opEscolhida + " " + i + " = " + resultado);
        }

    }

    public void dividir(int numeroEscolhido, String opEscolhida){

        for (int i = 1; i <= 10; i++){
            double resultado = (double) numeroEscolhido /i;
            System.out.println(numeroEscolhido +" " + opEscolhida + " " + i + " = " + resultado);
        }

    }

    public void subtrair(int numeroEscolhido, String opEscolhida){

        for (int i = 1; i <= 10; i++){
            int resultado = numeroEscolhido-i;
            System.out.println(numeroEscolhido +" " + opEscolhida + " " + i + " = " + resultado);
        }

    }

    public void somar(int numeroEscolhido, String opEscolhida){

        for (int i = 1; i <= 10; i++){
            int resultado = numeroEscolhido+i;
            System.out.println(numeroEscolhido +" " + opEscolhida + " " + i + " = " + resultado);
        }

    }


}
