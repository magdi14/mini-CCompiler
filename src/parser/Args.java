package parser;

public class Args implements Node {

    Arg_list arg_list;

    public Args(Arg_list arg_list) {
        this.arg_list = arg_list;
    }

    @Override
    public void printNode() {
        // TODO Auto-generated method stub
        System.out.println("---------Args-----------");
        System.out.println("arg_list = ");
        if (arg_list != null) arg_list.printNode();
        else System.out.println("null");
    }
}
