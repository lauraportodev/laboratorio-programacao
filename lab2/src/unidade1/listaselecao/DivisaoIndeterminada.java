package unidade1.listaselecao;
	import java.util.Scanner;
public class DivisaoIndeterminada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número:");
		int a = teclado.nextInt();
		System.out.println("Digite o segundo número:");
		int b = teclado.nextInt();
		if ( b == 0)  {
			System.out.println("Divisão indeterminada");	
		}else { 
			int c = a/b;
			System.out.printf("A divisão de %d por %d é : %d ", a,b,c );
		}
	teclado.close();
	}
}