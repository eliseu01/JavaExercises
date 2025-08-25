package Curso02Alura;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Maria Dos Anjos Mendes";
        conta.setNumeroConta(119274);

        System.out.println(conta.titular);
        System.out.println(conta.getNumeroConta());
    }
}

