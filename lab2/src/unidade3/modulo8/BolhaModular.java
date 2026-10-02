package unidade3.modulo8;

public class BolhaModular {

    public static void trocar(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    // procedimento: ordena o PROPRIO vetor recebido, sem return
    public static void ordenar(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    trocar(v, j, j + 1);
                }
            }
        }
    }

    public static void mostrar(String titulo, int[] v) {
        System.out.print(titulo);
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numeros = {28, 26, 30, 24, 25};
        int[] outros = {9, 1, 5};

        mostrar("antes : ", numeros);
        ordenar(numeros);                  // sem return: o vetor do main e que muda
        mostrar("depois: ", numeros);

        ordenar(outros);                   // o mesmo metodo, outro vetor
        mostrar("outros: ", outros);
    }
}
