package unidade3.modulo8;

public class Sombreamento {

    static int x = 100;                // global

    public static void metodoA() {
        int x = 5;                     // local com o MESMO nome: esconde a global
        System.out.println("metodoA: x = " + x);
        System.out.println("metodoA: Sombreamento.x = " + Sombreamento.x);
    }

    public static void metodoB() {
        System.out.println("metodoB: x = " + x);   // nao ha local x: usa a global
    }

    public static void main(String[] args) {
        metodoA();
        metodoB();
        System.out.println("main   : x = " + x);
    }
}
