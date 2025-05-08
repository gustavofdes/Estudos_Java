package Estudos_POO.Encapsulamento;

public class Main {
    public static void main(String[] args) {
        Viagem viagem = new Viagem();

        Transporte carro = new Carro();
        Transporte aviao = new Aviao();

        viagem.iniciarViagem(carro);
        viagem.iniciarViagem(aviao);
    }
}
