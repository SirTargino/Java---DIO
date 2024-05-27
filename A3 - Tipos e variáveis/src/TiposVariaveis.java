public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        int idade = 18; // É comum utilizar o tipo INT mesmo com valores pequenos em que byte ou short
                        // poderiam ser usados
        double salario = 1453.45; // O mesmo ocorre para o tipo double e float, por questões de precisão no código
        float pi = 3.14F; // Se for float, deve encerrar com um F

        int cep = 65857633; // Em CEP's e outros valores que podem começar com zero, devemos nos atentar
                            // pois o 0 será ignorado, e talvez seja melhor usar String;
        long cpf = 99988877754L; // Se for Long, deve encerrar com L para armazenar a variável corretamente.

        // Devemos ter cuidado com reatribuição de tipos, pela forte tipagem do Java.

        short numeroCurto = 1;
        //Veja que isso aqui é válido, pois um short cabe dentro de um int
        int numeroNormal = numeroCurto;
        //short numeroCurto2 = numeroNormal; Isso aqui já não é válido, e, se realmente tivermos que fazer isso, devemos usar o casting:
        short numeroCurto2 = (short) numeroNormal;

        //VARIÁVEIS E CONSTANTES:

        int numero = 5;
        numero = 10; //Como se trata de uma variável, seu valor pode alterar

        final double PI = 3.14; //Caso se trate de uma constante, não podemos alterar seu valor e precisamos utilizar o seu nome com letra maíuscula, por convenção.
    }
}
