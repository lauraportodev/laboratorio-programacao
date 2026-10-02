package unidade3.modulo8;

public class HierarquiaEmJava {

    // "Algoritmo Principal": V1, V2 e Resp viram variaveis da classe (static)
    static int v1 = 1, v2 = 2;
    static boolean resp = true;

    public static void main(String[] args) {
        algoritmoA();
        algoritmoB();
        algoritmoC();
    }

    public static void algoritmoA() {
        double v3 = 3.0;                                  // local de A
        System.out.println("A: v1=" + v1 + " v2=" + v2 + " resp=" + resp + " v3=" + v3);
        algoritmoD(v3);                                   // D e E precisam do v3:
        algoritmoE(v3);                                   // ele vai por PARAMETRO
    }

    public static void algoritmoB() {
        double v4 = 4.0;
        System.out.println("B: v1=" + v1 + " v2=" + v2 + " resp=" + resp + " v4=" + v4);
    }

    public static void algoritmoC() {
        double v5 = 5.0;
        System.out.println("C: v1=" + v1 + " v2=" + v2 + " resp=" + resp + " v5=" + v5);
    }

    public static void algoritmoD(double v3) {
        double v6 = 6.0;
        System.out.println("   D: v1=" + v1 + " v2=" + v2 + " resp=" + resp
                + " v3=" + v3 + " v6=" + v6);
    }

    public static void algoritmoE(double v3) {
        double v7 = 7.0;
        System.out.println("   E: v1=" + v1 + " v2=" + v2 + " resp=" + resp
                + " v3=" + v3 + " v7=" + v7);
        algoritmoF(v3, v7);                               // F precisa de v3 e v7
    }

    public static void algoritmoF(double v3, double v7) {
        double v8 = 8.0;
        System.out.println("      F: v1=" + v1 + " v2=" + v2 + " resp=" + resp
                + " v3=" + v3 + " v7=" + v7 + " v8=" + v8);
    }
}
