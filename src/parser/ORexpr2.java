package parser;

import Lexical.Token;

public class ORexpr2 implements Node {
    Token t1;
    ANDexpr anDexpr;
    ORexpr2 oRexpr2;

    public ORexpr2(Token t1, ANDexpr anDexpr, ORexpr2 oRexpr2) {
        this.t1 = t1;
        this.anDexpr = anDexpr;
        this.oRexpr2 = oRexpr2;
    }

    @Override
    public void printNode() {
        if(t1 != null)
        {
            System.out.println(t1.getValue());
            System.out.println(" ANDexpr = ");
            anDexpr.printNode();
            System.out.println(" ORexpr2");
            oRexpr2.printNode();
        }
        else
            System.out.println("NULL");
    }
}
