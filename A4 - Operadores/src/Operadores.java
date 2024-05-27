public class Operadores {
    public static void main(String[] args) {
        // Operador de atribuição => "="

        String nome = "João";

        // Operadores aritméticos => "+", "-", "*", "/", "%"

        double soma = 10.5 + 15.7; // Atenção com esse operador, pois ele também serve como operador de
                                   // CONCATENAÇÃO
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        // Operadores unários => "+", "-", "++", "--", "!"

        int numero = 5;

        //numero = - numero; Atribuí ao número o seu próprio valor, mas negativo.

        numero ++; //Atribui + 1 ao valor atual do número

        numero --; //Reduz -1 ao valor atual do número
        System.out.println(numero);

        boolean variavel = true;

        System.out.println(!variavel);

        // Operador ternário:

        int a,b;

        a=5;
        b=5;

        // Operador ternário fazendo o fluxo de código:
        String resposta = a==b ? "verdadeiro" : "falso";

        //Essa seria a maneira convencional de controlar o fluxo
        // if(a==b)
        //     resposta = "verdadeiro";
        // else
        //     resposta = "falso";

        System.out.println(resposta);

        // Operadores relacionais: => "==", "!=", ">", ">=", "<", "<="
        //Para objetos e textos, podemos usar o método .equals(), que é a forma mais recomendada.

        //Operadores lógicos: => "&&" (e), "||" (ou)
    }
}
