package estruturasbasicas;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Faça um programa que leia três valores inteiros, e calcule e exiba a sua média ponderada. A primeira nota \r\n"
				+ "tem peso 2, a segunda tem peso 3 e a terceira tem peso 5. ");
		int a = 5;
		int b = 8;
		int c = 3;
		double mediaPonderada = ((a*2) +( b*3) + (c*5))/10;
		
		System.out.println("A média ponderada é " + (mediaPonderada));
	}

}
