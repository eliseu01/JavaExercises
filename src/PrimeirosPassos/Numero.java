package PrimeirosPassos;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        double numeroDigitado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        numeroDigitado = sc.nextDouble();
        if(numeroDigitado > 0) {
            System.out.println("O número digitado é positivo.");
        } else if(numeroDigitado < 0) {
            System.out.println("O número digitado é negativo.");
        } else{
            System.out.println("O número digitado é 0. Não é positivo nem negativo.");
        }
    }
}