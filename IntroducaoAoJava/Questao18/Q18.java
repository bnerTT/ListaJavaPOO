package IntroducaoAoJava.Questao18;
import java.util.Scanner;


public class Q18 {
    public static void main(String[] args){
        int base, expoente, resultado;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o valor da base:");
        base = input.nextInt();
        System.out.println("Insira o valor do expoente:");
        expoente = input.nextInt();
        resultado = calculaPotencia(base, expoente);
        System.out.println("O valor retornado é " + resultado + ".");

        input.close();
        }


    public static int calculaPotencia(int base, int expoente){
        if (expoente == 1){
            return base;
        }
        else{
            return base * calculaPotencia(base, expoente-1);
        }
    }
}
