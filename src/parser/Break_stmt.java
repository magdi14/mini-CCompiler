package parser;

import Lexical.Token;

public class Break_stmt implements Node{

    Token t;

    public Break_stmt(Token t) {
        this.t = t;
    }

    @Override
    public void printNode(){
        // TODO Auto-generated method stub
        System.out.println("-------Break_stmt-------------");
        System.out.println("Break_stmt = " + t.getValue());
        System.out.println("--------------------");
    }
}
