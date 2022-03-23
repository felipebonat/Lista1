import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a sua idade ao final deste ano: ");
        int idade = entrada.nextInt();

        System.out.print("Digite o ano atual: ");
        int ano = entrada.nextInt();

        int anoNascimento;
        anoNascimento = ano - idade;
        System.out.println("De acordo com a idade informada e o ano atual, o ano em que você nasceu é: " + anoNascimento);

    }
}
