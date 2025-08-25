package Curso02Alura;

public class Aluno {
    String nome;
    int idade;

    void exibirInformacoes(){
        System.out.print(("""
                Nome do Aluno: %s.
                Idade: %d.""").formatted(nome, idade));
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Alisson Costa";
        aluno1.idade = 20;
        aluno1.exibirInformacoes();
    }
}
