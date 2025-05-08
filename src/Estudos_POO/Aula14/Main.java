package Estudos_POO.Aula14;

public class Main {
    public static void main(String[] args) {



        Video[] v = new Video[3];
        Gafanhoto[] g = new Gafanhoto[3];

        g[0] = new Gafanhoto("Gustavo Ferreira" , 14, EscolhaSexo.MASCULINO, "GuntinXP");

        v[0] = new Video("Gente Grande 1");

        System.out.println(v[0].toString());
        v[0].play();
        System.out.println(v[0].toString());

        System.out.println("\n" + g[0].toString());
        g[0].viuMaisUm();
        System.out.println(g[0].toString());


    }
}
