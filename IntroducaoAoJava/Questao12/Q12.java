package IntroducaoAoJava.Questao12;
import java.util.Scanner;
//1 = domingo

public class Q12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int dia;
        
        while(true){
            System.out.println("Insira o dia de fevereiro:");
            dia = input.nextInt();
            if(dia < 0 || dia > 28){
                System.out.println("Dia inválido. Insira novamente.");
                continue;
            }
            break;
        }
        
        String resultadoFinal = "O dia " + dia + " será ";

        switch(dia%7){
            case 0:
                resultadoFinal += "Domingo";
                break;
            case 1:
                resultadoFinal += "Segunda-Feira";
                break;
            case 2:
                resultadoFinal += "Terça-Feira";
                break;
            case 3:
                resultadoFinal += "Quarta-Feira";
                break;
            case 4:
                resultadoFinal += "Quinta-Feira";
                break;
            case 5:
                resultadoFinal += "Sexta-Feira";
                break;
            case 6:
                resultadoFinal += "Sábado";
                break;
        }

        System.out.println(resultadoFinal);


        input.close();
    }
}
