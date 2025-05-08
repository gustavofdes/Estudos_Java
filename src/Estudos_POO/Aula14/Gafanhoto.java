package Estudos_POO.Aula14;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totalAssistido;

    public Gafanhoto(String nome, int idade, EscolhaSexo sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    public void viuMaisUm(){
        setTotalAssistido(getTotalAssistido() + 1);
        ganharExperiencia(10);
        System.out.println("Mais um video assistido com sucesso!");
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto {" +
                "login='" + login + '\'' +
                ", totalAssistido=" + totalAssistido +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", experiencia=" + experiencia +
                ", sexo='" + sexo + '\'' +
                " }";
    }
}
