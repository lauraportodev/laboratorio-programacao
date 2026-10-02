package unidade3.modulo8;

import java.util.Scanner;

public class Tabuada {

    // procedimento: recebe o numero e MOSTRA a tabuada (nao precisa devolver nada)
    public static void mostrarTabuada(int n) {
        System.out.println("--- Tabuada do " + n + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %2d = %3d%n", n, i, n * i);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Tabuada de qual numero? ");
        int numero = entrada.nextInt();
        mostrarTabuada(numero);
        entrada.close();
    }
}
