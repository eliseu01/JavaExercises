package PrimeirosPassos;

public class precoTotalProduto {
    public static void main(String[] args) {
        double precoProduto = 49.99;
        int quantidade = 45;
        double precoTotalProduto = precoProduto*quantidade;
        System.out.println(("O preço de todos os produtos somados é %.2f".formatted(precoTotalProduto)));
    }
}
