package PrimeirosPassos;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDigitado;
        long resultado = 1;

        System.out.print("Digite um número natural: ");
        numeroDigitado = sc.nextInt();
        if(numeroDigitado == 0) System.out.println(("O fatorial de %d é %d.").formatted(0, 0));
        else{
            for (int i = 1; i <= numeroDigitado; i++) {
                resultado *= i;
            }
            System.out.println(("O fatorial de %d é %d.").formatted(numeroDigitado, resultado));
        }
    }
}
