package unidade3.modulo8;

public class Sobrecarga {

    public static int somar(int a, int b) {
        System.out.print("[somar(int, int)] ");
        return a + b;
    }

    public static double somar(double a, double b) {
        System.out.print("[somar(double, double)] ");
        return a + b;
    }

    public static int somar(int a, int b, int c) {
        System.out.print("[somar(int, int, int)] ");
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(somar(2, 3));
        System.out.println(somar(2.5, 1.5));
        System.out.println(somar(1, 2, 3));
        System.out.println(somar(2, 1.5));       // int com double: vai para (double, double)
    }
}
