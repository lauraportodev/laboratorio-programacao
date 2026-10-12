package unidade2.modulo7;

import java.util.Scanner;

public class BolhaComScanner {
	public static void main(String[] args) {

		final int tam = 4;
		int[] vet = new int[tam];
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < tam; i++) {
			System.out.println("Digite o " + (i + 1) + "º número:");
			vet[i] = teclado.nextInt();
		}
		int aux;
		for (int i = 0; i < tam - 1; i++) {
			for (int j = 0; j < tam - 1 - i; j++) {
				if (vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
		for (int i = 0; i < tam; i++) {
			System.out.println(vet[i]);
		}
		teclado.close();
	}
}