package PrimeirosPassos;

public class DolarParaReal {
    public static void main(String[] args) {
        double valorEmDolares = 94.00;
        double precoDolar = 4.94;
        double valorEmReais = valorEmDolares*precoDolar;
        System.out.print(("$%.2f convertendo para Real é R$ %.2f".formatted(valorEmDolares, valorEmReais)));
    }
}
