package PrimeirosPassos;

public class Contatenacao {
    public static void main(String[] args) {
        char letra = 'A';
        String palavra = " Pessoa.";
        System.out.println(("""
                %s%s""".formatted(letra, palavra)));
    }
}
