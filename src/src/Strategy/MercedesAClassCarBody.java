package Strategy;

public class MercedesAClassCarBody implements CarBody {
    private final CarBody carBody;

    public MercedesAClassCarBody() {
        this.carBody = new SedanCarBody();
    }

    @Override
    public String getCarBodyType() {
        return "Mercedes A-Class " + carBody.getCarBodyType();
    }

    @Override
    public String getDescription() {
        return "The Mercedes A-Class features a " + carBody.getDescription();
    }
}

