lexer grammar InternalOCLstdlib;
@header {
package org.eclipse.ocl.examples.xtext.oclstdlib.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : '*' ;
T12 : 'conformsTo' ;
T13 : 'extends' ;
T14 : 'import' ;
T15 : 'iteration' ;
T16 : 'library' ;
T17 : 'operation' ;
T18 : 'package' ;
T19 : 'property' ;
T20 : 'static' ;
T21 : 'super' ;
T22 : 'type' ;
T23 : '+' ;
T24 : '?' ;
T25 : '{' ;
T26 : '}' ;
T27 : ':' ;
T28 : '<' ;
T29 : '>' ;
T30 : ',' ;
T31 : '(' ;
T32 : ')' ;
T33 : '=>' ;
T34 : ';' ;
T35 : '[' ;
T36 : ']' ;
T37 : '..' ;
T38 : '::' ;
T39 : '&&' ;
T40 : '...' ;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 4248
RULE_DOUBLE_QUOTED_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 4250
RULE_SINGLE_QUOTED_STRING : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 4252
RULE_ID_TERMINAL : (('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'_' RULE_SINGLE_QUOTED_STRING);

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 4254
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 4256
RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 4258
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclstdlib.ui/src-gen/org/eclipse/ocl/examples/xtext/oclstdlib/ui/contentassist/antlr/internal/InternalOCLstdlib.g" 4260
RULE_INT : ('0'..'9')+;

