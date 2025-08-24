package Desafio01;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "Eliseu Coelho Mendes";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcaoDesejada;
        double valorTranferir;
        double valorReceber;

        System.out.println(("""
                ******************************************
                Nome: %s.
                Tipo de conta: %s.
                Saldo: %.2f.
                ******************************************
                
                """).formatted(nome, tipoConta, saldo));

        do{
            System.out.println("""
                    
                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    
                    Escolha a opção desejada: """);
            opcaoDesejada = sc.nextInt();

            if(opcaoDesejada == 1){
                System.out.println(("O saldo da conta é de R$ %.2f").formatted(saldo));
            } else if(opcaoDesejada == 2) {
                System.out.print("Informe o valor que você recebeu: ");
                valorReceber = sc.nextDouble();
                saldo += valorReceber;
                System.out.println("O valor foi adicionado à conta.");
            } else if(opcaoDesejada == 3) {
                System.out.print("Informe o valor que você quer transferir: ");
                valorTranferir = sc.nextDouble();
                if(saldo < valorTranferir) System.out.println(("""
                        Saldo insuficiente para realizar esta tranferência.
                        Saldo atual: %.2f""").formatted(saldo));
                else {
                    saldo -= valorTranferir;
                    System.out.println("Valor transferido.");
                }
            } else if(opcaoDesejada > 4 || opcaoDesejada < 1){
                System.out.println("Opção inválivda. Escolha uma das opções abaixo.");
            }
        } while (opcaoDesejada != 4);

        System.out.println("Você saiu da conta.");
    }
}
