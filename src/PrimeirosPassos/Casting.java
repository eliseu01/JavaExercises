package PrimeirosPassos;

public class Casting {
    public static void main(String[] args) {
        double numberDouble = 8.9;
        int numberInt = (int) numberDouble;
        System.out.println(("""
                O castingo do número %.2f resulta em %d
                """.formatted(numberDouble, numberInt)));
    }
}
