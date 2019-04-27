package parser;

import Lexical.Token;

public class Expr2 implements Node {

    Token t1;
    Token t2;
    Token t3;
    ORexpr oRexpr1;
    ORexpr oRexpr2;

    public Expr2(Token t1, ORexpr oRexpr1) {
        this.t1 = t1;
        this.oRexpr1 = oRexpr1;
    }

    public Expr2(Token t1, Token t2, Token t3, ORexpr oRexpr1, ORexpr oRexpr2) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.oRexpr1 = oRexpr1;
        this.oRexpr2 = oRexpr2;
    }

    @Override
    public void printNode() {
        if(t1 != null)
        {
            System.out.println(t1.getValue());
            System.out.println(" ORexpr = ");
            oRexpr1.printNode();
            if(t2 != null)
            {
                System.out.println(t2.getValue());
                System.out.println(t3.getValue());
                System.out.println(" ORexpr = ");
                oRexpr2.printNode();
            }

        }
    }
}
