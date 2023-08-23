public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentou volume para: " + volume);
    }
    public void dominuirVolume(){
        volume--;
        System.out.println("Diminuiu volume para: " + volume);
    }
    public void passarCanal(){
        canal++;
        System.out.println("Canal atual: " + canal);
    }
    public void voltarCanal(){
        canal--;
        System.out.println("Canal atual: " + canal);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal atual: " + canal);
    }
    public void ligar(){
        ligada = true;
        System.out.println("Tv ligada.");
    }
    public void desligar(){
        ligada = false;
        System.out.println("Tv desligada.");
    }
}
