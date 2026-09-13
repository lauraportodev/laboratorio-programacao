package estruturasbasicas;
	import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Em uma pizzaria, cada tulipa de chope custa R$1,80 e uma pizza mista grande custa R$25,00 mais R$ 3,50 \r\n"
				+ "por tipo de cobertura pedida (queijo, presunto, banana, etc.). Uma turma vai à pizzaria e pede uma \r\n"
				+ "determinada quantidade de \"chopes\" e uma pizza grande com uma determinada quantidade de coberturas. \r\n"
				+ "Faca um programa que calcula a conta e, sabendo que a será informada a quantidade de pessoas, quanto \r\n"
				+ "que cada um deve pagar. Lembre-se dos 10% do garçom.\r\n ");

		double valorTulipa = 1.80;
		System.out.println("Digite a quantidade de tulipas:");
		double chopes = teclado.nextDouble();
		System.out.println("Qual quantidade de coberturas ?");
		int coberturas = teclado.nextInt();
		double valorPizza = 25 +(coberturas*3.50);
		System.out.println("Qual a quantidade de pessoas?");
		int pessoas = teclado.nextInt();
		double total = (chopes*valorTulipa) + valorPizza;
		double gorjeta = total * 1.10;
		double conta = gorjeta / pessoas;
		
		System.out.printf("O total da conta foi de R$%.2f e no grupo de %d pessoas, cada uma irá pagar R$%.2f.%n", gorjeta, pessoas, conta);	
	}

}
