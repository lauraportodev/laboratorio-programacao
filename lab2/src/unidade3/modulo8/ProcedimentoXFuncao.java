package unidade3.modulo8;

public class ProcedimentoXFuncao {

    // PROCEDIMENTO: calcula e ja mostra. O valor morre aqui dentro.
    public static void mostrarMedia(double n1, double n2) {
        double media = (n1 + n2) / 2;
        System.out.println("Media: " + media);
    }

    // FUNCAO: calcula e devolve. Quem chamou decide o que fazer com o valor.
    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    public static void main(String[] args) {
        System.out.println("--- com o procedimento ---");
        mostrarMedia(8.0, 6.0);
        mostrarMedia(5.0, 4.0);
        // e agora? quem teve a maior media? o procedimento nao deixou o valor com a gente

        System.out.println("--- com a funcao ---");
        double mediaAna = calcularMedia(8.0, 6.0);
        double mediaBruno = calcularMedia(5.0, 4.0);
        System.out.println("Ana: " + mediaAna + " | Bruno: " + mediaBruno);

        if (mediaAna > mediaBruno) {
            System.out.println("Maior media: Ana");
        } else {
            System.out.println("Maior media: Bruno");
        }

        if (calcularMedia(5.0, 4.0) >= 7.0) {
            System.out.println("Bruno: aprovado");
        } else {
            System.out.println("Bruno: reprovado");
        }

        System.out.printf("Media da turma: %.2f%n", calcularMedia(mediaAna, mediaBruno));
    }
}
