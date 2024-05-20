public class MyClass {
    public static void main(String[] args) {
        // Nomenclatura de variáveis:

        // Letras maíusculas = nunca se alterará. Acompanhada por final
        // final String BR = "Brasil";
        // final int ANO_2000 = 2000;

        // Palavras simples = letras minúsculas
        // Palavras compostas = camelCase

        // String pais = "Brasil";
        // String estadoBrasileiro = "Paraíba";

        String primeiroNome = "João";
        String segundoNome = "Targino";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    // Métodos
    // TipoRetorno NomeObjetivo Parametro

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome + " " + segundoNome;
    }
}