package aulas06_controleDeFluxo;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        int n = 0;
        int numFim;
        String resp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva um numero para ver todos os numeros pares até ele: ");
        numFim =scan.nextInt();

        while (n < numFim){
            n++;

            if (n % 2 == 0){
                continue;
            }

            System.out.println(n);
        }

    }
}
