package li.jesse.creational.abstractfactory.example;

public class Driver4
{
    public static BenzCar createBenzCar(String car) throws Exception
    {
        return (BenzCar) Class.forName(car).newInstance();
    }
}
