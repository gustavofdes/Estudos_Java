package Estudos_POO.Conta;

public interface SistemaBancario {
    public abstract void depositarSaldo(double valor);
    public abstract void sacarSaldo(double valor);
    public abstract void exibirSaldo();
}
