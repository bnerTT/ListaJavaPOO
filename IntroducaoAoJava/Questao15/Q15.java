package IntroducaoAoJava.Questao15;

public class Q15 {
    public static void main(String[] args){
        int somaDivisores = 0, count = 0;

        for(int i = 1; ; i++){
            for(int j = 1; j < i; j++){
                if(i % j == 0){
                    somaDivisores += j;
                }
            }

            if(somaDivisores == i){
                System.out.println(somaDivisores);
                count++;
            }
            somaDivisores = 0;
            if(count == 4){
                break;
            }
        }
    }
}
