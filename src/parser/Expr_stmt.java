package parser;

import Lexical.Token;

public class Expr_stmt implements Node{
    Token t1;
    Expr expr;

    public Expr_stmt(Token t1) {
        this.t1 = t1;
    }

    public Expr_stmt(Token t1, Expr expr) {
        this.t1 = t1;
        this.expr = expr;
    }

    @Override
    public void printNode() {
        if(expr != null)
        {
            System.out.println(" Expr = ");
            expr.printNode();
        }
        System.out.println(t1.getValue());
    }
}
