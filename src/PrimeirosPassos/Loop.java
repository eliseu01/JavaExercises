package PrimeirosPassos;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("De 0 a 10, digite sua avaliação para o filme: ");
            nota += sc.nextDouble();
        }
        nota /= 3;
        System.out.print(("A média de notas para o filme é %.2f.").formatted(nota));
    }
}
