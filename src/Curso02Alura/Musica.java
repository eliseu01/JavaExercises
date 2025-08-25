package Curso02Alura;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao = 0;
    double somaAvaliacoes = 0;
    int numAvaliacoes = 0;

    void exibirFichaTecnica(){
        System.out.println(("""
                Título: %s.
                Artista: %s.
                Ano de Lançamento: %d.
                Avaliação: %.1f.""").formatted(titulo, artista, anoLancamento, avaliacao));
    }

    void avaliarMusica(double nota){
        somaAvaliacoes += nota;
        numAvaliacoes++;
        avaliacao = somaAvaliacoes/numAvaliacoes;
        System.out.println("Avaliação realizada!");
    }

    double getAvaliacao(){
        return avaliacao;
    }

    public static void main(String[] args) {
        Musica music1 = new Musica();
        music1.titulo = "Oceano";
        music1.artista = "Djavan";
        music1.anoLancamento = 1989;
        music1.avaliarMusica(10);
        music1.avaliarMusica(9);

        music1.exibirFichaTecnica();

    }
}
