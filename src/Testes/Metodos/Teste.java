package Testes.Metodos;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        int soma = 0, num = 0;
        String resp;
        Scanner scan = new Scanner(System.in);

        do {
            while (true){
                System.out.println("Digite um numero: ");
                try {
                    num = Integer.parseInt(scan.nextLine());
                    break;
                } catch (NumberFormatException e){
                    System.out.println("\nERRO: Digite um número válido!\n");
                }
            }
            soma += num;
            while (true){
                System.out.println("Deseja continuar? [S/N] ");
                resp = scan.nextLine();
                if (resp.trim().equalsIgnoreCase("S") || resp.trim().equalsIgnoreCase("N")){
                    break;
                } else{
                    System.out.println("\nERRO: Digite uma opção válida! Apenas 'S' ou 'N'.\n");
                }

            }
        } while (resp.trim().equalsIgnoreCase("S"));
        System.out.println("\nA soma dos números digitados é " + soma);
        }
    }
