package modulo4;

import java.util.Scanner;

public class ExercicioSecao32C {

	public static void main(String[] args) {
		// Leia N e calcule a soma de 1 até N.
		int soma =0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número:");
		int n = teclado.nextInt();
		for (int i =1;i <=n;i++ ) {
			soma = soma + i;
		}
		System.out.println(soma);
	teclado.close();
	System.out.println("Fim do programa!");
	}

}