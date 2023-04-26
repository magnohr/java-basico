public class usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Volume da tv ! " + smartTv.volume);
        System.out.println("canal da tv ? " + smartTv.canal);
        smartTv.definirCanal(12);
        System.out.println("canal da tv ? " + smartTv.canal);

        smartTv.aumentarvolume();
        smartTv.aumentarvolume();
        smartTv.aumentarvolume();
        smartTv.aumentarvolume();
        smartTv.aumentarvolume();
        smartTv.diminuirVolume();
        System.out.println("Novo status Volume da tv ! " + smartTv.volume);

        smartTv.mudarCanal();
        smartTv.mudarCanal();
        smartTv.mudarCanal();
        smartTv.mudarCanal();
        smartTv.mudarCanal2();
        System.out.println("Novo status canal da tv ? " + smartTv.canal);

       
    

        smartTv.ligar();
        System.out.println("novo status TV ligada? " + smartTv.ligada);
     
    }
}
