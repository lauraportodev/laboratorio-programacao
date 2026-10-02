package unidade3.modulo8;

import java.util.Scanner;

public class CadastroProdutosModular {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos produtos? ");
        int n = entrada.nextInt();
        entrada.nextLine();                               // descarta o Enter

        int[] codigo = new int[n];
        String[] descricao = new String[n];
        double[] preco = new double[n];

        cadastrar(entrada, codigo, descricao, preco);     // preenche os tres vetores
        ordenarPorCodigo(codigo, descricao, preco);       // exigencia da busca binaria
        mostrarCadastro(codigo, descricao, preco);

        System.out.println();
        System.out.print("Codigo a pesquisar: ");
        int procurado = entrada.nextInt();

        int pos = buscaBinaria(codigo, procurado);
        mostrarProduto(pos, procurado, descricao, preco);

        System.out.println();
        System.out.println("=== Comparacoes ===");
        System.out.println("(a) pesquisa linear .: " + comparacoesLinear(codigo, procurado));
        System.out.println("(b) pesquisa binaria: " + comparacoesBinaria(codigo, procurado));

        entrada.close();
    }

    // ---------- entrada ----------
    public static void cadastrar(Scanner entrada, int[] codigo, String[] descricao, double[] preco) {
        for (int i = 0; i < codigo.length; i++) {
            System.out.println("--- Produto " + (i + 1) + " ---");
            System.out.print("Codigo....: ");
            codigo[i] = entrada.nextInt();
            entrada.nextLine();                           // descarta o Enter
            System.out.print("Descricao.: ");
            descricao[i] = entrada.nextLine();
            System.out.print("Preco.....: ");
            preco[i] = entrada.nextDouble();
            entrada.nextLine();                           // descarta o Enter
        }
    }

    // ---------- ordenacao (bolha) ----------
    public static void ordenarPorCodigo(int[] codigo, String[] descricao, double[] preco) {
        for (int i = 0; i < codigo.length - 1; i++) {
            for (int j = 0; j < codigo.length - 1 - i; j++) {
                if (codigo[j] > codigo[j + 1]) {
                    trocar(codigo, j, j + 1);             // as tres chamadas movem
                    trocar(descricao, j, j + 1);          // o MESMO produto junto;
                    trocar(preco, j, j + 1);              // a sobrecarga escolhe a versao
                }
            }
        }
    }

    // tres versoes de trocar: mesmo nome, tipo de vetor diferente (sobrecarga)
    public static void trocar(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    public static void trocar(String[] v, int i, int j) {
        String aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    public static void trocar(double[] v, int i, int j) {
        double aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    // ---------- saida ----------
    public static void mostrarCadastro(int[] codigo, String[] descricao, double[] preco) {
        System.out.println();
        System.out.println("=== Cadastro ordenado por codigo ===");
        System.out.printf("%-10s %-22s %10s%n", "CODIGO", "DESCRICAO", "PRECO");
        for (int i = 0; i < codigo.length; i++) {
            System.out.printf("%-10d %-22s %10.2f%n", codigo[i], descricao[i], preco[i]);
        }
    }

    public static void mostrarProduto(int pos, int procurado, String[] descricao, double[] preco) {
        System.out.println();
        System.out.println("=== Resultado ===");
        if (pos == -1) {
            System.out.println("Codigo " + procurado + " nao cadastrado.");
        } else {
            System.out.println("Produto...: " + descricao[pos]);
            System.out.printf("Preco.....: R$ %.2f%n", preco[pos]);
            System.out.println("Posicao...: " + pos);
        }
    }

    // ---------- buscas ----------
    public static int buscaBinaria(int[] v, int x) {
        int inicio = 0, fim = v.length - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (v[meio] == x) {
                return meio;
            }
            if (x < v[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }

    public static int comparacoesLinear(int[] v, int x) {
        int comparacoes = 0;
        for (int i = 0; i < v.length; i++) {
            comparacoes++;
            if (v[i] == x) {
                return comparacoes;
            }
        }
        return comparacoes;
    }

    public static int comparacoesBinaria(int[] v, int x) {
        int comparacoes = 0;
        int inicio = 0, fim = v.length - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            comparacoes++;
            if (v[meio] == x) {
                return comparacoes;
            }
            if (x < v[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return comparacoes;
    }
}
