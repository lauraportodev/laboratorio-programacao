package unidade1.listaselecao;

import java.util.Scanner;

public class Financiamento {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu salário:");
        double salario = teclado.nextDouble();
        System.out.println("Digite o financiamento pretendido:");
        double financiamento = teclado.nextDouble();

        if (financiamento <= salario * 5) {
            System.out.println("Financiamento Concedido");
        } else {
            System.out.println("Financiamento Negado");
        }

        System.out.println("Obrigado por nos consultar.");
        teclado.close();
    }
}
