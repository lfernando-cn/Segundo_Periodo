package application;

import entities.Cabecalho;
import entities.Jogador;
import entities.Perguntas;
import entities.Quiz;


import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cabecalho cab = new Cabecalho();
        cab.exibirCabecalho();
        System.out.println(" \n");



        System.out.print("Digite seu nome: ");
        String name = sc.next();

        Jogador j1 = new Jogador(name);
        List<Perguntas> perguntas = List.of( new Perguntas("Qual é a capital do Acre?", List.of("Boa Vista", "Belém", "Manaus", "Rio Branco"), "D"),
                new Perguntas("Qual é a capital de Alagoas?", List.of("Salvador", "Maceió", "Aracaju", "Recife"), "B"),
                new Perguntas("Qual é a capital do Amapá?", List.of("Palmas", "Macapá", "Cuiabá", "Porto Velho"), "B"),
                new Perguntas("Qual é a capital do Amazonas?", List.of("Rio Branco", "Brasília", "Belém", "Manaus"), "D"),
                new Perguntas("Qual é a capital da Bahia?", List.of("Aracaju", "Recife", "Salvador", "Fortaleza"), "C"),
                new Perguntas("Qual é a capital do Ceará?", List.of("João Pessoa", "Fortaleza", "Natal", "Recife"), "B"),
                new Perguntas("Qual é a capital do Distrito Federal?", List.of("Rio de Janeiro", "São Paulo", "Goiânia", "Brasília"), "D"),
                new Perguntas("Qual é a capital do Espírito Santo?", List.of("Belo Horizonte", "Rio de Janeiro", "São Luís", "Vitória"), "D"),
                new Perguntas("Qual é a capital de Goiás?", List.of("Cuiabá", "Belo Horizonte", "Goiânia", "Brasília"), "C"),
                new Perguntas("Qual é a capital do Maranhão?", List.of("Vitória", "São Luís", "Porto Alegre", "Belém"), "B"),
                new Perguntas("Qual é a capital de Mato Grosso?", List.of("Rio Branco", "Brasília", "Goiânia", "Cuiabá"), "D"),
                new Perguntas("Qual é a capital de Mato Grosso do Sul?", List.of("Belo Horizonte", "São Paulo", "Porto Alegre", "Campo Grande"), "D"),
                new Perguntas("Qual é a capital de Minas Gerais?", List.of("Belo Horizonte", "Brasília", "Rio de Janeiro", "São Paulo"), "A"),
                new Perguntas("Qual é a capital do Pará?", List.of("Porto Alegre", "Manaus", "São Luís", "Belém"), "D"),
                new Perguntas("Qual é a capital da Paraíba?", List.of("Natal", "Recife", "João Pessoa", "Fortaleza"), "C")
        );


        Quiz quiz = new Quiz(j1, perguntas);
        System.out.print("Deseja iniciar o quiz Y/N: ");
        String respUser = sc.next();
        System.out.println();


        if(respUser.equalsIgnoreCase("y")){
            quiz.startQuiz();
        }
        else if(respUser.equalsIgnoreCase("n")){
            System.exit(0);
        }
        else{
            System.out.println("Digite uma resposta valida!!!");
        }
    }
}