package unidade3.modulo8;

import java.util.Scanner;

public class ScannerFechado {

    public static int lerIdade() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Idade: ");
        int idade = ler.nextInt();
        ler.close();                     // fecha o Scanner... e o System.in junto!
        return idade;
    }

    public static String lerNome() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = ler.next();        // o System.in ja esta fechado
        ler.close();
        return nome;
    }

    public static void main(String[] args) {
        int idade = lerIdade();
        String nome = lerNome();
        System.out.println(nome + " tem " + idade + " anos");
    }
}
