package aulas06_controleDeFluxo;



public class SistemaPlanoSwitch {
    public static void main(String[] args) {


        System.out.println("Bem vindo a nossa operadora!");
        System.out.println("Escolhar um plano: Turbo(T), Midia(M) ou Basic(B)");
        String escolha = "t";

        System.out.println("Seu novo plano: ");

        switch (escolha.toUpperCase()){
            case "T":{
                System.out.println("5 GB Youtube");
            }
            case "M":{
                System.out.println("WhatsApp e Instagram gratis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");

            }        }
    }
}
