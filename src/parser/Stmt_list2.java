package parser;

import Lexical.Token;

public class Stmt_list2 implements Node{
    Stmt stmt;
    Stmt_list2 stmt_list2;

    public Stmt_list2(Stmt stmt, Stmt_list2 stmt_list2) {
        this.stmt = stmt;
        this.stmt_list2 = stmt_list2;
    }

    @Override
    public void printNode() {
        if(stmt != null)
        {
            System.out.println(" Stmt = ");
            stmt.printNode();
            System.out.println(" Stmt_list2 = ");
            stmt_list2.printNode();
        }
        else
            System.out.println("NULL");
    }
}
