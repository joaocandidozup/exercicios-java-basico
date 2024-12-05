import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int fatorial = 1;
        int index =1;

        System.out.println("digite um numero");
        int numero = entrada.nextInt();

        while (index <= numero){
            fatorial *= index;
            index++;
        }
        System.out.println(fatorial);

    }
}
