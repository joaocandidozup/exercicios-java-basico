import java.util.Scanner;

public class Polindromo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("digite um numero inteiro: ");
        int numero = leitura.nextInt();
        int aux = numero;
        int numeroInvertido = 0;
        boolean ehPolindromo = true;

        while (numero != 0){
        int digito = numero % 10;
        numeroInvertido = (numeroInvertido * 10) + digito;
        numero /= 10;
        }
        if(aux == numeroInvertido){
            ehPolindromo = true;
        }else{
            ehPolindromo = false;
        }

        System.out.println(ehPolindromo);
    }
}
