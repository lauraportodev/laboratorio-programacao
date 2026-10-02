package unidade3.modulo8;

public class MediaInteira {

    // o retorno e double, mas a conta (a + b) / 2 e feita entre int
    public static double mediaErrada(int a, int b) {
        return (a + b) / 2;
    }

    public static double media(int a, int b) {
        return (a + b) / 2.0;
    }

    public static void main(String[] args) {
        System.out.println("mediaErrada(7, 8) = " + mediaErrada(7, 8));
        System.out.println("media(7, 8)       = " + media(7, 8));
    }
}
