package PrimeirosPassos;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double notaMedia = 0;
        double somaDasNotas = 0;
        double totalDeNotas = -1;

        while (nota != -1) {
            somaDasNotas += nota;
            System.out.print("De 0 a 10, digite sua avaliação para o filme ou digite -1 para finalizar: ");
            nota = sc.nextDouble();
            totalDeNotas++;
        }
        notaMedia = somaDasNotas / totalDeNotas;
        System.out.print(("A média de notas para o filme é %.2f.").formatted(notaMedia));
    }
}
