package estruturasbasicas;
	import java.util.Scanner;
	
public class Exercicio6 {

	public static void main(String[] args) {
// Fazer um programa que leia um número inteiro e mostre o seu triplo, sua metade, a sua raiz cúbica, e por 
//fim, o número elevado a potência fracionária 2/3.  
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite um número:");
		int n = teclado.nextInt();
		int triplo = n*3;
		double metade = (double)n/2;
		double raizCubica=Math.cbrt(n);
		double potenciaFracionaria = Math.pow(n, 2.0/3.0);
		System.out.printf( "O triplo de %d é :%d.\n", n,triplo);
		System.out.printf("A metade de %d é :%.2f\n", n,metade);
		System.out.printf("A raiz cúbica de %d é :%.2f\n", n,raizCubica);
		System.out.printf("%d,elevado a potência fracionária 2/3 é :%.2f\n", n, potenciaFracionaria);		
	}
}
