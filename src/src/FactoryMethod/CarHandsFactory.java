package FactoryMethod;
public class CarHandsFactory {
    public CarHandsFabric createCarByCountryHand(String country) {
        if (country.equalsIgnoreCase("England")) {
            return new SectorA();
        } else if (country.equalsIgnoreCase("Germany")) {
            return new SectorB();
        } else {
            throw new RuntimeException("Country's Driving Side Unknown");
        }
    }
}
