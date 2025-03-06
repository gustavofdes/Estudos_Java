package Testes.Metodos;

//Estou fazendo teste para aprender sobre os retornos de metodos


import java.util.Scanner;

public class Metodos {

    public boolean isPar(int numero){

        return numero % 2 == 0;
    } /* Primeiro crie um metodo que volta um valor Bool, no caso ele verifica se o numero colocado é igual
    ao resto da divisão por 0, se for ele volta o valor true*/

    public static void main(String[] args) { //metodos main para rodar o codigo

        Metodos numeroDigitado = new Metodos(); //Fiz com que a classe "Metodos" vira-se uma um objeto para poder usar o metodo isPar()
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha um numero: ");
        int numeroEscolhido = scan.nextInt();

        if(numeroDigitado.isPar(numeroEscolhido)){ // condição para se o metodo isPar() for True (o if ja é acionado com o true, entao não a necessidade de um "== true")
            System.out.println("Seu numero é par!");
        }
        else { // se a condição for false (não for par)
            System.out.println("Seu numero não é par!");
        }
    }

}
