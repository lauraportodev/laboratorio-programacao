package unidade3.modulo8;

public class SystemExitNoMeio {

    public static void encerrar() {
        System.out.println("encerrando...");
        System.exit(0);                        // desliga a JVM AQUI
    }

    public static void main(String[] args) {
        System.out.println("antes");
        encerrar();
        System.out.println("depois");          // nunca roda
    }
}
