package CriacaoDeClasses.Q24;

public class DemoFatura {
    public static void main(String[] args){
        Fatura computador = new Fatura("Processador", "I7 de 8 geração", 17, 857.22);
        System.out.println(computador.calculaTotal());
    }
}
