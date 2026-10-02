package unidade3.modulo8;

public class Fatoriais {

    public static int fatorial(int n) {
        int fat = 1;
        for (int i = 2; i <= n; i++) {
            fat = fat * i;
        }
        return fat;
    }

    public static void main(String[] args) {
        for (int k = 1; k <= 5; k++) {
            System.out.println(k + "! = " + fatorial(k));
        }
    }
}
