package modulo3;
	import java.util.Scanner;
public class ExercicioSecao23D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Leia duas notas e calcule a média.");
		System.out.println("Informe a primeira nota:");
		double a = teclado.nextDouble();
		System.out.println("Informe a segunda nota:");
		double b = teclado.nextDouble();
		double m = (a+b)/2;
		System.out.println("A média entre "+a+" e "+b+" é " +m);
		teclado.close();
	}

}
