import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean ehPrimo = true;
        int contador = 0;
        System.out.println("Digite um numero");
        int n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            ehPrimo=true;
        } else {
            ehPrimo=false;
        }
        System.out.println(ehPrimo);

    }
}
