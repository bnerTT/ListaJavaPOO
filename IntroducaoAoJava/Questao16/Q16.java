package IntroducaoAoJava.Questao16;
import java.lang.Math;

public class Q16 {
    public static void main(String[] args){
        int unidade, dezena, centena;
        for(int i = 100; i <= 999; i++){
            unidade = i % 10;
            dezena = ((i % 100) - unidade)/10;
            centena = i / 100;
            if(Math.pow(unidade,3) + Math.pow(dezena, 3) + Math.pow(centena, 3) == i){
                System.out.println(i);
            }
        }
    }
}
