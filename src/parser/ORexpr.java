package parser;

public class ORexpr implements Node {

    ANDexpr anDexpr;
    ORexpr2 oRexpr2;

    public ORexpr(ANDexpr anDexpr, ORexpr2 oRexpr2) {
        this.anDexpr = anDexpr;
        this.oRexpr2 = oRexpr2;
    }

    @Override
    public void printNode() {
        if(anDexpr != null)
        {
            System.out.println(" ANDexpr = ");
            anDexpr.printNode();
            System.out.println(" ORexpr2 = ");
            oRexpr2.printNode();
        }
    }
}
