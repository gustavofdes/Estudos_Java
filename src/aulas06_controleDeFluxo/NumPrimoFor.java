package aulas06_controleDeFluxo;

public class NumPrimoFor {
    public static void main(String[] args) {
        System.out.println("Numeros primos até 100: ");

        for (int num = 2; num <= 100; num++){
            if (ehPrimo(num)){
                System.out.println(num);
            }
        }
    }

    public static boolean ehPrimo(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
