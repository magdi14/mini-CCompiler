package parser;

import Lexical.Token;

public class If_stmt implements Node {
    Token t1;
    Token t2;
    Token t3;
    Expr expr;
    Stmt stmt;
    If_stmt2 if_stmt2;

    public If_stmt(Token t1, Token t2, Token t3, Expr expr, Stmt stmt, If_stmt2 if_stmt2) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.expr = expr;
        this.stmt = stmt;
        this.if_stmt2 = if_stmt2;
    }

    @Override
    public void printNode() {
        if(t1 != null)
        {
            System.out.println(t1.getValue());
            System.out.println(t2.getValue());
            System.out.println(" Expr = ");
            expr.printNode();
            System.out.println(t3.getValue());
            System.out.println(" Stmt = ");
            stmt.printNode();
            System.out.println(" If_stmt2 = ");
            if_stmt2.printNode();
        }
    }
}
