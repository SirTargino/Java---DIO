public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int n =1; n <= 5; n ++){
            if(n == 3){
                break; //aqui para no 3
            }

            if(n == 3){
                continue; //aqui desconsidera o 3
            }

            System.out.println(n);
        }
    }
}
