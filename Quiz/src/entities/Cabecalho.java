package entities;

public class Cabecalho {
    public String universidade = "Centro Universitario Alfredo Nasser";
    public String curso = "Engenharia de Software 2° Periodo";
    public String professor = "Brenno";
    public String aluno = "Luís Fernando C. Novais";


    public void exibirCabecalho(){
        String linha = "#######################################";

        System.out.println(linha);
        System.out.println("# " + universidade + " #");
        System.out.println("# " + curso + " ###");
        System.out.println("# Professor: " + professor + " ###################");
        System.out.println("# Aluno: " + aluno + " ######");
        System.out.println(linha);
    }

}
