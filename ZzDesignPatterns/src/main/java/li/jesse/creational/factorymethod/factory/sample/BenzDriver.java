package li.jesse.creational.factorymethod.factory.sample;

import li.jesse.creational.factorymethod.simplefactory.sample.Benz;
import li.jesse.creational.factorymethod.simplefactory.sample.Car;

public class BenzDriver extends Driver2
{
    @Override
    public Car createCar(String car) throws Exception
    {
        return new Benz();
    }
}
