package Strategy;

public class CarConfiguration {

    private CarBody carBody;

    public void setCarBody(CarBody carBody) {

        this.carBody = carBody;
    }

    public void configureCar() {
        System.out.println("Selected Car Configuration:");
        System.out.println("Brand: " + carBody.getCarBodyType());
        System.out.println("Description: " + carBody.getDescription());
    }
}