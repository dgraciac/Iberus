grammar Iberus;

program : (someComment | entity | aClass)* ;

someComment : Comment | LineComment ;

aClass : ClassSymbol IdFirstLargeAlpha SubclassOfSymbol IdFirstLargeAlpha (someComment | classSideEntity | entity)* EndClassSymbol ;

entity : routine | variableDeclaration EndStatSymbol ;

classSideEntity : StaticSymbol entity ;

routine : (typedThing | identifier) paramsDecl? codeBlock ;

variableDeclaration : typedThing (AssignSymbol expression)? ;

conditionThenSomeCode : condition someCode ;

condition : '(' booleanExpression ')' ;

someCode : codeBlock | codeEntity ;

codeEntity : someComment | flowControl | ( ContinueSymbol | BreakSymbol | variableDeclaration | ReturnSymbol? expression? ) EndStatSymbol ;

expression : '(' expression ')'
		   | function
		   | assign 
		   | identifier
		   | appl
		   | call 
		   | creation
		   | literal
		   ;
		   
function : IdFirstLargeAlpha? paramsDecl? codeBlock ;	   

assign : identifier AssignSymbol expression ;

call : classCall | instanceSideCall ;

classCall : (MyClassSymbol | IdFirstLargeAlpha) Dot identifier paramsRealCommaSeparated ;

instanceSideCall : identifier identifier expression* ;

appl : (identifier | function) paramsRealCommaSeparated ;
		   
creation : CreateSymbol LPar IdFirstLargeAlpha RPar ;		   

paramsRealCommaSeparated : LPar ( expression (Comma expression)*)? RPar ;

typedThing : (FunctionTypeSymbol | IdFirstLargeAlpha) identifier ;

codeBlock : LBrace codeEntity* RBrace ;

flowControl : aIf | aWhile | doWhile | aSwitch;

aSwitch : SwitchSymbol expression LBrace normalCase* defaultCase? RBrace ;

normalCase : expression ':' someCode ;

defaultCase : ':' someCode ;

doWhile : DoSymbol someCode WhileSymbol condition ;

aWhile : WhileSymbol conditionThenSomeCode ;

aIf : IfSymbol conditionThenSomeCode elseIf* aElse? ;

elseIf : ElseIfSymbol conditionThenSomeCode ;

aElse : ElseSymbol someCode ;

booleanExpression : variableDeclaration | expression | booleanLiteral ;

paramsDecl : LPar typedThing (Comma typedThing)* RPar ;

identifier : IdFirstLargeAlpha | IdFirstSmallAlpha ;

Comment : '/*' .*? '*/' ;

LineComment : '//' .*? '\r'? '\n' ;

SubclassOfSymbol : 'subclassOf' ;

FunctionTypeSymbol : 'Function' ;

StaticSymbol : 'static' ;

CreateSymbol : 'Create' ;

MyClassSymbol : 'myClass' ;

ClassSymbol : 'Class' ;

ReturnSymbol : 'return' ;

IdFirstLargeAlpha : LargeAlpha AlphaDigitUnderline* ;

literal : Real | IntegerTimesTenRaisedToThePowerOf | booleanLiteral | Text | Character | array ;

booleanLiteral : TrueSymbol | FalseSymbol ;

ContinueSymbol : 'continue' ;
SwitchSymbol : 'switch' ;
BreakSymbol : 'break' ;
TrueSymbol : 'true' ;
FalseSymbol : 'false' ;
WhileSymbol : 'while' ;
ElseIfSymbol : 'else if' ;
ElseSymbol : 'else' ;
ForSymbol : 'for' ;
IfSymbol : 'if' ;
DoSymbol : 'do' ;

IdFirstSmallAlpha : SmallAlpha AlphaDigitUnderline* ;

fragment AlphaDigitUnderline : AlphaDigit | Underline ;

fragment AlphaDigit : Alpha | Digit ;

fragment Alpha : LargeAlpha | SmallAlpha ;

UnseenCharacter : [ \t\r\n]+ -> skip ;

Text : QuotationMark ( EscapeSymbol QuotationMark | ~[\u0022] )* QuotationMark ;
Character : Apostrophe ( EscapeSymbol Apostrophe | ~[\u0027] ) Apostrophe ;
array : LSquareBracket (expression (Comma expression)*)? RSquareBracket ;
			   
Real : Integer Dot Integer TimesTenRaisedToThePowerOf? ;
IntegerTimesTenRaisedToThePowerOf : Integer TimesTenRaisedToThePowerOf? ;
TimesTenRaisedToThePowerOf : (ENotationSymbol | DecimalExponentSymbol) Integer ;

AssignSymbol : '<-' ;
fragment DecimalExponentSymbol : '\u23E8' ;
fragment ENotationSymbol : [eE] ;
fragment SmallAlpha : [a-z] ;
fragment LargeAlpha : [A-Z] ;
fragment Integer : ('+'|'-')? Digit+ ;
fragment Digit : [0-9] ;
fragment Underline : '_' ;
fragment EscapeSymbol : '\\' ;
fragment QuotationMark : '\u0022' ;
fragment Apostrophe : '\u0027' ;
Dot : '.' ;
Comma : ',' ;
LPar : '(' ;
RPar : ')' ;
LBrace : '{' ;
RBrace : '}' ;
LSquareBracket : '[' ;
RSquareBracket : ']' ;
EndStatSymbol : ';' ;
EndClassSymbol : '/' ;

/*

PENDIENTE cambiar a listas heterogéneas
PENDIENTE usar funciones en if, else, while, doWhile, etc.???

PENDIENTE usar funciones para definir rutinas (el bloque)???

PENDIENTE usando funciones anónimas se puede prescindir de los for, for range, for in ??? Sí, creando arrays (a partir de enteros) y métodos que reciben funciones anónimas como parámetros.
PENDIENTE que los booleanos sean objetos??? Si sí entonces implementar ifTrue,ifFalse, ifTrueIfFalse, whileTrue, whileFalse.
PENDIENTE high order functions (map, filter, etc.)
PENDIENTE ¿cómo implementar myClass?
PENDIENTE ¿cómo implementar self? 
 
PENDIENTE rule (usar Lpar y Rpar)
PENDIENTE añadir 'then' después de los loops (como en Python(else) )

PENDIENTE reconocer más caracteres para nombres de métodos (+,-,/,*,^,!)
PENDIENTE cambiar notación de creación de objetos (es parecida a la invocación de método de clase)
PENDIENTE revisar paramateros, variables y retornos en las reglas
PENDIENTE reglas léxicas recursivas
PENDIENTE reconocer todos los caracteres unicode
PENDIENTE probar que reconoce DecimalExponentSymbol

*/
