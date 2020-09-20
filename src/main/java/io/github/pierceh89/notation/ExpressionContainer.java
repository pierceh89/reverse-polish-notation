package io.github.pierceh89.notation;

public class ExpressionContainer implements Expression {

    private Expression expression;

    public ExpressionContainer(Expression exp) {
        expression = exp;
    }

    @Override
    public String toString() {
        return expression.toString();
    }
}
