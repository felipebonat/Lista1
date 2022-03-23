import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float celsius;
        System.out.print("Diga a temperatura em graus Celsius: ");
        celsius = entrada.nextFloat();

        float conversao;
        conversao = (celsius*9/5)+32;
        System.out.println(celsius + " graus Celsius é igual à: " + conversao  + " Fahrenheit."); 
    }
}
