package li.jesse.structural.bridge;

import li.jesse.structural.bridge.sample.CircleShape;
import li.jesse.structural.bridge.sample.DrawingAPI1;
import li.jesse.structural.bridge.sample.DrawingAPI2;
import li.jesse.structural.bridge.sample.Shape;
import org.junit.Test;

public class BridgeTest
{
    @Test
    public void testBridge()
    {
        Shape[] shapes = new Shape[2];
        shapes[0] = new CircleShape(1, 2, 3, new DrawingAPI1());
        shapes[1] = new CircleShape(5, 7, 11, new DrawingAPI2());

        for (Shape shape : shapes)
        {
            shape.resizeByPercentage(2.5);
            shape.draw();
        }
    }
}
