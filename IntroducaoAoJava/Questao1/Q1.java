package IntroducaoAoJava.Questao1;

import java.util.Scanner;

public class Q1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ladoQuadrado;
        
        System.out.println("Insira o valor do lado do quadrado:");
        ladoQuadrado = input.nextInt();
        System.out.println("A área do quadrado é " + ladoQuadrado * ladoQuadrado + ".");
        input.close();
    }
}