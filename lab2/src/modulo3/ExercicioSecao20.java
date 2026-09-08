package modulo3;
import java.util.Scanner;
public class ExercicioSecao20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite seu nome:");
		String nome = teclado.next();
		System.out.println("Qual sua idade:");
		int idade = teclado.nextInt();
		System.out.println("Qual sua altura");
		double altura = teclado.nextDouble();
		System.out.println("Olá, "+ nome + "!Você tem " +idade+ " anos e possui " +altura+ "m de altura.");
		teclado.close();
	}

}
