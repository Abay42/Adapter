package Strategy;

public class MercedesGClassCarBody implements CarBody {
    private final CarBody carBody;

    public MercedesGClassCarBody() {
        this.carBody = new SUVCarBody();
    }

    @Override
    public String getCarBodyType() {
        return "Mercedes G-Class " + carBody.getCarBodyType();
    }

    @Override
    public String getDescription() {
        return "The Mercedes G-Class features a " + carBody.getDescription();
    }
}
