package unidade3.modulo8;

public class ContadorQueNaoConta {

    static int contador = 0;

    public static void contar() {
        int contador = 0;       // ERRO: cria uma local nova em vez de usar a global
        contador++;
    }

    public static void main(String[] args) {
        contar();
        contar();
        contar();
        System.out.println("contador = " + contador);
    }
}
