import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Diga a velocidade em Km/h: ");
        float velocidadeK = entrada.nextFloat();

        float velocidadeM;
        velocidadeM = velocidadeK / 36;
        System.out.println(velocidadeK + " Km/h convertido em metros por segundos é igual à: " + velocidadeM + " m/s");
    }
}
