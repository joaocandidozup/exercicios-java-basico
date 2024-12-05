import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite um numero inteiro ");
        int numero = entrada.nextInt();
        int contadorDeDigitos = 0;

        while (numero != 0){
            numero/= 10;
            contadorDeDigitos++;
        }
        System.out.println(contadorDeDigitos);
    }
}
