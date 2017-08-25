package li.jesse.creational.abstractfactory.sample;

public class Driver4
{
    public static BenzCar createBenzCar(String car) throws Exception
    {
        return (BenzCar) Class.forName(car).newInstance();
    }
}
