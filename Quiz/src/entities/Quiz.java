package entities;

import java.util.List;
import java.util.Scanner;

public class Quiz {
    Scanner sc = new Scanner(System.in);
    private final Jogador jogador;
    private final List<Perguntas> perguntas;
    public String respJogador;

    public Quiz(Jogador jogador, List<Perguntas> perguntas) {
        this.jogador = jogador;
        this.perguntas = perguntas;
    }

    public void startQuiz() {

        int score = 0;
        String []arr = {"A)","B)","C)","D)"};
        int c = 1;

        for (Perguntas pergunta : perguntas) {
            System.out.println(c+"-) " +pergunta.getTexto());
            c++;
            List<String> opcoes = pergunta.getOpcoes();
            for (int i = 0; i < opcoes.size(); i++) {
                System.out.println(arr[i] + ". " + opcoes.get(i));
            }
            System.out.print("Digite sua resposta: ");
            respJogador = sc.next();
            if (pergunta.checkResp(respJogador)) {
                System.out.println("Resposta correta!\n");
                score++;
            } else {
                System.out.println("Resposta incorreta!\n");
            }
        }

        jogador.setScore(score);
        System.out.println(jogador.getNome() + ", seu score final é: " + jogador.getScore()+"/"+perguntas.size());
    }
}