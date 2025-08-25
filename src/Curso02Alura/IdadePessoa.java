package Curso02Alura;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void verificarIdade(){
        if(getIdade() >= 18) System.out.println("A pessoa é maior de idade.");
        else if(getIdade() < 18) System.out.println("A pessoa é menor de idade.");
    }

    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Emmily Eunice");
        pessoa.setIdade(19);

        pessoa.verificarIdade();
    }
}
