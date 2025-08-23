package PrimeirosPassos;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2014;
        double notaDoFilme = 9.5;
        boolean incluidoNoPlano = false;
        String tipoPlano = "plus";


        if(anoDeLancamento > 2022){
            System.out.println("Filmes que as pessoas estão curtindo");
        } else {
            System.out.println("Filmes retrô que valem a pena assistir");
        }

        if(incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme liberado!");
        } else{
            System.out.println("Deves pagar a locação.");
        }
    }
}
