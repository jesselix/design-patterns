package li.jesse.creational.abstractfactory;

import li.jesse.creational.abstractfactory.sample.BenzCar;
import li.jesse.creational.abstractfactory.sample.BusinessDriver;
import li.jesse.creational.abstractfactory.sample.Driver3;
import li.jesse.creational.abstractfactory.sample.Driver4;
import org.junit.Test;

public class AbstractFactoryTest
{
    @Test
    public void testAbstractFactory() throws Exception
    {
        Driver3 d = new BusinessDriver();
        BenzCar car = d.createBenzCar("b~b~b~");
        car.drive();
    }

    @Test
    public void testAbstractFactory2() throws Exception
    {
        BenzCar car = Driver4.createBenzCar("li.jesse.creational.abstractfactory.sample.BenzSportCar");
        car.drive();
    }
}
