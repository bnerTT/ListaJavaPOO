package IntroducaoAoJava.Questao19;

public class Q19 {
    public static void main(String[] args){
        int parametro = 100;
        fatorial(parametro);
    }

    public static int fatorial(int numeroGuia){
        if(numeroGuia == 0){
            System.out.println(numeroGuia + "! = " + 1);
            return 1;
        }
        int count = numeroGuia * fatorial(numeroGuia - 1);
        for(int i = 0; i < numeroGuia; i++){
            System.out.print("\t");
        }
        System.out.println(numeroGuia + "! = " + count);
        return(count);
    }
}
