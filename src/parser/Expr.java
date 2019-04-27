package parser;

import Lexical.Token;

public class Expr implements Node {
    Token t1;
    Expr2 expr2;
    ORexpr oRexpr;

    public Expr(Token t1, Expr2 expr2) {
        this.t1 = t1;
        this.expr2 = expr2;
    }

    public Expr(ORexpr oRexpr) {
        this.oRexpr = oRexpr;
    }

    @Override
    public void printNode() {
        if(t1 != null)
        {
            System.out.println(t1.getValue());
            System.out.println(" Expr2 = ");
            expr2.printNode();
        }
        else
        {
            System.out.println(" ORexpr = ");
            oRexpr.printNode();
        }
    }
}
