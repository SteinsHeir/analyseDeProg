// Generated from Geom.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GeomParser}.
 */
public interface GeomListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GeomParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(GeomParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeomParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(GeomParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeomParser#consdecl}.
	 * @param ctx the parse tree
	 */
	void enterConsdecl(GeomParser.ConsdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeomParser#consdecl}.
	 * @param ctx the parse tree
	 */
	void exitConsdecl(GeomParser.ConsdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeomParser#interpointconsdecl}.
	 * @param ctx the parse tree
	 */
	void enterInterpointconsdecl(GeomParser.InterpointconsdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeomParser#interpointconsdecl}.
	 * @param ctx the parse tree
	 */
	void exitInterpointconsdecl(GeomParser.InterpointconsdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeomParser#intervaldecl}.
	 * @param ctx the parse tree
	 */
	void enterIntervaldecl(GeomParser.IntervaldeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeomParser#intervaldecl}.
	 * @param ctx the parse tree
	 */
	void exitIntervaldecl(GeomParser.IntervaldeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeomParser#lindecl}.
	 * @param ctx the parse tree
	 */
	void enterLindecl(GeomParser.LindeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeomParser#lindecl}.
	 * @param ctx the parse tree
	 */
	void exitLindecl(GeomParser.LindeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeomParser#numericValue}.
	 * @param ctx the parse tree
	 */
	void enterNumericValue(GeomParser.NumericValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeomParser#numericValue}.
	 * @param ctx the parse tree
	 */
	void exitNumericValue(GeomParser.NumericValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeomParser#leftexpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftexpr(GeomParser.LeftexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeomParser#leftexpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftexpr(GeomParser.LeftexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeomParser#rightexpr}.
	 * @param ctx the parse tree
	 */
	void enterRightexpr(GeomParser.RightexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeomParser#rightexpr}.
	 * @param ctx the parse tree
	 */
	void exitRightexpr(GeomParser.RightexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeomParser#booleq}.
	 * @param ctx the parse tree
	 */
	void enterBooleq(GeomParser.BooleqContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeomParser#booleq}.
	 * @param ctx the parse tree
	 */
	void exitBooleq(GeomParser.BooleqContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeomParser#int_comp_op}.
	 * @param ctx the parse tree
	 */
	void enterInt_comp_op(GeomParser.Int_comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeomParser#int_comp_op}.
	 * @param ctx the parse tree
	 */
	void exitInt_comp_op(GeomParser.Int_comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeomParser#booldecl}.
	 * @param ctx the parse tree
	 */
	void enterBooldecl(GeomParser.BooldeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeomParser#booldecl}.
	 * @param ctx the parse tree
	 */
	void exitBooldecl(GeomParser.BooldeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeomParser#num_op}.
	 * @param ctx the parse tree
	 */
	void enterNum_op(GeomParser.Num_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeomParser#num_op}.
	 * @param ctx the parse tree
	 */
	void exitNum_op(GeomParser.Num_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeomParser#linop}.
	 * @param ctx the parse tree
	 */
	void enterLinop(GeomParser.LinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeomParser#linop}.
	 * @param ctx the parse tree
	 */
	void exitLinop(GeomParser.LinopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeomParser#exprent}.
	 * @param ctx the parse tree
	 */
	void enterExprent(GeomParser.ExprentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeomParser#exprent}.
	 * @param ctx the parse tree
	 */
	void exitExprent(GeomParser.ExprentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeomParser#consexpr}.
	 * @param ctx the parse tree
	 */
	void enterConsexpr(GeomParser.ConsexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeomParser#consexpr}.
	 * @param ctx the parse tree
	 */
	void exitConsexpr(GeomParser.ConsexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeomParser#exprcomp}.
	 * @param ctx the parse tree
	 */
	void enterExprcomp(GeomParser.ExprcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeomParser#exprcomp}.
	 * @param ctx the parse tree
	 */
	void exitExprcomp(GeomParser.ExprcompContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeomParser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterExprbool(GeomParser.ExprboolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeomParser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitExprbool(GeomParser.ExprboolContext ctx);
}