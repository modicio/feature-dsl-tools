/*
 * generated by Xtext 2.30.0
 */
lexer grammar InternalFeatureLangLexer;

@header {
package de.tud.st.featurelang.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

Associations : ('A'|'a')('S'|'s')('S'|'s')('O'|'o')('C'|'c')('I'|'i')('A'|'a')('T'|'t')('I'|'i')('O'|'o')('N'|'n')('S'|'s');

Attribute : ('A'|'a')('T'|'t')('T'|'t')('R'|'r')('I'|'i')('B'|'b')('U'|'u')('T'|'t')('E'|'e');

Existing : ('E'|'e')('X'|'x')('I'|'i')('S'|'s')('T'|'t')('I'|'i')('N'|'n')('G'|'g');

Inherit : ('I'|'i')('N'|'n')('H'|'h')('E'|'e')('R'|'r')('I'|'i')('T'|'t');

Called : ('C'|'c')('A'|'a')('L'|'l')('L'|'l')('E'|'e')('D'|'d');

Number : ('N'|'n')('U'|'u')('M'|'m')('B'|'b')('E'|'e')('R'|'r');

Phrase : ('P'|'p')('H'|'h')('R'|'r')('A'|'a')('S'|'s')('E'|'e');

Should : ('S'|'s')('H'|'h')('O'|'o')('U'|'u')('L'|'l')('D'|'d');

Class : ('C'|'c')('L'|'l')('A'|'a')('S'|'s')('S'|'s');

Exist : ('E'|'e')('X'|'x')('I'|'i')('S'|'s')('T'|'t');

Other : ('O'|'o')('T'|'t')('H'|'h')('E'|'e')('R'|'r');

From : ('F'|'f')('R'|'r')('O'|'o')('M'|'m');

Have : ('H'|'h')('A'|'a')('V'|'v')('E'|'e');

Must : ('M'|'m')('U'|'u')('S'|'s')('T'|'t');

Time : ('T'|'t')('I'|'i')('M'|'m')('E'|'e');

Has : ('H'|'h')('A'|'a')('S'|'s');

Not : ('N'|'n')('O'|'o')('T'|'t');

The : ('T'|'t')('H'|'h')('E'|'e');

An : ('A'|'a')('N'|'n');

Be : ('B'|'b')('E'|'e');

Is : ('I'|'i')('S'|'s');

It : ('I'|'i')('T'|'t');

To : ('T'|'t')('O'|'o');

FullStop : '.';

A : ('A'|'a');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
