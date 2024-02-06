package CriacaoDeClasses.Q23;

public class Time {
    String nome;
    String nomeCampeonato;
    String categoria;
    int numeroPontos;

    Time(String nome, String nomeCampeonato, String categoria, int numeroPontos){
        this.nome = nome;
        this.nomeCampeonato = nomeCampeonato;
        this.categoria = categoria;
        this.numeroPontos = numeroPontos;
    }

    public String toString(){
        return("Time:" + nome + "\nCampeonato: " + nomeCampeonato + "\nEsporte: " + categoria + "\nPontuação: " + numeroPontos);
    }
}
