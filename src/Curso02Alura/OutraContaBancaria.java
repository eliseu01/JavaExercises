package Curso02Alura;

public class OutraContaBancaria {
    private double saldo;

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (saldo >= valor) this.saldo -= valor;
        else System.out.println("Saldo insuficiente.");
    }

    public void consultarSaldo(){
        System.out.println(("Saldo: %.2f.").formatted(this.saldo));
    }
}
