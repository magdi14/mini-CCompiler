package parser;

import Lexical.Token;

public class Var_decl2 implements Node {

    Token ls; // semicolon or left square bracket
    Token rs; // right square bracket
    Token sc; // semicolon

    public Var_decl2(Token ls) {
        this.ls = ls;
    }

    public Var_decl2(Token ls, Token rs, Token sc) {
        this.ls = ls;
        this.rs = rs;
        this.sc = sc;
    }

    @Override
    public void printNode(){
        // TODO Auto-generated method stub
        System.out.println("---------Var_decl2-----------");
        if( ls != null && ls.getValue().equals(";"))
        {
            System.out.println("SEMICOLON");
        }
        else if (ls != null && ls.getValue().equals("["))
            System.out.println("LEFT_SQUARE_B");
        if (rs != null && rs.getValue().equals("]"))
            System.out.println("RIGHT_SQUARE_B");
        if (sc != null && sc.getValue().equals(";"))
            System.out.println("SEMICOLON");
    }
}
