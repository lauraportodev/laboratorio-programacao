package modulo5;
import java.util.Scanner;
public class ExercicioSecao41 {
		    public static void main(String[] args) {
		        Scanner teclado = new Scanner(System.in);
		                int[] numeros = new int[5];

		                // Exercicio A - ler os 5 numeros e guardar no vetor
		                System.out.println("Digite 5 numeros inteiros:");
		                for (int i = 0; i < numeros.length; i++) {
		                    System.out.print("Numero " + (i + 1) + ": ");
		                    numeros[i] = teclado.nextInt();
		                }

		                // Exercicio A - mostrar o vetor
		                System.out.println("\nVetor digitado:");
		                for (int i = 0; i < numeros.length; i++) {
		                    System.out.println("numeros[" + i + "] = " + numeros[i]);
		                }

		                // Exercicio B - soma dos elementos
		                int soma = 0;
		                for (int i = 0; i < numeros.length; i++) {
		                    soma = soma + numeros[i];
		                }
		                System.out.println("\nSoma: " + soma);

		                // Exercicio C - media (soma dividida pela quantidade)
		                // o cast para (double) evita a divisao inteira, que arredondaria pra baixo
		                double media = (double) soma / numeros.length;
		                System.out.println("Media: " + media);

		                // Exercicio D - maior valor
		                int maior = numeros[0];
		                for (int i = 1; i < numeros.length; i++) {
		                    if (numeros[i] > maior) {
		                        maior = numeros[i];
		                    }
		                }
		                System.out.println("Maior: " + maior);

		                // Exercicio E - menor valor
		                int menor = numeros[0];
		                for (int i = 1; i < numeros.length; i++) {
		                    if (numeros[i] < menor) {
		                        menor = numeros[i];
		                    }
		                }
		                System.out.println("Menor: " + menor);

		                // Exercicio F - conta quantos sao pares
		                int contadorPares = 0;
		                for (int i = 0; i < numeros.length; i++) {
		                    if (numeros[i] % 2 == 0) {
		                        contadorPares++;
		                    }
		                }
		                System.out.println("Quantidade de pares: " + contadorPares);
		            }
		        }
