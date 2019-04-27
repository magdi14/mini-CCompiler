package parser;

public class COMexpr implements Node {

    ASexpr asexpr;
    COMexpr2 comexpr2;

    public COMexpr(ASexpr asexpr, COMexpr2 comexpr2) {
        this.asexpr = asexpr;
        this.comexpr2 = comexpr2;
    }

    @Override
    public void printNode(){
        // TODO Auto-generated method stub
        System.out.println("----------COMexpr--------------");
        if (asexpr != null){
            System.out.println(" ASexpr = ");
            ASexpr.printNode();
            if (comexpr2 != null){
                System.out.println(" COMexpr2 = ");
                comexpr2.printNode();
            }
        }
    }
}
