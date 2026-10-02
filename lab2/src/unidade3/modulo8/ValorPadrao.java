package unidade3.modulo8;

public class ValorPadrao {

    public static void linha(int tamanho, char simbolo) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }

    // sobrecarga fazendo o papel do "valor padrao" do Python
    public static void linha() {
        linha(30, '=');
    }

    public static void main(String[] args) {
        linha();
        linha(12, '#');
    }
}
