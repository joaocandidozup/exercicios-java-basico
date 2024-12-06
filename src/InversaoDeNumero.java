import java.util.Scanner;

public class InversaoDeNumero {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite um numero inteiro :");
        int numero = leitura.nextInt();
        int numeroInvertido = 0;

        while (numero != 0){
            int separadorDigito = numero % 10;
            numeroInvertido = (numeroInvertido * 10) + separadorDigito;
            numero /= 10;
        }
        System.out.println(numeroInvertido);
    }
}
