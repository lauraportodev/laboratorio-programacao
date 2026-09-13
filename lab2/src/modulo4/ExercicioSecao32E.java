package modulo4;

import java.util.Scanner;

public class ExercicioSecao32E {

	public static void main(String[] args) {
		// Leia 5 notas e calcule a média.
		Scanner teclado = new Scanner(System.in);
		double  media,soma =0.0;
		for (int i =0; i < 5;i++) {
			System.out.println("Digite a " + (i+1) + "º nota:");
		double nota = teclado.nextDouble();
		soma = nota + soma;		
		}
		media = soma/5;
		System.out.printf("A média das notas é : %.2f%n",media);
		teclado.close();
		System.out.println("Fim do programa!");

	}

}
