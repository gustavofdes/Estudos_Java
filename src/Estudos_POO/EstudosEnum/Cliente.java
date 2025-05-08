package Estudos_POO.EstudosEnum;

public class Cliente {
    public enum TipoPagamento{
        DEBITO {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        },
        CREDITO {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.05;
            }
        };

        public abstract double calcularDesconto(double valor);
    }

    private String nome;
    private int idade;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, int idade, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.idade = idade;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    public void imprimirDesconto( double valorDesconto){
        System.out.println("Valor a ser descontado é de R$" + TipoPagamento.CREDITO.calcularDesconto(valorDesconto));
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", tipoCliente=" + tipoCliente +
                ", Limite de credito = R$" + tipoCliente.getLIMITE_CREDITO() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
