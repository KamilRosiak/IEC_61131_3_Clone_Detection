package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.st;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.interfaces.StatementStructure;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Assignment;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Case;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.CaseBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ConditionalBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ForLoop;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.FunctionCallStatement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.If;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.UnboundedLoop;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;

public class DefaultStatementStructure implements Serializable, StatementStructure {
	
	private static final long serialVersionUID = -7818581402737642927L;
	public static final String IF_KEY = "if";
	public static final String ELSIF_KEY = "elsif";
	public static final String ELSE_KEY = "else";
	public static final String CASE_KEY = "case";
	public static final String CASE_BLOCK_KEY = "caseblock";
	public static final String CONDITION_BLOCK_KEY = "conditionblock";
	public static final String FOR_KEY = "for";
	public static final String WHILE_KEY = "while";
	
	// expression keys
	public static final String VARIABLE_KEY = "varexpr";
	public static final String ASSIGNED_KEY = "assignedexpr";
	public static final String CONDITION_KEY = "condition";
	public static final String CASE_EXPRESSION_KEY = "caseexpr";
	public static final String FUNCTION_EXPRESSION_KEY = "functioncall";
	
	/**
	 * Returns an indexed version of the key string. Necessary when retrieving specific non-unique statement blocks via 
	 * {@link StatementStructure#ELSIF_KEY} or  {@link StatementStructure#CASE_KEY}. The key without index will retrieve 
	 * the first block of statements.
	 * 
	 * @param key one of the predefined keys
	 * @param index zero-based index
	 * @return indexed key string
	 */
	@Override
	public String getIndexedKey(String key, int index) {
		assert key.equals(IF_KEY) || key.equals(ELSIF_KEY) || key.equals(ELSE_KEY) || key.equals(CASE_KEY) 
			: "the provided key is not supported("+key+")";
		return key+"_"+index;
	}
	
	/**
	 * Returns a mapping from statement block keys to the corresponding statements. The following keys are defined:
	 * {@link StatementStructure#CONDITION_KEY}, {@link StatementStructure#ELSE_KEY} 
	 * and {@link StatementStructure#CASE_KEY}. The key without index will retrieve the first block of statements.<br>
	 * For example:<br>
	 * As for the Case type {@link #getSubstatements(Statement)} the structured map contains two lists of statements.
	 * The first list (indexed by CASE_KEY) represents the CaseBlock instances while the second one (indexed by ELSE_KEY) are the else statements.
	 * 
	 * @param s statement
	 * @return 
	 */
	@Override
	public StructuredMap<Statement> getSubstatements(Statement s) {
		Map<String, List<Statement>> labelledSubstatements = new HashMap<>();
		if (s instanceof If) {
			If ifStatement = (If) s;
			List<Statement> conditonStatements = new ArrayList<>();
			conditonStatements.addAll(ifStatement.getConditionalBlocks());
			labelledSubstatements.put(CONDITION_KEY, conditonStatements);
		} else if (s instanceof Case) {
			Case caseStatement = (Case) s;
			List<Statement> singleCaseStatements = new ArrayList<>();
			singleCaseStatements.addAll(caseStatement.getCases());
			labelledSubstatements.put(CASE_KEY, singleCaseStatements);
			labelledSubstatements.put(ELSE_KEY, caseStatement.getElseStatements());
		} else if (s instanceof CaseBlock) {
			CaseBlock caseBlock = (CaseBlock) s;
			labelledSubstatements.put(CASE_BLOCK_KEY, caseBlock.getSubstatements());
		} else if (s instanceof ConditionalBlock) {
			ConditionalBlock conditionBlock = (ConditionalBlock) s;
			labelledSubstatements.put(CONDITION_BLOCK_KEY, conditionBlock.getSubstatements());
		} else if (s instanceof UnboundedLoop) {
			UnboundedLoop unboundedLoop = (UnboundedLoop)s;
			labelledSubstatements.put(FOR_KEY, unboundedLoop.getSubstatements());
		} else if(s instanceof ForLoop) {
			ForLoop forLoop = (ForLoop)s; 
			labelledSubstatements.put(FOR_KEY, forLoop.getSubstatements());	
			
		}
		return new StructuredMap<>(labelledSubstatements);
	}
	
	public List<Statement> getSubstatementList(Statement s) {
		List<Statement> subStatement = new ArrayList<Statement>();
		if (s instanceof If) {
			If ifStatement = (If) s;
			subStatement.addAll(ifStatement.getConditionalBlocks());
		} else if (s instanceof Case) {
			Case caseStatement = (Case) s;
			subStatement.addAll(caseStatement.getCases());
		}
		return subStatement;
	}
	
	@Override
	public StructuredMap<Expression> getExpressions(Statement s) {
		Map<String, List<Expression>> labelledExpressions = new HashMap<>();
		if (s instanceof Assignment) {
			Assignment assignmentStatement = (Assignment) s;
			labelledExpressions.put(VARIABLE_KEY, Arrays.asList(assignmentStatement.getLeft()));
			if (assignmentStatement.getRight() != null) {
				labelledExpressions.put(ASSIGNED_KEY, Arrays.asList(assignmentStatement.getRight()));				
			}
		} else if (s instanceof FunctionCallStatement) {
			FunctionCallStatement functionCallStatement = (FunctionCallStatement) s;
			if (functionCallStatement.getInvokingVariable() != null) {
				labelledExpressions.put(VARIABLE_KEY, Arrays.asList(functionCallStatement.getInvokingVariable()));				
			}
			labelledExpressions.put(FUNCTION_EXPRESSION_KEY, Arrays.asList(functionCallStatement.getFunctionCall()));
		} else if (s instanceof If) {
			If ifStatement = (If) s;
			labelledExpressions.put(CONDITION_KEY, getConditions(ifStatement));
		} else if (s instanceof Case) {
			Case caseStatement = (Case) s;
			for (int i = 0; i < caseStatement.getCases().size(); i++) {
				CaseBlock cb = caseStatement.getCases().get(i);
				labelledExpressions.put(getIndexedKey(CASE_EXPRESSION_KEY, i), getCaseExpressions(cb));
			}
		}
		return new StructuredMap<>(labelledExpressions);
	}

	private List<Expression> getConditions(If ifStatement) {
		return ifStatement.getConditionalBlocks().stream()
				.map((block) -> block.getCondition())
				.filter(expr -> expr != null)
				.collect(Collectors.toList());
	}
	
	private List<Expression> getCaseExpressions(CaseBlock caseBlock) {
		return caseBlock.getCaseExpressions().stream().filter(e -> e != null).collect(Collectors.toList());
	}

}
