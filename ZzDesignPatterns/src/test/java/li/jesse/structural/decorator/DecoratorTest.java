package li.jesse.structural.decorator;

import li.jesse.structural.decorator.example.Car;
import li.jesse.structural.decorator.example.FlyCar;
import li.jesse.structural.decorator.example.SwimCar;
import org.junit.Test;

public class DecoratorTest
{
    @Test
    public void testCar()
    {
        Car car = new Car();
        car.move();

        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        SwimCar swimCar = new SwimCar(car);
        swimCar.move();
    }
}
