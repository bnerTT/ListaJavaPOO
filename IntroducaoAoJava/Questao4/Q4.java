package IntroducaoAoJava.Questao4;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int temperaturaCelsius;
        
        System.out.println("Insira a temperatura em graus celsius:");
        temperaturaCelsius = input.nextInt();
        System.out.printf("A temperatura em Fahrenheit é %.2f .", (temperaturaCelsius * 1.8) + 32);
        input.close();
    }
}
