package li.jesse.creational.factorymethod.sample;

import li.jesse.creational.factorymethod.simplefactory.sample.Car;
import li.jesse.creational.factorymethod.simplefactory.sample.Nissan;

public class NissanDriver extends Driver2
{
    @Override
    public Car createCar(String car) throws Exception
    {
        return new Nissan();
    }
}
