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

    // var_decl2 --> ; | [];
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
                    Token t2 = tokens.peek();
                    if(t2 != null && t2.getValue().equals(";")){
                        return new Var_decl2(t, t1, t2);
                    }
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
                tokens.poll();
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

    // stmt_list --> stmt_list2
    private Stmt_list stmt_list(){
        Token t = tokens.peek();
        if (t != null){
            Stmt_list2 stmt_list2 = stmt_list2();
            return new Stmt_list(stmt_list2);
        }
        return null;
    }

    // stmt_list2 --> stmt stmt_list2 | E
    private Stmt_list2 stmt_list2(){
        Token t = tokens.peek();
        if (t != null){
            Stmt stmt = stmt();
            Stmt_list2 stmt_list2 = stmt_list2();
            return new Stmt_list2(stmt, stmt_list2);
        }
        return null;
    }

    // stmt --> expr_stmt | compound_stmt | if_stmt | while_stmt | return_stmt | break_stmt
    private Stmt stmt(){
        Token t = tokens.peek();
        if (t.getValue().equals("{")){
            Compound_stmt compound_stmt = compound_stmt();
            return new Stmt(compound_stmt);
        }
        else if (t.getValue().equals("if")){
            If_stmt if_stmt = if_stmt();
            return new Stmt(if_stmt);
        }
        else if (t.getValue().equals("while")){
            While_stmt while_stmt = while_stmt();
            return new Stmt(while_stmt);
        }
        else if (t.getValue().equals("break")){
            Break_stmt break_stmt = break_stmt();
            return new Stmt(break_stmt);
        }
        else if (t.getValue().equals("return")){
            Return_stmt return_stmt = return_stmt();
            return new Stmt(return_stmt);
        }
        else{
            Expr_stmt expr_stmt = expr_stmt();
            return new Stmt(expr_stmt);
        }
        return null;
    }

    // expr_stmt --> expr ; | ;
    private Expr_stmt expr_stmt(){
        Token t = tokens.peek();
        if (t != null){
            if (t.getValue().equals(";")){
                tokens.poll();
                return new Expr_stmt(t);
            }else {
                Expr expr = expr();
                tokens.poll();
                return new Expr_stmt(expr, t);
            }
        }
        return null;
    }

    // while_stmt --> while ( expr ) stmt
    private While_stmt while_stmt(){
        Token t = tokens.peek();
        if (t != null){
            tokens.poll();
            Token t2 = tokens.peek();
            if(t2.getValue().equals("(")){
                tokens.poll();
                Expr expr = expr();
                Token t3 = tokens.peek();
                if (t3.getValue().equals(")")){
                    tokens.poll();
                    Stmt stmt = stmt();
                    return new While_stmt(t, t2, t3, expr, stmt);
                }
            }
        }
        return null;
    }

    // compound_stmt --> { local_decls stmt_list }
    private Compound_stmt compound_stmt(){
        Token t = tokens.peek();
        if(t != null){
            tokens.poll();
            Local_decls local_decls = local_decls();
            Stmt_list stmt_list = stmt_list();
            Token t2 = tokens.peek();
            if (t2.getValue().equals("}")){
                tokens.poll();
                return new Compound_stmt(t, t2, local_decls, stmt_list);
            }
        }
        return null;
    }

    // local_decls  --> local_decls2
    private Local_decls local_decls(){
        Token t = tokens.peek();
        if (t != null){
            Local_decls2 local_decls2 = local_decls2();
            return new Local_decls(local_decls2);
        }
        return null;
    }

    // local_decls2 --> local_decl local_decls2 | E
    private Local_decls2 local_decls2(){
        Token t = tokens.peek();
        if (t != null){
            Local_decl local_decl = local_decl();
            Local_decls2 local_decls2 = local_decls2();
            return new Local_decls2(local_decl, local_decls2);
        }
        return null;
    }

    // local_decl --> type_spec IDENT local_decl2
    private Local_decl local_decl(){
        Token t =tokens.peek();
        if (t != null){
            Type_spec type_spec = type_spec();
            Token id = tokens.peek();
            if (id.getType().equals("ID")){
                tokens.poll();
                Local_decl2 local_decl2 = local_decl2();
                return new Local_decl(type_spec, id, local_decl2);
            }
        }
        return null;
    }

    // local_decl2  --> [] ; | ;
    private Local_decl2 local_decl2(){
        Token t = tokens.peek();
        if (t != null){
            tokens.poll();
            if (t.getValue().equals("[")){
                Token t2 = tokens.peek();
                if (t2 != null && t2.getValue().equals("]")){
                    tokens.poll();
                    Token t3 = tokens.peek();
                    if (t3 != null && t3.getValue().equals(";")){
                        tokens.poll();
                        return new Local_decl2(t, t2, t3);
                    }

                }
            }else if (t.getValue().equals(";")){
                return new Local_decl2(t);
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
