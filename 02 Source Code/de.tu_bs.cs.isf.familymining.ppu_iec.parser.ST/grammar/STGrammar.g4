grammar STGrammar;
	
///////////////////////////////////////
// OPTION SECTION
///////////////////////////////////////

///////////////////////////////////////
// IMPORT SECTION
///////////////////////////////////////

import IECExpressions, IECBase;

///////////////////////////////////////
// ACTION SECTION
///////////////////////////////////////

///////////////////////////////////////
// STRUCTURED TEXT SPECIFIC RULES
///////////////////////////////////////

statement_list 
	: (statement)+
	;

statement 
	: NIL
	| function_call_statement SEMICOLON
	| assignment_statement SEMICOLON
	| selection_statement SEMICOLON? 
	| iteration_statement SEMICOLON?
	| exit_statement SEMICOLON
	| return_statement SEMICOLON
	;


//------- SIMPLE STATEMENT ----------------------------------------------------------
assignment_statement 
	: variable ASSIGN expression
	;

function_call_statement
	: (variable DOT)? function_call
	;

	
//------- SELECTION STATEMENTS -----------------------------------------------------------
selection_statement 
	: if_statement_block
    | case_statement_block
    ;

if_statement_block 
	: if_statement (elseif_statement)* (else_statement)? END_IF
	;

if_statement
	: IF expression THEN statement_list
	;

elseif_statement
	: ELSIF expression THEN statement_list
	;

else_statement
	: ELSE statement_list
	;

case_statement_block
	: CASE expression OF case_element+ else_statement? END_CASE
	;

case_element 
	: case_list_element (COMMA case_list_element)* COLON statement_list
	;

case_list_element
	: expression
	;

//------- ITERATION STATEMENTS -----------------------------------------------------------

iteration_statement
	: while_statement
	| for_statement
	| repeat_statement
	;
	
while_statement
	: WHILE expression DO statement_list END_WHILE 
	;
	
for_statement
	: for_header DO statement_list END_FOR
	;
	
for_header
	: FOR expression ASSIGN initial_value TO upper_bound (BY increment)?
	;
	
initial_value 
	: integer_literal
	;	

upper_bound
	: integer_literal 
	;
	
increment
	: integer_literal
	;
	
repeat_statement
	: REPEAT statement_list UNTIL expression END_REPEAT
	;	
//---------------------------------------------------------------------------------------

exit_statement
	: EXIT
	;
return_statement
	: RETURN
	;

//------- KEYWORDS ----------------------------------------------------------------------

IF
	: I F
	;
ELSIF
	: E L S I F
	;
THEN
	: T H E N
	;
ELSE
	: E L S E
	;
END_IF
	: E N D UNDERSCORE I F
	;
CASE
	: C A S E
	;
OF
	: O F
	;
END_CASE
	: E N D UNDERSCORE C A S E
	;
WHILE
	: W H I L E
	;
DO
	: D O 
	;
END_WHILE
	: E N D UNDERSCORE W H I L E
	;
FOR
	: F O R
	;
TO
	: T O 
	;
BY
	: B Y
	;
END_FOR
	: E N D UNDERSCORE F O R
	;
REPEAT
	: R E P E A T
	;
UNTIL
	: U N T I L
	;
END_REPEAT
	: E N D UNDERSCORE R E P E A T
	;
EXIT
	: E X I T
	;
RETURN
	: R E T U R N
	;