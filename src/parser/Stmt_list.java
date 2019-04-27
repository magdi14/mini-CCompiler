package parser;

import Lexical.Token;

public class Stmt_list implements Node{
    Stmt_list2 stmt_list2;

    public Stmt_list(Stmt_list2 stmt_list2) {
        this.stmt_list2 = stmt_list2;
    }

    @Override
    public void printNode() {
        if(stmt_list2 != null)
        {
            System.out.println(" Stmt_list2 = ");
            stmt_list2.printNode();
        }
    }
}
