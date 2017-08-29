package li.jesse.behavioral.visitor.sample;

public interface TheVisitor
{
    void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(Body body);
    void visit(Car car);
}
