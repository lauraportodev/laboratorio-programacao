package estruturasbasicas;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Realizarei uma viagem de vários dias em meu automóvel, e gostaria de saber a quilometragem média por \r\n"
				+ "litro de gasolina. Para isto, anotarei a quilometragem no velocímetro ao sair de viagem, e depois ao chegar. \r\n"
				+ "Também vou somar toda a gasolina que comprar para o carro. Você poderia fazer um programa que me \r\n"
				+ "desse, com estes dados, quantos km fiz, em média, por litro de gasolina?");
		System.out.print("Digite a quilometragem inicial: ");
        double kmInicial = teclado.nextDouble();
        System.out.print("Digite a quilometragem final: ");
        double kmFinal = teclado.nextDouble();
        System.out.print("Digite a quantidade de gasolina consumida (litros): ");
        double litrosGasolina = teclado.nextDouble();
        double kmPorLitro = (kmFinal - kmInicial) / litrosGasolina;
        System.out.printf("A quilometragem média por litro de gasolina foi de: %.2f%n", kmPorLitro);
        teclado.close();
    }
}