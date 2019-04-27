package parser;

import Lexical.Token;

public class Fun_decl implements Node {

    Type_spec type_spec;
    Token id;
    Token lb;
    Params params;
    Token rb;
    Compound_stmt compound_stmt;

    public Fun_decl(Type_spec type_spec, Token id, Token lb, Params params,
                    Token rb, Compound_stmt compound_stmt) {
        this.type_spec = type_spec;
        this.id = id;
        this.lb = lb;
        this.params = params;
        this.rb = rb;
        this.compound_stmt = compound_stmt;
    }

    @Override
    public void printNode(){
        // TODO Auto-generated method stub
        System.out.println("------------Fun_decl--------------");
        if (type_spec != null){
            System.out.println(" type_spec  = ");
            type_spec.printNode();
            System.out.println("  " + id.getValue());
            System.out.println("  " + lb.getValue());
            System.out.println(" params = ");
            params.printNode();
            System.out.println("  " + rb.getValue());
            System.out.println(" compound_stmt = ");
            compound_stmt.printNode();
        }else
            System.out.println("null");
    }
}
