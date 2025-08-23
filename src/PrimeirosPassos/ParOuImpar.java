package PrimeirosPassos;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDigitado;

        System.out.print("Digite um número inteiro: ");
        numeroDigitado = sc.nextInt();

        if(numeroDigitado%2 == 0) System.out.println("O número digitado é par");
        else System.out.println("O número digitado é ímpar.");
    }
}
