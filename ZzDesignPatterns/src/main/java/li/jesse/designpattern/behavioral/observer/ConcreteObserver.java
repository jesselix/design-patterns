package li.jesse.designpattern.behavioral.observer;

public class ConcreteObserver implements Observer
{
    private String observerState;

    public void update(Subject subject)
    {
        observerState = ((ConcreteSubject)subject).getSubjectState();
    }
}
