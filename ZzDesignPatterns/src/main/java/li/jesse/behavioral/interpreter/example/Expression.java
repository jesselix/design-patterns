package li.jesse.behavioral.interpreter.example;

import java.util.Map;

public interface Expression
{
    public int interpret(final Map<String, Expression> variables);
}
