// Generated from Iberus.g4 by ANTLR 4.5.3
package com.iberus;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IberusParser}.
 */
public interface IberusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IberusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(IberusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(IberusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#someComment}.
	 * @param ctx the parse tree
	 */
	void enterSomeComment(IberusParser.SomeCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#someComment}.
	 * @param ctx the parse tree
	 */
	void exitSomeComment(IberusParser.SomeCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#aClass}.
	 * @param ctx the parse tree
	 */
	void enterAClass(IberusParser.AClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#aClass}.
	 * @param ctx the parse tree
	 */
	void exitAClass(IberusParser.AClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(IberusParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(IberusParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(IberusParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(IberusParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#variableDeclarationAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationAssignment(IberusParser.VariableDeclarationAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#variableDeclarationAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationAssignment(IberusParser.VariableDeclarationAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(IberusParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(IberusParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#classSideEntity}.
	 * @param ctx the parse tree
	 */
	void enterClassSideEntity(IberusParser.ClassSideEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#classSideEntity}.
	 * @param ctx the parse tree
	 */
	void exitClassSideEntity(IberusParser.ClassSideEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#routine}.
	 * @param ctx the parse tree
	 */
	void enterRoutine(IberusParser.RoutineContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#routine}.
	 * @param ctx the parse tree
	 */
	void exitRoutine(IberusParser.RoutineContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#conditionThenSomeCode}.
	 * @param ctx the parse tree
	 */
	void enterConditionThenSomeCode(IberusParser.ConditionThenSomeCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#conditionThenSomeCode}.
	 * @param ctx the parse tree
	 */
	void exitConditionThenSomeCode(IberusParser.ConditionThenSomeCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(IberusParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(IberusParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#someCode}.
	 * @param ctx the parse tree
	 */
	void enterSomeCode(IberusParser.SomeCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#someCode}.
	 * @param ctx the parse tree
	 */
	void exitSomeCode(IberusParser.SomeCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#codeEntity}.
	 * @param ctx the parse tree
	 */
	void enterCodeEntity(IberusParser.CodeEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#codeEntity}.
	 * @param ctx the parse tree
	 */
	void exitCodeEntity(IberusParser.CodeEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#codeEntityEndStatement}.
	 * @param ctx the parse tree
	 */
	void enterCodeEntityEndStatement(IberusParser.CodeEntityEndStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#codeEntityEndStatement}.
	 * @param ctx the parse tree
	 */
	void exitCodeEntityEndStatement(IberusParser.CodeEntityEndStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(IberusParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(IberusParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(IberusParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(IberusParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(IberusParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(IberusParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(IberusParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(IberusParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(IberusParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(IberusParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(IberusParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(IberusParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#classCall}.
	 * @param ctx the parse tree
	 */
	void enterClassCall(IberusParser.ClassCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#classCall}.
	 * @param ctx the parse tree
	 */
	void exitClassCall(IberusParser.ClassCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#instanceSideCall}.
	 * @param ctx the parse tree
	 */
	void enterInstanceSideCall(IberusParser.InstanceSideCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#instanceSideCall}.
	 * @param ctx the parse tree
	 */
	void exitInstanceSideCall(IberusParser.InstanceSideCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#appl}.
	 * @param ctx the parse tree
	 */
	void enterAppl(IberusParser.ApplContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#appl}.
	 * @param ctx the parse tree
	 */
	void exitAppl(IberusParser.ApplContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#creation}.
	 * @param ctx the parse tree
	 */
	void enterCreation(IberusParser.CreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#creation}.
	 * @param ctx the parse tree
	 */
	void exitCreation(IberusParser.CreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#paramsRealCommaSeparated}.
	 * @param ctx the parse tree
	 */
	void enterParamsRealCommaSeparated(IberusParser.ParamsRealCommaSeparatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#paramsRealCommaSeparated}.
	 * @param ctx the parse tree
	 */
	void exitParamsRealCommaSeparated(IberusParser.ParamsRealCommaSeparatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#typedThing}.
	 * @param ctx the parse tree
	 */
	void enterTypedThing(IberusParser.TypedThingContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#typedThing}.
	 * @param ctx the parse tree
	 */
	void exitTypedThing(IberusParser.TypedThingContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(IberusParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(IberusParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#flowControl}.
	 * @param ctx the parse tree
	 */
	void enterFlowControl(IberusParser.FlowControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#flowControl}.
	 * @param ctx the parse tree
	 */
	void exitFlowControl(IberusParser.FlowControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#aSwitch}.
	 * @param ctx the parse tree
	 */
	void enterASwitch(IberusParser.ASwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#aSwitch}.
	 * @param ctx the parse tree
	 */
	void exitASwitch(IberusParser.ASwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#normalCase}.
	 * @param ctx the parse tree
	 */
	void enterNormalCase(IberusParser.NormalCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#normalCase}.
	 * @param ctx the parse tree
	 */
	void exitNormalCase(IberusParser.NormalCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCase(IberusParser.DefaultCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCase(IberusParser.DefaultCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#doWhile}.
	 * @param ctx the parse tree
	 */
	void enterDoWhile(IberusParser.DoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#doWhile}.
	 * @param ctx the parse tree
	 */
	void exitDoWhile(IberusParser.DoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#aWhile}.
	 * @param ctx the parse tree
	 */
	void enterAWhile(IberusParser.AWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#aWhile}.
	 * @param ctx the parse tree
	 */
	void exitAWhile(IberusParser.AWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#aIf}.
	 * @param ctx the parse tree
	 */
	void enterAIf(IberusParser.AIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#aIf}.
	 * @param ctx the parse tree
	 */
	void exitAIf(IberusParser.AIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void enterElseIf(IberusParser.ElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void exitElseIf(IberusParser.ElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#aElse}.
	 * @param ctx the parse tree
	 */
	void enterAElse(IberusParser.AElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#aElse}.
	 * @param ctx the parse tree
	 */
	void exitAElse(IberusParser.AElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(IberusParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(IberusParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#paramsDecl}.
	 * @param ctx the parse tree
	 */
	void enterParamsDecl(IberusParser.ParamsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#paramsDecl}.
	 * @param ctx the parse tree
	 */
	void exitParamsDecl(IberusParser.ParamsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#notFirstParamDecl}.
	 * @param ctx the parse tree
	 */
	void enterNotFirstParamDecl(IberusParser.NotFirstParamDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#notFirstParamDecl}.
	 * @param ctx the parse tree
	 */
	void exitNotFirstParamDecl(IberusParser.NotFirstParamDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(IberusParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(IberusParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(IberusParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(IberusParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(IberusParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(IberusParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link IberusParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(IberusParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link IberusParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(IberusParser.ArrayContext ctx);
}