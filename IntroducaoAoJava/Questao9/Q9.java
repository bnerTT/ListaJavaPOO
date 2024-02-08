package IntroducaoAoJava.Questao9;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int valor, naipe;
        String valorImprimir = "";
        while(true){
            System.out.println("Insira o valor da carta:");
            valor = input.nextInt();
            if(valor <= 0 || valor > 13){
                System.out.println("Valor inválido. Insira novamente.");
                continue;
            }
            break;
        }
        while(true){
            System.out.println("Insira o naipe da carta:\n1)Ouros\n2)Paus\n3)Copas\n4)Espadas");
            naipe = input.nextInt();
            if(naipe < 0 || naipe > 4){
                System.out.println("Valor inválido. Insira novamente.");
                continue;
            }
            break;
        }

        switch(valor){
            case 1:
                valorImprimir += "Ás de ";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                valorImprimir += valor + " de ";
                break;
            case 11:
                valorImprimir += "Valete de ";
                break;
            case 12:
                valorImprimir += "Dama de ";
                break;
            case 13:
                valorImprimir += "Rei de ";
                break;
        }

        switch(naipe){
            case 1:
                valorImprimir += "Ouros";
                break;
            case 2:
                valorImprimir += "Paus";
                break;
            case 3:
                valorImprimir += "Copas";
                break;
            case 4:
                valorImprimir += "Espadas";
                break;
        }

        System.out.println(valorImprimir);

        input.close();
    }
}
