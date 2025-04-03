package Estudos_POO.Aula02;

public class Caneta {

    private String modelo;
    private String cor;
    private double ponta;
    private int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor, int carga){

        setModelo(modelo);
    }


    public void setModelo (String m){
        this.modelo = m;
    }

    public void getModelo (){
        System.out.println("O modelo é: " + modelo);
    }

    public void status(){
        System.out.println("Modelo da caneta: " + this.modelo);
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Ponta da caneta: " + this.ponta);
        System.out.println("Carga da caneta: " + this.carga);
        System.out.println("A caneta esta tampada: " + this.tampada);


    }

}
