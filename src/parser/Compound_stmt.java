package parser;

import Lexical.Token;

public class Compound_stmt implements Node{
    Token t1;
    Token t2;
    Local_decls local_decls;
    Stmt_list stmt_list;

    public Compound_stmt(Token t1, Token t2, Local_decls local_decls, Stmt_list stmt_list) {
        this.t1 = t1;
        this.t2 = t2;
        this.local_decls = local_decls;
        this.stmt_list = stmt_list;
    }

    @Override
    public void printNode(){
        // TODO Auto-generated method stub
        if(t1 != null)
        {
            System.out.println(t1.getValue());
            System.out.println(" Local_decls = ");
            if (local_decls != null)
                local_decls.printNode();
            System.out.println(" Stmt_list = ");
            if (stmt_list != null)
                stmt_list.printNode();
            System.out.println(t2.getValue());
        }

    }
}
