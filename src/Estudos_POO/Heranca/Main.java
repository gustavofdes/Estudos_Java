package Estudos_POO.Heranca;

public class Main {
    public static void main(String[] args) {

        Bolsista b1 = new Bolsista("Gustavo", 20, "Masculino", true, "ADS", "VIP");
        Professor p1 = new Professor("Maria", 45, "Feminino", "Matematica", 2500.00);

        b1.pagarMensalidade();
        p1.receberAumento(500.00);
        System.out.println(p1.toString());
    }
}
