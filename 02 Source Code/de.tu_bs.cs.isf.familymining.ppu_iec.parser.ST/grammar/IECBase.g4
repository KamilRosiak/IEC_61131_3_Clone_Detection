grammar IECBase;

//------- LITERALS ---------------------------------------------------------------------
constant 
	: numeric_literal 
	| character_string 
	| time_literal 
	| bit_string
	| boolean_literal
	; 
	
// numbers 
numeric_literal 
	: integer_literal 
	| real_literal
	;
integer_literal 
	: INTEGER_LITERAL
	;
real_literal 
	: REAL_LITERAL
	; 

// time
time_literal
	: duration 
	| time_of_day 
	| date 
	| date_and_time
	;
duration
	: DURATION
	;
time_of_day
	: TIME_OF_DAY_LITERAL
	;
date
	: DATE_LITERAL
	;
date_and_time
	: DATE_AND_TIME_LITERAL
	;

// character strings
character_string 
	: single_byte_char_string
	| double_byte_char_string
	;
single_byte_char_string
	: SINGLE_BYTE_CHAR_STRING
	;
double_byte_char_string
	: DOUBLE_BYTE_CHAR_STRING
	;
bit_string
	: BIT_STRING_LITERAL
	;
boolean_literal
	: BOOLEAN_LITERAL
	;
subrange
	: constant DOT DOT constant
	;
// --------------------------------------------------------------------------------------

//------- DATA TYPES --------------------------------------------------------------------
elem_type_name 
	: numeric_type_name 
	| DATE_TYPE_NAME  
	| BIT_STRING_TYPE_NAME 
	| STRING 
	| WSTRING 
	;
numeric_type_name 
	: SIGNED_INTEGER_TYPE_NAME 
	| UNSIGNED_INTEGER_TYPE_NAME 
	| REAL_TYPE_NAME
	;
// --------------------------------------------------------------------------------------

//------- WHITESPACES HANDLING ----------------------------------------------------------
WHITESPACE
	: [ \t\n\r] -> skip
	; 
//---------------------------------------------------------------------------------------


//------- COMMENTS ----------------------------------------------------------------------
SINGLE_COMMENT
	: SLASH SLASH ~[\r\n]* -> channel(HIDDEN)
	;
MULTI_COMMENT
	: LCOMMENT (.)*? RCOMMENT -> channel(HIDDEN);
//---------------------------------------------------------------------------------------

//------- TIME --------------------------------------------------------------------------
TIME_OF_DAY_LITERAL
	: TIME_OF_DAY_PREFIX HASH DAYTIME_LITERAL // PREFIX # hour:minute:second 
	;
fragment TIME_OF_DAY_PREFIX
	: T I M E UNDERSCORE O F UNDERSCORE D A Y
	| T O D
	;
DAYTIME_LITERAL
	: UNSIGNED_INT COLON UNSIGNED_INT COLON FIXED_POINT // hour:minute:second
	; 
DURATION
	: DURATION_PREFIX HASH MINUS? INTERVAL;
fragment DURATION_PREFIX
	: T
	| T I M E
	;
INTERVAL
	: DAYS 
	| HOURS 
	| MINUTES 
	| SECONDS 
	| MILLISECONDS
	;
DAYS
	: FIXED_POINT D 
	| UNSIGNED_INT D UNDERSCORE? HOURS
	;
HOURS
	: FIXED_POINT H 
	| UNSIGNED_INT H UNDERSCORE? MINUTES
	;
MINUTES
	: FIXED_POINT M 
	| UNSIGNED_INT M UNDERSCORE? SECONDS
	;
SECONDS
	: FIXED_POINT S 
	| UNSIGNED_INT S UNDERSCORE? MILLISECONDS
	;
MILLISECONDS
	: FIXED_POINT (M S)
	;
DATE_LITERAL
	: DATE_PREFIX HASH DATE_SPECIFICATION // PREFIX # year - month - day
	; 
fragment DATE_PREFIX
	: D A T E
	| D
	;
DATE_AND_TIME_LITERAL
	: DATE_AND_TIME_PREFIX HASH DATE_SPECIFICATION MINUS DAYTIME_LITERAL // PREFIX # year - month - day - hour:minute:seconds
	;
fragment DATE_AND_TIME_PREFIX
	: D A T E UNDERSCORE A N D UNDERSCORE T I M E 
	| D T
	;
fragment DATE_SPECIFICATION
	: UNSIGNED_INT MINUS UNSIGNED_INT MINUS UNSIGNED_INT // year - month - day
	;
//---------------------------------------------------------------------------------------

//------- NUMERICAL LITERALS ------------------------------------------------------------
INTEGER_LITERAL
	: (INTEGER_LITERAL_PREFIX HASH)? INT_NUMBER 
	;
fragment INTEGER_LITERAL_PREFIX
	: SIGNED_INTEGER_TYPE_NAME 
	| UNSIGNED_INTEGER_TYPE_NAME
	;
REAL_LITERAL
	: (REAL_TYPE_NAME HASH)? SIGNED_INT DOT UNSIGNED_INT (EXPONENT)?
	;
fragment EXPONENT
	: E SIGNED_INT
	;
fragment FIXED_POINT
	: UNSIGNED_INT (DOT UNSIGNED_INT)?
	;
//---------------------------------------------------------------------------------------

//------- BOOLEAN AND BIT LITERALS ------------------------------------------------------
BOOLEAN_LITERAL 
	: BIT 
	| T R U E 
	| F A L S E 
	| B O O L HASH BIT
	;

// in bit string context - ambiguity with UNSIGNED_INT, BINARY_INT, OCT_INT and HEX_INT possible
BIT_STRING_LITERAL
	: (BIT_STRING_TYPE_NAME HASH)? INT_NUMBER
	;
//---------------------------------------------------------------------------------------

//------- DIRECT VARIABLE ---------------------------------------------------------------
// uses location and size specifier
DIRECT_VAR
	: PERCENT LOCATION_SPEC SIZE_SPEC (DOT UNSIGNED_INT)*
	; 
fragment LOCATION_SPEC
	: 'I' 
	| 'Q' 
	| 'M'
	;
fragment SIZE_SPEC
	: NIL 
	| 'X' 
	| 'B' 
	| 'W' 
	| 'D' 
	| 'L'
	;
//---------------------------------------------------------------------------------------

//------- CHARACTER STRING --------------------------------------------------------------
// uses quotes or double quotes enclosing characters
SINGLE_BYTE_CHAR_STRING
	: APOSTROPHE SINGLE_BYTE_CHAR_REPRESENTATION* APOSTROPHE
	;
fragment SINGLE_BYTE_CHAR_REPRESENTATION
	: COMMON_CHAR_REPRESENTATION 
	| DOLLAR APOSTROPHE
	| QUOTES 
	| DOLLAR HEX_DIGIT HEX_DIGIT
	;
	
DOUBLE_BYTE_CHAR_STRING
	: QUOTES DOUBLE_BYTE_CHAR_REPRESENTATION* QUOTES
	;
fragment DOUBLE_BYTE_CHAR_REPRESENTATION
	: COMMON_CHAR_REPRESENTATION 
	| DOLLAR QUOTES 
	| APOSTROPHE
	| DOLLAR HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
	;
fragment COMMON_CHAR_REPRESENTATION // ANY PRINTABLE CHAR
	: ' ' | LETTER | DIGIT
	| PLUS | MINUS | TIMES | SLASH
	| EXCLAM_POINT | PARAGRAPH | PERCENT | AMP 
	| LPARENT | RPARENT | EQUAL | QUEST_MARK | EXCLAM_POINT
	| HASH | UNDERSCORE | LT | GT | BAR | BACKSLASH 
	| DOT | COLON | SEMICOLON | COMMA | PARAGRAPH
	| LSQR_BRACKET | RSQR_BRACKET | LCURLY_BRACKET | RCURLY_BRACKET
	| DOLLAR DOLLAR | DOLLAR L | DOLLAR N | DOLLAR P | DOLLAR R | DOLLAR T
	;
//---------------------------------------------------------------------------------------

//------- DATA TYPES --------------------------------------------------------------------
SIGNED_INTEGER_TYPE_NAME
	: SINT 
	| INT 
	| DINT 
	| LINT
	;
SINT
	: 'SINT'
	;
INT 
	: 'INT'
	;
DINT
	: 'DINT'
	;
LINT
	: 'LINT'
	;
UNSIGNED_INTEGER_TYPE_NAME
	: USINT 
	| UINT
	| UDINT 
	| ULINT
	;
USINT 
	: 'USINT'
	;
UINT
	: 'UINT'
	;
UDINT
	: 'UDINT'
	;
ULINT
	: 'ULINT'
	;
REAL_TYPE_NAME
	: REAL
	| LREAL
	;
REAL
	: 'REAL'
	;
LREAL
	: 'LREAL'
	;
DATE_TYPE_NAME
	: DATE
	| TIME_OF_DAY 
	| TOD
	| DATE_AND_TIME 
	| DT
	;
DATE
	: 'DATE'
	;
TIME_OF_DAY
	: 'TIME_OF_DAY'
	;
TOD
	: 'TOD'
	;
DATE_AND_TIME
	: 'DATE_AND_TIME'
	;
DT
	: 'DT'
	;
BIT_STRING_TYPE_NAME
	: BOOL
	| BYTE 
	| WORD 
	| DWORD 
	| LWORD
	;
BOOL 
	: 'BOOL'
	;
BYTE
	: 'BYTE'
	;
WORD
	: 'WORD'
	;
DWORD
	: 'DWORD'
	;
LWORD
	: 'LWORD'
	;
WSTRING
	: 'WSTRING'
	;
STRING
	: 'STRING'
	;
//---------------------------------------------------------------------------------------

//------- SINGLE CHARACTER ATOMS --------------------------------------------------------
DOT
	: '.'
	;
COLON
	: ':'
	;
SEMICOLON
	: ';'
	;
COMMA
	: ','
	;
UNDERSCORE
	: '_'
	;
HASH
	: '#'
	;
fragment APOSTROPHE
	: '\''
	;
PLUS
	: '+'
	;
MINUS
	: '-'
	;
fragment TIMES
	: '*'
	;
fragment SLASH
	: '/'
	;
fragment MOD
	: 'MOD'
	;
fragment LCOMMENT
	: '(*'
	;
fragment RCOMMENT
	: '*)'
	;
fragment BACKSLASH
	: '\\'
	;
fragment EXCLAM_POINT
	: '!'
	;
fragment QUEST_MARK
	: '?'
	;
fragment QUOTES
	: '"'
	;
fragment PARAGRAPH
	: '§'
	;
fragment DOLLAR
	: '$'
	;
fragment PERCENT
	: '%'
	;
fragment AMP
	: '&'
	;
fragment AND
	: 'AND'
	;
BAR
	: '|'
	;
OR
	: 'OR'
	;
XOR
	: 'XOR'
	;
NOT
	: 'NOT'
	;
LPARENT
	: '('
	;
RPARENT
	: ')'
	;
LSQR_BRACKET
	: '['
	;
RSQR_BRACKET
	: ']'
	;
LCURLY_BRACKET
	: '{' 
	;
RCURLY_BRACKET
	: '}' 
	;
LT
	: '<'
	| '&lt;'
	;
GT
	: '>'
	| '&gt;'
	;
EQUAL
	: '='
	;
UNEQUAL
	: '<>'
	;
ASSIGN 
	: ':='
	;
NIL
	: 'NIL'
	;

fragment A
	: ('A' | 'a')
	;
fragment B
	: ('B' | 'b')
	;
fragment C
	: ('C' | 'c')
	;
fragment D
	: ('D' | 'd')
	;
fragment E
	: ('E' | 'e')
	;
fragment F
	: ('F' | 'f')
	;
fragment G
	: ('G' | 'g')
	;
fragment H
	: ('H' | 'h')
	;
fragment I
	: ('I' | 'i')
	;
fragment J
	: ('J' | 'j')
	;
fragment K
	: ('K' | 'k')
	;
fragment L
	: ('L' | 'l')
	;
fragment M
	: ('M' | 'm')
	;
fragment N
	: ('N' | 'n')
	;
fragment O
	: ('O' | 'o')
	;
fragment P
	: ('P' | 'p')
	;
fragment Q
	: ('Q' | 'q')
	;
fragment R
	: ('R' | 'r')
	;
fragment S
	: ('S' | 's')
	;
fragment T
	: ('T' | 't')
	;
fragment U
	: ('U' | 'u')
	;
fragment V
	: ('V' | 'v')
	;
fragment W
	: ('W' | 'w')
	;
fragment X
	: ('X' | 'x')
	;
fragment Y
	: ('Y' | 'y')
	;
fragment Z
	: ('Z' | 'z')
	;

//------- IDENTIFIER --------------------------------------------------------------------

IDENTIFIER // identifier beginning with letter or underscore
	: (LETTER | UNDERSCORE (LETTER | DIGIT)) (UNDERSCORE? (LETTER | DIGIT))* 
	;

// in enumeration context - ambiguity with IDENTIFIER possible
ENUMERATED_VALUE
	: (IDENTIFIER HASH)? IDENTIFIER
	;
//---------------------------------------------------------------------------------------

//------- NUMERICAL COMPONENTS ----------------------------------------------------------
INT_NUMBER
	: UNSIGNED_INT
	| BINARY_INT
	| OCT_INT
	| HEX_INT
	;

fragment UNSIGNED_INT
	: DIGIT (UNDERSCORE? DIGIT)* // decimal number
	;
fragment SIGNED_INT // --> allows addition and subtraction to be  
	: UNSIGNED_INT	//     performed without confusing it with sign
	;	
fragment BINARY_INT 
	: '2' HASH BIT (UNDERSCORE? BIT)* // 2 # binary number
	;
fragment OCT_INT
	: '8' HASH OCT_DIGIT (UNDERSCORE? OCT_DIGIT)* // 8 # octal number
	;
fragment HEX_INT
	: '16' HASH HEX_DIGIT (UNDERSCORE? HEX_DIGIT)* // 16 # hexadecimal number
	;
//---------------------------------------------------------------------------------------

//------- NUMERIC AND LETTER ATOMS ------------------------------------------------------
fragment UCASE_LETTER // upper case alphabetical letters
	: [A-Z]
	;
fragment LCASE_LETTER // lower case alphabetical letters
	: [a-z]
	;
fragment LETTER // alphabetical letters
	: UCASE_LETTER 
	| LCASE_LETTER
	;
fragment BIT // binaries
	: '1' | '0'
	;
fragment DIGIT // decimals
	: [0-9]
	;
fragment OCT_DIGIT // octals
	: [0-7]
	;
fragment HEX_DIGIT	// hexadecimals
	: DIGIT 
	| [A-F]
	;
//---------------------------------------------------------------------------------------
