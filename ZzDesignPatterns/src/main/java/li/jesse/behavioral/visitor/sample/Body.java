package li.jesse.behavioral.visitor.sample;

public class Body
{
    void accept(TheVisitor visitor)
    {
        visitor.visit(this);
    }
}
