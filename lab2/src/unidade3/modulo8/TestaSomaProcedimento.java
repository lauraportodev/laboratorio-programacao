package unidade3.modulo8;

import java.util.Scanner;

public class TestaSomaProcedimento {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num1, num2;
        System.out.println("Digite o primeiro valor: ");
        num1 = ler.nextDouble();
        System.out.println("Digite o segundo valor: ");
        num2 = ler.nextDouble();
        calcularAdicao(num1, num2);        // chama o procedimento
        ler.close();
        System.exit(0);
    }

    // procedimento: recebe dois valores, calcula e MOSTRA (nao devolve nada)
    static void calcularAdicao(double v1, double v2) {
        double res;
        res = v1 + v2;
        System.out.println("Soma = " + res);
    }
}
