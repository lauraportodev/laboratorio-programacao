package estruturasbasicas;

public class Exercicio9 {
    public static void main(String[] args) {
        /*
         * Escrever um algoritmo que lê:
         * a) a porcentagem do IPI a ser acrescido no valor das peças
         * b) o código da peça 1, valor unitário da peça 1, quantidade de peças 1
         * c) o código da peça 2, valor unitário da peça 2, quantidade de peças 2
         * O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
         * Fórmula: (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
         */

        double ipi = 30; 
        double valor1 = 505.10;
        double valor2 = 202.13;
        int quant1 = 5;
        int quant2 = 2;

        double total = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);

        System.out.printf("O valor total a ser pago é de R$ %.2f%n", total);
    }
}
