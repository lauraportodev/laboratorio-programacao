package estruturarepeticao;

public class Exercicio4 {

    public static void main(String[] args) {
        // Faça um algoritmo para somar os restos da divisão por 3 de 200 números inteiros.
        int soma = 0;
        for (int i = 0; i < 200; i++) {
            soma += i % 3; 
        }
        System.out.println("A soma dos restos da divisão por 3 foi de: " + soma);
        System.out.println("Fim do programa!");
    }
}