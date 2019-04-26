package parser;

import Lexical.Token;

public class Arg_list2 implements Node {

    Token comma;
    Expr expr;
    Arg_list2 arg_list2;

    public Arg_list2(Token comma, Expr expr, Arg_list2 arg_list2) {
        this.comma = comma;
        this.expr = expr;
        this.arg_list2 = arg_list2;
    }

    @Override
    public void printNode() {
        // TODO Auto-generated method stub
        System.out.println("---------Arg_list 2-----------");
        if (comma != null) System.out.println(comma.getType());
        System.out.println("expr = ");
        if (expr != null) expr.printNode();
        else System.out.println("null");
        System.out.println("arg_list2 = ");
        if (arg_list2 != null) arg_list2.printNode();
        else System.out.println("null");

    }
}
