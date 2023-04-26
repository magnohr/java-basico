public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //metodos
    public void ligar(){
        ligada =true;
    }
    public void desligada(){
        ligada =false;

    }
    public void aumentarvolume(){
        volume++;
        System.out.println("Volume" + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Volume" + volume);

    }
    public void mudarCanal(){
        canal++;
        System.out.println("canal" + canal);

    }
    public void mudarCanal2(){
        canal--;
        System.out.println("canal" + canal);

    }
    public void definirCanal(int novoCanal){
        canal =novoCanal;
        System.out.println("canal" + canal);

    }
}
