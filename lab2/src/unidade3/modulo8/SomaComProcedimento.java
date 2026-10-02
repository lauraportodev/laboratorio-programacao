package unidade3.modulo8;

public class SomaComProcedimento {

    // a rotina faz a conta E mostra o resultado: nao devolve nada (void)
    public static void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma de " + a + " com " + b + " e " + s);
    }

    public static void main(String[] args) {
        soma(5, 2);
        soma(10, 20);
    }
}
