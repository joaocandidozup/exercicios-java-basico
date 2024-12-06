import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("quantos numeros voçê quer da sequencia de fibonacci? ");
        int numeros = leitura.nextInt();

        int primeiroNumero = 0;
        int segundoNumero = 1;
        System.out.print(primeiroNumero+","+segundoNumero+",");
        for(int i =2; i < numeros;i++){
            int proximoNumero = primeiroNumero + segundoNumero;
            System.out.print(proximoNumero + ",");
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;
        }
    }
}
