package li.jesse.designpattern.behavioral.observer.sample;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject
{
    private List<SampleObserver> observers = new ArrayList<SampleObserver>();

    public void attach(SampleObserver observer)
    {
        observers.add(observer);
    }

    public void detach(SampleObserver observer)
    {
        observers.remove(observer);
    }

    protected void notifyObservers()
    {
        for (SampleObserver observer : observers)
        {
            observer.update(this);
        }
    }
}
