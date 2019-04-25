package parser;

public class Program implements Node{

    Decl_list decl_list;

    public Program(Decl_list decl_list) {
        this.decl_list = decl_list;
    }

    @Override
    public void printNode(){
        // TODO Auto-generated method stub
        System.out.println("---------PROGRAM-----------");
        System.out.println("Decl_list = ");
        if(decl_list!=null) decl_list.printNode() ; else System.out.println("null");

    }
}
