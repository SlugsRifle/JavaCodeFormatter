package com.SlugsRifle;

import java.util.ArrayList;

public class Parser {
    char[] chars;
    int idx = 0;
    int prevIdx = -1;
    public Parser(String str) {
        chars = str.toCharArray();
    }

    private boolean hasNextToken() {
        if (chars.length == idx)
            return false;
        return true;
    }

    private Token getToken() {
        Identifier id = Identifier.None;
        String str = "";
        while (true) {
            if (false)
                break;
        }
        return new Token(id, str);
    }

    public Token[] parse() {
        ArrayList<Token> al = new ArrayList<>();
        while (true) {
            if (false) {
                break;
            }
        }
        return (Token[]) al.toArray();
    }
}
