package unidade3.modulo8;

import java.util.Scanner;

public class TestaSomaFuncao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num1, num2, resultado;
        System.out.println("Digite o primeiro valor: ");
        num1 = ler.nextDouble();
        System.out.println("Digite o segundo valor: ");
        num2 = ler.nextDouble();
        resultado = calcularAdicao(num1, num2);   // o valor devolvido vai para resultado
        System.out.println("Resultado da soma: " + resultado);
        ler.close();
        System.exit(0);
    }

    // funcao: calcula e DEVOLVE o valor (quem chamou decide o que fazer com ele)
    static double calcularAdicao(double v1, double v2) {
        return (v1 + v2);
    }
}
