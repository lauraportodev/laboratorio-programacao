package unidade3.modulo8;

public class Calculadora {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double media(double a, double b) {
        return dividirPorDois(somar(a, b));
    }

    // private: so pode ser chamado aqui dentro da classe Calculadora
    private static double dividirPorDois(double x) {
        return x / 2;
    }
}
