package aulas04_operadores;

public class Aritmetica {
    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20/4);





    public static void main(String[] args) { //formas abreviadas
    /*
  Vamos imaginar que n1 começaria com valor 10 e n2 com valor 5
  mas em seguida gostaria de somar o valor de n1 e n2 e atribuir a n2.
    */
        int n1 = 10;
        int n2 = 5;
// forma literal
        n2 = n2 + n1;

// forma abreviada
        n2 += n1;

        System.out.println(n2);
    }
}
