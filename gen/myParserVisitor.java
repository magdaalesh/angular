// Generated from C:/Users/USER/Desktop/angular/src/myParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link myParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface myParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link myParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(myParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imports}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(myParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code component}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(myParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code class}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(myParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(myParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#importpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportpath(myParser.ImportpathContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportList(myParser.ImportListContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#componentDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDefinition(myParser.ComponentDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#componentMetadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentMetadata(myParser.ComponentMetadataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectoredata}
	 * labeled alternative in {@link myParser#metadataEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectoredata(myParser.SelectoredataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code standalonedata}
	 * labeled alternative in {@link myParser#metadataEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalonedata(myParser.StandalonedataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code templetedata}
	 * labeled alternative in {@link myParser#metadataEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempletedata(myParser.TempletedataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importsdata}
	 * labeled alternative in {@link myParser#metadataEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsdata(myParser.ImportsdataContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#htmlTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTemplate(myParser.HtmlTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(myParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#htmlopen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlopen(myParser.HtmlopenContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#htmlclose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlclose(myParser.HtmlcloseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styleback}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleback(myParser.StylebackContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ngifdata}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgifdata(myParser.NgifdataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ngfordata}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgfordata(myParser.NgfordataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clickdata}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClickdata(myParser.ClickdataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code styledata}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyledata(myParser.StyledataContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#stylback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylback(myParser.StylbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#ngfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgfor(myParser.NgforContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#ngif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgif(myParser.NgifContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#click}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClick(myParser.ClickContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(myParser.StyleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divdata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivdata(myParser.DivdataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code headardata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadardata(myParser.HeadardataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pdata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPdata(myParser.PdataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oldata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOldata(myParser.OldataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lidata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLidata(myParser.LidataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uldata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUldata(myParser.UldataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code buttondata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtondata(myParser.ButtondataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementdata}
	 * labeled alternative in {@link myParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementdata(myParser.ElementdataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imgdata}
	 * labeled alternative in {@link myParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgdata(myParser.ImgdataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringdata}
	 * labeled alternative in {@link myParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringdata(myParser.StringdataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vardata}
	 * labeled alternative in {@link myParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardata(myParser.VardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#img}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImg(myParser.ImgContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#imgarti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgarti(myParser.ImgartiContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(myParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propertydata}
	 * labeled alternative in {@link myParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertydata(myParser.PropertydataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arraydata}
	 * labeled alternative in {@link myParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraydata(myParser.ArraydataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methoddata}
	 * labeled alternative in {@link myParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethoddata(myParser.MethoddataContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDefinition(myParser.PropertyDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idcolon}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdcolon(myParser.IdcolonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(myParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(myParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code colorvalue}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorvalue(myParser.ColorvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hashid}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashid(myParser.HashidContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#arrayDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDefinition(myParser.ArrayDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code includearray}
	 * labeled alternative in {@link myParser#arrayList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludearray(myParser.IncludearrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valdata}
	 * labeled alternative in {@link myParser#arrayList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValdata(myParser.ValdataContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#methodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition(myParser.MethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(myParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calcolor}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcolor(myParser.CalcolorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(myParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valuedata}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuedata(myParser.ValuedataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propertyDefinitiondata}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDefinitiondata(myParser.PropertyDefinitiondataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayDefinitiondata}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDefinitiondata(myParser.ArrayDefinitiondataContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#calcualtecolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcualtecolor(myParser.CalcualtecolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#contenetcolorcal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenetcolorcal(myParser.ContenetcolorcalContext ctx);
}