package parser;

import Lexical.Token;

public class IDexpr2 implements Node {

    Token t1;
    Token t2;
    Expr expr;
    Args args;

    public IDexpr2(Token t1, Token t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public IDexpr2(Token t1, Token t2, Expr expr) {
        this.t1 = t1;
        this.t2 = t2;
        this.expr = expr;
    }

    public IDexpr2(Token t1, Token t2, Args args) {
        this.t1 = t1;
        this.t2 = t2;
        this.args = args;
    }

    @Override
    public void printNode() {
        // TODO Auto-generated method stub
        System.out.println("--------IDexpr2------------");
        if (t1 != null && t1.getValue().equals("[")) {
            System.out.println("[ expr =");
            if (expr != null) expr.printNode();
            else System.out.println("null");
            if (t2 != null && t2.getValue().equals("]"))
                System.out.println(" ]");
        }else if (t1 != null && t1.getValue().equals("(")){
            System.out.println("( args =");
            if (args != null) args.printNode();
            else System.out.println("null");
            if (t2 != null && t2.getValue().equals(")"))
                System.out.println(" )");
        }else if (t1 != null && t1.getValue().equals(".")){
            System.out.print("DOT ");
            if (t2 != null && t2.getValue().equals("size"))
                System.out.println("size");
        }else System.out.println("null");

    }
}
