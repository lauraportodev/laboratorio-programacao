package salariosabaixodamedia;
import java.util.Scanner;

public class RevisaoProva {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String vetNome[];
		double vetSalario[];
		int qtdeFunc;
		double mediaSalario, soma=0.0;

		System.out.println("Informe a quantidade de funcionários: ");
		qtdeFunc = entrada.nextInt();
		entrada.nextLine();

		vetNome = new String[qtdeFunc];
		vetSalario = new double[qtdeFunc];

		for(int i=0; i<qtdeFunc; i++) {
			System.out.println("Informe o nome do "+(i+1)+"° funcionários: ");
			vetNome[i] = entrada.nextLine();
			System.out.println("Informe o salário do "+(i+1)+"° funcionários: ");
			vetSalario[i] = entrada.nextDouble();
			entrada.nextLine();

			soma = soma + vetSalario[i];
		}

		mediaSalario = soma/qtdeFunc;
		
		System.out.printf("Funcionários que ganham abaixo da média de salários: R$ %.2f",mediaSalario);
		for(int i=0; i<qtdeFunc; i++) {
			if(vetSalario[i]<mediaSalario) {
				System.out.println("Nome do Funcionário: "+vetNome[i]);
				System.out.println("Salário do Funcionário: "+vetSalario[i]);
			}
		}		
		
		entrada.close();
		System.out.println("Fim do programa!");
	}
}

