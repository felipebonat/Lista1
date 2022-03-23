import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        float valor;
        System.out.print("Digite quantos dólares deseja converter em reais: ");
        valor = entrada.nextFloat();

        float dolar = 4.94f;

        float conversao = dolar * valor;
        System.out.println(valor + " dólares são " + conversao + " reais.");

    }
}
