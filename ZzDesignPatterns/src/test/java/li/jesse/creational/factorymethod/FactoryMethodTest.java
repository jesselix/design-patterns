package li.jesse.creational.factorymethod;

import li.jesse.creational.factorymethod.sample.BenzDriver;
import li.jesse.creational.factorymethod.sample.Driver2;
import li.jesse.creational.factorymethod.simplefactory.sample.Car;
import li.jesse.creational.factorymethod.simplefactory.sample.Driver;
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
