package li.jesse.behavioral.visitor.example;

public class Engine
{
    void accept(TheVisitor visitor) {
        visitor.visit(this);
    }
}
