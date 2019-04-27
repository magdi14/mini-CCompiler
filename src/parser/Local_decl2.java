package parser;

import Lexical.Token;

public class Local_decl2 implements Node{
    Token t1;
    Token t2;
    Token t3;

    public Local_decl2(Token t1) {
        this.t1 = t1;
    }

    public Local_decl2(Token t1, Token t2, Token t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    @Override
    public void printNode() {
        if(t1 != null)
        {
            System.out.println(t1.getValue());
            if(t2 != null)
            {
                System.out.println(t2.getValue());
                System.out.println(t3.getValue());
            }
        }
    }
}
