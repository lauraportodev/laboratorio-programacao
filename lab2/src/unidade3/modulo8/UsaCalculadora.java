package unidade3.modulo8;

public class UsaCalculadora {
    public static void main(String[] args) {
        // metodo static de OUTRA classe: chama pelo nome da classe, igual ao Math.sqrt
        System.out.println("Calculadora.somar(2, 3)  = " + Calculadora.somar(2, 3));
        System.out.println("Calculadora.media(7, 10) = " + Calculadora.media(7, 10));
        System.out.println("Math.sqrt(81)            = " + Math.sqrt(81));
        // Calculadora.dividirPorDois(10);   <- nao compila: o metodo e private
    }
}
