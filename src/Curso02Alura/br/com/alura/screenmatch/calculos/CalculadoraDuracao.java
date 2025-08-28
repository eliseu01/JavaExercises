package Curso02Alura.br.com.alura.screenmatch.calculos;

import Curso02Alura.br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDuracao {
    private int tempoTotal;

    public void addTitulo(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoMinutos();
        System.out.println("Título adicionado a lista de reprodução com sucesso!");
    }

    public int getTempoTotal() {
        return this.tempoTotal;
    }
}
