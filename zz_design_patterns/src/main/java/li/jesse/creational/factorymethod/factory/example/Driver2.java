package li.jesse.creational.factorymethod.factory.example;

import li.jesse.creational.factorymethod.simplefactory.example.Car;

public abstract class Driver2
{
    public abstract Car createCar(String car) throws Exception;
}
