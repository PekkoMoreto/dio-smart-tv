public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.passarCanal();
        smartTv.passarCanal();
        smartTv.passarCanal();
        smartTv.mudarCanal(666);
    }
}
