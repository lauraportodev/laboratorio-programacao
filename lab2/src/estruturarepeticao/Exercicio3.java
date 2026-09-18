package estruturarepeticao;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0;
        int contador = 0;
        double n;
        while (true) {
            System.out.println("Digite um número (ou -1 para sair):");
            n = teclado.nextDouble();

            if (n == -1) {
                break; 
            }

            soma += n;
            contador++;
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.printf("A média dos valores introduzidos foi de: %.2f%n", media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }

        teclado.close();
        System.out.println("Fim do programa!");
    }
}