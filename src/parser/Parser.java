package parser;

import Lexical.Load;
import Lexical.Token;

import java.io.FileNotFoundException;
import java.util.Queue;

public class Parser {
    Queue<Token> tokens;

    public Parser(String fileName) throws FileNotFoundException, Exception {
        // TODO Auto-generated constructor stub
        String sourceCode = Load.loadRaw(fileName);
        Queue<Token> tokens = Token.tokenize(sourceCode);
    }

    private Type_spec type_spec() {
        Token t = tokens.peek();
        if (t != null) {
            if (t.getValue().equals("void") || t.getValue().equals("int") || t.getValue().equals("bool") || t.getValue().equals("float")) {
                tokens.poll();
                return new Type_spec(t);
            }
            return null;
        }
        return null;
    }

    private Param_list2 param_list2(){
        Token t = tokens.peek();
        if (t != null){
            if (t.getValue().equals(",")){
                Param param = param();
                Param_list2 paramList2 = param_list2();
                return new Param_list2(t, param, paramList2);
            }
            return null;
        }
        return null;
    }

    private Param param() {
        Token t = tokens.peek();
        if (t != null) {
            Type_spec typeSpec = type_spec();
            Token id = tokens.peek();
            if (id.getType().equals("ID")){
                tokens.poll();
                Param2 param2 = param2();
                return new Param(typeSpec, id, param2);
            }
            return null;
        }
        return null;
    }

    private Param2 param2() {
        Token t = tokens.peek();
        if (t.getValue().equals("[")) {
            tokens.poll();
            Token t2 = tokens.peek();
            if (t2.getValue().equals("]")) {
                tokens.poll();
                return new Param2(t, t2);
            }
        }
        return null;
    }


    public static void main(String[] args) throws FileNotFoundException, Exception {
        Parser p = new Parser("/home/shehabeldeen/materials/compilers/mini-CCompiler/main.c");
    }

}
