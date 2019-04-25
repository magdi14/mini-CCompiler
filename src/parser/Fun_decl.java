package parser;

import Lexical.Token;

public class Fun_decl implements Node {

    Type_spec type_spec;
    Token id;
    Token lb;
    Params params;
    Token rb;


    @Override
    public void printNode(){
        // TODO Auto-generated method stub

    }
}
