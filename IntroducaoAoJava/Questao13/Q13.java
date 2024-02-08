package IntroducaoAoJava.Questao13;

public class Q13 {
    public static void main(String[] args){
        System.out.println("\t✩✩✩\t MEGA SENA \t✩✩✩\t");
        for(int i = 1; i <= 60; i++){
            System.out.printf("| %d |", i);
            if(i%6 == 0)
                System.out.print("\n");
            else
                System.out.print("\t");
        }
    }
    
}
