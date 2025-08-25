package Curso02Alura;

import Curso02Alura.br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Kingsman: Serviço Secreto");
        filme1.setAnoDeLancamento(2014);
        filme1.setGenero("Ação");
        filme1.setDuracaoMinutos(129);


        filme1.avaliarFilme(8.6);
        filme1.exibirFichaTecnica();
        System.out.println(filme1.getMediaAvaliacao());
    }
}
