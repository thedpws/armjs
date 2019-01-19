// Generated from armasm.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link armasmParser}.
 */
public interface armasmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link armasmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(armasmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link armasmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(armasmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link armasmParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(armasmParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link armasmParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(armasmParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link armasmParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(armasmParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link armasmParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(armasmParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link armasmParser#reg}.
	 * @param ctx the parse tree
	 */
	void enterReg(armasmParser.RegContext ctx);
	/**
	 * Exit a parse tree produced by {@link armasmParser#reg}.
	 * @param ctx the parse tree
	 */
	void exitReg(armasmParser.RegContext ctx);
	/**
	 * Enter a parse tree produced by {@link armasmParser#addr}.
	 * @param ctx the parse tree
	 */
	void enterAddr(armasmParser.AddrContext ctx);
	/**
	 * Exit a parse tree produced by {@link armasmParser#addr}.
	 * @param ctx the parse tree
	 */
	void exitAddr(armasmParser.AddrContext ctx);
	/**
	 * Enter a parse tree produced by {@link armasmParser#imm}.
	 * @param ctx the parse tree
	 */
	void enterImm(armasmParser.ImmContext ctx);
	/**
	 * Exit a parse tree produced by {@link armasmParser#imm}.
	 * @param ctx the parse tree
	 */
	void exitImm(armasmParser.ImmContext ctx);
	/**
	 * Enter a parse tree produced by {@link armasmParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(armasmParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link armasmParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(armasmParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link armasmParser#cc}.
	 * @param ctx the parse tree
	 */
	void enterCc(armasmParser.CcContext ctx);
	/**
	 * Exit a parse tree produced by {@link armasmParser#cc}.
	 * @param ctx the parse tree
	 */
	void exitCc(armasmParser.CcContext ctx);
	/**
	 * Enter a parse tree produced by {@link armasmParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(armasmParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link armasmParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(armasmParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link armasmParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(armasmParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link armasmParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(armasmParser.LabelContext ctx);
}