package parser;

import Lexical.Token;

public class IDexpr implements Node {

    Token t1;
    Token t2;
    Token t3;
    IDexpr idexpr;
    IDexpr2 idexpr2;
    Expr expr;
    Type_spec type_spec;

    public IDexpr(Token t1) {
        this.t1 = t1;
    }

    public IDexpr(Token t1, IDexpr2 idexpr2) {
        this.t1 = t1;
        this.idexpr2 = idexpr2;
    }

    public IDexpr(Token t1, IDexpr idexpr) {
        this.t1 = t1;
        this.idexpr = idexpr;
    }

    public IDexpr(Token t1, Token t2, Expr expr) {
        this.t1 = t1;
        this.t2 = t2;
        this.expr = expr;
    }

    public IDexpr(Token t1, Token t2, Token t3, Expr expr, Type_spec type_spec) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.expr = expr;
        this.type_spec = type_spec;
    }

    @Override
    public void printNode() {
        // TODO Auto-generated method stub
        System.out.println("---------IDexpr-----------");
        if (t1 != null){
            System.out.print(t1.getValue());
            if (idexpr2 != null){
                System.out.println(" IDexpr2 =  ");
                idexpr2.printNode();
            }else if (idexpr != null){
                System.out.println(" IDexpr =  ");
                idexpr.printNode();
            }else if (t2 != null && expr != null){
                if (t3 == null){
                    System.out.println("expr = ");
                    expr.printNode();
                    System.out.println(t2.getValue());
                }else{
                    System.out.println("type_spec = ");
                    type_spec.printNode();
                    System.out.println(t2.getValue());
                    System.out.println("expr = ");
                    expr.printNode();
                    System.out.println(t3.getValue());
                }
            }
        }
    }
}
