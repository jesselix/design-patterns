package li.jesse.structural.proxy.common;

public class UserService2Impl implements UserService2
{
    @Override
    public String getName(int id)
    {
        System.out.println("------getName------");
        return "Tom";
    }

    @Override
    public Integer getAge(int id)
    {
        System.out.println("------getAge------");
        return 10;
    }
}
