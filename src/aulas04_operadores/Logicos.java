package aulas04_operadores;

//Os operadores lógicos são o && e o ||

public class Logicos {
    public static void main(String[] args) {
        int idadeMaria = 19;
        int idadeLucia = 20;
        final int MAIOR_IDADE = 18;

        if(idadeMaria >= MAIOR_IDADE && idadeLucia >= MAIOR_IDADE){ // executa se maria é maior de idade E lucia também
            System.out.println("As duas meninas são maiores de idade");
        }
        if (idadeMaria >= MAIOR_IDADE || idadeLucia >= MAIOR_IDADE){ // executa se maria é maior de idade OU lucia é
            System.out.println("Uma delas é maior de idade");
        }
        else {
            System.out.println("Nenhuma das meninas é maior de idade");
        }
    }
}
