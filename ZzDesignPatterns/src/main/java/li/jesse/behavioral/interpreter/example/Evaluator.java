package li.jesse.behavioral.interpreter.example;

import java.util.Map;
import java.util.Stack;

public class Evaluator implements Expression
{
    private Expression syntaxTree;

    public Evaluator(final String expression) {
        final Stack<Expression> expressionStack = new Stack<Expression>();
        for (final String token : expression.split(" ")) {
            if (token.equals("+")) {
                final Expression subExpression = new Plus(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(subExpression);
            } else if (token.equals("-")) {
                // it's necessary remove first the right operand from the stack
                final Expression right = expressionStack.pop();
                // ..and after the left one
                final Expression left = expressionStack.pop();
                final Expression subExpression = new Minus(left, right);
                expressionStack.push(subExpression);
            } else
                expressionStack.push(new Variable(token));
        }
        syntaxTree = expressionStack.pop();
    }

    @Override
    public int interpret(Map<String, Expression> variables)
    {
        return syntaxTree.interpret(variables);
    }
}
