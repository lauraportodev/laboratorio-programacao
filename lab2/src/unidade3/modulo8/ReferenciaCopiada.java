package unidade3.modulo8;

public class ReferenciaCopiada {

    // 1) mexe no CONTEUDO do vetor: quem chamou ve a mudanca
    public static void zerarPrimeiro(int[] v) {
        v[0] = 0;
    }

    // 2) faz o parametro apontar para OUTRO vetor: quem chamou nao ve
    public static void trocarVetor(int[] v) {
        v = new int[3];                  // v agora aponta para um vetor novo
        v[0] = 99;
        System.out.println("   dentro de trocarVetor: v[0] = " + v[0]);
    }

    // 3) String: "mudar" o texto cria OUTRO texto; quem chamou nao ve
    public static void gritar(String s) {
        s = s + "!!!";
        System.out.println("   dentro de gritar: s = " + s);
    }

    public static void main(String[] args) {
        int[] numeros = {5, 6, 7};

        zerarPrimeiro(numeros);
        System.out.println("1) depois de zerarPrimeiro: numeros[0] = " + numeros[0]);

        trocarVetor(numeros);
        System.out.println("2) depois de trocarVetor  : numeros[0] = " + numeros[0]);

        String nome = "ana";
        gritar(nome);
        System.out.println("3) depois de gritar       : nome = " + nome);
    }
}
