package FactoryMethod;

public class LeftHandedCars implements CarHand {
    @Override
    public void createCarByHand() {

        System.out.println("Left handed car created");
    }
}

