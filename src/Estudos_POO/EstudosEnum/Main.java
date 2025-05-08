package Estudos_POO.EstudosEnum;

public class Main {
    public String teste;

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gustavo", 20, TipoCliente.PESSOA_FISISCA, Cliente.TipoPagamento.DEBITO);

        System.out.println(cliente1.toString());

        cliente1.imprimirDesconto(3000);
    }
}
