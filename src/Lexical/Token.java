package Lexical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Pattern;

public class Token implements Comparable<Token> {
    private String type, value;
    private int start;

    public Token(String type, String value, int start) {
        this.type = type;
        this.value = value;
        this.start = start;
    }

    @Override
    public String toString() {
        return "<" + type.toUpperCase() + ">:" + value + '\n';
    }

    @Override
    public int compareTo(Token token) {
        return Integer.compare(this.start, token.start);
    }

    public static Queue<Token> tokenize(String sourceCode) throws Exception {
        ArrayList<Token> tokens = new ArrayList<>();
        Queue<Token> qTokens = new LinkedList<Token>();
        var visitor = new Visitor(sourceCode.length());
        var dictionary = Load.loadClasses();
        for (var i : dictionary) {
            var pattern = Pattern.compile((String) i.getValue());
            var matcher = pattern.matcher(sourceCode);
            while (matcher.find()) {
                if (visitor.isVisited(matcher.start()) == false) {
                    tokens.add(new Token((String) i.getKey(), matcher.group(), matcher.start()));
                    visitor.visit(matcher.start(), matcher.end());
                }
            }
        }
        Collections.sort(tokens);
        qTokens.addAll(tokens);
        Save.saveTokens(qTokens);

        return qTokens;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

}
