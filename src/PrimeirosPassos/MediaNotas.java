package PrimeirosPassos;

public class MediaNotas {
    public static void main(String[] args) {
        double nota1 = 8.5;
        double nota2 = 9.9;
        System.out.print(("""
                A primeira nota é:   %.1f.
                A segunda nota é:    %.1f.
                A média das notas é: %.1f."""
                .formatted(nota1, nota2, ((nota1+nota2)/2))));
    }
}