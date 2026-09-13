package estruturasbasicas;
	import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Faça um algoritmo que leia um \r\n"
				+ "valor em graus Centígrados e imprima seu correspondente em graus Fahrenheit.\r \n");
		System.out.println("Digite um valor em ºC:");
		double celsius = teclado.nextDouble();
		double Fahrenheit = (9.0/5)*celsius+32;
		System.out.printf("Em Fahrenheit a temperatura de %.2f é de %.2f.", celsius,Fahrenheit);
	
	}
}
