package unidade3.modulo8;

public class ComoDevolverMudanca {

    // NAO funciona: n e uma copia do argumento
    public static void dobrarErrado(int n) {
        n = n * 2;
    }

    // funciona: devolve o novo valor, e quem chamou guarda
    public static int dobrar(int n) {
        return n * 2;
    }

    // funciona: troca duas POSICOES de um vetor (o vetor e compartilhado)
    public static void trocar(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    public static void main(String[] args) {
        int x = 5;
        dobrarErrado(x);
        System.out.println("depois de dobrarErrado(x): x = " + x);

        x = dobrar(x);                        // o retorno volta para o proprio x
        System.out.println("depois de x = dobrar(x)  : x = " + x);

        int[] par = {10, 30};
        trocar(par, 0, 1);
        System.out.println("depois de trocar(par, 0, 1): " + par[0] + " " + par[1]);
    }
}
