package entities;

public class Jogador {
    private final String nome;
    private int score;

   //Metodo Construtor
    public Jogador(String nome){
        this.nome = nome;
        this.score = 0;

    }
    //Metodos Especiais
    public String getNome(){
        return nome;
    }
    public void setScore(int score){
        this.score = score;
    }
    public int getScore(){
        return score;
    }


}
