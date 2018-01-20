package celemendi.gracia.david.iberus;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Compiler {

    private Compiler() {}

    public static void compile(IberusBaseListener iberusBaseListener) {

        ANTLRInputStream input;
        try {
            input = new ANTLRInputStream(System.in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        IberusLexer lexer = new IberusLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        IberusParser parser = new IberusParser(tokens);

        ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(iberusBaseListener, tree);

        System.out.println();

    }

}
