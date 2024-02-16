package IntroducaoAoJava.Questao17;

public class Q17 {
    public static void main(String[] args){
        int populacaoA = 7000, populacaoB = 20000, contAno = 0;
        while (populacaoA <= populacaoB){
            populacaoA += (populacaoA * 0.035);
            populacaoB += (populacaoB * 0.01);
            System.out.println("População A: " + populacaoA + "População B: " + populacaoB);
            contAno++;
        }
        System.out.println("Levaram " + contAno + " anos.");
    }
}
