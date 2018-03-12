package li.jesse.creational.factorymethod.factory.example;

import li.jesse.creational.factorymethod.simplefactory.example.Benz;
import li.jesse.creational.factorymethod.simplefactory.example.Car;

public class BenzDriver extends Driver2
{
    @Override
    public Car createCar(String car) throws Exception
    {
        return new Benz();
    }
}
