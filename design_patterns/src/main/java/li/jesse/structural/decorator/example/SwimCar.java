package li.jesse.structural.decorator.example;

public class SwimCar extends SuperCar
{
    public SwimCar(ICar car)
    {
        super(car);
    }

    public void swim()
    {
        System.out.println("swim on water");
    }

    @Override
    public void move()
    {
        super.move();
        swim();
    }
}
