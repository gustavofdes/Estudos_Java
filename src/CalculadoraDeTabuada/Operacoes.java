package CalculadoraDeTabuada;

public class Operacoes {

    public void realizarOperacao(int numeroEscolhido, String opEscolhida){
        double resultado = 0;
        for (int i = 1; i <= 10; i++){

            switch (opEscolhida){
                case "+": {
                    resultado = numeroEscolhido + i;
                    break;
                }
                case "-": {
                    resultado = numeroEscolhido - i;
                    break;
                }
                case "*": {
                    resultado = numeroEscolhido * i;
                    break;
                }
                case "/": {
                    resultado = (double) numeroEscolhido / i;
                    break;
                }
            }
            System.out.println(numeroEscolhido +" " + opEscolhida + " " + i + " = " + resultado);
        }
    }
}