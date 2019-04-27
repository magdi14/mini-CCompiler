package parser;

import Lexical.Token;

public class Return_stmt implements Node{
    Token t1;
    Return_stmt2 return_stmt2;

    public Return_stmt(Token t1, Return_stmt2 return_stmt2) {
        this.t1 = t1;
        this.return_stmt2 = return_stmt2;
    }

    @Override
    public void printNode() {
        if(t1 != null)
        {
            System.out.println(t1.getValue());
            System.out.println(" Return_stmt = ");
            return_stmt2.printNode();
        }
    }
}
