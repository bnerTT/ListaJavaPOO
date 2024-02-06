package CriacaoDeClasses.Q24;

public class Fatura {
    String numeroIdenficacao;
    String descricao;
    int qntdComprada;
    double precoUnitario;

    public Fatura(String numeroIdenficacao, String descricao, int qntdComprada, double precoUnitario) {
        this.numeroIdenficacao = numeroIdenficacao;
        this.descricao = descricao;
        if(qntdComprada < 0){
            this.qntdComprada = 0;
        }
        else{
            this.qntdComprada = qntdComprada;
            
        }
        if(precoUnitario < 0){
            this.precoUnitario = 0.0;
        }
        else{
            this.precoUnitario = precoUnitario;
            
        }

    }
    
    public String calculaTotal(){
        return("O valor total da fatura é: R$" +qntdComprada * precoUnitario + ".");
    }
}
