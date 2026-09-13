package modulo3;
import java.util.Scanner;
public class ExercicioSecao23A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Leia dois números e informe o maior.");
		System.out.println("Informe um número:");
		int a = teclado.nextInt();
		System.out.println("Informe outro número:");
		int b = teclado.nextInt();
		if (a>b) {
			System.out.println("O maior número é: " +a);
		}else{
			System.out.println("O maior número é: " +b);
			}
	teclado.close();
	System.out.println("Fim do programa!");
		}
	}