package parser;

import Lexical.Token;

public class Decl implements Node {

    Type_spec type_spec;
    Token id;
    Decl2 decl2;

    public Decl(Type_spec type_spec, Token id, Decl2 decl2) {
        this.type_spec = type_spec;
        this.id = id;
        this.decl2 = decl2;
    }

    @Override
    public void printNode(){
        // TODO Auto-generated method stub
        System.out.println("---------Decl-----------");
        System.out.println("Type_spec = ");
        if(type_spec!=null) type_spec.printNode() ; else System.out.println("null");
        System.out.println("IDENT = " + id.getValue());
        System.out.println(" DECL2 = ");
        if (decl2 != null) decl2.printNode(); else System.out.println("null");
    }
}
