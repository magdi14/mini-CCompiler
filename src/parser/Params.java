package parser;

import Lexical.Token;

public class Params implements Node {

    Param_list param_list;
    Token t;

    public Params(Param_list param_list) {
        this.param_list = param_list;
    }

    public Params(Token t) {
        this.t = t;
    }

    @Override
    public void printNode(){
        // TODO Auto-generated method stub
        System.out.println("----------Params----------");
        if(param_list != null){
            System.out.println("param_list = ");
            param_list.printNode();
        }
        else if(t != null){
            System.out.println("VOID");
        }
    }
}
