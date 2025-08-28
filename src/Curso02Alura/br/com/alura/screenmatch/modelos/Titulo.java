package Curso02Alura.br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private String genero;
    private double mediaAvaliacao = 0;
    private double somaAvaliacoes = 0;
    private int totalDeAvaliacoes = 0;
    private int anoDeLancamento;
    private int duracaoMinutos;

    public void exibirFichaTecnica(){
        System.out.println(("""
                Nome do Título: %s.
                Ano de Lançamento: %d.
                Gênero: %s.
                Avaliação: %.2f.""").formatted(getNome(), getAnoDeLancamento(), getGenero(), getMediaAvaliacao()));
    }

    public void avaliarObra(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
        mediaAvaliacao = somaAvaliacoes/totalDeAvaliacoes;
        System.out.println("Avaliação feita com sucesso.");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }


    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public double getMediaAvaliacao(){
        return mediaAvaliacao;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
}
