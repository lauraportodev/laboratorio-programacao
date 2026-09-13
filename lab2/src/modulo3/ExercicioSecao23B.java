package modulo3;
import java.util.Scanner;
public class ExercicioSecao23B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Leia uma idade e informe se está entre 18 e 60 anos.");
		System.out.println("Digite uma idade:");
		int a = teclado.nextInt();
		if (a >= 18 && a <=60){
			System.out.println("A idade " +a+ " está dentro da faixa.");
		}else{
			System.out.println("A idade " +a+ " não está dentro da faixa.");
			}
	teclado.close();
	System.out.println("Fim do programa!");
		}
	}