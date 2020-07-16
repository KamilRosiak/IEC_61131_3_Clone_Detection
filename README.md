# IEC_61131_3_Clone_Detection


List of Attributes for the comparison of IEC 61131-3 Arrtifacts
| Attribute Name  |Attribute Categorie | Attribute Description |
| ------------------- | --------- |---------------------------------------------------------|
| Number of POUs | Configuration | Calculates the normalized distance between the numer of comprised POUs |
| Names - Levenshtein Distance | Configuration | Compare the names of two projects using levenshtein distance |
| Number of POUs | Configuration | Calculates the normalized distance between the number of comprised POUs |
| Names of Global Variables | Configuration | Compares the names of global variables in both projects |
| Data Type of Global Variables | Configuration | Compares the data types of global variables in both projects |
| Number of Global Variables | Configuration | Evaluates if the projects have the same number of global variables |
| Action Name - Levenshtein Distance| Action | Compares the names of two actions using the levenshtein distance |
| Name - Complete   | POU | Compares the names of POUs for total equivalence |
| POU Implementation  | POU | Compares the implementation of POUs  |
| Number of Actions     | POU | Compares the number of actions |
| Programming Languages of a POU  | POU | Evaluates the programming languages utilized by the POUs |
| Name - Levenshtein Distance    | POU | Compares the names of two POUs using the levenshtein distance |
| Variables - Detailed    | POU | Compares the different types of variables idependently, then aggregates them all  |
| Type    | POU | Evaluates if POUs have the same type, thus, Program, Function or Function Block |
| Variables Plain | POU | Compares all types of variables idependently then aggregates them all |
| Version Number  | POU | Compares POUs by their Version Number |
| Adresses of Variables  | Variables | Compares the location of two variables |
| Variable Names - Levenshtein Distance | Variables | Compares the names of two variables using the levenshtein distance |
| Type of Variable | Variables | Compares the data type of two variables |
| Scope of Variable   | Variables | Compares the scopare of variables |
| DataLocation of Variable   | Variables | Compares the data location of variables |
| ST Number of Conditions in IF   | Structured Text | Compares the number of conditions in IF statements|
| ST Number of Conditionals  | Structured Text | Compares the number of IF, ELSE and ELSEIF in two ST implementations|
| ST Number of Operands   | Structured Text | Compares the number of Operands in two ST implementations|
| ST Number of Operators   | Structured Text | Compares the number of Operators in two ST implementations|
| ST Number of Statements   | Structured Text | Compares the number of Statements in two ST implementations|
| ST Type of Statements   | Structured Text | Compares the types of Statements in two ST implementations|



List of Optons that can be selected in a comparison metric.
| Option Name  | Option Description |
| ------------- | ------------- |
