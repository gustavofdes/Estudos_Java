package aulas04_operadores;

import java.util.Scanner;

import static java.lang.System.in;

public class Ternarios {
    public static void main(String[] args) {

        Scanner scan = new Scanner(in);;
        String nome = "Maria Lucia";
        int idadeMaria = 0;
        System.out.println("Digite a idade de Maria: ");
        idadeMaria = scan.nextInt();
        int maiorIdade = 18;
        boolean MAIOR_IDADE = idadeMaria >= maiorIdade;

        String mensagem = nome + (MAIOR_IDADE ? " é maior de idade" : " NÃO é maior de idade"); //Jeito de usar o "if e else" de forma mais simples

        System.out.println(mensagem);
    }
}
