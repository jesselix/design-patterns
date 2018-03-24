package li.jesse.structural.flyweight.template;

public class ConcreteFlyweight extends Flyweight
{
    @Override
    public void operation(int extrinsicstates)
    {
        System.out.println("共享的Flyweight : " + extrinsicstates);
    }
}
