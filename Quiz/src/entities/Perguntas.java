package entities;

import java.util.List;
public class Perguntas {
    private  final String texto;
    private  final List<String> opcoes;
    private  final String respCorreta;

    //Metodo construtor
    public Perguntas(String texto, List<String> opcoes, String respCorreta){
        this.texto = texto;
        this.opcoes = opcoes;
        this.respCorreta = respCorreta;
    }
    //Metodos Especiais
    public String getTexto(){
        return texto;
    }
    public List<String> getOpcoes(){
        return opcoes;
    }


    //Metodo publico
    public boolean checkResp(String respPlayer){
        return (respCorreta.equalsIgnoreCase(respPlayer));
    }
}
