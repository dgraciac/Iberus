package celemendi.gracia.david.iberus;

import org.antlr.v4.runtime.tree.TerminalNode;

public class IberusToCPlusPlusListener extends IberusBaseListener {

    public void enterSomeComment(IberusParser.SomeCommentContext ctx) {
        System.out.print(ctx.Comment());
        System.out.print(ctx.LineComment());
    }

    public void enterAClass(IberusParser.AClassContext ctx) {
        System.out.print("class ");
        System.out.print(ctx.IdFirstLargeAlpha(0).toString());
        System.out.print(": ");
        System.out.print("public");
        System.out.print(' ');
        System.out.print(ctx.IdFirstLargeAlpha(1));
        System.out.print(' ');
        System.out.println('{');
    }

    public void exitAClass(IberusParser.AClassContext ctx) {
        System.out.println("};");
        System.out.println();
    }

    public void exitVariableDeclaration(IberusParser.VariableDeclarationContext ctx) {
        System.out.print(' ');
        System.out.print(ctx.EndStatSymbol());
        System.out.println();
    }

    public void enterTypedThing(IberusParser.TypedThingContext ctx) {
        System.out.print(' ');
        TerminalNode f = ctx.FunctionTypeSymbol();
        TerminalNode f2 = ctx.IdFirstLargeAlpha();
        if(f != null){System.out.print(f);}
        if(f2 != null){System.out.print(f2);}
    }

    public void exitIdentifier(IberusParser.IdentifierContext ctx) {
        System.out.print(' ');
        TerminalNode f = ctx.IdFirstLargeAlpha();
        TerminalNode f2 = ctx.IdFirstSmallAlpha();
        if(f != null){System.out.print(f);}
        if(f2 != null){System.out.print(f2);}
    }

    public void enterAssignment(IberusParser.AssignmentContext ctx) {
        System.out.print(' ');
        System.out.print(ctx.AssignmentSymbol());
        System.out.print(' ');
    }

    public void enterParenthesizedExpression(IberusParser.ParenthesizedExpressionContext ctx) {
        System.out.print('(');
    }

    public void exitParenthesizedExpression(IberusParser.ParenthesizedExpressionContext ctx) {
        System.out.print(')');
    }

    public void exitLiteral(IberusParser.LiteralContext ctx) {
        TerminalNode t = ctx.IntegerTimesTenRaisedToThePowerOf();
        if(t != null) System.out.print(t);
    }
}