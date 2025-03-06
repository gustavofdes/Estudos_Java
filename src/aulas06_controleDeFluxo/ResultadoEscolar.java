package aulas06_controleDeFluxo;

import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nota = scanner.nextInt();

        if (nota >= 7){
            System.out.println("Aprovado !!");
        } else if (nota >= 5) {
            System.out.println("Aluno de recuperação");

        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
