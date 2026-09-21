package estruturarepeticao;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int positivos = 0, negativos = 0, contador = 0;
        double soma = 0; // acumula todos os valores
        double media = 0, pctnegativos = 0;
        
        while (true) {
            System.out.println("Digite um valor ou zero para sair:");
            int n = teclado.nextInt();
            
            if (n == 0) {
                break;
            }
            
            soma += n;
            contador++;
            
            if (n > 0) {
                positivos++;
            } else {
                negativos++;
            }
        }
        
        if (contador > 0) {
            media = soma / contador;
            pctnegativos = ((double) negativos / contador) * 100;
            
            System.out.printf("Média: %.2f, Positivos: %d, Percentual de negativos: %.2f%%\n", 
                              media, positivos, pctnegativos);
        } else {
            System.out.println("Nenhum valor foi digitado!");
        }
        
        teclado.close();
        System.out.println("Fim do programa!");
    }
}
