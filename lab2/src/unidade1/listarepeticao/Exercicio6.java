package unidade1.listarepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Fatorial =1;
		int Contador= 1;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite um número para calcular o seu fatorial:");
		int n = teclado.nextInt();
		while (Contador < n) {
			Contador ++;
			Fatorial = Fatorial * Contador;					 		 
		}
		System.out.printf("O fatorial de %d é : %d", n, Fatorial);
		teclado.close();
		System.out.println("Fim do Programa!");
	}
}