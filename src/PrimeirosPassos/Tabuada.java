package PrimeirosPassos;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDigitado;

        System.out.print("Digite um número inteiro: ");
        numeroDigitado = sc.nextInt();

        System.out.println(("Segue a tabuada do número %d:").formatted(numeroDigitado));
        for (int i = 1; i <= 10; i++) {
            System.out.println(("%d x %d = %d").formatted(numeroDigitado, i, (numeroDigitado*i)));
        }
    }
}
