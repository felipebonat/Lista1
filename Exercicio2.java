import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o primeiro valor: ");
        int numero = entrada.nextInt();

        System.out.print("Insira o segundo valor: ");
        int numero2 = entrada.nextInt();

        System.out.print("Insira o terceiro valor: ");
        int numero3 = entrada.nextInt();

        int valorTotal;
        valorTotal = numero + numero2 + numero3;
        System.out.println("A soma dos três valores são: " + valorTotal);
    }       
}