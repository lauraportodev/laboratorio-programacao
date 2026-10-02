package unidade3.modulo8;

import java.util.Scanner;

public class ContaPares {

    public static boolean ehPar(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pares = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Numero " + i + ": ");
            int n = entrada.nextInt();
            if (ehPar(n)) {
                pares++;
            }
        }
        System.out.println("Quantidade de pares: " + pares);
        entrada.close();
    }
}
