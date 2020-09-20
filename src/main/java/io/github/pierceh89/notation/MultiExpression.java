package io.github.pierceh89.notation;

public class MultiExpression implements Expression {
    private Expression expr1, expr2;
    private String operator;
    private boolean paren;

    public MultiExpression(Expression expr1, Expression expr2, String operator, boolean paren) {
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.operator = operator;
        this.paren = paren;
    }

    @Override
    public String toString() {
        if (paren) {
            return "(" + expr1 + ") " + operator + " (" + expr2 + ")";
        }
        return expr1 + " " + operator + " " + expr2;
    }
}
