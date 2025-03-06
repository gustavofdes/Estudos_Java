package CaculadoraFatorial;

public class Calculadora {

    public long calcular (int numero){
        long fatorial = 1;
        for (int i = 1; i <= numero; i++){
            fatorial = fatorial * i;
        }

    return fatorial;
    }
}
