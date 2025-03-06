package Aula_Wrappers;

import java.util.Scanner;

public class Tipos_Wrappers {


    public boolean isPar(String frase){

        return frase.toLowerCase().contains("cachorro");
    }


    public static void main(String[] args) {
        Tipos_Wrappers fraseUsuario = new Tipos_Wrappers();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fala ai uma frase");
        String fraseUser = scanner.nextLine();
        System.out.println(fraseUser);

        if (fraseUsuario.isPar(fraseUser)) {
            System.out.println("Sua frase tem cachorro");
        }
        else{
                System.out.println("sua Frase nao tem cachorro");
            }

    }
}
