package parser;

public class ANDexpr implements Node {

    COMexpr coMexpr;
    ANDexpr2 anDexpr2;

    public ANDexpr(COMexpr coMexpr, ANDexpr2 anDexpr2) {
        this.coMexpr = coMexpr;
        this.anDexpr2 = anDexpr2;
    }

    @Override
    public void printNode() {
        if(coMexpr != null)
        {
            System.out.println(" COMexpr = ");
            coMexpr.printNode();
            System.out.println( "ANDexpr2 = ");
            anDexpr2.printNode();
        }
    }
}
