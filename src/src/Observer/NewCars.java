package Observer;


import java.util.ArrayList;
import java.util.List;

public class NewCars implements Observed {

    List<String> release = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addRelease(String release){
        this.release.add(release);
        notifyObservers();
    }

    public void removeRelease(String release){
        this.release.remove(release);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {

        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer: subscribers){
            observer.Release(this.release);
        }
    }
}

