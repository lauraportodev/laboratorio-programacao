package unidade3.modulo8;

import java.util.Scanner;

public class CalculadoraOO {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Multiplica res = new Multiplica();       // cria um OBJETO da classe Multiplica
        double num1, num2;
        System.out.println("Digite o primeiro valor: ");
        num1 = ler.nextDouble();
        System.out.println("Digite o segundo valor: ");
        num2 = ler.nextDouble();
        res.multiplicarNumeros(num1, num2);      // chama o metodo PELO objeto
        ler.close();
        System.exit(0);
    }
}
