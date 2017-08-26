package li.jesse.structural.proxy.staticproxy.template;

public class RealSubject implements Subject
{
    @Override
    public void request()
    {
        System.out.println("RealSubject");
    }
}
