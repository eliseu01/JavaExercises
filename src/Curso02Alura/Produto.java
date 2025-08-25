package Curso02Alura;

public class Produto {
    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void aplicarDescontoPorcento(double desconto){
        desconto = 1 - desconto/100;
        this.setPreco(this.getPreco() * desconto);
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Caderno");
        produto1.setPreco(114.44);
        produto1.aplicarDescontoPorcento(20);
        System.out.print(("O preço do produto %s é %.2f").formatted(produto1.getNome(), produto1.getPreco()));
    }
}
