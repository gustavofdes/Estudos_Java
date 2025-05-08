package Estudos_POO.TesteCarro;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano){
        setModelo(modelo);
        setMarca(marca);
        setAno(ano);
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano){
        if (ano >= 1886 && ano <= 2025){
            this.ano = ano;
        } else {
            System.out.println("Ano invalido! Ano definido para 1886");
            this.ano = 1886;
        }
    }

    public void exibirInformacoes(){
        System.out.println("Carro: " + this.marca + " " + this.modelo + " - Ano " + this.ano);
    }

}
