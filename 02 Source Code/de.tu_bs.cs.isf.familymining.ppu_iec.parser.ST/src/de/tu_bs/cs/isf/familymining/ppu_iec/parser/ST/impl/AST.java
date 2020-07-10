package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
 
/**
 * A small class that flattens an ANTLR4 {@code ParseTree}. Given the
 * {@code ParseTree}:
 * 
 * <pre>
 * <code>
 * a
 * '-- b
 * | |
 * | '-- d
 * | |
 * | '-- e
 * | |
 * | '-- f
 * |
 * '-- c
 * </code>
 * </pre>
 * 
 * This class will flatten this structure as follows:
 * 
 * <pre>
 * <code>
 * a
 * '-- b
 * | |
 * | '-- f
 * |
 * '-- c
 * </code>
 * </pre>
 * 
 * In other word: all inner nodes that have a single child are removed from the
 * AST.
 */
public class AST {
 
	/**
	 * The payload will either be the name of the parser rule, or the token of a
	 * leaf in the tree.
	 */
	private final Object payload;
 
	/**
	 * All child nodes of this AST.
	 */
	private final List<AST> children;
 
	public AST(ParseTree tree) {
		this(null, tree);
	}
 
	private AST(AST ast, ParseTree tree) {
		this(ast, tree, new ArrayList<AST>());
	}
 
	private AST(AST parent, ParseTree tree, List<AST> children) {
 
		this.payload = getPayload(tree);
		this.children = children;
 
		if (parent == null) {
			// We're at the root of the AST, traverse down the parse tree to
			// fill
			// this AST with nodes.
			walk(tree, this);
		} else {
			parent.children.add(this);
		}
	}
 
	public Object getPayload() 
	{
		return payload;
	}
 
	public List<AST> getChildren() 
	{
		return new ArrayList<>(children);
	}
 
	// Determines the payload of this AST: a string in case it's an inner node
	// (which
	// is the name of the parser rule), or a Token in case it is a leaf node.
	private Object getPayload(ParseTree tree) {
		if (tree.getChildCount() == 0) {
			// A leaf node: return the tree's payload, which is a Token.
			return tree.getPayload();
		} else {
			// The name for parser rule `foo` will be `FooContext`. Strip
			// `Context` and
			// lower case the first character.
			String ruleName = tree.getClass().getSimpleName()
					.replace("Context", "");
			return Character.toLowerCase(ruleName.charAt(0))
					+ ruleName.substring(1);
		}
	}
 
	// Fills this AST based on the parse tree.
	private static void walk(ParseTree tree, AST ast) {
 
		if (tree.getChildCount() == 0) {
			// We've reached a leaf. We must create a new instance of an AST
			// because
			// the constructor will make sure this new instance is added to its
			// parent's
			// child nodes.
			new AST(ast, tree);
		} else if (tree.getChildCount() == 1) {
			// We've reached an inner node with a single child: we don't include this in
			// our AST.
			if (tree.getChild(0).getChildCount() == 0) {
				AST temp = new AST(ast, tree);
				if (!(temp.payload instanceof Token)) {
					// Only traverse down if the payload is not a Token.
					walk(tree.getChild(0), temp);
				}
			} else {
				walk(tree.getChild(0), ast);								
			}
		} else if (tree.getChildCount() > 1) {
 
			for (int i = 0; i < tree.getChildCount(); i++) {
 
				AST temp = new AST(ast, tree.getChild(i));
 
				if (!(temp.payload instanceof Token)) {
					// Only traverse down if the payload is not a Token.
					walk(tree.getChild(i), temp);
				}
			}
		}
	}
	
	@Override
	public String toString() {
 
		StringBuilder builder = new StringBuilder();
 
		AST ast = this;
		List<AST> firstStack = new ArrayList<>();
		firstStack.add(ast);
 
		List<List<AST>> childListStack = new ArrayList<>();
		childListStack.add(firstStack);
 
		while (!childListStack.isEmpty()) {
 
			List<AST> childStack = childListStack
					.get(childListStack.size() - 1);
 
			if (childStack.isEmpty()) {
				childListStack.remove(childListStack.size() - 1);
			} else {
				ast = childStack.remove(0);
				String caption;
 
				if (ast.payload instanceof Token) {
					Token token = (Token) ast.payload;
					caption = String.format("- - %s ",
							token.getText().replace("\n", "\\n"));
				} else {
					caption = String.valueOf("["+ast.payload+"]");
				}
 
				String indent = "";
 
				for (int i = 0; i < childListStack.size() - 1; i++) {
					indent += (childListStack.get(i).size() > 0) ? "   |  " : "     ";
				}
 
				builder.append(indent)
						.append(childStack.isEmpty() ? "   '- " : "   |- ")
						.append(caption).append("\n");
 
				if (ast.children.size() > 0) {
					List<AST> children = new ArrayList<>();
					for (int i = 0; i < ast.children.size(); i++) {
						children.add(ast.children.get(i));
					}
					childListStack.add(children);
				}
			}
		}
 
		return builder.toString();
	}
	
}
