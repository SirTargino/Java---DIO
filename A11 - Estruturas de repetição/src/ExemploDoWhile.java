import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        //O do-while funciona semelhante ao while, mas precisa executar pelo menos uma vez a tarefa. No caso aqui, precisa tocar pelo menos uma vez pra atender.
        do {
            System.out.println("Telefone tocando");
        } while(tocando());

        System.out.println("A ligação foi atendida.");
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);

        return ! atendeu;
    }
}
