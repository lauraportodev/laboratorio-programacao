package unidade3.modulo8;

public class EscopoEntreMetodos {
    public static void main(String[] args) {
        double salario = 3500.0;
        mostrarAumento(salario);           // entrega o VALOR ao metodo
    }

    public static void mostrarAumento(double salario) {   // recebe como parametro
        double novo = salario * 1.10;
        System.out.printf("Novo salario: R$ %.2f%n", novo);
    }
}
