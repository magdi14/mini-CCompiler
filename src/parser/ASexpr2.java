package parser;

import Lexical.Token;

public class ASexpr2 implements Node {

    Token t1;
    MDMexpr mdmexpr;
    ASexpr2 asexpr2;

    public ASexpr2(Token t1, MDMexpr mdmexpr, parser.ASexpr2 asexpr2) {
        this.t1 = t1;
        this.mdmexpr = mdmexpr;
        this.asexpr2 = asexpr2;
    }


    @Override
    public void printNode() {
        // TODO Auto-generated method stub
        System.out.println("---------ASexpr2-----------");
        if (t1 != null)
        {
            System.out.print(t1.getValue());
            System.out.println(" MDMexpr = ");
            mdmexpr.printNode();
            System.out.println(" ASexpr2 = ");
            ASexpr2.printNode();

        }
    }
}
