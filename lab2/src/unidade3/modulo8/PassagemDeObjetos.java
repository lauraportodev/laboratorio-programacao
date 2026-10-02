package unidade3.modulo8;

public class PassagemDeObjetos {
    public static void main(String[] args) {
        int[] vetor = {10, 30};
        troca(vetor);
        System.out.println("PASSAGEM POR REFERENCIA DE UM VETOR\nnum1 = " + vetor[0]
                + " num2 = " + vetor[1]);
        System.exit(0);
    }

    static void troca(int[] vet) {
        int temp;
        System.out.println("DENTRO DO METODO ANTES DA TROCA\nnum1 = "
                + vet[0] + " num2 = " + vet[1]);
        temp = vet[0];
        vet[0] = vet[1];
        vet[1] = temp;
        System.out.println("DENTRO DO METODO DEPOIS DA TROCA\nnum1 = "
                + vet[0] + " num2 = " + vet[1]);
    }
}
