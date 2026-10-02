package unidade3.modulo8;

public class ConversorTemperatura {

    // VERSAO COM BUG: 9 / 5 entre dois int da 1, e nao 1.8
    public static double fahrenheitErrado(double c) {
        return c * (9 / 5) + 32;
    }

    public static double celsiusParaFahrenheit(double c) {
        return c * 9.0 / 5.0 + 32;
    }

    public static double fahrenheitParaCelsius(double f) {
        return (f - 32) * 5.0 / 9.0;
    }

    public static void main(String[] args) {
        System.out.println("    C | errado |  certo");
        for (int c = 0; c <= 100; c += 25) {
            System.out.printf("%5d | %6.1f | %6.1f%n", c, fahrenheitErrado(c), celsiusParaFahrenheit(c));
        }
        System.out.printf("98,6 F = %.1f C%n", fahrenheitParaCelsius(98.6));
    }
}
