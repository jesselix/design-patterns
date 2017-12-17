package li.jesse.structural.flyweight;

import li.jesse.structural.flyweight.example.ChessCoordinate;
import li.jesse.structural.flyweight.example.ChessFlyWeight;
import li.jesse.structural.flyweight.example.ChessFlyWeightFactory;
import li.jesse.structural.flyweight.template.Flyweight;
import li.jesse.structural.flyweight.template.FlywightFactory;
import li.jesse.structural.flyweight.template.UnsharedConcreteFlyweight;
import org.junit.Test;

public class FlyweightTest
{
    @Test
    public void testFlyweight()
    {
        int extrinsicstates = 1;
        FlywightFactory factory = new FlywightFactory();

        Flyweight fx = factory.getFlyweight("X");
        fx.operation(extrinsicstates);

        Flyweight fy = factory.getFlyweight("Y");
        fy.operation(++extrinsicstates);

        Flyweight fz = factory.getFlyweight("Z");
        fz.operation(++extrinsicstates);

        Flyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(++extrinsicstates);
    }

    @Test
    public void testChessFlyweight()
    {
        ChessFlyWeightFactory factory = new ChessFlyWeightFactory();
        ChessFlyWeight chess1 = factory.getChess("黑色");
        ChessFlyWeight chess2 = factory.getChess("黑色");
        System.out.println(chess1);
        System.out.println(chess2);

        System.out.println("增加外部状态的处理===========");
        chess1.display(new ChessCoordinate(4, 5));
        chess2.display(new ChessCoordinate(6, 6));
    }
}
