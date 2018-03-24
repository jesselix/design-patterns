package li.jesse.creational.abstractfactory.example;

public class BenzSportCar extends BenzCar
{
    @Override
    public void drive()
    {
        System.out.println(this.getName()+"----BenzSportCar-----------------------");
    }
}
