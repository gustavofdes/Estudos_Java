package Estudos_POO.Conta;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.depositarSaldo(500);
        contaBancaria.sacarSaldo(100);
        contaBancaria.exibirSaldo();
    }
}
