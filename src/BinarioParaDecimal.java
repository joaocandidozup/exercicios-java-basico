import java.util.Scanner;

public class BinarioParaDecimal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("digite um numero binario ");
        int numeroBinario = leitura.nextInt();
        int decimal = 0;
        int expoente = 0;

        for(int i = numeroBinario;i >=0;i--){
            int digito = numeroBinario % 10;
            decimal += digito * Math.pow(2,expoente);
            numeroBinario /=10;
            expoente++;
        }
        System.out.println(decimal);

    }

}
