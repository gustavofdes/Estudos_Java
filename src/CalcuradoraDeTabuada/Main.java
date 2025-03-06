package CalcuradoraDeTabuada;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int num;

    public static void main(String[] args) {
        Operacoes op = new Operacoes();

        System.out.println("Operação (+, -; *, /): ");
        String opEscolhida = scanner.nextLine();


        System.out.println("Numero: ");
        num = scanner.nextInt();

        if (num == 0 && opEscolhida.equals("/")){
            System.out.println("Não é possível dividir por zero. Tente novamente");
            return;
        }

        switch (opEscolhida){

            case "*":{
                op.multiplicar(num, opEscolhida);
                break;
            }

            case "/":{
                op.dividir(num, opEscolhida);
                break;
            }

            case "-":{
                op.subtrair(num, opEscolhida);
                break;
            }

            case "+":{
                op.somar(num, opEscolhida);
                break;
            }

            default:{
                System.out.println("Operação Invalida");
            }

        }


    }

}
