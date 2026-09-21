package estruturarepeticao;

public class Exercicio9 {
    public static void main(String[] args) {
        // Construir um algoritmo para gerar a seguinte série:
        // s = 1/1 + 1/2 + 1/3 + ... + 1/n para os 50 primeiros termos.

        double s = 0;

        for (int i = 1; i <= 50; i++) {
            s += 1.0 / i;
        }

        System.out.println("Resultado da soma: " + s);
        System.out.println("Fim do programa!");
    }
}