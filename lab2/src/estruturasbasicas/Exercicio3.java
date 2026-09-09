package estruturasbasicas;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Faça um programa que leia o nome de um piloto, uma distância percorrida em km e o tempo que o piloto \r\n"
				+ "levou para percorrê-la (em horas). O programa deve calcular a velocidade média em km/h, e exibir a \r\n"
				+ "seguinte frase: A velocidade média de XX foi YY km/h, onde XX é o nome do piloto, e YY é a velocidade média. ");
		System.out.println("Qual seu nome?");
		String nome = teclado.next();
		System.out.println("Qual a distância?");
		double distancia = teclado.nextDouble();
		System.out.println("Qual tempo ?");
		double tempo = teclado.nextDouble();
		double velocidadeMedia = distancia/tempo;
		System.out.println("A velocidade media de " +(nome)+ " foi " + (velocidadeMedia) + "km/h");
	teclado.close();
	}

}
