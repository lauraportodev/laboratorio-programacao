package modulo3;
	import java.util.Scanner;
public class ExercicioSecao23E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Leia três números e informe o maior.");
		System.out.println("Informe o primeiro número:");
		double a = teclado.nextDouble();
		System.out.println("Informe o segundo número:");
		double b = teclado.nextDouble();
		System.out.println("Informe o terceiro número:");
		double c = teclado.nextDouble();
		if (a>b && a>c)  {
			System.out.println("O maior número é: " + (a));
		}
		else if (b>a && b>c) {
			System.out.println("O maior número é: " + (b));
		}else{
			System.out.println("O maior número é: " + (c));
				}
	teclado.close();
	System.out.println("Fim do programa!");
			}	
		}