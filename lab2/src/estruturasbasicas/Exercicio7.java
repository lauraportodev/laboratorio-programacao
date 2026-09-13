package estruturasbasicas;
	import java.math;
public class Exercicio7 {

	public static void main(String[] args) {
//  Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1,y1) e  
//P(x2,y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é: 
		
		int x1 = 3;
		int y1 = 6;
		int x2 = 12;
		int y2 = 9;
		double distancia = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		System.out.printf("A distância entre os pontos P(%d,%d) e P(%d,%d) é: %.2f", x1,y1,x2,y2,distancia);
		
	}

}
