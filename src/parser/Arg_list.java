package parser;

public class Arg_list implements Node {

    Expr expr;
    Arg_list2 arg_list2;

    public Arg_list(Expr expr, Arg_list2 arg_list2) {
        this.expr = expr;
        this.arg_list2 = arg_list2;
    }

    @Override
    public void printNode() {
        // TODO Auto-generated method stub
        System.out.println("---------Arg_list-----------");
        System.out.println("expr = ");
        if (expr != null) expr.printNode();
        else System.out.println("null");
        System.out.println("arg_list2 = ");
        if (arg_list2 != null) arg_list2.printNode();
        else System.out.println("null");

    }
}
