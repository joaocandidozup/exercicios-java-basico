import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculaIdade {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("digite seu nome ");
        String nome = leitura.nextLine();
        System.out.print("digite o ano do seu nascimento ");
        int ano = leitura.nextInt();
        LocalDate dataDeNascimento = LocalDate.of(ano,1,1);
        LocalDate dataAtual = LocalDate.now();

        Period idade = Period.between(dataDeNascimento,dataAtual);
        System.out.println(nome+" voçê tem "+idade.getYears()+" anos");
    }
}
