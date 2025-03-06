package CaculadoraFatorial;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num = scanner.nextInt();

        Calculadora cal = new Calculadora();

        System.out.println("O fatorial de " + num + "é igual a " + cal.calcular(num));
    }
}
