package li.jesse.behavioral.visitor.example;

public interface TheVisitor
{
    void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(Body body);
    void visit(Car car);
}
