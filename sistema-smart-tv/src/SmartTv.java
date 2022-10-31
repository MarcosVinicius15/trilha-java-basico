public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void status(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("TV ligada ? " + ligada);
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal ++;
    }
    public void diminuirCanal(){
        canal--;
    }
}
