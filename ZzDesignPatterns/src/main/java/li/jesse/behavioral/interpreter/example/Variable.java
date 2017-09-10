package li.jesse.behavioral.interpreter.example;

public class Variable implements Expression
{
    @Override
    public int interpret(Context context)
    {
        return context.LookupValue(this);
    }
}
