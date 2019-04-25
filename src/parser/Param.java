package parser;

import Lexical.Token;

public class Param implements Node{

    Type_spec type;
    Token id;
    Param2 params;

    public Param(Type_spec type, Token id, Param2 params) {
        this.type = type;
        this.id = id;
        this.params = params;
    }

    @Override
    public void printNode(){
        // TODO Auto-generated method stub
        System.out.println("-------Param-------------");
        System.out.println("Type_spec = ");
        if(type!=null) type.printNode() ; else System.out.println("null");
        System.out.println("IDENT = " + id.getValue());
        System.out.println("param2 = ");
        if(params!=null) params.printNode() ; else System.out.println("null");
        System.out.println("--------------------");
    }
}
