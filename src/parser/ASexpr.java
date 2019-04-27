package parser;

import Lexical.Token;

public class ASexpr implements Node{
    MDMexpr mdmexpr;
    ASexpr2 asexpr2;

    public ASexpr(MDMexpr mdmexpr, ASexpr2 asexpr2) {
        this.mdmexpr = mdmexpr;
        this.asexpr2 = asexpr2;
    }

    @Override
    public void printNode() {
        // TODO Auto-generated method stub
        System.out.println("---------ASexpr-----------");
        if(mdmexpr != null)
        {
            System.out.println(" MDMexpr = ");
            mdmexpr.printNode();
            System.out.println("ASexpr2 = ");
            asexpr2.printNode();
        }

    }
}
