package aulas04_operadores;

import java.util.Date;

public class Atribuicoes {
    String nome = "GLEYSON";
    int idade = 22;
    double peso = 68.5;
    char sexo = 'M';
    boolean doadorOrgao = false;
    Date dataNascimento = new Date();

    public static void main(String[] args) {
        Atribuicoes caracteristicas = new Atribuicoes();

        System.out.println(caracteristicas.peso);
    }
}
