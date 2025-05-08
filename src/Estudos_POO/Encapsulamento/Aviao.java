package Estudos_POO.Encapsulamento;

public class Aviao implements Transporte{
    @Override
    public void mover() {
        System.out.println("Estou me movendo sobre o ar");
    }
}
