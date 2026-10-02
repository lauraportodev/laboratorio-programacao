package unidade3.modulo8;

public class FuncoesComVetor {

    public static int somar(int[] v) {
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        return soma;
    }

    public static double media(int[] v) {
        return (double) somar(v) / v.length;      // uma funcao usando a outra
    }

    public static int maior(int[] v) {
        int maiorAteAgora = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] > maiorAteAgora) {
                maiorAteAgora = v[i];
            }
        }
        return maiorAteAgora;
    }

    public static int contarAcimaDe(int[] v, double limite) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > limite) {
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        int[] notas = {7, 9, 4, 10, 6, 8};
        int[] idades = {18, 25, 31};

        System.out.println("notas : soma = " + somar(notas) + ", maior = " + maior(notas));
        System.out.printf("notas : media = %.2f%n", media(notas));
        System.out.println("notas acima da media: " + contarAcimaDe(notas, media(notas)));

        // as MESMAS funcoes com outro vetor: isso e reutilizar
        System.out.println("idades: soma = " + somar(idades) + ", maior = " + maior(idades));
        System.out.printf("idades: media = %.2f%n", media(idades));
    }
}
