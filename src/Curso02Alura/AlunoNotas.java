package Curso02Alura;

public class AlunoNotas {
    private String nome;
    private double somaDeNotas;
    private int quantidadeNotas;
    private double notaMedia;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota){
        this.somaDeNotas += nota;
        this.quantidadeNotas++;
        this.notaMedia = somaDeNotas / quantidadeNotas;
        System.out.println("Nota registrada com sucesso!");
    }

    public String getNome() {
        return nome;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public static void main(String[] args) {
        AlunoNotas aluno1 = new AlunoNotas();
        aluno1.setNome("Albert Dumont Freitas");
        aluno1.setNota(9.9);
        aluno1.setNota(9);
        System.out.print(("A média de %s é %.1f.").formatted(aluno1.getNome(), aluno1.getNotaMedia()));
    }
}
