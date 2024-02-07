package IntroducaoAoJava.Questao8;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        int codigoProduto;
        double precoProduto;
        Scanner input = new Scanner(System.in);


        while(true){
            System.out.println("Insira o código do setor:");
            codigoProduto = input.nextInt();
            if(codigoProduto == 222 || codigoProduto == 111){
                break;
            }
            else{
                System.out.println("Código incorreto! Insira novamente.");
            }
        }

        while(true){
            System.out.println("Insira o preço do produto:");
            precoProduto = input.nextDouble();
            if(precoProduto > 0){
                break;
            }
            else{
                System.out.println("Preço incorreto! Insira novamente.");
            }
        }

        System.out.println("O preço do seu produto é: R$" + df.format(precoProduto));
        switch(codigoProduto){
            case 111:
                if(precoProduto < 50){
                    precoProduto *= 0.9;
                    break;
                }
                if(precoProduto >= 50 && precoProduto <= 100){
                    precoProduto *= 0.8;
                    break;
                }
                else{
                    precoProduto *= 0.6;
                    break;
                }
            
            case 222:
                if(precoProduto > 500){
                    precoProduto *= 0.9;
                }
                break;
        }

        System.out.println("O preço do seu produto com desconto é: R$" + df.format(precoProduto));

        input.close();
    }    
}
