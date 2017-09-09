package li.jesse.structural.flyweight.template;

public class UnsharedConcreteFlyweight extends Flyweight
{
    @Override
    public void operation(int extrinsicstates)
    {
        System.out.println("不共享的Flyweight : " + extrinsicstates);
    }
}
