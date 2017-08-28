package li.jesse.creational.factorymethod.factory.sample;

import li.jesse.creational.factorymethod.simplefactory.sample.Car;

public abstract class Driver2
{
    public abstract Car createCar(String car) throws Exception;
}
