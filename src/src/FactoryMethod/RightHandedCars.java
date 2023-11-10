package FactoryMethod;

public class RightHandedCars implements CarHand {
    @Override
    public void createCarByHand() {

        System.out.println("Right handed car created");
    }
}
