package unidade1.listaselecao;

import java.util.Scanner;

public class Operacoes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int a = teclado.nextInt();
        System.out.println("Digite o segundo número:");
        int b = teclado.nextInt();

        System.out.println("Escolha uma operação:\n" 
                + "1 - Soma\n" 
                + "2 - Subtração\n" 
                + "3 - Multiplicação\n" 
                + "4 - Divisão\n");

        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("A soma é: " + (a + b));
                break;
            case 2:
                System.out.println("A subtração é: " + (a - b));
                break;
            case 3:
                System.out.println("A multiplicação é: " + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Erro: divisão por zero não é permitida.");
                } else {
                    double divisao = (double) a / b;
                    System.out.printf("A divisão é: %.2f%n", divisao);
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        teclado.close();
    }
}
