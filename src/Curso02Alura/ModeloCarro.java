package Curso02Alura;

public class ModeloCarro extends CarroNovo{

    public static void main(String[] args) {
        ModeloCarro modelo1 = new ModeloCarro();
        modelo1.setModelo("Polo Track 2025");
        modelo1.setPrecoPrimeiroAno(79990);
        modelo1.setPrecoSegundoAno(84990);
        modelo1.setPrecoTerceiroAno(64599);
        modelo1.getMaiorEMenorPreco();
    }
}
