package parser;

import Lexical.Token;

public class EXPR implements Node {
    Token t1;
    EXPR2 expr2;
    ORexpr oRexpr;

    public EXPR(Token t1, EXPR2 expr2) {
        this.t1 = t1;
        this.expr2 = expr2;
    }

    public EXPR(ORexpr oRexpr) {
        this.oRexpr = oRexpr;
    }

    @Override
    public void printNode() {
        if(t1 != null)
        {
            System.out.println(t1.getValue());
            System.out.println(" EXPR2 = ");
            expr2.printNode();
        }
        else
        {
            System.out.println(" ORexpr = ");
            oRexpr.printNode();
        }
    }
}
