package Decorator;

public class SportMercedes extends DecoratorMercedes {
    public SportMercedes(MercedesInterface mercedes){
        super(mercedes);
    }

    @Override
    public void ChooseMercedes() {
        super.ChooseMercedes();
        System.out.println("Tuning your car into: Sport car");
    }
}
