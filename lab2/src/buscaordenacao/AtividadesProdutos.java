package buscaordenacao;

import java.util.Scanner;

public class AtividadesProdutos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite quantos produtos:");
		int n = teclado.nextInt();
		teclado.nextLine();

		// Vetores para armazenar os dados dos produtos
		int[] codigo = new int[n];
		String[] descricao = new String[n];
		double[] preco = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("\nProduto " + (i + 1));

			System.out.println("Código:");
			codigo[i] = teclado.nextInt();
			teclado.nextLine();

			System.out.println("Descrição:");
			descricao[i] = teclado.nextLine();

			System.out.println("Preço:");
			preco[i] = teclado.nextDouble();
			teclado.nextLine();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (codigo[j] > codigo[j + 1]) {
					int auxCodigo = codigo[j];
					codigo[j] = codigo[j + 1];
					codigo[j + 1] = auxCodigo;

					String auxDescricao = descricao[j];
					descricao[j] = descricao[j + 1];
					descricao[j + 1] = auxDescricao;

					double auxPreco = preco[j];
					preco[j] = preco[j + 1];
					preco[j + 1] = auxPreco;
				}
			}
		}

		System.out.println("\nDigite o código que deseja pesquisar:");
		int busca = teclado.nextInt();

		// a) PESQUISA LINEAR
		int qtdComparacoesLinear = 0;
		boolean achouLinear = false;
		int i = 0;
		while (i < n && achouLinear == false) {
			qtdComparacoesLinear++;
			if (codigo[i] == busca) {
				achouLinear = true;
			}
			i++;
		}

		// b) PESQUISA BINÁRIA
		int qtdComparacoesBinaria = 0;
		boolean achouBinaria = false;
		int inicio = 0;
		int fim = n - 1;
		while (inicio <= fim && achouBinaria == false) {
			int meio = (inicio + fim) / 2;
			qtdComparacoesBinaria++;
			if (codigo[meio] == busca) {
				achouBinaria = true;
			} else if (busca > codigo[meio]) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}

		
		if (achouLinear == true) {
			System.out.println("\nProduto encontrado!");
		} else {
			System.out.println("\nProduto não encontrado.");
		}
		System.out.println("Comparações na pesquisa linear: " + qtdComparacoesLinear);
		System.out.println("Comparações na pesquisa binária: " + qtdComparacoesBinaria);

		teclado.close();
		System.out.println("Fim do programa.");
	}
}