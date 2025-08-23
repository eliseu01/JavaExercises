package PrimeirosPassos;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu filme favorito: ");
        String filme = sc.nextLine();

        System.out.println("Digite o ano de lançamento deste filme: ");
        int anoDeLancamento = sc.nextInt();

        System.out.println("De 0 a 10, digite sua avaliação para esse filme: ");
        double avaliacao = sc.nextDouble();

        System.out.println(("""
                O seu filme favorito é %s, lançado em %d, recebe de você uma nota de %.2f.""").formatted(filme, anoDeLancamento, avaliacao));
    }
}
