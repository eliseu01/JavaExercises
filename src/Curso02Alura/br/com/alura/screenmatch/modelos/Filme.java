package Curso02Alura.br.com.alura.screenmatch.modelos;

import Curso02Alura.br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    public int getClassificacao(){
        return (int) getMediaAvaliacao() / 2;
    }
}
