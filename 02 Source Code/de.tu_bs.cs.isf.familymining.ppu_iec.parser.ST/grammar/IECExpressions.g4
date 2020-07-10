grammar IECExpressions;

import IECBase;

//------- EXPRESSIONS ---------------------------------------------------------------------
expression 
	: xor_expression (or_operator xor_expression)*
	;
or_operator
	: OR_OPERATOR
	;
OR_OPERATOR
	: OR
	;
xor_expression 
	: and_expression (xor_operator and_expression)*
	;
xor_operator
	: XOR_OPERATOR
	;
XOR_OPERATOR
	: XOR
	;
and_expression 	
	: comparison (and_operator comparison)*
	;
and_operator
	: AND_OPERATOR
	;
AND_OPERATOR
	: AND 
	| AMP
	;
comparison 
	: equ_expression (equ_operator equ_expression)*
	;
equ_operator
	: EQUALITY_OPERATOR
	;
EQUALITY_OPERATOR 
	: EQUAL
	| UNEQUAL
	;
equ_expression 
	: add_expression (comparison_operator add_expression)*
	;
comparison_operator 
	: COMPARISON_OPERATOR
	;
COMPARISON_OPERATOR
	: LT EQUAL?
	| GT EQUAL?
	;
add_expression 
	: term (add_operator term)*
	;
add_operator
	: PLUS
	| MINUS
	;

term
	: power_expression (multiply_operator power_expression)*
	;
multiply_operator
	: MULTIPLY_OPERATOR
	;
MULTIPLY_OPERATOR 
	: TIMES
	| SLASH
	| MOD
	;
power_expression 
	: unary_expression (POWER_OPERATOR unary_expression)*
	;
POWER_OPERATOR
	: TIMES TIMES
	;
unary_expression 
	: unary_operator? primary_expression
	;
unary_operator 
	: MINUS
	| PLUS
	| NOT
	;

primary_expression: constant 
	| variable 
	| ENUMERATED_VALUE 
	| LPARENT expression RPARENT 
	| function_call
	| subrange
	;
//---------------------------------------------------------------------------------------

//------- FUNCTION CALL -----------------------------------------------------------------
function_call 
	: function_name LPARENT parameter_list? RPARENT
	;
parameter_list 
	: param_assignment (COMMA param_assignment )*
	;
function_name 
	: IDENTIFIER
	;
param_assignment 
	: ((variable ASSIGN)? expression)
	;
  //| (('NOT')? variable '=>' variable);
//---------------------------------------------------------------------------------------

//------- VARIABLE REFERENCING ---------------------------------------------------------------------
variable 
	: direct_variable 
	| symbolic_variable
	;
variable_name
	: IDENTIFIER
	;
direct_variable 
	: DIRECT_VAR 
	;

// --> to eliminate left-recursion we needed to change the actual production rule
symbolic_variable 
	: variable_name symbolic_variable_helper?
	;
symbolic_variable_helper
	: array_variable 
	| structured_variable
	;
array_variable 
	: LSQR_BRACKET expression (COMMA expression)* RSQR_BRACKET symbolic_variable_helper?
	; 
structured_variable 
	: DOT variable_name symbolic_variable_helper?
	; 
// --------------------------------------------------------------------------------------
