package PrimeirosPassos;

public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 57.94;
        double percentualDesconto = 0.1;
        double valorDoDesconto = precoOriginal*percentualDesconto;
        System.out.print(("O valor do desconto para este é produto é: R$ %.2f".formatted(valorDoDesconto)));
    }
}
