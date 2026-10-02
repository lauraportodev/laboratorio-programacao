package unidade3.modulo8;

public class OQueImprime {

    static int total = 0;

    public static void somarNoTotal(int valor) {
        total = total + valor;
        valor = 0;
    }

    public static int dobrar(int total) {
        total = total * 2;
        return total;
    }

    public static void zerar(int[] v) {
        v[0] = 0;
    }

    public static void main(String[] args) {
        int x = 5;
        somarNoTotal(x);
        System.out.println("A: x = " + x + ", total = " + total);

        int y = dobrar(x);
        System.out.println("B: x = " + x + ", y = " + y + ", total = " + total);

        int[] v = {x, y};
        zerar(v);
        System.out.println("C: v[0] = " + v[0] + ", v[1] = " + v[1] + ", x = " + x);
    }
}
