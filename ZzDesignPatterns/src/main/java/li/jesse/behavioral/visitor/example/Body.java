package li.jesse.behavioral.visitor.example;

public class Body
{
    void accept(TheVisitor visitor)
    {
        visitor.visit(this);
    }
}
