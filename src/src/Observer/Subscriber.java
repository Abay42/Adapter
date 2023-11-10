package Observer;

import java.util.List;
public class Subscriber implements Observer {

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void Release(List<String> Release) {
        System.out.println(name + ", we have brand new release of a " + Release);

    }
}
