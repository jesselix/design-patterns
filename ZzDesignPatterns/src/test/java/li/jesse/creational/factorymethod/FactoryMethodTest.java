package li.jesse.creational.factorymethod;

import li.jesse.creational.factorymethod.factory.example.BenzDriver;
import li.jesse.creational.factorymethod.factory.example.Driver2;
import li.jesse.creational.factorymethod.factory.template.*;
import li.jesse.creational.factorymethod.simplefactory.example.Car;
import li.jesse.creational.factorymethod.simplefactory.example.Driver;

import org.junit.Test;

public class FactoryMethodTest
{
    @Test
    public void testSimpleFactory()
    {
        Car car = Driver.createCar("benz");
        car.setName("benz");
        car.drive();
    }

    @Test
    public void testFactoryMethod2() throws Exception
    {
        Driver2 d = new BenzDriver();
        Car c = d.createCar("benz");
        c.setName("benz");
        c.drive();
    }

    @Test
    public void testFactoryMethod()
    {
        Creator factory = new ConcreteCreator();
        Product product1 = factory.createProduct(ConcreteProduct1.class);
        Product product2 = factory.createProduct(ConcreteProduct2.class);
    }
}
