package li.jesse.creational.factorymethod.factory.example;

import li.jesse.creational.factorymethod.simplefactory.example.Car;
import li.jesse.creational.factorymethod.simplefactory.example.Nissan;

public class NissanDriver extends Driver2
{
    @Override
    public Car createCar(String car) throws Exception
    {
        return new Nissan();
    }
}
