package parser;

import Lexical.Token;

public class Local_decl implements Node{
    Type_spec type_spec;
    Token t1;
    Local_decl2 local_decl2;

    public Local_decl(Type_spec type_spec, Token t1, Local_decl2 local_decl2) {
        this.type_spec = type_spec;
        this.t1 = t1;
        this.local_decl2 = local_decl2;
    }

    @Override
    public void printNode() {
        if(type_spec != null)
        {
            System.out.println(" Type_spec = ");
            type_spec.printNode();
            System.out.println(t1.getValue());
            System.out.println(" Local_decl2 = ");
            local_decl2.printNode();
        }
    }
}
