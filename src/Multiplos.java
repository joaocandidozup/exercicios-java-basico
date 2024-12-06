import java.sql.SQLOutput;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int numero = entrada.nextInt();
        System.out.print("digite o numero limite: ");
        int numeroLimite = entrada.nextInt();

        for(int i =1;i <= numeroLimite;i++){
            if (i % numero == 0){
                System.out.print(i + ",");
            }

        }

    }
}
