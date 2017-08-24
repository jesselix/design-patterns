package li.jesse.creational.factorymethod.simplefactory.sample;

public class Benz extends Car
{

    @Override
    public void drive()
    {
        System.out.println(this.getClass().getName()+"----go-----------------------");
    }
}
