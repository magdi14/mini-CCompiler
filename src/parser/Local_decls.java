package parser;

import Lexical.Token;

public class Local_decls implements Node{

    Local_decls2 local_decls2;

    public Local_decls(Local_decls2 local_decls2) {
        this.local_decls2 = local_decls2;
    }

    @Override
    public void printNode() {
        if(local_decls2 != null)
        {
            System.out.println(" Local_decls = ");
            local_decls2.printNode();
        }
    }
}
