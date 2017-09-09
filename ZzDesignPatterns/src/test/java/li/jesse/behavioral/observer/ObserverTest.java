package li.jesse.behavioral.observer;

import li.jesse.behavioral.observer.example.SampleConcreteObserver;
import li.jesse.behavioral.observer.example.WeatherConcreteSubject;
import org.junit.Test;

public class ObserverTest
{
    @Test
    public void testObserver()
    {
        WeatherConcreteSubject weatherConcreteSubject = new WeatherConcreteSubject();

        SampleConcreteObserver observer1 = new SampleConcreteObserver();
        observer1.setObserverName("张三");
        observer1.setRemindContent("是跑步的好日子");

        SampleConcreteObserver observer2 = new SampleConcreteObserver();
        observer2.setObserverName("李四");
        observer2.setRemindContent("去公园散步吧");

        weatherConcreteSubject.attach(observer1);
        weatherConcreteSubject.attach(observer2);

        weatherConcreteSubject.setWeatherContent("明天28℃");
    }
}
