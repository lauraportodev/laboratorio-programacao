package modulo1;

public class TesteDoAmbiente {

	public static void main(String[] args) {

		// Constante: o valor nao muda depois de definido
		final String DISCIPLINA = "Laboratorio de Programacao II";

		// Variaveis: cada uma precisa dizer o tipo antes do nome
		String aluna = "Laura";
		int modulo = 1;
		double nota = 8.5;

		System.out.println("Ambiente configurado com sucesso!");
		System.out.println("------------------------------");
		System.out.println("Disciplina: " + DISCIPLINA);
		System.out.println("Aluna: " + aluna);
		System.out.println("Modulo atual: " + modulo);
		System.out.println("Nota de exemplo: " + nota);

		// A pegadinha classica: int dividido por int corta a parte decimal
		System.out.println("10 / 3 com inteiros: " + (10 / 3));
		System.out.println("10.0 / 3 com decimal: " + (10.0 / 3));
	}
}