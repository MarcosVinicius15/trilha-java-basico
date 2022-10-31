public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.status();

        smartTv.ligar();
        System.out.println("-> TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        smartTv.status();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.status();

        smartTv.mudarCanal(13);
        smartTv.status();

        smartTv.aumentarCanal();
        smartTv.status();

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.status();
    }
}