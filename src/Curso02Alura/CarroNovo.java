package Curso02Alura;

public class CarroNovo {
    private String modelo;
    private double precoPrimeiroAno = 0;
    private double precoSegundoAno = 0;
    private double precoTerceiroAno = 0;
    private String maiorPreco = "primeiro";
    private String menorPreco = "terceiro";
    private double maiorPrecoValor = 0;
    private double menorPrecoValor = 0;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoPrimeiroAno() {
        return precoPrimeiroAno;
    }

    public void setPrecoPrimeiroAno(double precoPrimeiroAno) {
        this.precoPrimeiroAno = precoPrimeiroAno;

    }

    public double getPrecoSegundoAno() {
        return precoSegundoAno;
    }

    public void setPrecoSegundoAno(double precoSegundoAno) {
        this.precoSegundoAno = precoSegundoAno;
    }

    public double getPrecoTerceiroAno() {
        return precoTerceiroAno;
    }

    public void setPrecoTerceiroAno(double precoTerceiroAno) {
        this.precoTerceiroAno = precoTerceiroAno;
    }

    private void atualizarMenorEMaiorPreco(){
        if(this.precoPrimeiroAno > this.precoSegundoAno && this.precoPrimeiroAno > this.precoSegundoAno) {
            this.maiorPreco = "primeiro";
            this.maiorPrecoValor = this.precoPrimeiroAno;
            if (this.precoSegundoAno < this.precoTerceiroAno) {
                this.menorPreco = "segundo";
                this.menorPrecoValor = this.precoSegundoAno;
            }
            else {
                this.menorPreco = "terceiro";
                this.menorPrecoValor = this.precoTerceiroAno;
            }
        } else if (this.precoSegundoAno > this.precoTerceiroAno){
            this.maiorPreco = "segundo";
            this.maiorPrecoValor = this.precoSegundoAno;
            if (this.precoPrimeiroAno < this.precoTerceiroAno) {
                this.menorPreco = "primeiro";
                this.menorPrecoValor = this.precoPrimeiroAno;
            }
            else {
                this.menorPreco = "terceiro";
                this.menorPrecoValor = this.precoTerceiroAno;
            }
        } else{
            this.maiorPreco = "terceiro";
            this.maiorPrecoValor = this.precoTerceiroAno;
            if (this.precoPrimeiroAno < this.precoSegundoAno) {
                this.menorPreco = "primeiro";
                this.menorPrecoValor = this.precoPrimeiroAno;
            }
            else {
                this.menorPreco = "segundo";
                this.menorPrecoValor = this.precoSegundoAno;
            }
        }
    }

    public void getMaiorEMenorPreco(){
        this.atualizarMenorEMaiorPreco();
        System.out.println(("""
                O maior preço deste modelo foi no %s ano: %.2f.
                O menor preço deste modelo foir no %s ano: %.2f.""").formatted(this.maiorPreco, this.maiorPrecoValor, this.menorPreco, this.menorPrecoValor));
    }
}
