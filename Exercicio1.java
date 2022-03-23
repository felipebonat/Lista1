import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira um valor: ");
        int numero = entrada.nextInt();

        int numero2 = numero - 1;
        int numero3 = numero + 1;

        System.out.println("O número informado foi: " + numero);
        System.out.println("O seu antecessor é: " + numero2);
        System.out.println("E o seu sucessor é: " + numero3);

    }
}