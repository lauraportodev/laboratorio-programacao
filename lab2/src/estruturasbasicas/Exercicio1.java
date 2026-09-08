package estruturasbasicas;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        int a = teclado.nextInt();

        System.out.print("Digite a segunda nota: ");
        int b = teclado.nextInt();

        System.out.print("Digite a terceira nota: ");
        int c = teclado.nextInt();

        double mediaPonderada = ((a*2) + (b*3) + (c*5)) / 10.0;

        System.out.println("A média ponderada é " + mediaPonderada);
        teclado.close();
	}

}
