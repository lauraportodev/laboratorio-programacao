package unidade3.modulo8;

import java.util.Scanner;

public class MaiorDeTres {

    public static int maior(int a, int b) {
        if (a >= b) {
            return a;
        }
        return b;                                 // so chega aqui se b > a
    }

    // sobrecarga: mesmo nome, TRES parametros; reaproveita a versao de dois
    public static int maior(int a, int b, int c) {
        return maior(maior(a, b), c);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Primeiro numero: ");
        int a = entrada.nextInt();
        System.out.print("Segundo numero.: ");
        int b = entrada.nextInt();
        System.out.print("Terceiro numero: ");
        int c = entrada.nextInt();
        System.out.println("Maior: " + maior(a, b, c));
        entrada.close();
    }
}
