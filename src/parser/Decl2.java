package parser;

public class Decl2 implements Node {

    Var_decl var_decl;
    Fun_decl fun_decl;

    public Decl2(Var_decl var_decl) {
        this.var_decl = var_decl;
    }

    public Decl2(Fun_decl fun_decl) {
        this.fun_decl = fun_decl;
    }

    @Override
    public void printNode() {
        // TODO Auto-generated method stub
        System.out.println("---------Decl-----------");
        if (var_decl != null) {
            System.out.println("Var_decl = ");
            var_decl.printNode();
        } else if (fun_decl != null) {
            System.out.println("Fun_decl = ");
            fun_decl.printNode();
        }
    }
}