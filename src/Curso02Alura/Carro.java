package Curso02Alura;

public class Carro {
    String modelo;
    int ano;
    String cor;
    static int anoAtual = 2025;

    void exibirFichaTecnica(){
        System.out.println(("""
                Modelo: %s.
                Ano: %d.
                Cor: %s.""").formatted(modelo, ano, cor));
    }

    void getIdade(){
        System.out.println(("O carro tem %d anos de idade.").formatted(anoAtual - ano));
    }

    public static void main(String[] args) {
        Carro car = new Carro();
        car.modelo = "Creta";
        car.ano = 2025;
        car.cor = "Branco";

        car.exibirFichaTecnica();
        car.getIdade();
    }
}
