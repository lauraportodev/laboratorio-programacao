package unidade1.listaselecao;
	import java.util.Scanner;
public class PessoaMaisNova {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	System.out.println("Digite o primeiro nome:");
	String nome1 = teclado.next();
	System.out.println("Digite a idade de " +nome1+ ":");
	int idade1= teclado.nextInt();
	System.out.println("Digite o primeiro nome:");
	String nome2 = teclado.next();
	System.out.println("Digite a idade de " +nome2+ ":");
	int idade2= teclado.nextInt(); 
	int maisNova =0;
	if (idade1 < idade2) {
		maisNova = idade1;
	}else { 
		maisNova = idade2;
	} 
	System.out.println("A pessoa mais nova é" +maisNova+ " e nasceu em " +anoNascimento);
	teclado.close();
	}
}