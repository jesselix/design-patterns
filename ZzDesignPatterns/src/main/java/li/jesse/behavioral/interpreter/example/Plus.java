package li.jesse.behavioral.interpreter.example;

import java.util.Map;

public class Plus implements Expression
{
    Expression leftOperand;
    Expression rightOperand;

    public Plus(final Expression left, final Expression right)
    {
        leftOperand = left;
        rightOperand = right;
    }

    @Override
    public int interpret(Map<String, Expression> variables)
    {
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
}
