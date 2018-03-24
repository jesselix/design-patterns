package li.jesse.behavioral.interpreter;

import li.jesse.behavioral.interpreter.example.*;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class InterpreterTest
{
    @Test
    public void testInterpreter()
    {
        // (a * b) / (a - b + 15000)
        Context context = new Context();
        Variable a = new Variable();
        Variable b = new Variable();
        Constant c = new Constant(2);

        context.addValue(a, 10);
        context.addValue(b, 2);

        Expression expression = new Div(new Mul(a, b), new Add(new Sub(a, b), c));
        System.out.println("Result = "+expression.interpret(context));
    }
}
