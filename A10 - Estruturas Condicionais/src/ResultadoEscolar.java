public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 3;
        //Condicional composta, mas com apenas 1 condição
        // if (nota >= 7) {
        //     System.out.println("Aprovado");
        // }else{
        //     System.out.println("Reprovado");
        // }

        //Condição encadeada
        // if (nota >= 7) {
        //     System.out.println("Aprovado");
        // }else if(nota >= 5 && nota < 7){
        //     System.out.println("Recuperação");
        // }else{
        //     System.out.println("Reprovado");
        // }

        //Condição com operador ternário
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
