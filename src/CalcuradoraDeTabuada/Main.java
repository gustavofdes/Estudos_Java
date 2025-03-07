package CalcuradoraDeTabuada;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int num;

    public static void main(String[] args) {
        Operacoes op = new Operacoes();

        String respContinue;
        String opEscolhida;
        do {
            while(true){
                System.out.println("Operação (+, -; *, /): ");
                opEscolhida = scanner.next().trim();
                if (opEscolhida.equals("+") || opEscolhida.equals("-") || opEscolhida.equals("*") || opEscolhida.equals("/")){
                    break;
                } else {
                    System.out.println("\nERRO: Escolha um opção valida!\n");
                }
            }

            while (true){
            System.out.println("Numero: ");
                try {
                num = Integer.parseInt(scanner.next());
                break;
                } catch (NumberFormatException e){
                    System.out.println("ERRO: Digite um numero valido!!");
                }
            }

            if (num == 0 && opEscolhida.equals("/")) {
                System.out.println("Não é possível dividir por zero. Tente novamente");
                return;
            }

            switch (opEscolhida) {

                case "*": {
                    op.multiplicar(num, opEscolhida);
                    break;
                }

                case "/": {
                    op.dividir(num, opEscolhida);
                    break;
                }

                case "-": {
                    op.subtrair(num, opEscolhida);
                    break;
                }

                case "+": {
                    op.somar(num, opEscolhida);
                    break;
                }

                default: {
                    System.out.println("Operação Invalida");
                }

            }

            while (true) {
                System.out.println("Deseja fazer uma nova operação? [S/N]");
                respContinue = scanner.next().trim();
                if (respContinue.equalsIgnoreCase("S") || respContinue.equalsIgnoreCase("N")){
                    break;
                } else {
                    System.out.println("\nERRO: Selecione uma opção valida!!\n");
                }
            }
        } while (respContinue.trim().equalsIgnoreCase("S"));
        System.out.println("Programa encerrado com sucesso!");
        scanner.close();
    }
}
