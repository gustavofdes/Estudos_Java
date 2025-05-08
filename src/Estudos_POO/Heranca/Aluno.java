package Estudos_POO.Heranca;

public class Aluno extends Pessoa {
    private boolean matricula = true;
    private String curso;

    public Aluno(String nome, int idade, String sexo, boolean matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void cancelarMatricula(){
        setMatricula(false);
        System.out.println("Matricula cancelada com sucesso");
    }

    public void pagarMensalidade(){
        System.out.println("Mensalidade de ALUNO paga com sucesso");
    }



    // Metodos Especiais
    public boolean getMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        curso = curso;
    }
}
