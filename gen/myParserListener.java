// Generated from C:/Users/USER/Desktop/angular/src/myParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link myParser}.
 */
public interface myParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link myParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(myParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(myParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imports}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 */
	void enterImports(myParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imports}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 */
	void exitImports(myParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code component}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 */
	void enterComponent(myParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code component}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 */
	void exitComponent(myParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 */
	void enterClass(myParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 */
	void exitClass(myParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(myParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(myParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#importpath}.
	 * @param ctx the parse tree
	 */
	void enterImportpath(myParser.ImportpathContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#importpath}.
	 * @param ctx the parse tree
	 */
	void exitImportpath(myParser.ImportpathContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(myParser.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(myParser.ImportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#componentDefinition}.
	 * @param ctx the parse tree
	 */
	void enterComponentDefinition(myParser.ComponentDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#componentDefinition}.
	 * @param ctx the parse tree
	 */
	void exitComponentDefinition(myParser.ComponentDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#componentMetadata}.
	 * @param ctx the parse tree
	 */
	void enterComponentMetadata(myParser.ComponentMetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#componentMetadata}.
	 * @param ctx the parse tree
	 */
	void exitComponentMetadata(myParser.ComponentMetadataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectoredata}
	 * labeled alternative in {@link myParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void enterSelectoredata(myParser.SelectoredataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectoredata}
	 * labeled alternative in {@link myParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void exitSelectoredata(myParser.SelectoredataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code standalonedata}
	 * labeled alternative in {@link myParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void enterStandalonedata(myParser.StandalonedataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code standalonedata}
	 * labeled alternative in {@link myParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void exitStandalonedata(myParser.StandalonedataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code templetedata}
	 * labeled alternative in {@link myParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void enterTempletedata(myParser.TempletedataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code templetedata}
	 * labeled alternative in {@link myParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void exitTempletedata(myParser.TempletedataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importsdata}
	 * labeled alternative in {@link myParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void enterImportsdata(myParser.ImportsdataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importsdata}
	 * labeled alternative in {@link myParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void exitImportsdata(myParser.ImportsdataContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#htmlTemplate}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTemplate(myParser.HtmlTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#htmlTemplate}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTemplate(myParser.HtmlTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(myParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(myParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#htmlopen}.
	 * @param ctx the parse tree
	 */
	void enterHtmlopen(myParser.HtmlopenContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#htmlopen}.
	 * @param ctx the parse tree
	 */
	void exitHtmlopen(myParser.HtmlopenContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#htmlclose}.
	 * @param ctx the parse tree
	 */
	void enterHtmlclose(myParser.HtmlcloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#htmlclose}.
	 * @param ctx the parse tree
	 */
	void exitHtmlclose(myParser.HtmlcloseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styleback}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 */
	void enterStyleback(myParser.StylebackContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styleback}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 */
	void exitStyleback(myParser.StylebackContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngifdata}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 */
	void enterNgifdata(myParser.NgifdataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngifdata}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 */
	void exitNgifdata(myParser.NgifdataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngfordata}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 */
	void enterNgfordata(myParser.NgfordataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngfordata}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 */
	void exitNgfordata(myParser.NgfordataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clickdata}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 */
	void enterClickdata(myParser.ClickdataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clickdata}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 */
	void exitClickdata(myParser.ClickdataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code styledata}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 */
	void enterStyledata(myParser.StyledataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code styledata}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 */
	void exitStyledata(myParser.StyledataContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#stylback}.
	 * @param ctx the parse tree
	 */
	void enterStylback(myParser.StylbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#stylback}.
	 * @param ctx the parse tree
	 */
	void exitStylback(myParser.StylbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#ngfor}.
	 * @param ctx the parse tree
	 */
	void enterNgfor(myParser.NgforContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#ngfor}.
	 * @param ctx the parse tree
	 */
	void exitNgfor(myParser.NgforContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#ngif}.
	 * @param ctx the parse tree
	 */
	void enterNgif(myParser.NgifContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#ngif}.
	 * @param ctx the parse tree
	 */
	void exitNgif(myParser.NgifContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#click}.
	 * @param ctx the parse tree
	 */
	void enterClick(myParser.ClickContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#click}.
	 * @param ctx the parse tree
	 */
	void exitClick(myParser.ClickContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(myParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(myParser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divdata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 */
	void enterDivdata(myParser.DivdataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divdata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 */
	void exitDivdata(myParser.DivdataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headardata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 */
	void enterHeadardata(myParser.HeadardataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headardata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 */
	void exitHeadardata(myParser.HeadardataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pdata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 */
	void enterPdata(myParser.PdataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pdata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 */
	void exitPdata(myParser.PdataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oldata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 */
	void enterOldata(myParser.OldataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code oldata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 */
	void exitOldata(myParser.OldataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lidata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 */
	void enterLidata(myParser.LidataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lidata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 */
	void exitLidata(myParser.LidataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uldata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 */
	void enterUldata(myParser.UldataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uldata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 */
	void exitUldata(myParser.UldataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code buttondata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 */
	void enterButtondata(myParser.ButtondataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code buttondata}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 */
	void exitButtondata(myParser.ButtondataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementdata}
	 * labeled alternative in {@link myParser#content}.
	 * @param ctx the parse tree
	 */
	void enterElementdata(myParser.ElementdataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementdata}
	 * labeled alternative in {@link myParser#content}.
	 * @param ctx the parse tree
	 */
	void exitElementdata(myParser.ElementdataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imgdata}
	 * labeled alternative in {@link myParser#content}.
	 * @param ctx the parse tree
	 */
	void enterImgdata(myParser.ImgdataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imgdata}
	 * labeled alternative in {@link myParser#content}.
	 * @param ctx the parse tree
	 */
	void exitImgdata(myParser.ImgdataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringdata}
	 * labeled alternative in {@link myParser#content}.
	 * @param ctx the parse tree
	 */
	void enterStringdata(myParser.StringdataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringdata}
	 * labeled alternative in {@link myParser#content}.
	 * @param ctx the parse tree
	 */
	void exitStringdata(myParser.StringdataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vardata}
	 * labeled alternative in {@link myParser#content}.
	 * @param ctx the parse tree
	 */
	void enterVardata(myParser.VardataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vardata}
	 * labeled alternative in {@link myParser#content}.
	 * @param ctx the parse tree
	 */
	void exitVardata(myParser.VardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#img}.
	 * @param ctx the parse tree
	 */
	void enterImg(myParser.ImgContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#img}.
	 * @param ctx the parse tree
	 */
	void exitImg(myParser.ImgContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#imgarti}.
	 * @param ctx the parse tree
	 */
	void enterImgarti(myParser.ImgartiContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#imgarti}.
	 * @param ctx the parse tree
	 */
	void exitImgarti(myParser.ImgartiContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(myParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(myParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propertydata}
	 * labeled alternative in {@link myParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterPropertydata(myParser.PropertydataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propertydata}
	 * labeled alternative in {@link myParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitPropertydata(myParser.PropertydataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arraydata}
	 * labeled alternative in {@link myParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterArraydata(myParser.ArraydataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arraydata}
	 * labeled alternative in {@link myParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitArraydata(myParser.ArraydataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methoddata}
	 * labeled alternative in {@link myParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterMethoddata(myParser.MethoddataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methoddata}
	 * labeled alternative in {@link myParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitMethoddata(myParser.MethoddataContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDefinition(myParser.PropertyDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDefinition(myParser.PropertyDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idcolon}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIdcolon(myParser.IdcolonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idcolon}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIdcolon(myParser.IdcolonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(myParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(myParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void enterId(myParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void exitId(myParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code colorvalue}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void enterColorvalue(myParser.ColorvalueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code colorvalue}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void exitColorvalue(myParser.ColorvalueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashid}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void enterHashid(myParser.HashidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashid}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void exitHashid(myParser.HashidContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#arrayDefinition}.
	 * @param ctx the parse tree
	 */
	void enterArrayDefinition(myParser.ArrayDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#arrayDefinition}.
	 * @param ctx the parse tree
	 */
	void exitArrayDefinition(myParser.ArrayDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code includearray}
	 * labeled alternative in {@link myParser#arrayList}.
	 * @param ctx the parse tree
	 */
	void enterIncludearray(myParser.IncludearrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code includearray}
	 * labeled alternative in {@link myParser#arrayList}.
	 * @param ctx the parse tree
	 */
	void exitIncludearray(myParser.IncludearrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valdata}
	 * labeled alternative in {@link myParser#arrayList}.
	 * @param ctx the parse tree
	 */
	void enterValdata(myParser.ValdataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valdata}
	 * labeled alternative in {@link myParser#arrayList}.
	 * @param ctx the parse tree
	 */
	void exitValdata(myParser.ValdataContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(myParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(myParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(myParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(myParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calcolor}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterCalcolor(myParser.CalcolorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calcolor}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitCalcolor(myParser.CalcolorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterVar(myParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitVar(myParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valuedata}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterValuedata(myParser.ValuedataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valuedata}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitValuedata(myParser.ValuedataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propertyDefinitiondata}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDefinitiondata(myParser.PropertyDefinitiondataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propertyDefinitiondata}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDefinitiondata(myParser.PropertyDefinitiondataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayDefinitiondata}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterArrayDefinitiondata(myParser.ArrayDefinitiondataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayDefinitiondata}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitArrayDefinitiondata(myParser.ArrayDefinitiondataContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#calcualtecolor}.
	 * @param ctx the parse tree
	 */
	void enterCalcualtecolor(myParser.CalcualtecolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#calcualtecolor}.
	 * @param ctx the parse tree
	 */
	void exitCalcualtecolor(myParser.CalcualtecolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#contenetcolorcal}.
	 * @param ctx the parse tree
	 */
	void enterContenetcolorcal(myParser.ContenetcolorcalContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#contenetcolorcal}.
	 * @param ctx the parse tree
	 */
	void exitContenetcolorcal(myParser.ContenetcolorcalContext ctx);
}