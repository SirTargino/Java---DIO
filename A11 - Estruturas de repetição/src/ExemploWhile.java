import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        int produtos = 0;

        while (mesada>0) {
            Double valorProduto = valorAleatorio();
            if(valorProduto > mesada){
                valorProduto = mesada;
            }

            System.out.println("Produto no valor de: " + valorProduto + " adicionado ao carrinho");
            mesada = mesada - valorProduto;
            produtos++;
        }

        System.out.println("Saldo da mesada: " + mesada);
        System.out.println("Toda a sua mesada foi gasta com " + produtos + " produtos.");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
