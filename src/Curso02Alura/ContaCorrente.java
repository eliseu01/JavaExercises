package Curso02Alura;

public class ContaCorrente extends OutraContaBancaria{
    private double saldo;
    private int mesAtual;
    private double tarifa = 5.75;
    public void cobrarTarifaMensal(){
        if(getMesAtual() != mesAtual){
            if(saldo >= tarifa) saldo -= tarifa;
            else System.out.println("""
                    Saldo insuficiente para a Tarifa Mensal do Banco.
                    Pague a tarifa para não ter sua conta suspensa.""");
        }
    }

    private int getMesAtual(){
        System.out.println("Retorna o mês atual");
        return 0;
    }
}
