package modulo3;

import java.util.Scanner;

public class ExercicioSecao23C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Leia uma nota e informe a situação.");
		System.out.println("Informe uma nota:");
		int nota = teclado.nextInt();
		if (nota >= 7 ) {
			System.out.println(nota + " é uma boa nota.");
		}else if (nota >= 5 ) {
			System.out.println(nota + " é uma nota regular.");
		}else{
			System.out.println(nota + " é uma nota insuficiente.");
			teclado.close();
					}
				}
			}