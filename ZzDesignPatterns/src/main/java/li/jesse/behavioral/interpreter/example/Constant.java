package li.jesse.behavioral.interpreter.example;

public class Constant implements Expression
{
    private int i;

    public Constant(int i) {
        this.i = i;
    }

    @Override
    public int interpret(Context context)
    {
        return i;
    }
}
