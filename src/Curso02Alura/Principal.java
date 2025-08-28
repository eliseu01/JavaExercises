package Curso02Alura;

import Curso02Alura.br.com.alura.screenmatch.calculos.CalculadoraDuracao;
import Curso02Alura.br.com.alura.screenmatch.modelos.Filme;
import Curso02Alura.br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Kingsman: Serviço Secreto");
        filme1.setAnoDeLancamento(2014);
        filme1.setGenero("Ação");
        filme1.setDuracaoMinutos(144);


        filme1.avaliarObra(8.6);
        filme1.exibirFichaTecnica();
        System.out.println(filme1.getMediaAvaliacao());

        Serie serie1 = new Serie();
        serie1.setNome("Suits");
        serie1.setGenero("Drama");
        serie1.setAnoDeLancamento(2013);
        serie1.setDuracaoEpisodioMinutos(42);
        serie1.setQuantidadeEpisodios(134);
        serie1.setQuantidadeTemporadas(9);
        serie1.avaliarObra(9.5);
        serie1.avaliarObra(8);
        serie1.avaliarObra(9);
        serie1.exibirFichaTecnica();


        CalculadoraDuracao calculadora = new CalculadoraDuracao();
        calculadora.addTitulo(filme1);
        calculadora.addTitulo(serie1);
        System.out.println(("A lista tem reprodução tem %d minutos de duração.").formatted(calculadora.getTempoTotal()));
    }
}
