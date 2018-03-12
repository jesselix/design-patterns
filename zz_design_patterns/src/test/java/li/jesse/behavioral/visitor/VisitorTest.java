package li.jesse.behavioral.visitor;

import li.jesse.behavioral.visitor.example.Car;
import li.jesse.behavioral.visitor.example.PrintVisitor;
import li.jesse.behavioral.visitor.example.TheVisitor;
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
