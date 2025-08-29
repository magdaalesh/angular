// Generated from C:/Users/USER/IdeaProjects/angular/src/myParser.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by the {@code interfaces}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaces(myParser.InterfacesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code injectable}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectable(myParser.InjectableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methode}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethode(myParser.MethodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlpagenode}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlpagenode(myParser.HtmlpagenodeContext ctx);
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
	 * Visit a parse tree produced by the {@code importStateme}
	 * labeled alternative in {@link myParser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStateme(myParser.ImportStatemeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imortid}
	 * labeled alternative in {@link myParser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImortid(myParser.ImortidContext ctx);
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
	 * Visit a parse tree produced by the {@code urltamplate}
	 * labeled alternative in {@link myParser#metadataEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrltamplate(myParser.UrltamplateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code urlstyle}
	 * labeled alternative in {@link myParser#metadataEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlstyle(myParser.UrlstyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#htmlTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTemplate(myParser.HtmlTemplateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementhtml}
	 * labeled alternative in {@link myParser#htmlpage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementhtml(myParser.ElementhtmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imghtml}
	 * labeled alternative in {@link myParser#htmlpage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImghtml(myParser.ImghtmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selftag}
	 * labeled alternative in {@link myParser#htmlpage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelftag(myParser.SelftagContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(myParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#voidtag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidtag(myParser.VoidtagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputele}
	 * labeled alternative in {@link myParser#selftagname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputele(myParser.InputeleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brdata}
	 * labeled alternative in {@link myParser#selftagname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrdata(myParser.BrdataContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#arttiselftag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArttiselftag(myParser.ArttiselftagContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#htmlopen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlopen(myParser.HtmlopenContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#artt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArtt(myParser.ArttContext ctx);
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
	 * Visit a parse tree produced by the {@code selfart}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfart(myParser.SelfartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ngsubmit}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgsubmit(myParser.NgsubmitContext ctx);
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
	 * Visit a parse tree produced by the {@code textarea}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextarea(myParser.TextareaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formm}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormm(myParser.FormmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlpagecontent}
	 * labeled alternative in {@link myParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlpagecontent(myParser.HtmlpagecontentContext ctx);
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
	 * Visit a parse tree produced by the {@code atbuterimg}
	 * labeled alternative in {@link myParser#imgarti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtbuterimg(myParser.AtbuterimgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrti}
	 * labeled alternative in {@link myParser#imgarti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrti(myParser.ArrtiContext ctx);
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
	 * Visit a parse tree produced by the {@code cconstruct}
	 * labeled alternative in {@link myParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCconstruct(myParser.CconstructContext ctx);
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
	 * Visit a parse tree produced by the {@code value1}
	 * labeled alternative in {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue1(myParser.Value1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code value2}
	 * labeled alternative in {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue2(myParser.Value2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code definition}
	 * labeled alternative in {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(myParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constpro}
	 * labeled alternative in {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstpro(myParser.ConstproContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanvalue}
	 * labeled alternative in {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanvalue(myParser.BooleanvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mapdefinition}
	 * labeled alternative in {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapdefinition(myParser.MapdefinitionContext ctx);
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
	 * Visit a parse tree produced by the {@code equalsExpr}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsExpr(myParser.EqualsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lparen}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLparen(myParser.LparenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lpranqoute}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLpranqoute(myParser.LpranqouteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callfun}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallfun(myParser.CallfunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringvalue}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringvalue(myParser.StringvalueContext ctx);
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
	 * Visit a parse tree produced by {@link myParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(myParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#parameterListconstructer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterListconstructer(myParser.ParameterListconstructerContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#methodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition(myParser.MethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAnnotation(myParser.TypeAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type11}
	 * labeled alternative in {@link myParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType11(myParser.Type11Context ctx);
	/**
	 * Visit a parse tree produced by the {@code type21}
	 * labeled alternative in {@link myParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType21(myParser.Type21Context ctx);
	/**
	 * Visit a parse tree produced by the {@code valuedata}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuedata(myParser.ValuedataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calcolor}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcolor(myParser.CalcolorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code object}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(myParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(myParser.VarContext ctx);
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
	 * Visit a parse tree produced by the {@code returnExpr}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpr(myParser.ReturnExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifstatement}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(myParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idcond}
	 * labeled alternative in {@link myParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdcond(myParser.IdcondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operationcond}
	 * labeled alternative in {@link myParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationcond(myParser.OperationcondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqeq}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqeq(myParser.EqeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqeqeq}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqeqeq(myParser.EqeqeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noteqeq}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoteqeq(myParser.NoteqeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(myParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gt}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt(myParser.GtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(myParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(myParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueex}
	 * labeled alternative in {@link myParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueex(myParser.ValueexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisProp}
	 * labeled alternative in {@link myParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisProp(myParser.ThisPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleArrow}
	 * labeled alternative in {@link myParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleArrow(myParser.SimpleArrowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sparedExpr}
	 * labeled alternative in {@link myParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparedExpr(myParser.SparedExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#spreadExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpreadExpressionList(myParser.SpreadExpressionListContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link myParser#interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface(myParser.InterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#interfacecontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfacecontent(myParser.InterfacecontentContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#injectableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectableDefinition(myParser.InjectableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link myParser#objectdefinetion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectdefinetion(myParser.ObjectdefinetionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type1}
	 * labeled alternative in {@link myParser#contentt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType1(myParser.Type1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code sparetedd}
	 * labeled alternative in {@link myParser#contentt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparetedd(myParser.SpareteddContext ctx);
}