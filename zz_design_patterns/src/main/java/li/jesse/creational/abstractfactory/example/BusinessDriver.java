package li.jesse.creational.abstractfactory.example;

public class BusinessDriver extends Driver3
{
    @Override
    public BenzCar createBenzCar(String car) throws Exception
    {
        return new BenzBusinessCar();
    }
}
