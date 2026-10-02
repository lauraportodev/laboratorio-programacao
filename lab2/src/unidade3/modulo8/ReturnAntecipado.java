package unidade3.modulo8;

public class ReturnAntecipado {

    // return; num procedimento: sai na hora, sem devolver nada
    public static void mostrarRaiz(double x) {
        if (x < 0) {
            System.out.println("Nao existe raiz real de " + x);
            return;                                // sai aqui; o resto nao roda
        }
        System.out.println("Raiz de " + x + " = " + Math.sqrt(x));
    }

    // return dentro do laco: achou, devolve, e o metodo acaba ali mesmo
    public static int posicao(int[] v, int x) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                return i;                          // encerra o for E o metodo
            }
        }
        return -1;                                 // so chega aqui se nao achou
    }

    public static void main(String[] args) {
        mostrarRaiz(49);
        mostrarRaiz(-4);

        int[] dados = {23, 4, 33, 45, 19};
        System.out.println("posicao do 33: " + posicao(dados, 33));
        System.out.println("posicao do 77: " + posicao(dados, 77));
    }
}
