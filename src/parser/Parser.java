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

    private Program parse(){
        return program();
    }

    // program --> decl_list
    private Program program(){
        Token t = tokens.peek();
        if (t != null){
            Decl_list declList = decl_list();
            return new Program(declList);
        }
        return null;
    }

    // decl_list --> decl decl_list2
    private Decl_list decl_list(){
        Token t = tokens.peek();
        if (t != null){
            Decl decl = decl();
            Decl_list2 decl_list2 = decl_list2();
            return new Decl_list(decl, decl_list2);
        }
        return null;
    }

    // decl_list2 --> decl decl_list2 | E
    private Decl_list2 decl_list2(){
        Token t = tokens.peek();
        if (t != null){
            Decl decl = decl();
            Decl_list2 decl_list2 = decl_list2();
            return new Decl_list2(decl, decl_list2);
        }
        return null;
    }

    // decl --> var_decl | fun_decl
    private Decl decl(){
        Var_decl var_decl = var_decl();
        return new Decl(var_decl);
    }

    // var_decl --> type_spec ident var_decl2
    private Var_decl var_decl(){
        Token t = tokens.peek();
        if (t != null){
            Type_spec typeSpec = type_spec();
            Token id = tokens.poll();
            Var_decl2 varDecl2 = var_decl2();
            return new Var_decl(typeSpec, id, varDecl2);
        }
        return null;
    }

    // var_decl2 --> ; | []
    private Var_decl2 var_decl2(){
        Token t = tokens.peek();
        if (t != null){
            tokens.poll();
            if (t.getValue().equals(";")){
                return new Var_decl2(t);
            }else if(t.getValue().equals("[")){
                Token t1 = tokens.peek();
                if(t1 != null && t1.getValue().equals("]")){
                    tokens.poll();
                    return new Var_decl2(t, t1);
                }
            }
        }
        return null;
    }

    // type_spec --> void | bool | int | float
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

    // fun_decl --> type_spec ident (params) compound_stmt
    private Fun_decl fun_decl(){
        return null;
    }

    // params --> param_list | void
    private Params params() {
        Token t = tokens.peek();
        if (t != null){
            if (t.getValue().equals("void")){
                tokens.poll();
                return new Params(t);
            }else {
                Param_list param_list = param_list();
                return new Params(param_list);
            }
        }
        return null;
    }

    // param_list --> param param_list2
    private Param_list param_list() {
        Token t = tokens.peek();
        if (t != null) {
            Param param = param();
            Param_list2 paramList2 = param_list2();
            return new Param_list(param, paramList2);
        }
        return null;
    }

    // param_list2 --> , param param_list2 | E
    private Param_list2 param_list2() {
        Token t = tokens.peek();
        if (t != null) {
            if (t.getValue().equals(",")) {
                Param param = param();
                Param_list2 paramList2 = param_list2();
                return new Param_list2(t, param, paramList2);
            }
            return null;
        }
        return null;
    }

    // param --> type_spec ident param2
    private Param param() {
        Token t = tokens.peek();
        if (t != null) {
            Type_spec typeSpec = type_spec();
            Token id = tokens.peek();
            if (id.getType().equals("ID")) {
                tokens.poll();
                Param2 param2 = param2();
                return new Param(typeSpec, id, param2);
            }
            return null;
        }
        return null;
    }

    // param2 --> [ ] | E
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
        Program root = p.parse();
        root.printNode();
    }

}
