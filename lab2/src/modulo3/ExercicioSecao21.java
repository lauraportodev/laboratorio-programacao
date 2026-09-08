package modulo3;
	import java.util.Scanner;
public class ExercicioSecao21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Leia dois números e mostre:\r\n"
				+ " soma;\r\n"
				+ " subtração;\r\n"
				+ " multiplicação;\r\n"
				+ " divisão;\r\n"
				+ " resto.");
		System.out.println("Digite o primeiro valor:");
		int a = teclado.nextInt();
		System.out.println("Digite o segundo valor:");
		int b = teclado.nextInt();
		System.out.println("Os números são: " + a + ", " + b);
		System.out.println("A soma deles é:"+ (a + b));
		System.out.println("A subtração é:"+ (a - b));
		System.out.println("A multiplicação é:"+ (a * b));
		System.out.println("A divisão é:"+ (a / b));
		System.out.println("O resto é:"+ (a % b));
		teclado.close();
	}
}

