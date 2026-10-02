package unidade1.listarepeticao;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o primeiro valor:");
		int a = teclado.nextInt();

		System.out.println("Digite o segundo valor:");
		int b = teclado.nextInt();

		int soma = 0;

		// Garantir que A seja o menor
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}

		for (int i = a; i <= b; i++) {
			soma += i;
		}

		System.out.printf("A soma de todos os inteiros entre %d e %d é %d.%n", a, b, soma);

		teclado.close();
		System.out.println("Fim do programa.");
	}
}
