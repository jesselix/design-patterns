package li.jesse.behavioral.visitor;

import li.jesse.behavioral.visitor.sample.Car;
import li.jesse.behavioral.visitor.sample.PrintVisitor;
import li.jesse.behavioral.visitor.sample.TheVisitor;
import org.junit.Test;

public class VisitorTest
{
    @Test
    public void testVisitor()
    {
        Car car = new Car();
        TheVisitor visitor = new PrintVisitor();
        car.accept(visitor);
    }
}
