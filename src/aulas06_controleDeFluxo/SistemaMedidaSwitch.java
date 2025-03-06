package aulas06_controleDeFluxo;

import java.util.Scanner;

public class SistemaMedidaSwitch {
    public static void main(String[] args) {
        String medida;
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Digite uma medida valida: [G / M / P]");
            medida = scan.next().toUpperCase().trim();
            if (medida.equals("G") || medida.equals("M") || medida.equals("P")){
                break;
            } else {
                System.out.println("Opção invalida!");
            }
        }

        switch (medida){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:{
                System.out.println("INDEFINIDO");
            }
        }
    }
}
