package li.jesse.structural.proxy.staticproxy;

public class RealSubject implements Subject
{
    @Override
    public void request()
    {
        System.out.println("RealSubject");
    }
}
