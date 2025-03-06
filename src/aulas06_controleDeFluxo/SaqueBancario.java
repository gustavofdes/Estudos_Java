package aulas06_controleDeFluxo;

/**
 * Teste condicional
 * @author Gustavo
 */


public class SaqueBancario {


    public static void main(String[] args) {
        double saldo = 50.0;
        double valorSolicitado = -10.0;

        double saldoAtualizado = sacar(saldo, valorSolicitado);

        if (saldoAtualizado >= 0){
            System.out.println("Saque realizado com sucesso");
            System.out.println("Saldo: " + saldoAtualizado);
        }
        else {
            System.out.println("Saldo insuficiente!");
            System.out.println("Saldo: " + saldo);
        }
    }

    /**
     *
     * @param saldo Saldo atual
     * @param valorSolicitado Valor que deseja sacar
     * @return Saldo ja atualizado, caso for insuficente, retorna o valor −1
     */

    static double sacar (double saldo, double valorSolicitado){
        if (valorSolicitado >= 0 && saldo >= valorSolicitado){
            return saldo - valorSolicitado;
        }
        return -1;
    }
}
