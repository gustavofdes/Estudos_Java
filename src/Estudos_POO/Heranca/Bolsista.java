package Estudos_POO.Heranca;

public class Bolsista extends Aluno{
    private String bolsa;

    public Bolsista(String nome, int idade, String sexo, boolean matricula, String curso, String bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Mensalidade de BOLSISTA paga com sucesso");
    }
}
