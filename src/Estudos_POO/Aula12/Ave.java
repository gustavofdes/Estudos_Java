package Estudos_POO.Aula12;

public class Ave extends Animal{
    private String corPena;

    public void fazerNinho(){
        System.out.println("Fazendo ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Se locomovendo voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo minhocas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de passarinhos");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
