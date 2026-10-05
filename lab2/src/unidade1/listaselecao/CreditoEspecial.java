package unidade1.listaselecao;

import java.util.Scanner;

public class CreditoEspecial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual saldo médio?");
        double saldomedio = teclado.nextDouble();
        double creditoespecial = 0;

        if (saldomedio <= 200) {
            System.out.printf("Seu saldo médio é R$%.2f, você não receberá nenhum crédito.", saldomedio);
        } else if (saldomedio > 200 && saldomedio <= 400) {
            creditoespecial = saldomedio * 0.1;
            System.out.printf("Seu saldo médio é R$%.2f, valor do crédito é R$%.2f.", saldomedio, creditoespecial);
        } else {
            creditoespecial = saldomedio * 0.2;
            System.out.printf("Seu saldo médio é R$%.2f, valor do crédito é R$%.2f.", saldomedio, creditoespecial);
        }

        teclado.close();
    }
}

