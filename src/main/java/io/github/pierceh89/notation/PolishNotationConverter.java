package io.github.pierceh89.notation;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class PolishNotationConverter extends PolishNotationBaseVisitor<Expression> {

    public Expression convertExpression(String polishExpression) {
        PolishNotationLexer lexer = new PolishNotationLexer(new ANTLRInputStream(polishExpression));
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        PolishNotationParser parser = new PolishNotationParser(commonTokenStream);
        PolishNotationParser.ExprContext context = parser.expr();

        return visit(context);
    }

    @Override
    public Expression visitExpr(PolishNotationParser.ExprContext ctx) {
        if (ctx.expr().isEmpty()) {
            return new ValueExpression(Integer.parseInt(ctx.VALUE().getText()));
        } else {
            String operator = ctx.OPER().getText();
            boolean paren = false;
            if (operator.equals("*") || operator.equals("/")) {
                paren = true;
            }
            return new MultiExpression(visitExpr(ctx.expr(0)), visitExpr(ctx.expr(1)), operator, paren);
        }
    }
}
