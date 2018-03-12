package li.jesse.creational.factorymethod.simplefactory.example;

public class Benz extends Car
{

    @Override
    public void drive()
    {
        System.out.println(this.getClass().getName()+"----go-----------------------");
    }
}
