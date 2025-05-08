package Estudos_POO.Aula12;

public class Peixe extends Animal{
    private String corEscama;

    public void soltarBolhas(){
        System.out.println("Estou soltando bolhass");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substacias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
