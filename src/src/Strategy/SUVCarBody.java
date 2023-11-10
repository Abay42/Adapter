package Strategy;
public class SUVCarBody implements CarBody {
    @Override
    public String getCarBodyType() {
        return "SUV";
    }

    @Override
    public String getDescription() {
        return "Spacious and rugged SUV body.";
    }
}
