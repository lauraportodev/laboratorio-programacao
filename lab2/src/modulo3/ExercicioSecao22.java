package modulo3;
import java.util.Scanner;
public class ExercicioSecao22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Leia uma idade e informe: Maior de idade ou Menor de idade");
		Scanner teclado = new Scanner (System.in);
		System.out.println("Informe sua idade:");
		int idade = teclado.nextInt();
		if (idade >=18) {
			System.out.println("Maior de idade.");
		}else{
			System.out.println("Menor de idade.");
			teclado.close();
		}
	}
}