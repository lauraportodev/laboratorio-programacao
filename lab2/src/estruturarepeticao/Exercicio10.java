package estruturarepeticao;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // Escrever um algoritmo que lê um valor n e outro valor m,
        // e calcula a tabuada de n de 1 até m.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número da tabuada:");
        int n = teclado.nextInt();

        System.out.println("Digite até qual número deseja calcular:");
        int m = teclado.nextInt();

        for (int i = 1; i <= m; i++) {
            int resultado = n * i;
            System.out.printf("%d x %d = %d%n", i, n, resultado);
        }

        teclado.close();
        System.out.println("Fim do programa!");
    }
}
