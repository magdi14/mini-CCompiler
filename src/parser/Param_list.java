package parser;

public class Param_list implements Node{

    Param param;
    Param_list2 param_list2;

    public Param_list(Param param, Param_list2 param_list2) {
        this.param = param;
        this.param_list2 = param_list2;
    }

    @Override
    public void printNode(){
        // TODO Auto-generated method stub
        System.out.println("---------Param_list----------");
        System.out.println("param = ");
        if(param!=null) param.printNode() ; else System.out.println("null");
        System.out.println("param_list2 = ");
        if(param_list2!=null) param_list2.printNode() ; else System.out.println("null");
    }

}
