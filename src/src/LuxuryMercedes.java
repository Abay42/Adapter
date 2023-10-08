public class LuxuryMercedes extends DecoratorMercedes{
    public LuxuryMercedes(MercedesInterface mercedes){
        super(mercedes);
    }

    @Override
    public void ChooseMercedes() {
        super.ChooseMercedes();
        System.out.println("Tuning your car into: luxury car");
    }
}
