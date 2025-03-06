package aulas04_operadores;

public class Concatenacao {

    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";

//qual o resultado das expressões abaixo?
        String concatenacao ="?";

        concatenacao = 1+1+1+"1"; //31

        concatenacao = 1+"1"+1+1; //1111

        concatenacao = 1+"1"+1+"1"; //1111

        concatenacao = "1"+1+1+1; //1111

        concatenacao = "1"+(1+1+1); //13 (Nesse caso ele fiz primeiro a envidência entre parenteses e dps a concatenização
    }
}

//O programa depois que ver a String, ele ira fazer a concatenização e não a soma
