package li.jesse.behavioral.visitor.sample;

public class Engine
{
    void accept(TheVisitor visitor) {
        visitor.visit(this);
    }
}
