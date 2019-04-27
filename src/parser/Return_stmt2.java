package parser;

import Lexical.Token;

public class Return_stmt2 implements Node {
    Token t1;
    Expr expr;

    public Return_stmt2(Token t1) {
        this.t1 = t1;
    }

    public Return_stmt2(Expr expr, Token t1) {
        this.t1 = t1;
        this.expr = expr;
    }

    @Override
    public void printNode() {
        if (expr != null)
        {
            System.out.println(" Expr = ");
            expr.printNode();
        }
        System.out.println(t1.getValue());
    }
}
