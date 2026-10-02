package unidade3.modulo8;

import java.util.Scanner;

public class MediaAluno {

    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    // funcao que devolve String: cada caminho do if devolve um texto
    public static String situacao(double media) {
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media >= 4.0) {
            return "Recuperacao";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double n1 = entrada.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = entrada.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = entrada.nextDouble();

        double media = calcularMedia(n1, n2, n3);
        System.out.printf("Media: %.2f%n", media);
        System.out.println("Situacao: " + situacao(media));
        entrada.close();
    }
}
