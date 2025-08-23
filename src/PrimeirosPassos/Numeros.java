package PrimeirosPassos;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double primeiroNumero;
        double segundoNumero;
        System.out.print("Digite um número: ");
        primeiroNumero = sc.nextDouble();
        System.out.print("Agora digite outro número: ");
        segundoNumero = sc.nextDouble();

        if(primeiroNumero == segundoNumero){
            System.out.println("Os dois números digitados são iguais.");
        } else{
            System.out.println("Os dois números são diferentes");
            if(primeiroNumero > segundoNumero) System.out.println("O primeiro número é maior.");
            else System.out.println("O segundo número é maior.");
        }
    }
}
