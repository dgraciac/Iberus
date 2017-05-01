package com.iberus;

import org.antlr.v4.runtime.tree.TerminalNode;

public class IberusToCPlusPlus extends IberusBaseListener {

    @Override public void enterSomeComment(IberusParser.SomeCommentContext ctx) {
        System.out.print(ctx.Comment());
        System.out.print(ctx.LineComment());
    }

    @Override public void enterAClass(IberusParser.AClassContext ctx) {
        System.out.print("class ");
        System.out.print(ctx.IdFirstLargeAlpha(0).toString());
        System.out.print(": ");
        System.out.print("public");
        System.out.print(' ');
        System.out.print(ctx.IdFirstLargeAlpha(1));
        System.out.print(' ');
        System.out.println('{');
    }

    @Override public void exitAClass(IberusParser.AClassContext ctx) {
        System.out.println("};");
        System.out.println();
    }

    @Override public void exitVariableDeclaration(IberusParser.VariableDeclarationContext ctx) {
        System.out.print(' ');
        System.out.print(ctx.EndStatSymbol());
        System.out.println();
    }

    @Override public void enterTypedThing(IberusParser.TypedThingContext ctx) {
        System.out.print(' ');
        TerminalNode f = ctx.FunctionTypeSymbol();
        TerminalNode f2 = ctx.IdFirstLargeAlpha();
        if(f != null){System.out.print(f);}
        if(f2 != null){System.out.print(f2);}
    }

    @Override public void exitIdentifier(IberusParser.IdentifierContext ctx) {
        System.out.print(' ');
        TerminalNode f = ctx.IdFirstLargeAlpha();
        TerminalNode f2 = ctx.IdFirstSmallAlpha();
        if(f != null){System.out.print(f);}
        if(f2 != null){System.out.print(f2);}
    }

    @Override public void enterAssignment(IberusParser.AssignmentContext ctx) {
        System.out.print(' ');
        System.out.print(ctx.AssignmentSymbol());
        System.out.print(' ');
    }

    @Override public void enterParenthesizedExpression(IberusParser.ParenthesizedExpressionContext ctx) {
        System.out.print('(');
    }

    @Override public void exitParenthesizedExpression(IberusParser.ParenthesizedExpressionContext ctx) {
        System.out.print(')');
    }

    @Override public void exitLiteral(IberusParser.LiteralContext ctx) {
        TerminalNode t = ctx.IntegerTimesTenRaisedToThePowerOf();
        if(t != null) System.out.print(t);
    }
}