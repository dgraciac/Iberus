package com.iberus;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Compiler {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);

        IberusLexer lexer = new IberusLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        IberusParser parser = new IberusParser(tokens);

        ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(new IberusToCPlusPlus(), tree);

        System.out.println();

    }
}