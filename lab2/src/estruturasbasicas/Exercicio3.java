package estruturasbasicas;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Faça um programa que leia o nome de um piloto, uma distância percorrida em km e o tempo que o piloto \r\n"
				+ "levou para percorrê-la (em horas). O programa deve calcular a velocidade média em km/h, e exibir a \r\n"
				+ "seguinte frase: A velocidade média de XX foi YY km/h, onde XX é o nome do piloto, e YY é a velocidade média. ");
		String nome = "João";
		double distancia = 10;
		double tempo = 1.20;
		double velocidadeMedia = distancia/tempo;
		System.out.println("A velocidade media de " +(nome)+ "foi " + (velocidadeMedia) + "km/h")
		
	}

}
