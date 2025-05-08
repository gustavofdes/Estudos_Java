package Estudos_POO.Conta;

public class ContaBancaria implements SistemaBancario{
    private String nomeTitular;
    private double saldo;
    private String numConta;

    private double limiteDeSaque;




    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    @Override
    public void depositarSaldo(double valor) {
        this.saldo += valor;
        System.out.println("Valor de R$" + valor + " depositado com sucesso.");
    }

    @Override
    public void sacarSaldo(double valor) {
        if (this.saldo >= valor){
            limiteDeSaque = 1000;
            if (valor <= limiteDeSaque){
                this.saldo = saldo - valor;
                System.out.println("Saque realizado com sucesso");
            } else {
                System.out.println("Voce não pode ultrapassar o seu limite de saque po dia");
            }
        } else {
            System.out.println("Dinheiro insuficiente na conta");
        }

    }

    @Override
    public void exibirSaldo() {
        System.out.println("O valor do seu saldo até agora é de R$" + this.saldo);
    }
}
