import Adapter.*;
import Decorator.*;
import FactoryMethod.*;
import Observer.*;
import Singelton.MercedesFranchise;
import Strategy.*;

public class Main {
    public static void main(String[] args) {

        MercedesFranchise mercedesFranchise1 = MercedesFranchise.getInstance("Berlin");
        System.out.println(mercedesFranchise1.getLocation());

        MercedesFranchise mercedesFranchise2 = MercedesFranchise.getInstance("Astana");
        System.out.println(mercedesFranchise2.getLocation());

        System.out.println("------------------------------------------");

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
        Charger charger = new Charger();
        EuroSocket euroSocket = new SocketAdapter(americanSocket);
        charger.ChargePhone(euroSocket);

        System.out.println("------------------------------------------");

        CarHandsFactory carHandsFactory = new CarHandsFactory();
        CarHandsFabric handsFabric = carHandsFactory.createCarByCountryHand("Germany");
        CarHand carHand = handsFabric.CarByHand();
        carHand.createCarByHand();


        System.out.println("------------------------------------------");

        NewCars Cars = new NewCars();
        Cars.addRelease("Maybach exelero");
        Cars.addRelease("G-wagon");
        Observer subscribers = new Subscriber("Alisher");
        Cars.addObserver(subscribers);
        Cars.removeRelease("G-wagon");



        CarConfiguration carConfiguration = new CarConfiguration();

        System.out.println("------------------------------------------");

        carConfiguration.setCarBody(new MercedesAClassCarBody());
        carConfiguration.configureCar();
        System.out.println("------------------------------------------");

        carConfiguration.setCarBody(new MercedesGClassCarBody());
        carConfiguration.configureCar();

        System.out.println("------------------------------------------");
    }
}
