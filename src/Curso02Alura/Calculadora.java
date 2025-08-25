package Curso02Alura;

public class Calculadora {

    double retornarDobro(double numero){
        return numero*2;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.retornarDobro(67));;
    }
}
