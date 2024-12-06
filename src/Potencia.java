import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("digite o numero base: ");
        int base = leitura.nextInt();
        System.out.print("digite o expoente: ");
        int expoente = leitura.nextInt();
        int resposta = 1;

        for(int i =1;i<= expoente;i++){
           resposta *= base;
        }
        System.out.println(resposta);

    }
}
