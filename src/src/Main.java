
public class Main {
    public static void main(String[] args){

        MercedesInterface BasicMercedes = new BasicMercedes();
        BasicMercedes.ChooseMercedes();

        System.out.println("------------------------------------------");

        MercedesInterface SportMercedes = new SportMercedes(new BasicMercedes());
        SportMercedes.ChooseMercedes();


        System.out.println("------------------------------------------");

        MercedesInterface LuxuryMercedes = new LuxuryMercedes(new SportMercedes(new BasicMercedes()));
        LuxuryMercedes.ChooseMercedes();

        System.out.println("------------------------------------------");

        AmericanSocket americanSocket = new PlainAmericanSocket();
        CarsRadio carsRadio = new CarsRadio();
        EuroSocket euroSocket = new SocketAdapter(americanSocket);
        carsRadio.ListenToMusic(euroSocket);











    }
}