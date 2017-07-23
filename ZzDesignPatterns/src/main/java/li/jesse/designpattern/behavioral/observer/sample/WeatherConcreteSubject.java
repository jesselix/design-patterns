package li.jesse.designpattern.behavioral.observer.sample;

public class WeatherConcreteSubject extends WeatherSubject
{
    private String weatherContent;

    public String getWeatherContent()
    {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent)
    {
        this.weatherContent = weatherContent;
        this.notifyObservers();
    }
}
