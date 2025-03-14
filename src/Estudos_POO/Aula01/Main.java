package Estudos_POO.Aula01;

public class Main {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();

        c1.ponta = 0.2;
        c1.cor = "vermelha";
        c1.modelo = "Bic Cristal";
        c1.carga = 1;
        c1.tampada = false;
        c2.cor = "Azul";
        c2.ponta = 1.0;

        c2.tampar();
        c1.status();
        c2.status();
    }
}
