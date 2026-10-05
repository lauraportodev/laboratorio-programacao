package unidade1.listaselecao;

import java.util.Scanner;

public class AumentoSalario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual seu salário:");
        double salario = teclado.nextDouble();
        System.out.println("Qual seu cargo:\n" + "101 (Gerente) \n" + "102 (Engenheiro)\n" + "103 (Técnico)\n");
        int opcao = teclado.nextInt();
        double novosalario = 0;
        double diferenca = 0;

        switch (opcao) {
            case 101:
                novosalario = salario + (salario * 0.1);
                break;
            case 102:
                novosalario = salario + (salario * 0.2);
                break;
            case 103:
                novosalario = salario + (salario * 0.3);
                break;
            default:
                novosalario = salario + (salario * 0.5);
        }

        diferenca = novosalario - salario;
        System.out.printf("Seu salário era R$%.2f , com aumento de R$%.2f, vai passar a ser R$%.2f", salario, diferenca, novosalario);

        teclado.close();
    }
}
