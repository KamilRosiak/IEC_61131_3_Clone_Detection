@echo off 
title Compile Structured Text Grammar

set antlr_lib=../library/antlr-4.7.1-complete.jar
set output=../src-gen/de/tu_bs/cs/isf/familymining/ppu_iec/grammar
set package_root=de.tu_bs.cs.isf.familymining.ppu_iec.grammar

REM Compile Structured Text Grammar

CALL :compile_grammar %antlr_lib%, IECBase.g4, %output%/iecbase, %package_root%.iecbase
CALL :compile_grammar %antlr_lib%, IECExpressions.g4, %output%/iecexpressions, %package_root%.iecexpressions
CALL :compile_grammar %antlr_lib%, STGrammar.g4, %output%/st, %package_root%.st

pause
EXIT /B %ERRORLEVEL%

:compile_grammar
	REM Compile a Single Grammar File (.g4)
	::
	REM Input Parameters: 	
	REM (1) relative path to ANTLR library (2) relative path to grammar 
	REM (3) output path of the generated files (4) package specification (level0.level1.[...]) 
	
	SETLOCAL
	SET antlr_lib=%1
	SET grammar_path=%2
	SET output=%3
	SET package=%4
	
	ECHO Compile ANTLR4 Grammar "%grammar_path%" into "%output%"
	java -jar %antlr_lib% %grammar_path% -o %output% -package %package% -listener -visitor -encoding UTF-8
	
	ENDLOCAL
EXIT /B 0