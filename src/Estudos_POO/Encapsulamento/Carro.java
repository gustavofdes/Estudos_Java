package Estudos_POO.Encapsulamento;

public class Carro implements Transporte {

    @Override
    public void mover() {
        System.out.println("Estou me movendo sobre rodas");
    }
}
