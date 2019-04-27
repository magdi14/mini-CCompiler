package parser;

import Lexical.Token;

public class MDMexpr2 implements Node {

    Token t1;
    IDexpr idexpr;
    MDMexpr2 mdmexpr2;

    public MDMexpr2(Token t1, IDexpr idexpr, MDMexpr2 mdmexpr2) {
        this.t1 = t1;
        this.idexpr = idexpr;
        this.mdmexpr2 = mdmexpr2;
    }

    @Override
    public void printNode() {
        // TODO Auto-generated method stub
        System.out.println("---------MDMexpr2-----------");
        if (t1 != null){
            System.out.println(t1.getValue());
            System.out.println(" IDexpr = ");
            idexpr.printNode();
            System.out.println(" MDMexpr2 = ");
            mdmexpr2.printNode();
        }
    }
}
