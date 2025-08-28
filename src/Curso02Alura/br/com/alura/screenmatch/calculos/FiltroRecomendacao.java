package Curso02Alura.br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Está em alta!");
        } else if(classificavel.getClassificacao() > 2.5){
            System.out.println("Este está bem avaliado!");
        } else {
            System.out.println("Coloque na sua lista para assistir em outro momento.");
        }
    }
}
