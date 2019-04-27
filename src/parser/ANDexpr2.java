package parser;

import Lexical.Token;

public class ANDexpr2 implements Node{
    Token t1;
    COMexpr comexpr;
    ANDexpr2 andexpr2;

    public ANDexpr2(Token t1, COMexpr comexpr, ANDexpr2 andexpr2) {
        this.t1 = t1;
        this.comexpr = comexpr;
        this.andexpr2 = andexpr2;
    }

    @Override
    public void printNode() {
        if(t1 != null)
        {
            System.out.println(t1.getValue());
            System.out.println(" COMexpr = ");
            comexpr.printNode();
            System.out.println( "ANDexpr2 = ");
            andexpr2.printNode();
        }
        else
            System.out.println("NULL");
    }
}
