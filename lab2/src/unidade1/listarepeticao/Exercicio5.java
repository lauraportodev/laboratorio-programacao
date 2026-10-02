package unidade1.listarepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Faca um algoritmo que leia a altura de mocas inscritas em um concurso de
		 * beleza. Para finalizar sera digitado zero na altura. Imprima as duas
		 * maiores alturas.
		 */
		Scanner teclado = new Scanner(System.in);

		// guardam a maior e a segunda maior altura vistas ate agora
		double maior1 = 0;
		double maior2 = 0;

		while (true) {
			System.out.println("Digite uma altura ou zero para sair:");
			double altura = teclado.nextDouble();

			if (altura == 0) {
				break;
			} else if (altura > maior1) {
				// a nova altura bateu a maior: o antigo 1o lugar vira 2o lugar
				maior2 = maior1;
				maior1 = altura;
			} else if (altura > maior2) {
				// nao bateu a maior, mas bateu a segunda maior
				maior2 = altura;
			}
		}

		System.out.printf("As duas maiores alturas digitadas foram: %.2f e %.2f%n", maior1, maior2);
		teclado.close();
		System.out.println("Fim do programa!");
	}
}