package estruturarepeticao;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// Leia a altura e o sexo de n pessoas e imprima:
		// a) Quantos homens e mulheres foram medidas;
		// b) Quantos homens acima de 1,70;
		// c) A media das alturas das mulheres.
		Scanner teclado = new Scanner(System.in);

		int homens = 0, mulheres = 0, homensAltos = 0;
		double somaAlturasMulheres = 0;

		while (true) {
			System.out.println("Digite a altura ou 0 para parar:");
			double altura = teclado.nextDouble();
			if (altura == 0) {
				break;
			}

			System.out.println("Digite o sexo (1 - Masculino, 2 - Feminino):");
			int sexo = teclado.nextInt();

			if (sexo == 1) {
				homens++;
				if (altura > 1.70) {
					homensAltos++;
				}
			} else if (sexo == 2) {
				mulheres++;
				somaAlturasMulheres += altura;
			}
		}
		teclado.close();

		System.out.println("Homens medidos: " + homens);
		System.out.println("Mulheres medidas: " + mulheres);
		System.out.println("Homens acima de 1,70: " + homensAltos);

		if (mulheres > 0) {
			double media = somaAlturasMulheres / mulheres;
			System.out.println("Media das alturas das mulheres: " + media);
		} else {
			System.out.println("Nenhuma mulher foi medida.");
		}
		System.out.println("Fim do programa!");
	}
}