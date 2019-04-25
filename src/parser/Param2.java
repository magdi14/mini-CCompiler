package parser;

import Lexical.Token;

public class Param2 implements Node{

    Token LEFT_SQUARE_B;
    Token RIGHT_SQUARE_B;

    public Param2(Token LEFT_SQUARE_B, Token RIGHT_SQUARE_B){
        this.LEFT_SQUARE_B = LEFT_SQUARE_B;
        this.RIGHT_SQUARE_B = RIGHT_SQUARE_B;
    }

    @Override
    public void printNode(){
        // TODO Auto-generated method stub
        System.out.println("-------Param2-------------");
        if(LEFT_SQUARE_B != null)
            System.out.print("LEFT_SQUARE_B");
        if(RIGHT_SQUARE_B != null)
            System.out.println("RIGHT_SQUARE_B");
        System.out.println("--------------------");
    }

}
