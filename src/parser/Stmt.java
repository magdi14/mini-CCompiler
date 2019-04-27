package parser;

import Lexical.Token;

public class Stmt implements Node{
    Token t1;
    Expr_stmt expr_stmt;
    Compound_stmt compound_stmt;
    If_stmt if_stmt;
    While_stmt while_stmt;
    Return_stmt return_stmt;
    Break_stmt break_stmt;

    public Stmt(Token t1) {
        this.t1 = t1;
    }

    public Stmt(Expr_stmt expr_stmt) {
        this.expr_stmt = expr_stmt;
    }

    public Stmt(Compound_stmt compound_stmt) {
        this.compound_stmt = compound_stmt;
    }

    public Stmt(If_stmt if_stmt) {
        this.if_stmt = if_stmt;
    }

    public Stmt(While_stmt while_stmt) {
        this.while_stmt = while_stmt;
    }

    public Stmt(Return_stmt return_stmt) {
        this.return_stmt = return_stmt;
    }

    public Stmt(Break_stmt break_stmt) {
        this.break_stmt = break_stmt;
    }

    @Override
    public void printNode() {
        if(t1 != null)
        {
            System.out.println(t1.getValue());
        }
        else if(expr_stmt != null)
        {
            System.out.println(" Expr_stmt = ");
            expr_stmt.printNode();
        }
        else if(compound_stmt != null)
        {
            System.out.println(" Compound_stmt = ");
            compound_stmt.printNode();
        }
        else if(if_stmt != null)
        {
            System.out.println(" If_stmt = ");
            if_stmt.printNode();
        }
        else if(while_stmt != null)
        {
            System.out.println(" While_stmt = ");
            while_stmt.printNode();
        }
        else if(return_stmt != null)
        {
            System.out.println(" Return_stmt = ");
            return_stmt.printNode();
        }
        else if(break_stmt != null)
        {
            System.out.println(" Break_stmt = ");
            break_stmt.printNode();
        }

    }
}
