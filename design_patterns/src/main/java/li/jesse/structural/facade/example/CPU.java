package li.jesse.structural.facade.example;

public class CPU
{
    public void freeze()
    {
        System.out.println("cpu is freeze");
    };

    public void jump(long position)
    {
        System.out.println("cpu jumps");
    };

    public void execute()
    {
        System.out.println("cpu excutes");
    };
}
