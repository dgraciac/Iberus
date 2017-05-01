// Generated from Iberus.g4 by ANTLR 4.5.3
package com.iberus;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IberusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Comment=2, LineComment=3, SubclassOfSymbol=4, FunctionTypeSymbol=5, 
		StaticSymbol=6, CreateSymbol=7, MyClassSymbol=8, ClassSymbol=9, ReturnSymbol=10, 
		IdFirstLargeAlpha=11, ContinueSymbol=12, SwitchSymbol=13, BreakSymbol=14, 
		TrueSymbol=15, FalseSymbol=16, WhileSymbol=17, ElseIfSymbol=18, ElseSymbol=19, 
		ForSymbol=20, IfSymbol=21, DoSymbol=22, IdFirstSmallAlpha=23, UnseenCharacter=24, 
		Text=25, Character=26, Real=27, IntegerTimesTenRaisedToThePowerOf=28, 
		TimesTenRaisedToThePowerOf=29, AssignmentSymbol=30, Dot=31, Comma=32, 
		LPar=33, RPar=34, LBrace=35, RBrace=36, LSquareBracket=37, RSquareBracket=38, 
		EndStatSymbol=39, EndClassSymbol=40;
	public static final int
		RULE_program = 0, RULE_someComment = 1, RULE_aClass = 2, RULE_entity = 3, 
		RULE_variableDeclaration = 4, RULE_variableDeclarationAssignment = 5, 
		RULE_assignment = 6, RULE_classSideEntity = 7, RULE_routine = 8, RULE_conditionThenSomeCode = 9, 
		RULE_condition = 10, RULE_someCode = 11, RULE_codeEntity = 12, RULE_codeEntityEndStatement = 13, 
		RULE_returnStatement = 14, RULE_expression = 15, RULE_parenthesizedExpression = 16, 
		RULE_function = 17, RULE_variableAssignment = 18, RULE_call = 19, RULE_classCall = 20, 
		RULE_instanceSideCall = 21, RULE_appl = 22, RULE_creation = 23, RULE_paramsRealCommaSeparated = 24, 
		RULE_typedThing = 25, RULE_codeBlock = 26, RULE_flowControl = 27, RULE_aSwitch = 28, 
		RULE_normalCase = 29, RULE_defaultCase = 30, RULE_doWhile = 31, RULE_aWhile = 32, 
		RULE_aIf = 33, RULE_elseIf = 34, RULE_aElse = 35, RULE_booleanExpression = 36, 
		RULE_paramsDecl = 37, RULE_notFirstParamDecl = 38, RULE_identifier = 39, 
		RULE_literal = 40, RULE_booleanLiteral = 41, RULE_array = 42;
	public static final String[] ruleNames = {
		"program", "someComment", "aClass", "entity", "variableDeclaration", "variableDeclarationAssignment", 
		"assignment", "classSideEntity", "routine", "conditionThenSomeCode", "condition", 
		"someCode", "codeEntity", "codeEntityEndStatement", "returnStatement", 
		"expression", "parenthesizedExpression", "function", "variableAssignment", 
		"call", "classCall", "instanceSideCall", "appl", "creation", "paramsRealCommaSeparated", 
		"typedThing", "codeBlock", "flowControl", "aSwitch", "normalCase", "defaultCase", 
		"doWhile", "aWhile", "aIf", "elseIf", "aElse", "booleanExpression", "paramsDecl", 
		"notFirstParamDecl", "identifier", "literal", "booleanLiteral", "array"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", null, null, "'subclassOf'", "'Function'", "'static'", "'Create'", 
		"'myClass'", "'Class'", "'return'", null, "'continue'", "'switch'", "'break'", 
		"'true'", "'false'", "'while'", "'else if'", "'else'", "'for'", "'if'", 
		"'do'", null, null, null, null, null, null, null, "'<-'", "'.'", "','", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "Comment", "LineComment", "SubclassOfSymbol", "FunctionTypeSymbol", 
		"StaticSymbol", "CreateSymbol", "MyClassSymbol", "ClassSymbol", "ReturnSymbol", 
		"IdFirstLargeAlpha", "ContinueSymbol", "SwitchSymbol", "BreakSymbol", 
		"TrueSymbol", "FalseSymbol", "WhileSymbol", "ElseIfSymbol", "ElseSymbol", 
		"ForSymbol", "IfSymbol", "DoSymbol", "IdFirstSmallAlpha", "UnseenCharacter", 
		"Text", "Character", "Real", "IntegerTimesTenRaisedToThePowerOf", "TimesTenRaisedToThePowerOf", 
		"AssignmentSymbol", "Dot", "Comma", "LPar", "RPar", "LBrace", "RBrace", 
		"LSquareBracket", "RSquareBracket", "EndStatSymbol", "EndClassSymbol"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Iberus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IberusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<SomeCommentContext> someComment() {
			return getRuleContexts(SomeCommentContext.class);
		}
		public SomeCommentContext someComment(int i) {
			return getRuleContext(SomeCommentContext.class,i);
		}
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public List<AClassContext> aClass() {
			return getRuleContexts(AClassContext.class);
		}
		public AClassContext aClass(int i) {
			return getRuleContext(AClassContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comment) | (1L << LineComment) | (1L << FunctionTypeSymbol) | (1L << ClassSymbol) | (1L << IdFirstLargeAlpha) | (1L << IdFirstSmallAlpha))) != 0)) {
				{
				setState(89);
				switch (_input.LA(1)) {
				case Comment:
				case LineComment:
					{
					setState(86);
					someComment();
					}
					break;
				case FunctionTypeSymbol:
				case IdFirstLargeAlpha:
				case IdFirstSmallAlpha:
					{
					setState(87);
					entity();
					}
					break;
				case ClassSymbol:
					{
					setState(88);
					aClass();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SomeCommentContext extends ParserRuleContext {
		public TerminalNode Comment() { return getToken(IberusParser.Comment, 0); }
		public TerminalNode LineComment() { return getToken(IberusParser.LineComment, 0); }
		public SomeCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_someComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterSomeComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitSomeComment(this);
		}
	}

	public final SomeCommentContext someComment() throws RecognitionException {
		SomeCommentContext _localctx = new SomeCommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_someComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !(_la==Comment || _la==LineComment) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AClassContext extends ParserRuleContext {
		public TerminalNode ClassSymbol() { return getToken(IberusParser.ClassSymbol, 0); }
		public List<TerminalNode> IdFirstLargeAlpha() { return getTokens(IberusParser.IdFirstLargeAlpha); }
		public TerminalNode IdFirstLargeAlpha(int i) {
			return getToken(IberusParser.IdFirstLargeAlpha, i);
		}
		public TerminalNode SubclassOfSymbol() { return getToken(IberusParser.SubclassOfSymbol, 0); }
		public TerminalNode EndClassSymbol() { return getToken(IberusParser.EndClassSymbol, 0); }
		public List<SomeCommentContext> someComment() {
			return getRuleContexts(SomeCommentContext.class);
		}
		public SomeCommentContext someComment(int i) {
			return getRuleContext(SomeCommentContext.class,i);
		}
		public List<ClassSideEntityContext> classSideEntity() {
			return getRuleContexts(ClassSideEntityContext.class);
		}
		public ClassSideEntityContext classSideEntity(int i) {
			return getRuleContext(ClassSideEntityContext.class,i);
		}
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public AClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterAClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitAClass(this);
		}
	}

	public final AClassContext aClass() throws RecognitionException {
		AClassContext _localctx = new AClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_aClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(ClassSymbol);
			setState(97);
			match(IdFirstLargeAlpha);
			setState(98);
			match(SubclassOfSymbol);
			setState(99);
			match(IdFirstLargeAlpha);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comment) | (1L << LineComment) | (1L << FunctionTypeSymbol) | (1L << StaticSymbol) | (1L << IdFirstLargeAlpha) | (1L << IdFirstSmallAlpha))) != 0)) {
				{
				setState(103);
				switch (_input.LA(1)) {
				case Comment:
				case LineComment:
					{
					setState(100);
					someComment();
					}
					break;
				case StaticSymbol:
					{
					setState(101);
					classSideEntity();
					}
					break;
				case FunctionTypeSymbol:
				case IdFirstLargeAlpha:
				case IdFirstSmallAlpha:
					{
					setState(102);
					entity();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(EndClassSymbol);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntityContext extends ParserRuleContext {
		public RoutineContext routine() {
			return getRuleContext(RoutineContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitEntity(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_entity);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				routine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				variableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode EndStatSymbol() { return getToken(IberusParser.EndStatSymbol, 0); }
		public VariableDeclarationAssignmentContext variableDeclarationAssignment() {
			return getRuleContext(VariableDeclarationAssignmentContext.class,0);
		}
		public TypedThingContext typedThing() {
			return getRuleContext(TypedThingContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(114);
				variableDeclarationAssignment();
				}
				break;
			case 2:
				{
				setState(115);
				typedThing();
				}
				break;
			}
			setState(118);
			match(EndStatSymbol);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationAssignmentContext extends ParserRuleContext {
		public TypedThingContext typedThing() {
			return getRuleContext(TypedThingContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VariableDeclarationAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterVariableDeclarationAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitVariableDeclarationAssignment(this);
		}
	}

	public final VariableDeclarationAssignmentContext variableDeclarationAssignment() throws RecognitionException {
		VariableDeclarationAssignmentContext _localctx = new VariableDeclarationAssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclarationAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			typedThing();
			setState(121);
			assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode AssignmentSymbol() { return getToken(IberusParser.AssignmentSymbol, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(AssignmentSymbol);
			setState(124);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassSideEntityContext extends ParserRuleContext {
		public TerminalNode StaticSymbol() { return getToken(IberusParser.StaticSymbol, 0); }
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public ClassSideEntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSideEntity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterClassSideEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitClassSideEntity(this);
		}
	}

	public final ClassSideEntityContext classSideEntity() throws RecognitionException {
		ClassSideEntityContext _localctx = new ClassSideEntityContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classSideEntity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(StaticSymbol);
			setState(127);
			entity();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoutineContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TypedThingContext typedThing() {
			return getRuleContext(TypedThingContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParamsDeclContext paramsDecl() {
			return getRuleContext(ParamsDeclContext.class,0);
		}
		public RoutineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterRoutine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitRoutine(this);
		}
	}

	public final RoutineContext routine() throws RecognitionException {
		RoutineContext _localctx = new RoutineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_routine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(129);
				typedThing();
				}
				break;
			case 2:
				{
				setState(130);
				identifier();
				}
				break;
			}
			setState(134);
			_la = _input.LA(1);
			if (_la==LPar) {
				{
				setState(133);
				paramsDecl();
				}
			}

			setState(136);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionThenSomeCodeContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SomeCodeContext someCode() {
			return getRuleContext(SomeCodeContext.class,0);
		}
		public ConditionThenSomeCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionThenSomeCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterConditionThenSomeCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitConditionThenSomeCode(this);
		}
	}

	public final ConditionThenSomeCodeContext conditionThenSomeCode() throws RecognitionException {
		ConditionThenSomeCodeContext _localctx = new ConditionThenSomeCodeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditionThenSomeCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			condition();
			setState(139);
			someCode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(LPar);
			setState(142);
			booleanExpression();
			setState(143);
			match(RPar);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SomeCodeContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public CodeEntityContext codeEntity() {
			return getRuleContext(CodeEntityContext.class,0);
		}
		public SomeCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_someCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterSomeCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitSomeCode(this);
		}
	}

	public final SomeCodeContext someCode() throws RecognitionException {
		SomeCodeContext _localctx = new SomeCodeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_someCode);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				codeBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				codeEntity();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeEntityContext extends ParserRuleContext {
		public SomeCommentContext someComment() {
			return getRuleContext(SomeCommentContext.class,0);
		}
		public FlowControlContext flowControl() {
			return getRuleContext(FlowControlContext.class,0);
		}
		public CodeEntityEndStatementContext codeEntityEndStatement() {
			return getRuleContext(CodeEntityEndStatementContext.class,0);
		}
		public CodeEntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeEntity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterCodeEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitCodeEntity(this);
		}
	}

	public final CodeEntityContext codeEntity() throws RecognitionException {
		CodeEntityContext _localctx = new CodeEntityContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_codeEntity);
		try {
			setState(152);
			switch (_input.LA(1)) {
			case Comment:
			case LineComment:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				someComment();
				}
				break;
			case SwitchSymbol:
			case WhileSymbol:
			case IfSymbol:
			case DoSymbol:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				flowControl();
				}
				break;
			case FunctionTypeSymbol:
			case CreateSymbol:
			case MyClassSymbol:
			case ReturnSymbol:
			case IdFirstLargeAlpha:
			case ContinueSymbol:
			case BreakSymbol:
			case TrueSymbol:
			case FalseSymbol:
			case IdFirstSmallAlpha:
			case Text:
			case Character:
			case Real:
			case IntegerTimesTenRaisedToThePowerOf:
			case LPar:
			case LBrace:
			case LSquareBracket:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				codeEntityEndStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeEntityEndStatementContext extends ParserRuleContext {
		public TerminalNode EndStatSymbol() { return getToken(IberusParser.EndStatSymbol, 0); }
		public TerminalNode ContinueSymbol() { return getToken(IberusParser.ContinueSymbol, 0); }
		public TerminalNode BreakSymbol() { return getToken(IberusParser.BreakSymbol, 0); }
		public VariableDeclarationAssignmentContext variableDeclarationAssignment() {
			return getRuleContext(VariableDeclarationAssignmentContext.class,0);
		}
		public TypedThingContext typedThing() {
			return getRuleContext(TypedThingContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CodeEntityEndStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeEntityEndStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterCodeEntityEndStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitCodeEntityEndStatement(this);
		}
	}

	public final CodeEntityEndStatementContext codeEntityEndStatement() throws RecognitionException {
		CodeEntityEndStatementContext _localctx = new CodeEntityEndStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_codeEntityEndStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(154);
				match(ContinueSymbol);
				}
				break;
			case 2:
				{
				setState(155);
				match(BreakSymbol);
				}
				break;
			case 3:
				{
				setState(156);
				variableDeclarationAssignment();
				}
				break;
			case 4:
				{
				setState(157);
				typedThing();
				}
				break;
			case 5:
				{
				setState(158);
				returnStatement();
				}
				break;
			case 6:
				{
				setState(159);
				expression();
				}
				break;
			}
			setState(162);
			match(EndStatSymbol);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode ReturnSymbol() { return getToken(IberusParser.ReturnSymbol, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(ReturnSymbol);
			setState(166);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CreateSymbol) | (1L << MyClassSymbol) | (1L << IdFirstLargeAlpha) | (1L << TrueSymbol) | (1L << FalseSymbol) | (1L << IdFirstSmallAlpha) | (1L << Text) | (1L << Character) | (1L << Real) | (1L << IntegerTimesTenRaisedToThePowerOf) | (1L << LPar) | (1L << LBrace) | (1L << LSquareBracket))) != 0)) {
				{
				setState(165);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ApplContext appl() {
			return getRuleContext(ApplContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public CreationContext creation() {
			return getRuleContext(CreationContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				parenthesizedExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				variableAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				appl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				creation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesizedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitParenthesizedExpression(this);
		}
	}

	public final ParenthesizedExpressionContext parenthesizedExpression() throws RecognitionException {
		ParenthesizedExpressionContext _localctx = new ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(LPar);
			setState(179);
			expression();
			setState(180);
			match(RPar);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode IdFirstLargeAlpha() { return getToken(IberusParser.IdFirstLargeAlpha, 0); }
		public ParamsDeclContext paramsDecl() {
			return getRuleContext(ParamsDeclContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if (_la==IdFirstLargeAlpha) {
				{
				setState(182);
				match(IdFirstLargeAlpha);
				}
			}

			setState(186);
			_la = _input.LA(1);
			if (_la==LPar) {
				{
				setState(185);
				paramsDecl();
				}
			}

			setState(188);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableAssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitVariableAssignment(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			identifier();
			setState(191);
			assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public ClassCallContext classCall() {
			return getRuleContext(ClassCallContext.class,0);
		}
		public InstanceSideCallContext instanceSideCall() {
			return getRuleContext(InstanceSideCallContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_call);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				classCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				instanceSideCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCallContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(IberusParser.Dot, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParamsRealCommaSeparatedContext paramsRealCommaSeparated() {
			return getRuleContext(ParamsRealCommaSeparatedContext.class,0);
		}
		public TerminalNode MyClassSymbol() { return getToken(IberusParser.MyClassSymbol, 0); }
		public TerminalNode IdFirstLargeAlpha() { return getToken(IberusParser.IdFirstLargeAlpha, 0); }
		public ClassCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterClassCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitClassCall(this);
		}
	}

	public final ClassCallContext classCall() throws RecognitionException {
		ClassCallContext _localctx = new ClassCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_classCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !(_la==MyClassSymbol || _la==IdFirstLargeAlpha) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(198);
			match(Dot);
			setState(199);
			identifier();
			setState(200);
			paramsRealCommaSeparated();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceSideCallContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InstanceSideCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceSideCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterInstanceSideCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitInstanceSideCall(this);
		}
	}

	public final InstanceSideCallContext instanceSideCall() throws RecognitionException {
		InstanceSideCallContext _localctx = new InstanceSideCallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_instanceSideCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			identifier();
			setState(203);
			identifier();
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204);
					expression();
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApplContext extends ParserRuleContext {
		public ParamsRealCommaSeparatedContext paramsRealCommaSeparated() {
			return getRuleContext(ParamsRealCommaSeparatedContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ApplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterAppl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitAppl(this);
		}
	}

	public final ApplContext appl() throws RecognitionException {
		ApplContext _localctx = new ApplContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_appl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(210);
				identifier();
				}
				break;
			case 2:
				{
				setState(211);
				function();
				}
				break;
			}
			setState(214);
			paramsRealCommaSeparated();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreationContext extends ParserRuleContext {
		public TerminalNode CreateSymbol() { return getToken(IberusParser.CreateSymbol, 0); }
		public TerminalNode LPar() { return getToken(IberusParser.LPar, 0); }
		public TerminalNode IdFirstLargeAlpha() { return getToken(IberusParser.IdFirstLargeAlpha, 0); }
		public TerminalNode RPar() { return getToken(IberusParser.RPar, 0); }
		public CreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitCreation(this);
		}
	}

	public final CreationContext creation() throws RecognitionException {
		CreationContext _localctx = new CreationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_creation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(CreateSymbol);
			setState(217);
			match(LPar);
			setState(218);
			match(IdFirstLargeAlpha);
			setState(219);
			match(RPar);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsRealCommaSeparatedContext extends ParserRuleContext {
		public TerminalNode LPar() { return getToken(IberusParser.LPar, 0); }
		public TerminalNode RPar() { return getToken(IberusParser.RPar, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(IberusParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(IberusParser.Comma, i);
		}
		public ParamsRealCommaSeparatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsRealCommaSeparated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterParamsRealCommaSeparated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitParamsRealCommaSeparated(this);
		}
	}

	public final ParamsRealCommaSeparatedContext paramsRealCommaSeparated() throws RecognitionException {
		ParamsRealCommaSeparatedContext _localctx = new ParamsRealCommaSeparatedContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_paramsRealCommaSeparated);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(LPar);
			setState(230);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CreateSymbol) | (1L << MyClassSymbol) | (1L << IdFirstLargeAlpha) | (1L << TrueSymbol) | (1L << FalseSymbol) | (1L << IdFirstSmallAlpha) | (1L << Text) | (1L << Character) | (1L << Real) | (1L << IntegerTimesTenRaisedToThePowerOf) | (1L << LPar) | (1L << LBrace) | (1L << LSquareBracket))) != 0)) {
				{
				setState(222);
				expression();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(223);
					match(Comma);
					setState(224);
					expression();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(232);
			match(RPar);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedThingContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FunctionTypeSymbol() { return getToken(IberusParser.FunctionTypeSymbol, 0); }
		public TerminalNode IdFirstLargeAlpha() { return getToken(IberusParser.IdFirstLargeAlpha, 0); }
		public TypedThingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedThing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterTypedThing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitTypedThing(this);
		}
	}

	public final TypedThingContext typedThing() throws RecognitionException {
		TypedThingContext _localctx = new TypedThingContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typedThing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !(_la==FunctionTypeSymbol || _la==IdFirstLargeAlpha) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(235);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(IberusParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(IberusParser.RBrace, 0); }
		public List<CodeEntityContext> codeEntity() {
			return getRuleContexts(CodeEntityContext.class);
		}
		public CodeEntityContext codeEntity(int i) {
			return getRuleContext(CodeEntityContext.class,i);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitCodeBlock(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(LBrace);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Comment) | (1L << LineComment) | (1L << FunctionTypeSymbol) | (1L << CreateSymbol) | (1L << MyClassSymbol) | (1L << ReturnSymbol) | (1L << IdFirstLargeAlpha) | (1L << ContinueSymbol) | (1L << SwitchSymbol) | (1L << BreakSymbol) | (1L << TrueSymbol) | (1L << FalseSymbol) | (1L << WhileSymbol) | (1L << IfSymbol) | (1L << DoSymbol) | (1L << IdFirstSmallAlpha) | (1L << Text) | (1L << Character) | (1L << Real) | (1L << IntegerTimesTenRaisedToThePowerOf) | (1L << LPar) | (1L << LBrace) | (1L << LSquareBracket))) != 0)) {
				{
				{
				setState(238);
				codeEntity();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlowControlContext extends ParserRuleContext {
		public AIfContext aIf() {
			return getRuleContext(AIfContext.class,0);
		}
		public AWhileContext aWhile() {
			return getRuleContext(AWhileContext.class,0);
		}
		public DoWhileContext doWhile() {
			return getRuleContext(DoWhileContext.class,0);
		}
		public ASwitchContext aSwitch() {
			return getRuleContext(ASwitchContext.class,0);
		}
		public FlowControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flowControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterFlowControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitFlowControl(this);
		}
	}

	public final FlowControlContext flowControl() throws RecognitionException {
		FlowControlContext _localctx = new FlowControlContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_flowControl);
		try {
			setState(250);
			switch (_input.LA(1)) {
			case IfSymbol:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				aIf();
				}
				break;
			case WhileSymbol:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				aWhile();
				}
				break;
			case DoSymbol:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				doWhile();
				}
				break;
			case SwitchSymbol:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				aSwitch();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ASwitchContext extends ParserRuleContext {
		public TerminalNode SwitchSymbol() { return getToken(IberusParser.SwitchSymbol, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBrace() { return getToken(IberusParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(IberusParser.RBrace, 0); }
		public List<NormalCaseContext> normalCase() {
			return getRuleContexts(NormalCaseContext.class);
		}
		public NormalCaseContext normalCase(int i) {
			return getRuleContext(NormalCaseContext.class,i);
		}
		public DefaultCaseContext defaultCase() {
			return getRuleContext(DefaultCaseContext.class,0);
		}
		public ASwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aSwitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterASwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitASwitch(this);
		}
	}

	public final ASwitchContext aSwitch() throws RecognitionException {
		ASwitchContext _localctx = new ASwitchContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_aSwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(SwitchSymbol);
			setState(253);
			expression();
			setState(254);
			match(LBrace);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CreateSymbol) | (1L << MyClassSymbol) | (1L << IdFirstLargeAlpha) | (1L << TrueSymbol) | (1L << FalseSymbol) | (1L << IdFirstSmallAlpha) | (1L << Text) | (1L << Character) | (1L << Real) | (1L << IntegerTimesTenRaisedToThePowerOf) | (1L << LPar) | (1L << LBrace) | (1L << LSquareBracket))) != 0)) {
				{
				{
				setState(255);
				normalCase();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(261);
				defaultCase();
				}
			}

			setState(264);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalCaseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SomeCodeContext someCode() {
			return getRuleContext(SomeCodeContext.class,0);
		}
		public NormalCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterNormalCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitNormalCase(this);
		}
	}

	public final NormalCaseContext normalCase() throws RecognitionException {
		NormalCaseContext _localctx = new NormalCaseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_normalCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			expression();
			setState(267);
			match(T__0);
			setState(268);
			someCode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultCaseContext extends ParserRuleContext {
		public SomeCodeContext someCode() {
			return getRuleContext(SomeCodeContext.class,0);
		}
		public DefaultCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterDefaultCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitDefaultCase(this);
		}
	}

	public final DefaultCaseContext defaultCase() throws RecognitionException {
		DefaultCaseContext _localctx = new DefaultCaseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_defaultCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__0);
			setState(271);
			someCode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileContext extends ParserRuleContext {
		public TerminalNode DoSymbol() { return getToken(IberusParser.DoSymbol, 0); }
		public SomeCodeContext someCode() {
			return getRuleContext(SomeCodeContext.class,0);
		}
		public TerminalNode WhileSymbol() { return getToken(IberusParser.WhileSymbol, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public DoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitDoWhile(this);
		}
	}

	public final DoWhileContext doWhile() throws RecognitionException {
		DoWhileContext _localctx = new DoWhileContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_doWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(DoSymbol);
			setState(274);
			someCode();
			setState(275);
			match(WhileSymbol);
			setState(276);
			condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AWhileContext extends ParserRuleContext {
		public TerminalNode WhileSymbol() { return getToken(IberusParser.WhileSymbol, 0); }
		public ConditionThenSomeCodeContext conditionThenSomeCode() {
			return getRuleContext(ConditionThenSomeCodeContext.class,0);
		}
		public AWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterAWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitAWhile(this);
		}
	}

	public final AWhileContext aWhile() throws RecognitionException {
		AWhileContext _localctx = new AWhileContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_aWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(WhileSymbol);
			setState(279);
			conditionThenSomeCode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AIfContext extends ParserRuleContext {
		public TerminalNode IfSymbol() { return getToken(IberusParser.IfSymbol, 0); }
		public ConditionThenSomeCodeContext conditionThenSomeCode() {
			return getRuleContext(ConditionThenSomeCodeContext.class,0);
		}
		public List<ElseIfContext> elseIf() {
			return getRuleContexts(ElseIfContext.class);
		}
		public ElseIfContext elseIf(int i) {
			return getRuleContext(ElseIfContext.class,i);
		}
		public AElseContext aElse() {
			return getRuleContext(AElseContext.class,0);
		}
		public AIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterAIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitAIf(this);
		}
	}

	public final AIfContext aIf() throws RecognitionException {
		AIfContext _localctx = new AIfContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_aIf);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(IfSymbol);
			setState(282);
			conditionThenSomeCode();
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(283);
					elseIf();
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(289);
				aElse();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfContext extends ParserRuleContext {
		public TerminalNode ElseIfSymbol() { return getToken(IberusParser.ElseIfSymbol, 0); }
		public ConditionThenSomeCodeContext conditionThenSomeCode() {
			return getRuleContext(ConditionThenSomeCodeContext.class,0);
		}
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitElseIf(this);
		}
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_elseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(ElseIfSymbol);
			setState(293);
			conditionThenSomeCode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AElseContext extends ParserRuleContext {
		public TerminalNode ElseSymbol() { return getToken(IberusParser.ElseSymbol, 0); }
		public SomeCodeContext someCode() {
			return getRuleContext(SomeCodeContext.class,0);
		}
		public AElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterAElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitAElse(this);
		}
	}

	public final AElseContext aElse() throws RecognitionException {
		AElseContext _localctx = new AElseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_aElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(ElseSymbol);
			setState(296);
			someCode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public VariableDeclarationAssignmentContext variableDeclarationAssignment() {
			return getRuleContext(VariableDeclarationAssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitBooleanExpression(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_booleanExpression);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				variableDeclarationAssignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				booleanLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsDeclContext extends ParserRuleContext {
		public TerminalNode LPar() { return getToken(IberusParser.LPar, 0); }
		public TypedThingContext typedThing() {
			return getRuleContext(TypedThingContext.class,0);
		}
		public TerminalNode RPar() { return getToken(IberusParser.RPar, 0); }
		public List<NotFirstParamDeclContext> notFirstParamDecl() {
			return getRuleContexts(NotFirstParamDeclContext.class);
		}
		public NotFirstParamDeclContext notFirstParamDecl(int i) {
			return getRuleContext(NotFirstParamDeclContext.class,i);
		}
		public ParamsDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterParamsDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitParamsDecl(this);
		}
	}

	public final ParamsDeclContext paramsDecl() throws RecognitionException {
		ParamsDeclContext _localctx = new ParamsDeclContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_paramsDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(LPar);
			setState(304);
			typedThing();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(305);
				notFirstParamDecl();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(RPar);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotFirstParamDeclContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(IberusParser.Comma, 0); }
		public TypedThingContext typedThing() {
			return getRuleContext(TypedThingContext.class,0);
		}
		public NotFirstParamDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notFirstParamDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterNotFirstParamDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitNotFirstParamDecl(this);
		}
	}

	public final NotFirstParamDeclContext notFirstParamDecl() throws RecognitionException {
		NotFirstParamDeclContext _localctx = new NotFirstParamDeclContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_notFirstParamDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(Comma);
			setState(314);
			typedThing();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IdFirstLargeAlpha() { return getToken(IberusParser.IdFirstLargeAlpha, 0); }
		public TerminalNode IdFirstSmallAlpha() { return getToken(IberusParser.IdFirstSmallAlpha, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !(_la==IdFirstLargeAlpha || _la==IdFirstSmallAlpha) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Real() { return getToken(IberusParser.Real, 0); }
		public TerminalNode IntegerTimesTenRaisedToThePowerOf() { return getToken(IberusParser.IntegerTimesTenRaisedToThePowerOf, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode Text() { return getToken(IberusParser.Text, 0); }
		public TerminalNode Character() { return getToken(IberusParser.Character, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_literal);
		try {
			setState(324);
			switch (_input.LA(1)) {
			case Real:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(Real);
				}
				break;
			case IntegerTimesTenRaisedToThePowerOf:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(IntegerTimesTenRaisedToThePowerOf);
				}
				break;
			case TrueSymbol:
			case FalseSymbol:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				booleanLiteral();
				}
				break;
			case Text:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				match(Text);
				}
				break;
			case Character:
				enterOuterAlt(_localctx, 5);
				{
				setState(322);
				match(Character);
				}
				break;
			case LSquareBracket:
				enterOuterAlt(_localctx, 6);
				{
				setState(323);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TrueSymbol() { return getToken(IberusParser.TrueSymbol, 0); }
		public TerminalNode FalseSymbol() { return getToken(IberusParser.FalseSymbol, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_la = _input.LA(1);
			if ( !(_la==TrueSymbol || _la==FalseSymbol) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LSquareBracket() { return getToken(IberusParser.LSquareBracket, 0); }
		public TerminalNode RSquareBracket() { return getToken(IberusParser.RSquareBracket, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(IberusParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(IberusParser.Comma, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IberusListener ) ((IberusListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(LSquareBracket);
			setState(337);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CreateSymbol) | (1L << MyClassSymbol) | (1L << IdFirstLargeAlpha) | (1L << TrueSymbol) | (1L << FalseSymbol) | (1L << IdFirstSmallAlpha) | (1L << Text) | (1L << Character) | (1L << Real) | (1L << IntegerTimesTenRaisedToThePowerOf) | (1L << LPar) | (1L << LBrace) | (1L << LSquareBracket))) != 0)) {
				{
				setState(329);
				expression();
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(330);
					match(Comma);
					setState(331);
					expression();
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(339);
			match(RSquareBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u0158\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4j\n\4\f\4\16\4m\13\4\3\4\3\4\3\5\3\5\5\5s\n\5\3\6\3\6\5\6"+
		"w\n\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\5\n\u0086\n"+
		"\n\3\n\5\n\u0089\n\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\5"+
		"\r\u0096\n\r\3\16\3\16\3\16\5\16\u009b\n\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00a3\n\17\3\17\3\17\3\20\3\20\5\20\u00a9\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00b3\n\21\3\22\3\22\3\22\3\22\3\23\5\23"+
		"\u00ba\n\23\3\23\5\23\u00bd\n\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\5"+
		"\25\u00c6\n\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u00d0\n\27"+
		"\f\27\16\27\u00d3\13\27\3\30\3\30\5\30\u00d7\n\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00e4\n\32\f\32\16\32\u00e7\13"+
		"\32\5\32\u00e9\n\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\7\34\u00f2\n\34"+
		"\f\34\16\34\u00f5\13\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u00fd\n\35"+
		"\3\36\3\36\3\36\3\36\7\36\u0103\n\36\f\36\16\36\u0106\13\36\3\36\5\36"+
		"\u0109\n\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3#\3#\3#\7#\u011f\n#\f#\16#\u0122\13#\3#\5#\u0125\n#\3$\3$\3"+
		"$\3%\3%\3%\3&\3&\3&\5&\u0130\n&\3\'\3\'\3\'\7\'\u0135\n\'\f\'\16\'\u0138"+
		"\13\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\5*\u0147\n*\3+\3+\3,\3"+
		",\3,\3,\7,\u014f\n,\f,\16,\u0152\13,\5,\u0154\n,\3,\3,\3,\2\2-\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2"+
		"\7\3\2\4\5\4\2\n\n\r\r\4\2\7\7\r\r\4\2\r\r\31\31\3\2\21\22\u015f\2]\3"+
		"\2\2\2\4`\3\2\2\2\6b\3\2\2\2\br\3\2\2\2\nv\3\2\2\2\fz\3\2\2\2\16}\3\2"+
		"\2\2\20\u0080\3\2\2\2\22\u0085\3\2\2\2\24\u008c\3\2\2\2\26\u008f\3\2\2"+
		"\2\30\u0095\3\2\2\2\32\u009a\3\2\2\2\34\u00a2\3\2\2\2\36\u00a6\3\2\2\2"+
		" \u00b2\3\2\2\2\"\u00b4\3\2\2\2$\u00b9\3\2\2\2&\u00c0\3\2\2\2(\u00c5\3"+
		"\2\2\2*\u00c7\3\2\2\2,\u00cc\3\2\2\2.\u00d6\3\2\2\2\60\u00da\3\2\2\2\62"+
		"\u00df\3\2\2\2\64\u00ec\3\2\2\2\66\u00ef\3\2\2\28\u00fc\3\2\2\2:\u00fe"+
		"\3\2\2\2<\u010c\3\2\2\2>\u0110\3\2\2\2@\u0113\3\2\2\2B\u0118\3\2\2\2D"+
		"\u011b\3\2\2\2F\u0126\3\2\2\2H\u0129\3\2\2\2J\u012f\3\2\2\2L\u0131\3\2"+
		"\2\2N\u013b\3\2\2\2P\u013e\3\2\2\2R\u0146\3\2\2\2T\u0148\3\2\2\2V\u014a"+
		"\3\2\2\2X\\\5\4\3\2Y\\\5\b\5\2Z\\\5\6\4\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2"+
		"\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\3\3\2\2\2_]\3\2\2\2`a\t\2\2\2a\5\3"+
		"\2\2\2bc\7\13\2\2cd\7\r\2\2de\7\6\2\2ek\7\r\2\2fj\5\4\3\2gj\5\20\t\2h"+
		"j\5\b\5\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2"+
		"ln\3\2\2\2mk\3\2\2\2no\7*\2\2o\7\3\2\2\2ps\5\22\n\2qs\5\n\6\2rp\3\2\2"+
		"\2rq\3\2\2\2s\t\3\2\2\2tw\5\f\7\2uw\5\64\33\2vt\3\2\2\2vu\3\2\2\2wx\3"+
		"\2\2\2xy\7)\2\2y\13\3\2\2\2z{\5\64\33\2{|\5\16\b\2|\r\3\2\2\2}~\7 \2\2"+
		"~\177\5 \21\2\177\17\3\2\2\2\u0080\u0081\7\b\2\2\u0081\u0082\5\b\5\2\u0082"+
		"\21\3\2\2\2\u0083\u0086\5\64\33\2\u0084\u0086\5P)\2\u0085\u0083\3\2\2"+
		"\2\u0085\u0084\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0089\5L\'\2\u0088\u0087"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\5\66\34\2"+
		"\u008b\23\3\2\2\2\u008c\u008d\5\26\f\2\u008d\u008e\5\30\r\2\u008e\25\3"+
		"\2\2\2\u008f\u0090\7#\2\2\u0090\u0091\5J&\2\u0091\u0092\7$\2\2\u0092\27"+
		"\3\2\2\2\u0093\u0096\5\66\34\2\u0094\u0096\5\32\16\2\u0095\u0093\3\2\2"+
		"\2\u0095\u0094\3\2\2\2\u0096\31\3\2\2\2\u0097\u009b\5\4\3\2\u0098\u009b"+
		"\58\35\2\u0099\u009b\5\34\17\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2"+
		"\u009a\u0099\3\2\2\2\u009b\33\3\2\2\2\u009c\u00a3\7\16\2\2\u009d\u00a3"+
		"\7\20\2\2\u009e\u00a3\5\f\7\2\u009f\u00a3\5\64\33\2\u00a0\u00a3\5\36\20"+
		"\2\u00a1\u00a3\5 \21\2\u00a2\u009c\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009e"+
		"\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\7)\2\2\u00a5\35\3\2\2\2\u00a6\u00a8\7\f\2\2"+
		"\u00a7\u00a9\5 \21\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\37"+
		"\3\2\2\2\u00aa\u00b3\5\"\22\2\u00ab\u00b3\5$\23\2\u00ac\u00b3\5&\24\2"+
		"\u00ad\u00b3\5P)\2\u00ae\u00b3\5.\30\2\u00af\u00b3\5(\25\2\u00b0\u00b3"+
		"\5\60\31\2\u00b1\u00b3\5R*\2\u00b2\u00aa\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2"+
		"\u00ac\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3!\3\2\2\2\u00b4\u00b5"+
		"\7#\2\2\u00b5\u00b6\5 \21\2\u00b6\u00b7\7$\2\2\u00b7#\3\2\2\2\u00b8\u00ba"+
		"\7\r\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb"+
		"\u00bd\5L\'\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\5\66\34\2\u00bf%\3\2\2\2\u00c0\u00c1\5P)\2\u00c1\u00c2"+
		"\5\16\b\2\u00c2\'\3\2\2\2\u00c3\u00c6\5*\26\2\u00c4\u00c6\5,\27\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6)\3\2\2\2\u00c7\u00c8\t\3\2\2"+
		"\u00c8\u00c9\7!\2\2\u00c9\u00ca\5P)\2\u00ca\u00cb\5\62\32\2\u00cb+\3\2"+
		"\2\2\u00cc\u00cd\5P)\2\u00cd\u00d1\5P)\2\u00ce\u00d0\5 \21\2\u00cf\u00ce"+
		"\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"-\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\5P)\2\u00d5\u00d7\5$\23\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\5\62"+
		"\32\2\u00d9/\3\2\2\2\u00da\u00db\7\t\2\2\u00db\u00dc\7#\2\2\u00dc\u00dd"+
		"\7\r\2\2\u00dd\u00de\7$\2\2\u00de\61\3\2\2\2\u00df\u00e8\7#\2\2\u00e0"+
		"\u00e5\5 \21\2\u00e1\u00e2\7\"\2\2\u00e2\u00e4\5 \21\2\u00e3\u00e1\3\2"+
		"\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7$\2\2\u00eb\63\3\2\2\2\u00ec\u00ed"+
		"\t\4\2\2\u00ed\u00ee\5P)\2\u00ee\65\3\2\2\2\u00ef\u00f3\7%\2\2\u00f0\u00f2"+
		"\5\32\16\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2"+
		"\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7"+
		"\7&\2\2\u00f7\67\3\2\2\2\u00f8\u00fd\5D#\2\u00f9\u00fd\5B\"\2\u00fa\u00fd"+
		"\5@!\2\u00fb\u00fd\5:\36\2\u00fc\u00f8\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd9\3\2\2\2\u00fe\u00ff\7\17\2\2"+
		"\u00ff\u0100\5 \21\2\u0100\u0104\7%\2\2\u0101\u0103\5<\37\2\u0102\u0101"+
		"\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\5> \2\u0108\u0107\3\2\2"+
		"\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7&\2\2\u010b;\3"+
		"\2\2\2\u010c\u010d\5 \21\2\u010d\u010e\7\3\2\2\u010e\u010f\5\30\r\2\u010f"+
		"=\3\2\2\2\u0110\u0111\7\3\2\2\u0111\u0112\5\30\r\2\u0112?\3\2\2\2\u0113"+
		"\u0114\7\30\2\2\u0114\u0115\5\30\r\2\u0115\u0116\7\23\2\2\u0116\u0117"+
		"\5\26\f\2\u0117A\3\2\2\2\u0118\u0119\7\23\2\2\u0119\u011a\5\24\13\2\u011a"+
		"C\3\2\2\2\u011b\u011c\7\27\2\2\u011c\u0120\5\24\13\2\u011d\u011f\5F$\2"+
		"\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0125\5H%\2\u0124"+
		"\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125E\3\2\2\2\u0126\u0127\7\24\2\2"+
		"\u0127\u0128\5\24\13\2\u0128G\3\2\2\2\u0129\u012a\7\25\2\2\u012a\u012b"+
		"\5\30\r\2\u012bI\3\2\2\2\u012c\u0130\5\f\7\2\u012d\u0130\5 \21\2\u012e"+
		"\u0130\5T+\2\u012f\u012c\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2"+
		"\2\u0130K\3\2\2\2\u0131\u0132\7#\2\2\u0132\u0136\5\64\33\2\u0133\u0135"+
		"\5N(\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7$"+
		"\2\2\u013aM\3\2\2\2\u013b\u013c\7\"\2\2\u013c\u013d\5\64\33\2\u013dO\3"+
		"\2\2\2\u013e\u013f\t\5\2\2\u013fQ\3\2\2\2\u0140\u0147\7\35\2\2\u0141\u0147"+
		"\7\36\2\2\u0142\u0147\5T+\2\u0143\u0147\7\33\2\2\u0144\u0147\7\34\2\2"+
		"\u0145\u0147\5V,\2\u0146\u0140\3\2\2\2\u0146\u0141\3\2\2\2\u0146\u0142"+
		"\3\2\2\2\u0146\u0143\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147"+
		"S\3\2\2\2\u0148\u0149\t\6\2\2\u0149U\3\2\2\2\u014a\u0153\7\'\2\2\u014b"+
		"\u0150\5 \21\2\u014c\u014d\7\"\2\2\u014d\u014f\5 \21\2\u014e\u014c\3\2"+
		"\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u014b\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7(\2\2\u0156W\3\2\2\2![]ikrv\u0085"+
		"\u0088\u0095\u009a\u00a2\u00a8\u00b2\u00b9\u00bc\u00c5\u00d1\u00d6\u00e5"+
		"\u00e8\u00f3\u00fc\u0104\u0108\u0120\u0124\u012f\u0136\u0146\u0150\u0153";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}