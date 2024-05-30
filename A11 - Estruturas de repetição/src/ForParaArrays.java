public class ForParaArrays {
    public static void main(String[] args) {
        String alunos[] = { "João", "Paulo", "Marcos", "Julia" };

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no índice x=" + x + " é: " + alunos[x]);
        }

        // Em arrays ou collections, é comum utilizar outra síntaxe, o for each:

        for (String aluno : alunos) {
            System.out.println("O aluno é: " + aluno);
        }
    }
}
