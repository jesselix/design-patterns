package li.jesse.structural.proxy.jdkdynamicproxy;

public class UserServiceImpl implements Service
{
    @Override
    public void add()
    {
        System.out.println("This is add service");
    }
}
