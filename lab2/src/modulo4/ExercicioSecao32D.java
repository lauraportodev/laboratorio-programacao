package modulo4;

import java.util.Scanner;

public class ExercicioSecao32D {

	public static void main(String[] args) {
		// Leia um número e mostre sua tabuada.
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número:");
		int n = teclado.nextInt();
		for (int i = 0; i <= 10; i++) {
			int tabuada = n * i;
			System.out.println(tabuada);
		}
		teclado.close();
		System.out.println("Fim do programa!");
	}

}
