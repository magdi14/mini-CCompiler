package parser;

import Lexical.Token;

public class COMexpr2 implements Node {

    Token t1;
    ASexpr asxpr;

    public COMexpr2(Token t1, ASexpr asxpr) {
        this.t1 = t1;
        this.asxpr = asxpr;
    }

    @Override
    public void printNode(){
        // TODO Auto-generated method stub
        System.out.println("---------COMexpr2-----------");
        if(t1 != null){
            System.out.println(t1.getValue());
            System.out.println(" ASexpr = ");
            asxpr.printNode();
        }else
            System.out.println("null");
    }

}
