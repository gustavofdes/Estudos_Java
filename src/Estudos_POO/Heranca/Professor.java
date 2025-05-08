package Estudos_POO.Heranca;

public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAumento(double valorAumento){
        setSalario(getSalario() + valorAumento);
    }

    @Override
    public String toString() {
        return super.toString()
                + "Professor {" +
                "especialidade = '" + especialidade + '\'' +
                ", salario = " + salario +
                '}';
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
