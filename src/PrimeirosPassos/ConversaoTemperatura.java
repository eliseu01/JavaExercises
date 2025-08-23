package PrimeirosPassos;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        double temperaturaCelsius = 27.3;
        int  temperaturaFahrenheit = (int) (temperaturaCelsius * 1.8) + 32;
        System.out.print("A temperatura " + temperaturaCelsius + "°C é " + temperaturaFahrenheit + "F.");
    }
}