package Lexical;

import Lexical.Load;

import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        String sourceCode = Load.loadRaw("/home/shehabeldeen/materials/compilers/mini-CCompiler/main.c");
        Queue<Token> tokens = Token.tokenize(sourceCode);
        System.out.println(tokens);
    }
}
