package li.jesse.creational.abstractfactory.sample;

public class BenzBusinessCar extends BenzCar
{
    @Override
    public void drive()
    {
        System.out.println(this.getName()+"----BenzBusinessCar-----------------------");
    }
}
