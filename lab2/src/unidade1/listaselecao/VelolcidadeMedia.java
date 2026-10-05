package unidade1.listaselecao;

import java.util.Scanner;

public class VelocidadeMedia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a distância percorrida do primeiro carro:");
        double distancia1 = teclado.nextDouble();
        System.out.println("Digite o tempo do primeiro carro:");
        double tempo1 = teclado.nextDouble();
        double velocidade1 = distancia1 / tempo1;

        System.out.println("Digite a distância percorrida do segundo carro:");
        double distancia2 = teclado.nextDouble();
        System.out.println("Digite o tempo do segundo carro:");
        double tempo2 = teclado.nextDouble();
        double velocidade2 = distancia2 / tempo2;

        System.out.printf("Velocidade média do primeiro carro: %.2f km/h%n", velocidade1);
        System.out.printf("Velocidade média do segundo carro: %.2f km/h%n", velocidade2);

        if (velocidade1 > velocidade2) {
            System.out.println("O primeiro carro foi mais rápido.");
        } else if (velocidade2 > velocidade1) {
            System.out.println("O segundo carro foi mais rápido.");
        } else {
            System.out.println("Os dois carros tiveram a mesma velocidade média.");
        }

        teclado.close();
    }
}
