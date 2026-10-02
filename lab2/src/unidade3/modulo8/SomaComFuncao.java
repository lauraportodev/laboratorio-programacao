package unidade3.modulo8;

public class SomaComFuncao {

    // a rotina so faz a conta e DEVOLVE: quem chamou decide o que fazer
    public static int soma(int a, int b) {
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        int resultado = soma(5, 2);
        System.out.println("A soma de 5 com 2 e " + resultado);     // o mesmo texto de antes
        System.out.println("Total da compra: R$ " + soma(10, 20));  // outro texto, mesmo metodo
        if (soma(3, 4) > 5) {                                        // usado num if
            System.out.println("3 + 4 passa de 5");
        }
        System.out.println("O dobro de 5 + 2 e " + 2 * soma(5, 2));  // usado numa conta
    }
}
