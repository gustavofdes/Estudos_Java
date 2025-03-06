package aulas06_controleDeFluxo;

import java.util.Random;

public class DoWhile {
    private static int numeroTentativa;

    public static void main(String[] args) {
        System.out.println("Discando...");
        do {

            System.out.println("Telefone tocando - trim trim trim");
        } while (tocando());

    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(5)==1;
        numeroTentativa++;
        System.out.println("Atendeu? " + atendeu);
        System.out.println("A");

        return !atendeu;
    }



}
