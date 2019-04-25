package parser;

public class Decl_list2 implements Node {

    Decl decl;
    Decl_list2 decl_list2;

    public Decl_list2(Decl decl, Decl_list2 decl_list2) {
        this.decl = decl;
        this.decl_list2 = decl_list2;
    }

    @Override
    public void printNode(){
        // TODO Auto-generated method stub
        System.out.println("---------Decl_list2-----------");
        System.out.println("Decl = ");
        if(decl!=null) decl.printNode() ; else System.out.println("null");
        System.out.println("Decl_list2 = ");
        if(decl_list2!=null) decl_list2.printNode() ; else System.out.println("null");
    }
}
