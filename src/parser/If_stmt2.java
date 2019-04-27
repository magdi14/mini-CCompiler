package parser;

import Lexical.Token;

public class If_stmt2 implements Node{
    Token t1;
    Stmt stmt;

    public If_stmt2(Token t1, Stmt stmt) {
        this.t1 = t1;
        this.stmt = stmt;
    }

    @Override
    public void printNode() {
        if(t1 != null)
        {
            System.out.println(t1.getValue());
            System.out.println(" Stmt = ");
            stmt.printNode();
        }
        else
            System.out.println("NULL");
    }
}
