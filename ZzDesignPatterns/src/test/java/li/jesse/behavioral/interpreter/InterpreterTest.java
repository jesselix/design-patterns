package li.jesse.behavioral.interpreter;

import li.jesse.behavioral.interpreter.example.Evaluator;
import li.jesse.behavioral.interpreter.example.Expression;
import li.jesse.behavioral.interpreter.example.Number;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class InterpreterTest
{
    @Test
    public void testInterpreter()
    {
        final String expression = "w x z + -";
        final Evaluator sentence = new Evaluator(expression);
        final Map<String, Expression> variables = new HashMap<>();
        variables.put("w", new Number(10));
        variables.put("x", new Number(7));
        variables.put("z", new Number(50));
        final int result = sentence.interpret(variables);
        System.out.println(result);
    }
}
