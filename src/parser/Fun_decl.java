package parser;

import Lexical.Token;

public class Fun_decl implements Node {

    Token lb;
    Params params;
    Token rb;
    Compound_stmt compound_stmt;

    public Fun_decl(Token lb, Params params,
                    Token rb, Compound_stmt compound_stmt) {
        this.lb = lb;
        this.params = params;
        this.rb = rb;
        this.compound_stmt = compound_stmt;
    }

    @Override
    public void printNode() {
        // TODO Auto-generated method stub
        System.out.println("------------Fun_decl--------------");
        if (lb != null) {
            System.out.println("  " + lb.getValue());
            System.out.println(" params = ");
            params.printNode();
            System.out.println("  " + rb.getValue());
            System.out.println(" compound_stmt = ");
            if (compound_stmt != null)
                compound_stmt.printNode();
        } else
            System.out.println("null");
    }
}
