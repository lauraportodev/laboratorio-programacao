package unidade1.listaselecao;

import java.util.Scanner;

public class CodigoCarga {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o código da carga:");
        int carga = teclado.nextInt();
        System.out.println("Digite o peso da carga (em kg):");
        double peso = teclado.nextDouble();
        double precoCarga = 0;

        if (carga >= 10 && carga <= 20) {
            precoCarga = peso * 100;
            System.out.printf("O peso da carga é %.3f kg e o preço da carga é R$%.2f.", peso, precoCarga);
        } else if (carga >= 21 && carga <= 30) {
            precoCarga = peso * 250;
            System.out.printf("O peso da carga é %.3f kg e o preço da carga é R$%.2f.", peso, precoCarga);
        } else if (carga >= 31 && carga <= 40) {
            precoCarga = peso * 300;
            System.out.printf("O peso da carga é %.3f kg e o preço da carga é R$%.2f.", peso, precoCarga);
        } else {
            System.out.println("Código inválido.");
        }

        teclado.close();
    }
}
