package Lexical;

import java.io.File;
import java.io.PrintWriter;
import java.util.Queue;


class Save {
    static void saveTokens(Queue<Token> tokens) throws Exception {
        PrintWriter printWriter = new PrintWriter(new File("/home/ref/IdeaProjects/mini-CCompiler/main.tokens"));
        for (var token : tokens) {
            printWriter.write(token.toString());
        }
        printWriter.close();
    }
}
