package li.jesse.creational.abstractfactory.sample;

public abstract class BenzCar
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
