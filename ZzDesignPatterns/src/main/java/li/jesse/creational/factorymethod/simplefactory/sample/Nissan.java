package li.jesse.creational.factorymethod.simplefactory.sample;

public class Nissan extends Car
{
    @Override
    public void drive()
    {
        System.out.println(this.getClass().getName()+"----go-----------------------");
    }
}
