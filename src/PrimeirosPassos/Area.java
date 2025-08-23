package PrimeirosPassos;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area;
        int escolha;
        double ladoQuadrado;
        double raioCírculo;

        System.out.print("""
                Escolha uma das operações abaixo para fazer digitano o número correspondente:
                1. Área do Quadrado.
                2. Área do Círculo.
                Escolha 1 ou 2: """);
        escolha = sc.nextInt();
        if(escolha == 1){
            System.out.print("Diga qual é o tamanho do lado do quadrado: ");
            ladoQuadrado = sc.nextDouble();
            area = (Math.pow(ladoQuadrado, 2));
            System.out.println(("A área do quadrado é %.1fu2.").formatted(area));
        } else{
            System.out.print("Diga qual é o tamanho do raio do círculo: ");
            raioCírculo = sc.nextDouble();
            area = 3.14*(Math.pow(raioCírculo, 2));
            System.out.println(("A área do círculo é %.1fu2.").formatted(area));
        }

    }
}
