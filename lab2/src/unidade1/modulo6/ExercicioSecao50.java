package unidade1.modulo6;

public class ExercicioSecao50 {

	public static void main(String[] args) {
		// A) matriz 3x3
		int[][] matriz = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};

		int soma = 0;
		int pares = 0;
		int maior = matriz[0][0]; // começa com um elemento real da matriz

		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");

				soma = soma + matriz[i][j]; // B) soma

				if (matriz[i][j] % 2 == 0) { // D) pares
					pares++;
				}

				if (matriz[i][j] > maior) { // E) maior
					maior = matriz[i][j];
				}
			}
			System.out.println();
		}

		// C) média: fora do loop e com double
		double media = (double) soma / (matriz.length * matriz[0].length);

		System.out.println("A soma dessa matriz é: " + soma);
		System.out.println("A média dessa matriz é: " + media);
		System.out.println("A quantidade de elementos pares é: " + pares);
		System.out.println("O maior elemento dessa matriz é: " + maior);
	}
}