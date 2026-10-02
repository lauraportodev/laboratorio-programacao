package unidade3.modulo8;

public class PilhaDeChamadas {

    public static double media(int[] v) {
        int soma = 0;
        for (int i = 0; i <= v.length; i++) {      // BUG: <= em vez de <
            soma += v[i];
        }
        return (double) soma / v.length;
    }

    public static void relatorio(int[] notas) {
        System.out.println("Calculando a media...");
        System.out.println("Media: " + media(notas));
    }

    public static void main(String[] args) {
        int[] notas = {7, 8, 9};
        relatorio(notas);
        System.out.println("fim");
    }
}
