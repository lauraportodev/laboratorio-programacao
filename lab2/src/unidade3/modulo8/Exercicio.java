package unidade3.modulo8;

public class Exercicio {
    public static void main(String[] args) {
        int num1 = 10, num2 = 30;
        troca(num1, num2);
        System.out.println("PROGRAMA PRINCIPAL - PASSAGEM POR VALOR\nnum1 = " + num1
                + " num2 = " + num2);
        System.exit(0);
    }

    static void troca(int n1, int n2) {
        int temp;
        System.out.println("DENTRO DO METODO ANTES DA TROCA\nn1 = " + n1 + " n2 = " + n2);
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("DENTRO DO METODO DEPOIS DA TROCA\nn1 = " + n1 + " n2 = " + n2);
    }
}
