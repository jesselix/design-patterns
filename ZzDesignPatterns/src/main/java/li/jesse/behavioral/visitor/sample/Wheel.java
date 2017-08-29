package li.jesse.behavioral.visitor.sample;

public class Wheel
{
    private String name;

    Wheel(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return this.name;
    }
    void accept(TheVisitor visitor)
    {
        visitor.visit(this);
    }
}
