package Estudos_POO.Aula07e08;

public class Main {

    public static void main(String[] args) {

        Lutador[] lutador = new Lutador[6];

        lutador[0] = new Lutador("Thiago", "Brasil", 25, 78.0, 175, 10, 2, 1);
        lutador[1] = new Lutador("Rafael", "Brasil", 30, 80.5, 180, 15, 3, 2);
        lutador[2] = new Lutador("Carlos", "Brasil", 28, 90.0, 185, 20, 5, 3);
        lutador[3] = new Lutador("Lucas", "Brasil", 27, 101.0, 178, 12, 4, 1);
        lutador[4] = new Lutador("Marcos", "Brasil", 29, 85.0, 182, 18, 6, 2);
        lutador[5] = new Lutador("Pedro", "Brasil", 26, 95.0, 190, 22, 7, 4);

        Luta ufc = new Luta();

        ufc.marcarLuta(lutador[3], lutador[5]);
        ufc.luta();

    }
}
