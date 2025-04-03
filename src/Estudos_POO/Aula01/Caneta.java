package Estudos_POO.Aula01;

public class Caneta {
    String modelo;
    private String cor;
    double ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("A caneta é do modelo: " + this.modelo);
        System.out.println("Da cor: " + this.cor);
        System.out.println("A porta é: " + this.ponta);
        System.out.println("A carga dela esta: " + this.carga);
        System.out.println("Ela esta tampada: " + this.tampada);
    }

    void tampar(){
        tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }

    void rabiscar(){
        if (!tampada){
            System.out.println("Estou rabiscando...");
        } else {
            System.err.println("ERRO: A caneta esta tampada, impossivel rabiscar");
        }
    }
}
