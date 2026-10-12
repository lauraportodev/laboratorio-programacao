package unidade3.modulo8;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {

		// Um loja deseja informatizar o sistema de venda de produtos. Suponha que a
		// loja tenha diversos produtos, cada um com um código e valor respectivos.
		// Para comprar um produto, o cliente informa a descrição dele e a quantidade
		// desejada. O cliente pode comprar mais de um produto.
		// Construa métodos (funções ou procedimento) específicos para:
		//
		// a) Inicializar os dados de produtos (código, descrição, valor e quantidade em
		// estoque).
		// b) Vender para um cliente um conjunto de produtos. Ao final da venda, imprima
		// na tela algo semelhante a um cupom fiscal: código, descrição,
		// valor unitário, quantidade e valor total do item. No final informe o total da
		// compra.
		//
		// O método principal deve ter um menu que gerencie a loja e permita realizar
		// diversas compras.
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual produto deseja:\n" + "101 (Monitor) \n" + "102 (Teclado)\n" + "103 (Mouse)\n");
		int opcao = teclado.nextInt();
		System.out.println("Qual a quantidade desejada para :" + opcao);
		int totalItem = teclado.nextInt();
		String descricao;
		int codigo, totalItem;
		double valorUnitario, totalCompra;

		switch (opcao) {
		case 101:
			 valorUnitario = totalItem * 350;
			break;
		case 102:
			 valorUnitario = totalItem * 120;
			break;
		case 103:
			 valorUnitario = totalItem * 60;
			break;
		default:
			// novosalario = salario + (salario * 0.5);
		}

		totalCompra = valorUnitario * totalItem;
		System.out.printf(
				" -- Cupom fiscal -- /n" + "Código: %d /n " + "Descrição: %d /n" + "Valor unitário: R$%.2f /n "
						+ "Quantidade: %d /n" + "Valor total do item: R$%.2f /n" + "Total da compra: R$%.2f /n",
				codigo, descricao, valorUnitario, quantidade, totalItem, totalCompra);
		teclado.close();
	}
}
