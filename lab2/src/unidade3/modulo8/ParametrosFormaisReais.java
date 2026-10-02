package unidade3.modulo8;

public class ParametrosFormaisReais {

    //                        parametros FORMAIS: dividendo e divisor
    public static double dividir(double dividendo, double divisor) {
        return dividendo / divisor;
    }

    public static void main(String[] args) {
        double a = 10, b = 4;

        // argumentos (parametros REAIS): a e b
        System.out.println("dividir(a, b) = " + dividir(a, b));
        System.out.println("dividir(b, a) = " + dividir(b, a));    // a ORDEM manda

        // nomes iguais aos dos parametros NAO fazem a associacao
        double dividendo = 1, divisor = 8;
        System.out.println("dividir(divisor, dividendo) = " + dividir(divisor, dividendo));

        // o argumento pode ser literal, expressao ou outra chamada
        System.out.println("dividir(9, 3) = " + dividir(9, 3));    // int vira double sozinho
        System.out.println("dividir(a * 2, b + 1) = " + dividir(a * 2, b + 1));
        System.out.println("dividir(dividir(100, 5), 4) = " + dividir(dividir(100, 5), 4));
    }
}
