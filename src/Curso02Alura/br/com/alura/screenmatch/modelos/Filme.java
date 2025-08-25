package Curso02Alura.br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private String genero;
    private int duracaoMinutos;
    private double mediaAvaliacao = 0;
    private double somaAvaliacoes = 0;
    private int totalDeAvaliacoes = 0;
    private int anoDeLancamento;

    public void exibirFichaTecnica(){
        System.out.println(("""
                Nome do Filme: %s.
                Ano de Lançamento: %d.
                Gênero: %s.
                Avaliação: %.2f.
                Duração: %dm.""").formatted(getNome(), getAnoDeLancamento(), getGenero(), getMediaAvaliacao(), getDuracaoMinutos()));
    }

    public void avaliarFilme(double nota){
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

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
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

    public int getDuracaoMinutos() {
        return duracaoMinutos;
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
}
