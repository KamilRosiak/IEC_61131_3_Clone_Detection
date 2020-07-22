# IEC_61131_3_Clone_Detection
![alt text](https://github.com/TUBS-ISF/IEC_61131_3_Clone_Detection/05 Images/configuration_meta_model.png ?raw=true)
![Alt text](05 Images/configuration_meta_model.png?raw=true "Title")




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
| FunctionCall Parameter Types  | Structured Text Impl | Compares the parameter types of two function calls|
| FunctionCall Parameter Names  | Structured Text Impl | Compares the parameter names of two function calls|
| FunctionCall Name  | Structured Text Impl | Compares the names of two function calls|
| Assignment Left Side Name  | Structured Text Impl | Compares the names of two assigned variables|
| Assignment Left Side Type  | Structured Text Impl | Compares the types of two assigned variables|
| Assignment Right Side  | Structured Text Impl | Compares the expression on the right side of a assignment|
| If-Condition  | Structured Text Impl | Compares the conditions of two If statements|
| While-Condition  | Structured Text Impl | Compares the conditions of two while statements|
| For-Condition  | Structured Text Impl | Compares the conditions of two for statements|
| Case-Condition  | Structured Text Impl | Compares the conditions of two case statements|
| Exit or Return  | Structured Text Impl | Compares exit and return statements|
| Type of Transition  | Sequential Function Chart |  Compares the type of transitions (condition or jump)|
| Number of Transitions  | Sequential Function Chart | Compares the total number of transitions of an SFC |
| Names of Actions  | Sequential Function Chart | Compares the names of all actions of an SFC|
| Names of Steps | Sequential Function Chart |Compare the names of all steps |
| Number of Actions  | Sequential Function Chart | Compares the numer of actions of an SFC|
| Number of Steps  | Sequential Function Chart | Compares the numer of steps of an SFC|
| Qualifier of Steps  | Sequential Function Chart |Compares the qualifier of steps of an SFC |
| Step Name Compare  | Sequential Function Chart Impl |Compares the names of two steps |
| Step Name Compare  | Sequential Function Chart Impl | Compares the names of two steps |
| Step Activity Compare  | Sequential Function Chart Impl | Compares the activity status of two steps|
| Step Linked Variable Compare  | Sequential Function Chart Impl |Compares the the linked variables of two steps |
| Step In Transition Compare | Sequential Function Chart Impl |Compares the incomming transitions of two steps |
| Step Out Transition Compare | Sequential Function Chart Impl |Compares the outgoing transitions of two steps |
| Step Level Compare | Sequential Function Chart Impl |Compares the level of two steps |
| Number of Coils | Ladder Diagram |Compares the number of coils in a LD|
| Contact Expression | Ladder Diagram Impl |Compares the expression of two contacts|
| Power Rail | Ladder Diagram Impl | Assigns the left and right power rail a mandatory value|
| Target Elements| Ladder Diagram Impl | Compares the types of all outgoing elements|
| Source Elements | Ladder Diagram Impl | Compares the types of all incomming elements|
| Coil Expression | Ladder Diagram Impl | Compares the expression of two coils|
| Block Name Compare| Function Block Diagram Impl | Compares the names of two Function Blocks|
| Block Type Compare| Function Block Diagram Impl | Compares the types of two Function Blocks|
| Block Input Elements| Function Block Diagram Impl | Compares the input elements of two Function Blocks|
| Block Output Elements| Function Block Diagram Impl |Compares the output elements of two Function Blocks|
| Block Input Ports| Function Block Diagram Impl | Compares the input ports of two Function Blocks|
| Block Output Ports| Function Block Diagram Impl | Compares the output ports of two Function Blocks|
| Block Level| Function Block Diagram Impl | Compares the level of two Function Blocks|

List of Optons that can be selected in a comparison metric.
| Option Name  | Option Level | Option Description |
| ------------- | ------------- |------------------|
| Compare POUs | Configuration |When activated POUs will be compared|
| Compare Global Variables | Configuration |When activated globale Variables will be compared|
| Compare POU implementation | POU |When activated the implementation of POUs will be compared|
| Compare POU variables | POU |When activated local POU variables will be compared|
| Compare POU actions | POU |  When activated POU actions will be compared |
| Compare Action implementation | Action |  When activated the implementation of actions will be compared |
| Compare Structured Text | Languages |  When activated ST implementations will be compared|
| Compare Structured Text Impl | Structured Text |  When activated ST implementations will be compared statement-wise|
| Compare Sequential Function Chart| Languages |  When activated SFC implementations will be compared|
| Compare Sequential Function Chart Impl | Sequential Function Chart |  When activated SFC implementations will be compared step-wise|
| Compare Action Implementation | Sequential Function Chart |  When activated the implementation of actions will be compared|
| Compare Ladder Diagram | Languages |  When activated LD implementations will be compared|
| Compare Ladder Diagram Impl| Ladder Diagram  | When activated LD implementations will be compared element-wise|
| Compare Function Blocks | Ladder Diagram  | When activated Function Block in Ladder Diagram will be compared|
| Compare Function Block Diagram | Languages |  When activated FBD implementations will be compared|
| Compare Function Block Diagram Impl |  Function Block Diagram  |  When activated FBD implementations will be compared block-wise|
| Compare Structured Text | Function Block Diagram  |  When activated ST implementations of Function Blocks will be compared|




