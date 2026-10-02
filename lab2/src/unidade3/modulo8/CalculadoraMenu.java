package unidade3.modulo8;

import java.util.Scanner;

public class CalculadoraMenu {

    public static void mostrarMenu() {
        System.out.println();
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Sair");
        System.out.print("Opcao: ");
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;
        do {
            mostrarMenu();
            opcao = ler.nextInt();
            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Primeiro valor: ");
                double a = ler.nextDouble();
                System.out.print("Segundo valor.: ");
                double b = ler.nextDouble();
                switch (opcao) {
                    case 1:
                        System.out.println("Resultado: " + somar(a, b));
                        break;
                    case 2:
                        System.out.println("Resultado: " + subtrair(a, b));
                        break;
                    case 3:
                        System.out.println("Resultado: " + multiplicar(a, b));
                        break;
                    case 4:
                        if (b == 0) {
                            System.out.println("Nao existe divisao por zero.");
                        } else {
                            System.out.println("Resultado: " + dividir(a, b));
                        }
                        break;
                }
            } else if (opcao != 0) {
                System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);
        System.out.println("Fim.");
        ler.close();
    }
}
