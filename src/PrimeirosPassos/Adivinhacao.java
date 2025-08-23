package PrimeirosPassos;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAlvo = new Random().nextInt(100);
        int tentativas = 0;
        int numeroTentado = -1;

        System.out.println("Bem vindo ao jogo de adivinhação.");
        System.out.println("Eu pensei em um número inteiro entre 0 e 100 e você tem de tentar acertá-lo.");
        System.out.println("Por favor, escolha um número entre 0 e 100: ");
        numeroTentado = sc.nextInt();
        tentativas++;

        while (numeroTentado != numeroAlvo){
            if(numeroAlvo > numeroTentado){
                System.out.println("O número que pensei é maior que este.");
            } else if(numeroAlvo < numeroTentado){
                System.out.println("O número que pensei é menor que este.");
            }
            System.out.println("Vamos lá, tente novamente.");
            System.out.println("Por favor, escolha um número entre 0 e 100: ");
            numeroTentado = sc.nextInt();
            tentativas++;
        }

        System.out.println(("Você acertou o número que pensei, você é bom! Você acertou com %d tentativas que o número era %d. Parabéns!").formatted(tentativas, numeroAlvo));
    }
}
