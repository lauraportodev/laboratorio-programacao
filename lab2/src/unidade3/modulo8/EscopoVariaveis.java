package unidade3.modulo8;

public class EscopoVariaveis {

    /* a variavel abaixo e "global": declarada na classe, fora de qualquer metodo */
    static int totalChamadas = 0;

    public static void registrar(String quem) {
        /* a variavel abaixo e local: existe somente dentro deste metodo */
        int chamadasNestaExecucao = 0;
        totalChamadas++;
        chamadasNestaExecucao++;
        System.out.println(quem + " -> local = " + chamadasNestaExecucao
                + " | global = " + totalChamadas);
    }

    public static void main(String[] args) {
        registrar("Ana");
        registrar("Bruno");
        registrar("Carla");

        for (int i = 1; i <= 3; i++) {
            /* a variavel i e local, definida so dentro deste bloco */
            System.out.print(i + " ");
        }
        System.out.println();
        // System.out.println(i);   <- nao compila: aqui o i ja nao existe
        System.out.println("total de chamadas: " + totalChamadas);
    }
}
