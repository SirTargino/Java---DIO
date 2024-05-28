public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        
        smartTv.ligar();
        
        System.out.println("Novo estado => TV Ligada: " + smartTv.ligada);

        smartTv.desligar();
        
        System.out.println("Novo estado => TV Ligada: " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        
        System.out.println("Novo estado => Volume atual: " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        
        System.out.println("Novo estado => Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(21);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        
        System.out.println("Novo estado => Canal atual: " + smartTv.canal);
    }
}