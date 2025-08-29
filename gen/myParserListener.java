// Generated from C:/Users/USER/IdeaProjects/angular/src/myParser.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by the {@code interfaces}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 */
	void enterInterfaces(myParser.InterfacesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code interfaces}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 */
	void exitInterfaces(myParser.InterfacesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code injectable}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 */
	void enterInjectable(myParser.InjectableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code injectable}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 */
	void exitInjectable(myParser.InjectableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methode}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 */
	void enterMethode(myParser.MethodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methode}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 */
	void exitMethode(myParser.MethodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlpagenode}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 */
	void enterHtmlpagenode(myParser.HtmlpagenodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlpagenode}
	 * labeled alternative in {@link myParser#node}.
	 * @param ctx the parse tree
	 */
	void exitHtmlpagenode(myParser.HtmlpagenodeContext ctx);
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
	 * Enter a parse tree produced by the {@code importStateme}
	 * labeled alternative in {@link myParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportStateme(myParser.ImportStatemeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importStateme}
	 * labeled alternative in {@link myParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportStateme(myParser.ImportStatemeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imortid}
	 * labeled alternative in {@link myParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImortid(myParser.ImortidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imortid}
	 * labeled alternative in {@link myParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImortid(myParser.ImortidContext ctx);
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
	 * Enter a parse tree produced by the {@code urltamplate}
	 * labeled alternative in {@link myParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void enterUrltamplate(myParser.UrltamplateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code urltamplate}
	 * labeled alternative in {@link myParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void exitUrltamplate(myParser.UrltamplateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code urlstyle}
	 * labeled alternative in {@link myParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void enterUrlstyle(myParser.UrlstyleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code urlstyle}
	 * labeled alternative in {@link myParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void exitUrlstyle(myParser.UrlstyleContext ctx);
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
	 * Enter a parse tree produced by the {@code elementhtml}
	 * labeled alternative in {@link myParser#htmlpage}.
	 * @param ctx the parse tree
	 */
	void enterElementhtml(myParser.ElementhtmlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementhtml}
	 * labeled alternative in {@link myParser#htmlpage}.
	 * @param ctx the parse tree
	 */
	void exitElementhtml(myParser.ElementhtmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imghtml}
	 * labeled alternative in {@link myParser#htmlpage}.
	 * @param ctx the parse tree
	 */
	void enterImghtml(myParser.ImghtmlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imghtml}
	 * labeled alternative in {@link myParser#htmlpage}.
	 * @param ctx the parse tree
	 */
	void exitImghtml(myParser.ImghtmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selftag}
	 * labeled alternative in {@link myParser#htmlpage}.
	 * @param ctx the parse tree
	 */
	void enterSelftag(myParser.SelftagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selftag}
	 * labeled alternative in {@link myParser#htmlpage}.
	 * @param ctx the parse tree
	 */
	void exitSelftag(myParser.SelftagContext ctx);
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
	 * Enter a parse tree produced by {@link myParser#voidtag}.
	 * @param ctx the parse tree
	 */
	void enterVoidtag(myParser.VoidtagContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#voidtag}.
	 * @param ctx the parse tree
	 */
	void exitVoidtag(myParser.VoidtagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputele}
	 * labeled alternative in {@link myParser#selftagname}.
	 * @param ctx the parse tree
	 */
	void enterInputele(myParser.InputeleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputele}
	 * labeled alternative in {@link myParser#selftagname}.
	 * @param ctx the parse tree
	 */
	void exitInputele(myParser.InputeleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brdata}
	 * labeled alternative in {@link myParser#selftagname}.
	 * @param ctx the parse tree
	 */
	void enterBrdata(myParser.BrdataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brdata}
	 * labeled alternative in {@link myParser#selftagname}.
	 * @param ctx the parse tree
	 */
	void exitBrdata(myParser.BrdataContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#arttiselftag}.
	 * @param ctx the parse tree
	 */
	void enterArttiselftag(myParser.ArttiselftagContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#arttiselftag}.
	 * @param ctx the parse tree
	 */
	void exitArttiselftag(myParser.ArttiselftagContext ctx);
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
	 * Enter a parse tree produced by {@link myParser#artt}.
	 * @param ctx the parse tree
	 */
	void enterArtt(myParser.ArttContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#artt}.
	 * @param ctx the parse tree
	 */
	void exitArtt(myParser.ArttContext ctx);
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
	 * Enter a parse tree produced by the {@code selfart}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 */
	void enterSelfart(myParser.SelfartContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfart}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 */
	void exitSelfart(myParser.SelfartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngsubmit}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 */
	void enterNgsubmit(myParser.NgsubmitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngsubmit}
	 * labeled alternative in {@link myParser#csselement}.
	 * @param ctx the parse tree
	 */
	void exitNgsubmit(myParser.NgsubmitContext ctx);
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
	 * Enter a parse tree produced by the {@code textarea}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 */
	void enterTextarea(myParser.TextareaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textarea}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 */
	void exitTextarea(myParser.TextareaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formm}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 */
	void enterFormm(myParser.FormmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formm}
	 * labeled alternative in {@link myParser#name}.
	 * @param ctx the parse tree
	 */
	void exitFormm(myParser.FormmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlpagecontent}
	 * labeled alternative in {@link myParser#content}.
	 * @param ctx the parse tree
	 */
	void enterHtmlpagecontent(myParser.HtmlpagecontentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlpagecontent}
	 * labeled alternative in {@link myParser#content}.
	 * @param ctx the parse tree
	 */
	void exitHtmlpagecontent(myParser.HtmlpagecontentContext ctx);
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
	 * Enter a parse tree produced by the {@code atbuterimg}
	 * labeled alternative in {@link myParser#imgarti}.
	 * @param ctx the parse tree
	 */
	void enterAtbuterimg(myParser.AtbuterimgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atbuterimg}
	 * labeled alternative in {@link myParser#imgarti}.
	 * @param ctx the parse tree
	 */
	void exitAtbuterimg(myParser.AtbuterimgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrti}
	 * labeled alternative in {@link myParser#imgarti}.
	 * @param ctx the parse tree
	 */
	void enterArrti(myParser.ArrtiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrti}
	 * labeled alternative in {@link myParser#imgarti}.
	 * @param ctx the parse tree
	 */
	void exitArrti(myParser.ArrtiContext ctx);
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
	 * Enter a parse tree produced by the {@code cconstruct}
	 * labeled alternative in {@link myParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterCconstruct(myParser.CconstructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cconstruct}
	 * labeled alternative in {@link myParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitCconstruct(myParser.CconstructContext ctx);
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
	 * Enter a parse tree produced by the {@code value1}
	 * labeled alternative in {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterValue1(myParser.Value1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code value1}
	 * labeled alternative in {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitValue1(myParser.Value1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code value2}
	 * labeled alternative in {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterValue2(myParser.Value2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code value2}
	 * labeled alternative in {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitValue2(myParser.Value2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code definition}
	 * labeled alternative in {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(myParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definition}
	 * labeled alternative in {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(myParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constpro}
	 * labeled alternative in {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstpro(myParser.ConstproContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constpro}
	 * labeled alternative in {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstpro(myParser.ConstproContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanvalue}
	 * labeled alternative in {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterBooleanvalue(myParser.BooleanvalueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanvalue}
	 * labeled alternative in {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitBooleanvalue(myParser.BooleanvalueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mapdefinition}
	 * labeled alternative in {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMapdefinition(myParser.MapdefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mapdefinition}
	 * labeled alternative in {@link myParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMapdefinition(myParser.MapdefinitionContext ctx);
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
	 * Enter a parse tree produced by the {@code equalsExpr}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void enterEqualsExpr(myParser.EqualsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalsExpr}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void exitEqualsExpr(myParser.EqualsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lparen}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void enterLparen(myParser.LparenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lparen}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void exitLparen(myParser.LparenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lpranqoute}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void enterLpranqoute(myParser.LpranqouteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lpranqoute}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void exitLpranqoute(myParser.LpranqouteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callfun}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void enterCallfun(myParser.CallfunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callfun}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void exitCallfun(myParser.CallfunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringvalue}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void enterStringvalue(myParser.StringvalueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringvalue}
	 * labeled alternative in {@link myParser#value}.
	 * @param ctx the parse tree
	 */
	void exitStringvalue(myParser.StringvalueContext ctx);
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
	 * Enter a parse tree produced by {@link myParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(myParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(myParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#parameterListconstructer}.
	 * @param ctx the parse tree
	 */
	void enterParameterListconstructer(myParser.ParameterListconstructerContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#parameterListconstructer}.
	 * @param ctx the parse tree
	 */
	void exitParameterListconstructer(myParser.ParameterListconstructerContext ctx);
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
	 * Enter a parse tree produced by {@link myParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnotation(myParser.TypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnotation(myParser.TypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type11}
	 * labeled alternative in {@link myParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterType11(myParser.Type11Context ctx);
	/**
	 * Exit a parse tree produced by the {@code type11}
	 * labeled alternative in {@link myParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitType11(myParser.Type11Context ctx);
	/**
	 * Enter a parse tree produced by the {@code type21}
	 * labeled alternative in {@link myParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterType21(myParser.Type21Context ctx);
	/**
	 * Exit a parse tree produced by the {@code type21}
	 * labeled alternative in {@link myParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitType21(myParser.Type21Context ctx);
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
	 * Enter a parse tree produced by the {@code object}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterObject(myParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code object}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitObject(myParser.ObjectContext ctx);
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
	 * Enter a parse tree produced by the {@code returnExpr}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpr(myParser.ReturnExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnExpr}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpr(myParser.ReturnExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifstatement}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(myParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifstatement}
	 * labeled alternative in {@link myParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(myParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idcond}
	 * labeled alternative in {@link myParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterIdcond(myParser.IdcondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idcond}
	 * labeled alternative in {@link myParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitIdcond(myParser.IdcondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operationcond}
	 * labeled alternative in {@link myParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOperationcond(myParser.OperationcondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operationcond}
	 * labeled alternative in {@link myParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOperationcond(myParser.OperationcondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqeq}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterEqeq(myParser.EqeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqeq}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitEqeq(myParser.EqeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqeqeq}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterEqeqeq(myParser.EqeqeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqeqeq}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitEqeqeq(myParser.EqeqeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noteqeq}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterNoteqeq(myParser.NoteqeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noteqeq}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitNoteqeq(myParser.NoteqeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lt}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterLt(myParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitLt(myParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gt}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterGt(myParser.GtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gt}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitGt(myParser.GtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterAnd(myParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitAnd(myParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOr(myParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link myParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOr(myParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueex}
	 * labeled alternative in {@link myParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueex(myParser.ValueexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueex}
	 * labeled alternative in {@link myParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueex(myParser.ValueexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisProp}
	 * labeled alternative in {@link myParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisProp(myParser.ThisPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisProp}
	 * labeled alternative in {@link myParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisProp(myParser.ThisPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleArrow}
	 * labeled alternative in {@link myParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleArrow(myParser.SimpleArrowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleArrow}
	 * labeled alternative in {@link myParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleArrow(myParser.SimpleArrowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sparedExpr}
	 * labeled alternative in {@link myParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSparedExpr(myParser.SparedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sparedExpr}
	 * labeled alternative in {@link myParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSparedExpr(myParser.SparedExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#spreadExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterSpreadExpressionList(myParser.SpreadExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#spreadExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitSpreadExpressionList(myParser.SpreadExpressionListContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link myParser#interface}.
	 * @param ctx the parse tree
	 */
	void enterInterface(myParser.InterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#interface}.
	 * @param ctx the parse tree
	 */
	void exitInterface(myParser.InterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#interfacecontent}.
	 * @param ctx the parse tree
	 */
	void enterInterfacecontent(myParser.InterfacecontentContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#interfacecontent}.
	 * @param ctx the parse tree
	 */
	void exitInterfacecontent(myParser.InterfacecontentContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#injectableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInjectableDefinition(myParser.InjectableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#injectableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInjectableDefinition(myParser.InjectableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link myParser#objectdefinetion}.
	 * @param ctx the parse tree
	 */
	void enterObjectdefinetion(myParser.ObjectdefinetionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myParser#objectdefinetion}.
	 * @param ctx the parse tree
	 */
	void exitObjectdefinetion(myParser.ObjectdefinetionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type1}
	 * labeled alternative in {@link myParser#contentt}.
	 * @param ctx the parse tree
	 */
	void enterType1(myParser.Type1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code type1}
	 * labeled alternative in {@link myParser#contentt}.
	 * @param ctx the parse tree
	 */
	void exitType1(myParser.Type1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code sparetedd}
	 * labeled alternative in {@link myParser#contentt}.
	 * @param ctx the parse tree
	 */
	void enterSparetedd(myParser.SpareteddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sparetedd}
	 * labeled alternative in {@link myParser#contentt}.
	 * @param ctx the parse tree
	 */
	void exitSparetedd(myParser.SpareteddContext ctx);
}