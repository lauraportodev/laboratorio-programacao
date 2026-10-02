package unidade3.modulo8;

public class RelatorioComParametros {

    // agora o procedimento recebe O QUE desenhar: tamanho e simbolo
    public static void linha(int tamanho, char simbolo) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linha(30, '=');
        System.out.println("RELATORIO DE VENDAS");
        linha(30, '-');
        System.out.println("Janeiro .......... R$ 1200,00");
        System.out.println("Fevereiro ........ R$ 1850,00");
        linha(30, '=');
        linha(10, '*');
    }
}
