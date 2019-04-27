package parser;

public class MDMexpr implements Node {

    IDexpr idexpr;
    MDMexpr2 mdmexpr2;

    public MDMexpr(IDexpr idexpr, MDMexpr2 mdmexpr2) {
        this.idexpr = idexpr;
        this.mdmexpr2 = mdmexpr2;
    }

    @Override
    public void printNode() {
        // TODO Auto-generated method stub
        System.out.println("---------MDMexpr-----------");
        if (idexpr != null){
            System.out.println(" IDexpr = ");
            idexpr.printNode();
            System.out.println(" MDMexpr2 = ");
            mdmexpr2.printNode();
        }
    }
}
