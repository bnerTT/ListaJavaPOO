package IntroducaoAoJava.Questao14;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int enesimoTermo, antecessorA = 0, antecessorB = 1, numTemp;
        
        System.out.println("Insira o termo desejado:");
        enesimoTermo = input.nextInt();
        if(enesimoTermo <= 0){
            System.out.println("Termo inválido.");
            input.close();
            System.exit(0);
        }

        if(antecessorA ==0){
            System.out.println(antecessorB);
        }

        for(int i = 0; i < enesimoTermo; i++){
            System.out.println(antecessorA + antecessorB);
            numTemp = antecessorA;
            antecessorA = antecessorB;
            antecessorB = antecessorA + numTemp;
        }

        input.close();
    }
}
