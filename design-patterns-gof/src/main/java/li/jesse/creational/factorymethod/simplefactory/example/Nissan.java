package li.jesse.creational.factorymethod.simplefactory.example;

public class Nissan extends Car
{
    @Override
    public void drive()
    {
        System.out.println(this.getClass().getName()+"----go-----------------------");
    }
}
