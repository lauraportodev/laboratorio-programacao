package estruturarepeticao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Apresentar todos os valores numericos inteiros impares situados na faixa de 0 a n, onde
		// n e um numero fornecido pelo usuario do programa. A verificacao se o numero e impar
		// sera feita dentro do loop. Caso o numero seja impar, mostre-o, nao sendo, passe para
		// o proximo numero.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int n = teclado.nextInt();

		System.out.println("Numeros impares de 0 ate " + n + ":");
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		teclado.close();
		System.out.println("Fim do programa!");
	}
}