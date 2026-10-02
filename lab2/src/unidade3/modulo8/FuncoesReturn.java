package unidade3.modulo8;

public class FuncoesReturn {

    // dois caminhos, dois return: todo caminho PRECISA devolver um int
    public static int maior(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // funcao que devolve boolean: pronta para usar direto num if
    public static boolean ehPar(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        // 1. guardar o retorno numa variavel
        int m = maior(8, 3);
        System.out.println("maior(8, 3) = " + m);

        // 2. usar o retorno direto numa expressao
        int dobro = 2 * maior(4, 9);
        System.out.println("2 * maior(4, 9) = " + dobro);

        // 3. entregar o retorno direto a outro metodo (o println)
        System.out.println("maior(-5, -2) = " + maior(-5, -2));

        // 4. o retorno de uma chamada vira argumento de outra
        System.out.println("maior de 7, 12 e 10 = " + maior(maior(7, 12), 10));

        // 5. funcao boolean como condicao do if
        for (int i = 1; i <= 4; i++) {
            if (ehPar(i)) {
                System.out.println(i + " e par");
            } else {
                System.out.println(i + " e impar");
            }
        }

        // 6. chamar e ignorar o retorno: compila, mas o valor se perde
        maior(100, 200);
    }
}
