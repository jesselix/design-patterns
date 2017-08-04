package li.jesse.behavioral.observer.sample;

public class SampleConcreteObserver implements SampleObserver
{
    private String observerName;

    private String weatherContent;

    private String remindContent;

    public String getObserverName()
    {
        return observerName;
    }

    public void setObserverName(String observerName)
    {
        this.observerName = observerName;
    }

    public String getWeatherContent()
    {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent)
    {
        this.weatherContent = weatherContent;
    }

    public String getRemindContent()
    {
        return remindContent;
    }

    public void setRemindContent(String remindContent)
    {
        this.remindContent = remindContent;
    }


    public void update(WeatherSubject subject)
    {
        weatherContent = ((WeatherConcreteSubject)subject).getWeatherContent();

        System.out.println(observerName + " " + weatherContent + " " + remindContent);

    }
}
