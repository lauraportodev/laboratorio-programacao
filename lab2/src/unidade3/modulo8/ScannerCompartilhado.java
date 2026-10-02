package unidade3.modulo8;

import java.util.Scanner;

public class ScannerCompartilhado {

    // o Scanner chega como parametro: todos os metodos usam o MESMO
    public static int lerIdade(Scanner ler) {
        System.out.print("Idade: ");
        return ler.nextInt();
    }

    public static String lerNome(Scanner ler) {
        System.out.print("Nome: ");
        return ler.next();
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);     // criado UMA vez, no main
        int idade = lerIdade(ler);
        String nome = lerNome(ler);
        System.out.println(nome + " tem " + idade + " anos");
        ler.close();                              // fechado UMA vez, no fim
    }
}
