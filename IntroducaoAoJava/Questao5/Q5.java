package IntroducaoAoJava.Questao5;
import java.util.Scanner;


public class Q5 {
    public static void main(String[] args){
    double numeroModificado, numeroOriginal;
    Scanner input = new Scanner(System.in);

    numeroOriginal = input.nextInt();
    numeroModificado = (numeroOriginal % 10) * 100;
    numeroOriginal -= (numeroModificado/100);
    numeroOriginal /= 10;
    numeroModificado += numeroOriginal;
    System.out.println("Número modificado: " + numeroModificado);
    
    input.close();
    }
}
