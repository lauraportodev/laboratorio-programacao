package modulo4;
	import java.util.Scanner;
public class ExercicioSecao31 {

	public static void main(String[] args) {
		// Leia N e mostre os números de 1 até N.
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite um número:");
		int n = teclado.nextInt();
		for (int i =1;i <= n;i++){
		System.out.println(i);
		}
		teclado.close();
		System.out.println("Fim do programa!");
	}

}
