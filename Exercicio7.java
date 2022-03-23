import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        double total;
        total = 780000.00;
        System.out.println("O valor total de R$780.000 dividido entre os três conforme o enunciado ficará da seguinte maneira: \n");

        double valorGanhador;
        valorGanhador = total * 46/100;
        System.out.println("O primeiro ganhador receberá: R$"+ valorGanhador +"\n");

        double valorGanhador2;
        valorGanhador2 = total * 32/100;
        System.out.println("O segundo ganahdor receberá: R$"+ valorGanhador2 +"\n");

        double valorGanhador3;
        valorGanhador3 = total * 22/100;
        System.out.println("Já o terceiro ganhador receberá: R$"+ valorGanhador3 +"\n");
    }
}
