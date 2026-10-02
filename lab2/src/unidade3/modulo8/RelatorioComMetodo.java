package unidade3.modulo8;

public class RelatorioComMetodo {

    // procedimento: desenha uma linha de 30 sinais de igual
    public static void linha() {
        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linha();                                   // chamada 1
        System.out.println("RELATORIO DE VENDAS");
        linha();                                   // chamada 2
        System.out.println("Janeiro .......... R$ 1200,00");
        System.out.println("Fevereiro ........ R$ 1850,00");
        linha();                                   // chamada 3
    }
}
