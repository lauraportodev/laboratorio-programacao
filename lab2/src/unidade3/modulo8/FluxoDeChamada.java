package unidade3.modulo8;

public class FluxoDeChamada {

    public static void saudacao() {
        System.out.println("   2. dentro do metodo saudacao");
        System.out.println("   3. saudacao terminou, voltando...");
    }

    public static void main(String[] args) {
        System.out.println("1. main comecou");
        saudacao();                               // o main PAUSA aqui e espera
        System.out.println("4. main continuou da linha seguinte");
        saudacao();                               // pode chamar quantas vezes quiser
        System.out.println("5. fim do main");
    }
}
