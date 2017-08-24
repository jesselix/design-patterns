package li.jesse.creational.factorymethod.simplefactory.sample;

public abstract class Car
{
    private String name;

    public abstract void drive();

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
