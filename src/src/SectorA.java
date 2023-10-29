public class SectorA implements CarHandsFabric{
    @Override
    public CarHand CarByHand() {
        return new RightHandedCars();

    }
}
