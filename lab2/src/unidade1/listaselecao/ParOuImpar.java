package unidade1.listaselecao;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int a = teclado.nextInt();
		if (a % 2 == 0) {
			System.out.println("O número digitado é par.");
		} else if (a % 2 != 0) {
			System.out.println("O número é ímpar.");
		} else if (a == 0) {
			System.out.println("O número é zero.");
		}
	teclado.close();
	}
}