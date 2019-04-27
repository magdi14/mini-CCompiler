package parser;

import Lexical.Token;

public class Local_decls2 implements Node{
    Local_decl local_decl;
    Local_decls2 local_decls2;

    public Local_decls2(Local_decl local_decl, Local_decls2 local_decls2) {
        this.local_decl = local_decl;
        this.local_decls2 = local_decls2;
    }

    @Override
    public void printNode() {
        if(local_decl != null)
        {
            System.out.println(" Local_decl = ");
            local_decl.printNode();
            System.out.println(" Local_decls2 = ");
            local_decls2.printNode();
        }
        else
            System.out.println("NULL");
    }
}
