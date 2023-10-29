public class SectorB implements CarHandsFabric{
    @Override
    public CarHand CarByHand() {
        return new LeftHandedCars();
    }
}
