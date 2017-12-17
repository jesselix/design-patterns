package li.jesse.creational.abstractfactory.example;

public class SportDriver extends Driver3
{
    @Override
    public BenzCar createBenzCar(String car) throws Exception
    {
        return new BenzSportCar();
    }
}
