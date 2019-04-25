package parser;

import Lexical.Token;

public class Var_decl implements Node {

    Type_spec type_spec;
    Token id;
    Var_decl2 var_decl2;

    public Var_decl(Type_spec type_spec, Token id, Var_decl2 var_decl2) {
        this.type_spec = type_spec;
        this.id = id;
        this.var_decl2 = var_decl2;
    }

    @Override
    public void printNode(){
        // TODO Auto-generated method stub
        System.out.println("---------Var_decl-----------");
        System.out.println("Type_spec = ");
        if(type_spec!=null) type_spec.printNode() ; else System.out.println("null");
        System.out.println("IDENT = " + id.getValue());
        System.out.println("Var_decl2 = ");
        if(var_decl2!=null) var_decl2.printNode() ; else System.out.println("null");
    }
}
