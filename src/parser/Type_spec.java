package parser;

import Lexical.Token;

public class Type_spec implements Node{

    Token type;

    public Type_spec(Token type) {
        this.type = type;
    }

    @Override
    public void printNode(){
        // TODO Auto-generated method stub
        System.out.println("-------Type_spec-------------");
        System.out.println("Type_spec = " + type.getValue());
        System.out.println("--------------------");
    }
}
