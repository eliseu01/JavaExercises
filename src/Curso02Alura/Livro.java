package Curso02Alura;

public class Livro {
    private String titulo;
    private String autor;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void exibirDetalhes(){
        System.out.print(("""
                Título: %s.
                Autor: %s.""").formatted(this.getTitulo(), this.getAutor()));
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("Matéria Escura");
        livro1.setAutor("Blake Croch");

        livro1.exibirDetalhes();
    }
}
