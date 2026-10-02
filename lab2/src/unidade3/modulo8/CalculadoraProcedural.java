package unidade3.modulo8;

import java.util.Scanner;

public class CalculadoraProcedural {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num1, num2;
        System.out.println("Digite o primeiro valor: ");
        num1 = ler.nextDouble();
        System.out.println("Digite o segundo valor: ");
        num2 = ler.nextDouble();
        somarNumeros(num1, num2);
        subtrairNumeros(num1, num2);
        multiplicarNumeros(num1, num2);     // o slide so chama este
        dividirNumeros(num1, num2);
        ler.close();
        System.exit(0);
    }

    static void somarNumeros(double a, double b) {
        double res;                         // no slide: int res (nao compila)
        res = a + b;
        System.out.println("Resultado Soma: " + res);
    }

    static void subtrairNumeros(double a, double b) {
        double res;
        res = a - b;
        System.out.println("Resultado Subtracao: " + res);
    }

    static void multiplicarNumeros(double a, double b) {
        double res;
        res = a * b;
        System.out.println("Resultado Multiplicacao: " + res);
    }

    static void dividirNumeros(double a, double b) {
        double res;
        res = a / b;
        System.out.println("Resultado Divisao: " + res);
    }
}
