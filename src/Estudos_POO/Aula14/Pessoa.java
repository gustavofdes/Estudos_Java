package Estudos_POO.Aula14;

public abstract class Pessoa {


    protected String nome;
    protected int idade;
    protected EscolhaSexo sexo;
    protected int experiencia;

    public Pessoa(String nome, int idade, EscolhaSexo sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public void ganharExperiencia(int quantidadeExp){
        setExperiencia(getExperiencia() + quantidadeExp);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public EscolhaSexo getSexo() {
        return sexo;
    }

    public void setSexo(EscolhaSexo sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
