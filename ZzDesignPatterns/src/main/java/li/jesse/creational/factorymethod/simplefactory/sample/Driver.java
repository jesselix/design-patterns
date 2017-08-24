package li.jesse.creational.factorymethod.simplefactory.sample;

public class Driver
{
    public static Car createCar(String car)
    {
        Car c = null;
        if("Benz".equalsIgnoreCase(car))
            c = new Benz();
        else if("Nissan".equalsIgnoreCase(car))
            c = new Nissan();
        return c;
    }
}
