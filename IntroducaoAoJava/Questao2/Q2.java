package IntroducaoAoJava.Questao2;
import java.util.Scanner;


public class Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Insira 3 números:");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        System.out.println("Soma: " + (n1+n2+n3) + "\nMédia: " + ((n1+n2+n3) / 3));
        input.close();
    }
}
