public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        //Switch case
        switch (sigla) {
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MEDIO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default:
            System.out.println("SIGLA INVALIDA");
                break;
        }
    }
}
