package io.github.pierceh89.notation;

public class ValueExpression implements Expression {
    private int value;

    public ValueExpression(int v) {
        value = v;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
