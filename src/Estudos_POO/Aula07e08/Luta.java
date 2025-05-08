package Estudos_POO.Aula07e08;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiante;
    private Lutador desafiado;
    private boolean aprovada;
    private int rounds;

    //Metodos
    public void marcarLuta(Lutador lutador1, Lutador lutador2){
        if (lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2){
            this.setAprovada(true);
            this.desafiante = lutador1;
            this.desafiado = lutador2;
            System.out.println("Luta marcada!");
        } else {
            this.setAprovada(false);
            this.desafiante = null;
            this.desafiado =  null;
            System.out.println("A luta não pode ser realizada!");
        }
    }

    public void luta(){
        if (this.isAprovada()){

            this.desafiante.apresentar();
            this.desafiado.apresentar();

            Random random = new Random();

            int resultado = random.nextInt(3);

            System.out.println("------------------------------------");
            switch (resultado){
                case 0: {
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    System.out.println("O lutador " + this.desafiante.getNome() + " ganhou a luta de hoje!");
                    break;
                }

                case 1: {
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("O lutador " + this.desafiado.getNome() + " ganhou a luta de hoje!");
                    break;
                }

                case 2: {
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println("Tivemos um empate!");
                    break;
                }
            }
            System.out.println("------------------------------------");
            this.desafiante.status();
            this.desafiado.status();
        } else {
            System.out.println("Essa luta não esta aprovada para acontecer");
        }
    }





    //Metodos Especiais
    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
}
