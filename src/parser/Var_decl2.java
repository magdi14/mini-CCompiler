package parser;

import Lexical.Token;

public class Var_decl2 implements Node {

    Token sc; // semicolon or left square bracket
    Token rs; // right square bracket

    public Var_decl2(Token sc) {
        this.sc = sc;
    }

    public Var_decl2(Token sc, Token rs) {
        this.sc = sc;
        this.rs = rs;
    }

    @Override
    public void printNode(){
        // TODO Auto-generated method stub
        System.out.println("---------Var_decl2-----------");
        if( sc != null && sc.getValue().equals(";"))
        {
            System.out.println("semicolon");
        }
        else if (sc != null && sc.getValue().equals("["))
            System.out.println("LEFT_SQUARE_B");
        if (rs != null && rs.getValue().equals("]"))
            System.out.println("RIGHT_SQUARE_B");
    }
}
