package Curso02Alura.br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int quantidadeEpisodios;
    private int quantidadeTemporadas;
    private int duracaoEpisodioMinutos;
    private int duracaoMinutos;

    public int getQuantidadeEpisodios() {
        return quantidadeEpisodios;
    }

    public void setQuantidadeEpisodios(int quantidadeEpisodios) {
        this.quantidadeEpisodios = quantidadeEpisodios;
    }

    public int getQuantidadeTemporadas() {
        return quantidadeTemporadas;
    }

    public void setQuantidadeTemporadas(int quantidadeTemporadas) {
        this.quantidadeTemporadas = quantidadeTemporadas;
    }

    public int getDuracaoEpisodioMinutos() {
        return duracaoEpisodioMinutos;
    }

    public void setDuracaoEpisodioMinutos(int duracaoEpisodioMinutos) {
        this.duracaoEpisodioMinutos = duracaoEpisodioMinutos;
    }

    @Override
    public int getDuracaoMinutos() {
        this.duracaoMinutos = duracaoEpisodioMinutos * quantidadeEpisodios;
        return this.duracaoMinutos;
    }
}
