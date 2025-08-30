// Generated from C:/Users/USER/IdeaProjects/angular/src/myParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class myParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, COMPONENT=2, INJECTABLE=3, EXPORT=4, CONSTRUCTOR=5, IMPORTLIST=6, 
		LET=7, OF=8, THIS=9, IMPLEMENT=10, URLTEMPLATE=11, STYLEURL=12, RETURN=13, 
		FROM=14, PROVIDIN=15, CLASS=16, IF=17, INTERFACE=18, SELECTOR=19, STANDALONE=20, 
		TEMPLATE=21, STYLE=22, NGFOR=23, NGIF=24, IMPORTS=25, BUTTON=26, DIV=27, 
		IMG=28, UL=29, LI=30, OL=31, P=32, A=33, BR=34, FORM=35, AARTT=36, CONST=37, 
		CLICK=38, INPUT=39, TEXTERA=40, NGSUBMIT=41, MODIFIER=42, HEDEAR=43, ATTRBUTE=44, 
		IMG_ATTRIBUTE=45, SELF_ATTRIBUTE=46, STYLE_BACK=47, TYPE=48, BOOLEAN=49, 
		AT=50, HASH=51, LCURLY=52, RCURLY=53, LBRACK=54, RBRACK=55, LPAREN=56, 
		RPAREN=57, EQEQ=58, EQEQEQ=59, NOTEQEQ=60, PLUS=61, MINUS=62, AND=63, 
		OR=64, QMARK=65, MUL=66, LT=67, GT=68, TAG_OPEN=69, TAG_CLOSE=70, SPREAD=71, 
		ARROW=72, CALCULAATE=73, SLASH=74, SEMI=75, COLON=76, COMMA=77, DOT=78, 
		PIPE=79, EQUAL=80, QUOTE=81, TH=82, WHITESPACE=83, ID=84, COMMENT=85;
	public static final int
		RULE_program = 0, RULE_node = 1, RULE_importStatement = 2, RULE_importpath = 3, 
		RULE_importList = 4, RULE_componentDefinition = 5, RULE_componentMetadata = 6, 
		RULE_metadataEntry = 7, RULE_htmlTemplate = 8, RULE_htmlpage = 9, RULE_element = 10, 
		RULE_voidtag = 11, RULE_selftagname = 12, RULE_arttiselftag = 13, RULE_htmlopen = 14, 
		RULE_artt = 15, RULE_htmlclose = 16, RULE_csselement = 17, RULE_stylback = 18, 
		RULE_ngfor = 19, RULE_ngif = 20, RULE_click = 21, RULE_style = 22, RULE_name = 23, 
		RULE_content = 24, RULE_img = 25, RULE_imgarti = 26, RULE_classDefinition = 27, 
		RULE_classBody = 28, RULE_propertyDefinition = 29, RULE_value = 30, RULE_arrayDefinition = 31, 
		RULE_arrayList = 32, RULE_constructor = 33, RULE_parameterListconstructer = 34, 
		RULE_methodDefinition = 35, RULE_typeAnnotation = 36, RULE_parameterList = 37, 
		RULE_methodBody = 38, RULE_condition = 39, RULE_operation = 40, RULE_expression = 41, 
		RULE_spreadExpressionList = 42, RULE_calcualtecolor = 43, RULE_contenetcolorcal = 44, 
		RULE_interface = 45, RULE_interfacecontent = 46, RULE_injectableDefinition = 47, 
		RULE_objectdefinetion = 48, RULE_contentt = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "node", "importStatement", "importpath", "importList", "componentDefinition", 
			"componentMetadata", "metadataEntry", "htmlTemplate", "htmlpage", "element", 
			"voidtag", "selftagname", "arttiselftag", "htmlopen", "artt", "htmlclose", 
			"csselement", "stylback", "ngfor", "ngif", "click", "style", "name", 
			"content", "img", "imgarti", "classDefinition", "classBody", "propertyDefinition", 
			"value", "arrayDefinition", "arrayList", "constructor", "parameterListconstructer", 
			"methodDefinition", "typeAnnotation", "parameterList", "methodBody", 
			"condition", "operation", "expression", "spreadExpressionList", "calcualtecolor", 
			"contenetcolorcal", "interface", "interfacecontent", "injectableDefinition", 
			"objectdefinetion", "contentt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'@Component'", "'@Injectable'", "'export'", "'constructor'", 
			null, "'let'", "'of'", "'this'", "'implements'", "'templateUrl'", "'styleUrls'", 
			"'return'", "'from'", "'providedIn'", "'class'", "'if'", "'interface'", 
			"'selector'", "'standalone'", "'template'", "'style'", "'*ngFor'", "'*ngIf'", 
			"'imports'", "'button'", "'div'", "'img'", "'ul'", "'li'", "'ol'", "'p'", 
			"'a'", "'br'", "'form'", "'routerLink'", "'const'", "'click'", "'input'", 
			"'textarea'", "'(ngSubmit)'", null, null, null, null, null, "'style.background'", 
			null, null, "'@'", "'#'", "'{'", "'}'", "'['", "']'", "'('", "')'", "'=='", 
			"'==='", "'!=='", "'+'", "' -'", "'&&'", "'||'", "'?'", "'*'", "' <'", 
			"' >'", "'<'", "'>'", "'...'", "'=>'", null, "'/'", "';'", "':'", "','", 
			"'.'", "'|'", "'='", null, "'`'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "COMPONENT", "INJECTABLE", "EXPORT", "CONSTRUCTOR", "IMPORTLIST", 
			"LET", "OF", "THIS", "IMPLEMENT", "URLTEMPLATE", "STYLEURL", "RETURN", 
			"FROM", "PROVIDIN", "CLASS", "IF", "INTERFACE", "SELECTOR", "STANDALONE", 
			"TEMPLATE", "STYLE", "NGFOR", "NGIF", "IMPORTS", "BUTTON", "DIV", "IMG", 
			"UL", "LI", "OL", "P", "A", "BR", "FORM", "AARTT", "CONST", "CLICK", 
			"INPUT", "TEXTERA", "NGSUBMIT", "MODIFIER", "HEDEAR", "ATTRBUTE", "IMG_ATTRIBUTE", 
			"SELF_ATTRIBUTE", "STYLE_BACK", "TYPE", "BOOLEAN", "AT", "HASH", "LCURLY", 
			"RCURLY", "LBRACK", "RBRACK", "LPAREN", "RPAREN", "EQEQ", "EQEQEQ", "NOTEQEQ", 
			"PLUS", "MINUS", "AND", "OR", "QMARK", "MUL", "LT", "GT", "TAG_OPEN", 
			"TAG_CLOSE", "SPREAD", "ARROW", "CALCULAATE", "SLASH", "SEMI", "COLON", 
			"COMMA", "DOT", "PIPE", "EQUAL", "QUOTE", "TH", "WHITESPACE", "ID", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "myParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public myParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				node();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0) || _la==TAG_OPEN || _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NodeContext extends ParserRuleContext {
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
	 
		public NodeContext() { }
		public void copyFrom(NodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodeContext extends NodeContext {
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public MethodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterMethode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitMethode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitMethode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends NodeContext {
		public ComponentDefinitionContext componentDefinition() {
			return getRuleContext(ComponentDefinitionContext.class,0);
		}
		public ComponentContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfacesContext extends NodeContext {
		public InterfaceContext interface_() {
			return getRuleContext(InterfaceContext.class,0);
		}
		public InterfacesContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitInterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InjectableContext extends NodeContext {
		public InjectableDefinitionContext injectableDefinition() {
			return getRuleContext(InjectableDefinitionContext.class,0);
		}
		public InjectableContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterInjectable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitInjectable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitInjectable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportsContext extends NodeContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ImportsContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlpagenodeContext extends NodeContext {
		public HtmlpageContext htmlpage() {
			return getRuleContext(HtmlpageContext.class,0);
		}
		public HtmlpagenodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterHtmlpagenode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitHtmlpagenode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitHtmlpagenode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassContext extends NodeContext {
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public ClassContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_node);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ImportsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				importStatement();
				}
				break;
			case 2:
				_localctx = new ComponentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				componentDefinition();
				}
				break;
			case 3:
				_localctx = new ClassContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				classDefinition();
				}
				break;
			case 4:
				_localctx = new InterfacesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				interface_();
				}
				break;
			case 5:
				_localctx = new InjectableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				injectableDefinition();
				}
				break;
			case 6:
				_localctx = new MethodeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(110);
				methodDefinition();
				}
				break;
			case 7:
				_localctx = new HtmlpagenodeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(111);
				htmlpage();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(myParser.IMPORT, 0); }
		public TerminalNode LCURLY() { return getToken(myParser.LCURLY, 0); }
		public ImportListContext importList() {
			return getRuleContext(ImportListContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(myParser.RCURLY, 0); }
		public TerminalNode FROM() { return getToken(myParser.FROM, 0); }
		public ImportpathContext importpath() {
			return getRuleContext(ImportpathContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IMPORT);
			setState(115);
			match(LCURLY);
			setState(116);
			importList();
			setState(117);
			match(RCURLY);
			setState(118);
			match(FROM);
			setState(119);
			importpath();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportpathContext extends ParserRuleContext {
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode SEMI() { return getToken(myParser.SEMI, 0); }
		public List<TerminalNode> AT() { return getTokens(myParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(myParser.AT, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(myParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(myParser.SLASH, i);
		}
		public ImportpathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importpath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterImportpath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitImportpath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitImportpath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportpathContext importpath() throws RecognitionException {
		ImportpathContext _localctx = new ImportpathContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importpath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(QUOTE);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(122);
				match(AT);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(ID);
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				match(SLASH);
				setState(130);
				match(ID);
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SLASH );
			setState(135);
			match(QUOTE);
			setState(136);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportListContext extends ParserRuleContext {
		public ImportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importList; }
	 
		public ImportListContext() { }
		public void copyFrom(ImportListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImortidContext extends ImportListContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParser.COMMA, i);
		}
		public ImortidContext(ImportListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterImortid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitImortid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitImortid(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatemeContext extends ImportListContext {
		public List<TerminalNode> IMPORTLIST() { return getTokens(myParser.IMPORTLIST); }
		public TerminalNode IMPORTLIST(int i) {
			return getToken(myParser.IMPORTLIST, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParser.COMMA, i);
		}
		public ImportStatemeContext(ImportListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterImportStateme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitImportStateme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitImportStateme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportListContext importList() throws RecognitionException {
		ImportListContext _localctx = new ImportListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importList);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORTLIST:
				_localctx = new ImportStatemeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(IMPORTLIST);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(139);
					match(COMMA);
					setState(140);
					match(IMPORTLIST);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ID:
				_localctx = new ImortidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(ID);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(147);
					match(COMMA);
					setState(148);
					match(ID);
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDefinitionContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(myParser.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(myParser.LPAREN, 0); }
		public ComponentMetadataContext componentMetadata() {
			return getRuleContext(ComponentMetadataContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(myParser.RPAREN, 0); }
		public ComponentDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterComponentDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitComponentDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitComponentDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDefinitionContext componentDefinition() throws RecognitionException {
		ComponentDefinitionContext _localctx = new ComponentDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_componentDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(COMPONENT);
			setState(157);
			match(LPAREN);
			setState(158);
			componentMetadata();
			setState(159);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentMetadataContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(myParser.LCURLY, 0); }
		public List<MetadataEntryContext> metadataEntry() {
			return getRuleContexts(MetadataEntryContext.class);
		}
		public MetadataEntryContext metadataEntry(int i) {
			return getRuleContext(MetadataEntryContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(myParser.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(myParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParser.COMMA, i);
		}
		public ComponentMetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentMetadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterComponentMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitComponentMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitComponentMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentMetadataContext componentMetadata() throws RecognitionException {
		ComponentMetadataContext _localctx = new ComponentMetadataContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_componentMetadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(LCURLY);
			setState(162);
			metadataEntry();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(163);
				match(COMMA);
				setState(164);
				metadataEntry();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MetadataEntryContext extends ParserRuleContext {
		public MetadataEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataEntry; }
	 
		public MetadataEntryContext() { }
		public void copyFrom(MetadataEntryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectoredataContext extends MetadataEntryContext {
		public TerminalNode SELECTOR() { return getToken(myParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(myParser.COLON, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public TerminalNode ID() { return getToken(myParser.ID, 0); }
		public SelectoredataContext(MetadataEntryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterSelectoredata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitSelectoredata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitSelectoredata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UrlstyleContext extends MetadataEntryContext {
		public TerminalNode STYLEURL() { return getToken(myParser.STYLEURL, 0); }
		public TerminalNode COLON() { return getToken(myParser.COLON, 0); }
		public TerminalNode LBRACK() { return getToken(myParser.LBRACK, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public TerminalNode DOT() { return getToken(myParser.DOT, 0); }
		public TerminalNode RBRACK() { return getToken(myParser.RBRACK, 0); }
		public List<TerminalNode> SLASH() { return getTokens(myParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(myParser.SLASH, i);
		}
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public UrlstyleContext(MetadataEntryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterUrlstyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitUrlstyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitUrlstyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandalonedataContext extends MetadataEntryContext {
		public TerminalNode STANDALONE() { return getToken(myParser.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(myParser.COLON, 0); }
		public TerminalNode BOOLEAN() { return getToken(myParser.BOOLEAN, 0); }
		public StandalonedataContext(MetadataEntryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterStandalonedata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitStandalonedata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitStandalonedata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportsdataContext extends MetadataEntryContext {
		public TerminalNode IMPORTS() { return getToken(myParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(myParser.COLON, 0); }
		public TerminalNode LBRACK() { return getToken(myParser.LBRACK, 0); }
		public ImportListContext importList() {
			return getRuleContext(ImportListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(myParser.RBRACK, 0); }
		public ImportsdataContext(MetadataEntryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterImportsdata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitImportsdata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitImportsdata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TempletedataContext extends MetadataEntryContext {
		public TerminalNode TEMPLATE() { return getToken(myParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(myParser.COLON, 0); }
		public HtmlTemplateContext htmlTemplate() {
			return getRuleContext(HtmlTemplateContext.class,0);
		}
		public TempletedataContext(MetadataEntryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterTempletedata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitTempletedata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitTempletedata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UrltamplateContext extends MetadataEntryContext {
		public TerminalNode URLTEMPLATE() { return getToken(myParser.URLTEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(myParser.COLON, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public TerminalNode DOT() { return getToken(myParser.DOT, 0); }
		public List<TerminalNode> SLASH() { return getTokens(myParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(myParser.SLASH, i);
		}
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public UrltamplateContext(MetadataEntryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterUrltamplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitUrltamplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitUrltamplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetadataEntryContext metadataEntry() throws RecognitionException {
		MetadataEntryContext _localctx = new MetadataEntryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_metadataEntry);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectoredataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(SELECTOR);
				setState(173);
				match(COLON);
				setState(174);
				match(QUOTE);
				setState(175);
				match(ID);
				setState(176);
				match(QUOTE);
				}
				break;
			case STANDALONE:
				_localctx = new StandalonedataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(STANDALONE);
				setState(178);
				match(COLON);
				setState(179);
				match(BOOLEAN);
				}
				break;
			case TEMPLATE:
				_localctx = new TempletedataContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(TEMPLATE);
				setState(181);
				match(COLON);
				setState(182);
				htmlTemplate();
				}
				break;
			case IMPORTS:
				_localctx = new ImportsdataContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(IMPORTS);
				setState(184);
				match(COLON);
				setState(185);
				match(LBRACK);
				setState(186);
				importList();
				setState(187);
				match(RBRACK);
				}
				break;
			case URLTEMPLATE:
				_localctx = new UrltamplateContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				match(URLTEMPLATE);
				setState(190);
				match(COLON);
				setState(191);
				match(QUOTE);
				setState(192);
				match(DOT);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SLASH) {
					{
					{
					setState(193);
					match(SLASH);
					setState(194);
					match(ID);
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				match(QUOTE);
				}
				break;
			case STYLEURL:
				_localctx = new UrlstyleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				match(STYLEURL);
				setState(202);
				match(COLON);
				setState(203);
				match(LBRACK);
				setState(204);
				match(QUOTE);
				setState(205);
				match(DOT);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SLASH) {
					{
					{
					setState(206);
					match(SLASH);
					setState(207);
					match(ID);
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
				match(QUOTE);
				setState(214);
				match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTemplateContext extends ParserRuleContext {
		public List<TerminalNode> TH() { return getTokens(myParser.TH); }
		public TerminalNode TH(int i) {
			return getToken(myParser.TH, i);
		}
		public List<HtmlpageContext> htmlpage() {
			return getRuleContexts(HtmlpageContext.class);
		}
		public HtmlpageContext htmlpage(int i) {
			return getRuleContext(HtmlpageContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParser.COMMA, i);
		}
		public HtmlTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterHtmlTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitHtmlTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitHtmlTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTemplateContext htmlTemplate() throws RecognitionException {
		HtmlTemplateContext _localctx = new HtmlTemplateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_htmlTemplate);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(TH);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_OPEN) {
				{
				{
				setState(218);
				htmlpage();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			match(TH);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					match(COMMA);
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlpageContext extends ParserRuleContext {
		public HtmlpageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlpage; }
	 
		public HtmlpageContext() { }
		public void copyFrom(HtmlpageContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementhtmlContext extends HtmlpageContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ElementhtmlContext(HtmlpageContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterElementhtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitElementhtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitElementhtml(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImghtmlContext extends HtmlpageContext {
		public ImgContext img() {
			return getRuleContext(ImgContext.class,0);
		}
		public ImghtmlContext(HtmlpageContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterImghtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitImghtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitImghtml(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelftagContext extends HtmlpageContext {
		public VoidtagContext voidtag() {
			return getRuleContext(VoidtagContext.class,0);
		}
		public SelftagContext(HtmlpageContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterSelftag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitSelftag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitSelftag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlpageContext htmlpage() throws RecognitionException {
		HtmlpageContext _localctx = new HtmlpageContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_htmlpage);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ElementhtmlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				element();
				}
				break;
			case 2:
				_localctx = new ImghtmlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				img();
				}
				break;
			case 3:
				_localctx = new SelftagContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				voidtag();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public HtmlopenContext htmlopen() {
			return getRuleContext(HtmlopenContext.class,0);
		}
		public HtmlcloseContext htmlclose() {
			return getRuleContext(HtmlcloseContext.class,0);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_element);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			htmlopen();
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(237);
					content();
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(243);
			htmlclose();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VoidtagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(myParser.TAG_OPEN, 0); }
		public SelftagnameContext selftagname() {
			return getRuleContext(SelftagnameContext.class,0);
		}
		public TerminalNode TAG_CLOSE() { return getToken(myParser.TAG_CLOSE, 0); }
		public List<ArttiselftagContext> arttiselftag() {
			return getRuleContexts(ArttiselftagContext.class);
		}
		public ArttiselftagContext arttiselftag(int i) {
			return getRuleContext(ArttiselftagContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(myParser.SLASH, 0); }
		public VoidtagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidtag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterVoidtag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitVoidtag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitVoidtag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidtagContext voidtag() throws RecognitionException {
		VoidtagContext _localctx = new VoidtagContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_voidtag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(TAG_OPEN);
			setState(246);
			selftagname();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SELF_ATTRIBUTE) {
				{
				{
				setState(247);
				arttiselftag();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(253);
				match(SLASH);
				}
			}

			setState(256);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelftagnameContext extends ParserRuleContext {
		public SelftagnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selftagname; }
	 
		public SelftagnameContext() { }
		public void copyFrom(SelftagnameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputeleContext extends SelftagnameContext {
		public TerminalNode INPUT() { return getToken(myParser.INPUT, 0); }
		public InputeleContext(SelftagnameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterInputele(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitInputele(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitInputele(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BrdataContext extends SelftagnameContext {
		public TerminalNode BR() { return getToken(myParser.BR, 0); }
		public BrdataContext(SelftagnameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterBrdata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitBrdata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitBrdata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelftagnameContext selftagname() throws RecognitionException {
		SelftagnameContext _localctx = new SelftagnameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selftagname);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
				_localctx = new InputeleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(INPUT);
				}
				break;
			case BR:
				_localctx = new BrdataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(BR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArttiselftagContext extends ParserRuleContext {
		public TerminalNode SELF_ATTRIBUTE() { return getToken(myParser.SELF_ATTRIBUTE, 0); }
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(myParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(myParser.RPAREN, 0); }
		public List<TerminalNode> SLASH() { return getTokens(myParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(myParser.SLASH, i);
		}
		public ArttiselftagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arttiselftag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterArttiselftag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitArttiselftag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitArttiselftag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArttiselftagContext arttiselftag() throws RecognitionException {
		ArttiselftagContext _localctx = new ArttiselftagContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arttiselftag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(SELF_ATTRIBUTE);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(263);
				match(EQUAL);
				setState(264);
				match(QUOTE);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(265);
					match(ID);
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(271);
					match(LPAREN);
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(272);
						match(ID);
						}
						}
						setState(277);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SLASH) {
						{
						{
						setState(278);
						match(SLASH);
						setState(279);
						match(ID);
						}
						}
						setState(284);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(285);
					match(RPAREN);
					}
				}

				setState(288);
				match(QUOTE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlopenContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(myParser.TAG_OPEN, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(myParser.TAG_CLOSE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ArttContext artt() {
			return getRuleContext(ArttContext.class,0);
		}
		public List<CsselementContext> csselement() {
			return getRuleContexts(CsselementContext.class);
		}
		public CsselementContext csselement(int i) {
			return getRuleContext(CsselementContext.class,i);
		}
		public HtmlopenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlopen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterHtmlopen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitHtmlopen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitHtmlopen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlopenContext htmlopen() throws RecognitionException {
		HtmlopenContext _localctx = new HtmlopenContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_htmlopen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(TAG_OPEN);
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BUTTON:
			case DIV:
			case UL:
			case LI:
			case OL:
			case P:
			case FORM:
			case TEXTERA:
			case HEDEAR:
				{
				setState(292);
				name();
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 90144560344203264L) != 0)) {
					{
					{
					setState(293);
					csselement();
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case A:
				{
				setState(299);
				artt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(302);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArttContext extends ParserRuleContext {
		public TerminalNode A() { return getToken(myParser.A, 0); }
		public TerminalNode AARTT() { return getToken(myParser.AARTT, 0); }
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public TerminalNode SLASH() { return getToken(myParser.SLASH, 0); }
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public ArttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_artt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterArtt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitArtt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitArtt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArttContext artt() throws RecognitionException {
		ArttContext _localctx = new ArttContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_artt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(A);
			setState(305);
			match(AARTT);
			setState(306);
			match(EQUAL);
			setState(307);
			match(QUOTE);
			setState(308);
			match(SLASH);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(309);
				match(ID);
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
			match(QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlcloseContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(myParser.TAG_OPEN, 0); }
		public TerminalNode SLASH() { return getToken(myParser.SLASH, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(myParser.TAG_CLOSE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode A() { return getToken(myParser.A, 0); }
		public HtmlcloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlclose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterHtmlclose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitHtmlclose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitHtmlclose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlcloseContext htmlclose() throws RecognitionException {
		HtmlcloseContext _localctx = new HtmlcloseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_htmlclose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(TAG_OPEN);
			setState(318);
			match(SLASH);
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BUTTON:
			case DIV:
			case UL:
			case LI:
			case OL:
			case P:
			case FORM:
			case TEXTERA:
			case HEDEAR:
				{
				setState(319);
				name();
				}
				break;
			case A:
				{
				setState(320);
				match(A);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(323);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CsselementContext extends ParserRuleContext {
		public CsselementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csselement; }
	 
		public CsselementContext() { }
		public void copyFrom(CsselementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfartContext extends CsselementContext {
		public ArttiselftagContext arttiselftag() {
			return getRuleContext(ArttiselftagContext.class,0);
		}
		public SelfartContext(CsselementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterSelfart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitSelfart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitSelfart(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgfordataContext extends CsselementContext {
		public NgforContext ngfor() {
			return getRuleContext(NgforContext.class,0);
		}
		public NgfordataContext(CsselementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterNgfordata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitNgfordata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitNgfordata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClickdataContext extends CsselementContext {
		public ClickContext click() {
			return getRuleContext(ClickContext.class,0);
		}
		public ClickdataContext(CsselementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterClickdata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitClickdata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitClickdata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StylebackContext extends CsselementContext {
		public StylbackContext stylback() {
			return getRuleContext(StylbackContext.class,0);
		}
		public StylebackContext(CsselementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterStyleback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitStyleback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitStyleback(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyledataContext extends CsselementContext {
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public StyledataContext(CsselementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterStyledata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitStyledata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitStyledata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgifdataContext extends CsselementContext {
		public NgifContext ngif() {
			return getRuleContext(NgifContext.class,0);
		}
		public NgifdataContext(CsselementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterNgifdata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitNgifdata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitNgifdata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgsubmitContext extends CsselementContext {
		public TerminalNode NGSUBMIT() { return getToken(myParser.NGSUBMIT, 0); }
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(myParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(myParser.RPAREN, 0); }
		public NgsubmitContext(CsselementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterNgsubmit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitNgsubmit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitNgsubmit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CsselementContext csselement() throws RecognitionException {
		CsselementContext _localctx = new CsselementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_csselement);
		int _la;
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				_localctx = new StylebackContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				stylback();
				}
				break;
			case NGIF:
				_localctx = new NgifdataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				ngif();
				}
				break;
			case NGFOR:
				_localctx = new NgfordataContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				ngfor();
				}
				break;
			case LPAREN:
				_localctx = new ClickdataContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				click();
				}
				break;
			case STYLE:
				_localctx = new StyledataContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(329);
				style();
				}
				break;
			case SELF_ATTRIBUTE:
				_localctx = new SelfartContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(330);
				arttiselftag();
				}
				break;
			case NGSUBMIT:
				_localctx = new NgsubmitContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(331);
				match(NGSUBMIT);
				setState(332);
				match(EQUAL);
				setState(333);
				match(QUOTE);
				setState(334);
				match(ID);
				setState(335);
				match(LPAREN);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(336);
					match(ID);
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(342);
				match(RPAREN);
				setState(343);
				match(QUOTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylbackContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(myParser.LBRACK, 0); }
		public TerminalNode STYLE_BACK() { return getToken(myParser.STYLE_BACK, 0); }
		public TerminalNode RBRACK() { return getToken(myParser.RBRACK, 0); }
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public TerminalNode ID() { return getToken(myParser.ID, 0); }
		public StylbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterStylback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitStylback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitStylback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylbackContext stylback() throws RecognitionException {
		StylbackContext _localctx = new StylbackContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stylback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(LBRACK);
			setState(347);
			match(STYLE_BACK);
			setState(348);
			match(RBRACK);
			setState(349);
			match(EQUAL);
			setState(350);
			match(QUOTE);
			setState(351);
			match(ID);
			setState(352);
			match(QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgforContext extends ParserRuleContext {
		public TerminalNode NGFOR() { return getToken(myParser.NGFOR, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(myParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(myParser.EQUAL, i);
		}
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public TerminalNode LET() { return getToken(myParser.LET, 0); }
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public List<TerminalNode> OF() { return getTokens(myParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(myParser.OF, i);
		}
		public NgforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterNgfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitNgfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitNgfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgforContext ngfor() throws RecognitionException {
		NgforContext _localctx = new NgforContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ngfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(NGFOR);
			setState(355);
			match(EQUAL);
			setState(356);
			match(QUOTE);
			setState(357);
			match(LET);
			setState(361); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(358);
				match(ID);
				setState(359);
				_la = _input.LA(1);
				if ( !(_la==OF || _la==EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(360);
				match(ID);
				}
				}
				setState(363); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(365);
			match(QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgifContext extends ParserRuleContext {
		public TerminalNode NGIF() { return getToken(myParser.NGIF, 0); }
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public TerminalNode ID() { return getToken(myParser.ID, 0); }
		public NgifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterNgif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitNgif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitNgif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgifContext ngif() throws RecognitionException {
		NgifContext _localctx = new NgifContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ngif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(NGIF);
			setState(368);
			match(EQUAL);
			setState(369);
			match(QUOTE);
			setState(370);
			match(ID);
			setState(371);
			match(QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClickContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(myParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(myParser.LPAREN, i);
		}
		public TerminalNode CLICK() { return getToken(myParser.CLICK, 0); }
		public List<TerminalNode> RPAREN() { return getTokens(myParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(myParser.RPAREN, i);
		}
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public ClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_click; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClickContext click() throws RecognitionException {
		ClickContext _localctx = new ClickContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_click);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(LPAREN);
			setState(374);
			match(CLICK);
			setState(375);
			match(RPAREN);
			setState(376);
			match(EQUAL);
			setState(377);
			match(QUOTE);
			setState(378);
			match(ID);
			setState(379);
			match(LPAREN);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(380);
				match(ID);
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			match(RPAREN);
			setState(387);
			match(QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(myParser.STYLE, 0); }
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public List<TerminalNode> ATTRBUTE() { return getTokens(myParser.ATTRBUTE); }
		public TerminalNode ATTRBUTE(int i) {
			return getToken(myParser.ATTRBUTE, i);
		}
		public List<TerminalNode> COLON() { return getTokens(myParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(myParser.COLON, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(myParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(myParser.SEMI, i);
		}
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(STYLE);
			setState(390);
			match(EQUAL);
			setState(391);
			match(QUOTE);
			setState(397); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(392);
				match(ATTRBUTE);
				setState(393);
				match(COLON);
				setState(394);
				value();
				setState(395);
				match(SEMI);
				}
				}
				setState(399); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ATTRBUTE );
			setState(401);
			match(QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	 
		public NameContext() { }
		public void copyFrom(NameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivdataContext extends NameContext {
		public TerminalNode DIV() { return getToken(myParser.DIV, 0); }
		public DivdataContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterDivdata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitDivdata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitDivdata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PdataContext extends NameContext {
		public TerminalNode P() { return getToken(myParser.P, 0); }
		public PdataContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterPdata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitPdata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitPdata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LidataContext extends NameContext {
		public TerminalNode LI() { return getToken(myParser.LI, 0); }
		public LidataContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterLidata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitLidata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitLidata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UldataContext extends NameContext {
		public TerminalNode UL() { return getToken(myParser.UL, 0); }
		public UldataContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterUldata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitUldata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitUldata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FormmContext extends NameContext {
		public TerminalNode FORM() { return getToken(myParser.FORM, 0); }
		public FormmContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterFormm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitFormm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitFormm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HeadardataContext extends NameContext {
		public TerminalNode HEDEAR() { return getToken(myParser.HEDEAR, 0); }
		public HeadardataContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterHeadardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitHeadardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitHeadardata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextareaContext extends NameContext {
		public TerminalNode TEXTERA() { return getToken(myParser.TEXTERA, 0); }
		public TextareaContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterTextarea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitTextarea(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitTextarea(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ButtondataContext extends NameContext {
		public TerminalNode BUTTON() { return getToken(myParser.BUTTON, 0); }
		public ButtondataContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterButtondata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitButtondata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitButtondata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OldataContext extends NameContext {
		public TerminalNode OL() { return getToken(myParser.OL, 0); }
		public OldataContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterOldata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitOldata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitOldata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_name);
		try {
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIV:
				_localctx = new DivdataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(DIV);
				}
				break;
			case HEDEAR:
				_localctx = new HeadardataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(HEDEAR);
				}
				break;
			case P:
				_localctx = new PdataContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				match(P);
				}
				break;
			case OL:
				_localctx = new OldataContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(406);
				match(OL);
				}
				break;
			case LI:
				_localctx = new LidataContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(407);
				match(LI);
				}
				break;
			case UL:
				_localctx = new UldataContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(408);
				match(UL);
				}
				break;
			case BUTTON:
				_localctx = new ButtondataContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(409);
				match(BUTTON);
				}
				break;
			case TEXTERA:
				_localctx = new TextareaContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(410);
				match(TEXTERA);
				}
				break;
			case FORM:
				_localctx = new FormmContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(411);
				match(FORM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContentContext extends ParserRuleContext {
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
	 
		public ContentContext() { }
		public void copyFrom(ContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringdataContext extends ContentContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public StringdataContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterStringdata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitStringdata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitStringdata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlpagecontentContext extends ContentContext {
		public HtmlpageContext htmlpage() {
			return getRuleContext(HtmlpageContext.class,0);
		}
		public HtmlpagecontentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterHtmlpagecontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitHtmlpagecontent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitHtmlpagecontent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VardataContext extends ContentContext {
		public List<TerminalNode> LCURLY() { return getTokens(myParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(myParser.LCURLY, i);
		}
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(myParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(myParser.RCURLY, i);
		}
		public List<TerminalNode> COLON() { return getTokens(myParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(myParser.COLON, i);
		}
		public List<TerminalNode> DOT() { return getTokens(myParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(myParser.DOT, i);
		}
		public VardataContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterVardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitVardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitVardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_content);
		int _la;
		try {
			int _alt;
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new HtmlpagecontentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				htmlpage();
				}
				break;
			case 2:
				_localctx = new StringdataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(416); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(415);
						match(ID);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(418); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				_localctx = new VardataContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(420);
					match(ID);
					setState(421);
					match(COLON);
					}
					}
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(427);
				match(LCURLY);
				setState(428);
				match(LCURLY);
				setState(429);
				match(ID);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(430);
					match(DOT);
					setState(431);
					match(ID);
					}
					}
					setState(436);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(437);
				match(RCURLY);
				setState(438);
				match(RCURLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImgContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(myParser.TAG_OPEN, 0); }
		public TerminalNode IMG() { return getToken(myParser.IMG, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(myParser.TAG_CLOSE, 0); }
		public List<ImgartiContext> imgarti() {
			return getRuleContexts(ImgartiContext.class);
		}
		public ImgartiContext imgarti(int i) {
			return getRuleContext(ImgartiContext.class,i);
		}
		public List<CsselementContext> csselement() {
			return getRuleContexts(CsselementContext.class);
		}
		public CsselementContext csselement(int i) {
			return getRuleContext(CsselementContext.class,i);
		}
		public ImgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_img; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterImg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitImg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitImg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgContext img() throws RecognitionException {
		ImgContext _localctx = new ImgContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_img);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(TAG_OPEN);
			setState(442);
			match(IMG);
			setState(444); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(443);
					imgarti();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(446); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 90144560344203264L) != 0)) {
				{
				{
				setState(448);
				csselement();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImgartiContext extends ParserRuleContext {
		public ImgartiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imgarti; }
	 
		public ImgartiContext() { }
		public void copyFrom(ImgartiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtbuterimgContext extends ImgartiContext {
		public TerminalNode LBRACK() { return getToken(myParser.LBRACK, 0); }
		public TerminalNode IMG_ATTRIBUTE() { return getToken(myParser.IMG_ATTRIBUTE, 0); }
		public TerminalNode RBRACK() { return getToken(myParser.RBRACK, 0); }
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(myParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(myParser.DOT, i);
		}
		public AtbuterimgContext(ImgartiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterAtbuterimg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitAtbuterimg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitAtbuterimg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrtiContext extends ImgartiContext {
		public TerminalNode ATTRBUTE() { return getToken(myParser.ATTRBUTE, 0); }
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public TerminalNode ID() { return getToken(myParser.ID, 0); }
		public ArrtiContext(ImgartiContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterArrti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitArrti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitArrti(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgartiContext imgarti() throws RecognitionException {
		ImgartiContext _localctx = new ImgartiContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_imgarti);
		int _la;
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				_localctx = new AtbuterimgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				match(LBRACK);
				setState(457);
				match(IMG_ATTRIBUTE);
				setState(458);
				match(RBRACK);
				setState(459);
				match(EQUAL);
				setState(460);
				match(QUOTE);
				setState(461);
				match(ID);
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(462);
					match(DOT);
					setState(463);
					match(ID);
					}
					}
					setState(468);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(469);
				match(QUOTE);
				}
				break;
			case ATTRBUTE:
				_localctx = new ArrtiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				match(ATTRBUTE);
				setState(471);
				match(EQUAL);
				setState(472);
				match(QUOTE);
				setState(473);
				match(ID);
				setState(474);
				match(QUOTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefinitionContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(myParser.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(myParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode LCURLY() { return getToken(myParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(myParser.RCURLY, 0); }
		public TerminalNode IMPLEMENT() { return getToken(myParser.IMPLEMENT, 0); }
		public List<ClassBodyContext> classBody() {
			return getRuleContexts(ClassBodyContext.class);
		}
		public ClassBodyContext classBody(int i) {
			return getRuleContext(ClassBodyContext.class,i);
		}
		public TerminalNode IMPORTLIST() { return getToken(myParser.IMPORTLIST, 0); }
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(EXPORT);
			setState(478);
			match(CLASS);
			setState(479);
			match(ID);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENT) {
				{
				setState(480);
				match(IMPLEMENT);
				setState(481);
				_la = _input.LA(1);
				if ( !(_la==IMPORTLIST || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(484);
			match(LCURLY);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4535485464608L) != 0) || _la==ID) {
				{
				{
				setState(485);
				classBody();
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
	 
		public ClassBodyContext() { }
		public void copyFrom(ClassBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertydataContext extends ClassBodyContext {
		public PropertyDefinitionContext propertyDefinition() {
			return getRuleContext(PropertyDefinitionContext.class,0);
		}
		public PropertydataContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterPropertydata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitPropertydata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitPropertydata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethoddataContext extends ClassBodyContext {
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public MethoddataContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterMethoddata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitMethoddata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitMethoddata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CconstructContext extends ClassBodyContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public CconstructContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterCconstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitCconstruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitCconstruct(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArraydataContext extends ClassBodyContext {
		public ArrayDefinitionContext arrayDefinition() {
			return getRuleContext(ArrayDefinitionContext.class,0);
		}
		public ArraydataContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterArraydata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitArraydata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitArraydata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_classBody);
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new PropertydataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				propertyDefinition();
				}
				break;
			case 2:
				_localctx = new CconstructContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				constructor();
				}
				break;
			case 3:
				_localctx = new ArraydataContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				arrayDefinition();
				}
				break;
			case 4:
				_localctx = new MethoddataContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(496);
				methodDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDefinitionContext extends ParserRuleContext {
		public PropertyDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDefinition; }
	 
		public PropertyDefinitionContext() { }
		public void copyFrom(PropertyDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstproContext extends PropertyDefinitionContext {
		public TerminalNode CONST() { return getToken(myParser.CONST, 0); }
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public TerminalNode LPAREN() { return getToken(myParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(myParser.RPAREN, 0); }
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public ConstproContext(PropertyDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterConstpro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitConstpro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitConstpro(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Value2Context extends PropertyDefinitionContext {
		public TerminalNode MODIFIER() { return getToken(myParser.MODIFIER, 0); }
		public TerminalNode ID() { return getToken(myParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(myParser.SEMI, 0); }
		public Value2Context(PropertyDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterValue2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitValue2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitValue2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Value1Context extends PropertyDefinitionContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(myParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(myParser.SEMI, 0); }
		public TerminalNode TYPE() { return getToken(myParser.TYPE, 0); }
		public TerminalNode QMARK() { return getToken(myParser.QMARK, 0); }
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Value1Context(PropertyDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterValue1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitValue1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitValue1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends PropertyDefinitionContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(myParser.COLON, 0); }
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public TerminalNode SEMI() { return getToken(myParser.SEMI, 0); }
		public TerminalNode TYPE() { return getToken(myParser.TYPE, 0); }
		public TerminalNode QMARK() { return getToken(myParser.QMARK, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DefinitionContext(PropertyDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanvalueContext extends PropertyDefinitionContext {
		public TerminalNode ID() { return getToken(myParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(myParser.BOOLEAN, 0); }
		public TerminalNode SEMI() { return getToken(myParser.SEMI, 0); }
		public BooleanvalueContext(PropertyDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterBooleanvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitBooleanvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitBooleanvalue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapdefinitionContext extends PropertyDefinitionContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public TerminalNode LCURLY() { return getToken(myParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(myParser.RCURLY, 0); }
		public TerminalNode SEMI() { return getToken(myParser.SEMI, 0); }
		public List<TerminalNode> COLON() { return getTokens(myParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(myParser.COLON, i);
		}
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParser.COMMA, i);
		}
		public MapdefinitionContext(PropertyDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterMapdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitMapdefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitMapdefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDefinitionContext propertyDefinition() throws RecognitionException {
		PropertyDefinitionContext _localctx = new PropertyDefinitionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_propertyDefinition);
		int _la;
		try {
			int _alt;
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new Value1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				match(ID);
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QMARK) {
					{
					setState(500);
					match(QMARK);
					}
				}

				setState(503);
				match(COLON);
				setState(504);
				_la = _input.LA(1);
				if ( !(_la==TYPE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(505);
					match(EQUAL);
					setState(506);
					value();
					}
				}

				setState(509);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new Value2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				match(MODIFIER);
				setState(511);
				match(ID);
				setState(512);
				match(EQUAL);
				setState(513);
				value();
				setState(514);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new DefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				match(ID);
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QMARK) {
					{
					setState(517);
					match(QMARK);
					}
				}

				setState(520);
				match(COLON);
				setState(521);
				_la = _input.LA(1);
				if ( !(_la==TYPE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(522);
				match(EQUAL);
				setState(523);
				match(QUOTE);
				setState(525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(524);
					value();
					}
					break;
				}
				setState(527);
				match(QUOTE);
				setState(528);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new ConstproContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(529);
				match(CONST);
				setState(530);
				match(ID);
				setState(531);
				match(EQUAL);
				setState(532);
				match(ID);
				setState(533);
				match(LPAREN);
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 38654705669L) != 0)) {
					{
					{
					setState(534);
					parameterList();
					}
					}
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(540);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new BooleanvalueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(541);
				match(ID);
				setState(542);
				match(EQUAL);
				setState(543);
				match(BOOLEAN);
				setState(544);
				match(SEMI);
				}
				break;
			case 6:
				_localctx = new MapdefinitionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(545);
				match(ID);
				setState(546);
				match(EQUAL);
				setState(547);
				match(LCURLY);
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(548);
					match(ID);
					setState(549);
					match(COLON);
					setState(551);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(550);
						match(QUOTE);
						}
						break;
					}
					setState(556);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(553);
							value();
							}
							} 
						}
						setState(558);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
					}
					setState(560);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==QUOTE) {
						{
						setState(559);
						match(QUOTE);
						}
					}

					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(562);
						match(COMMA);
						}
						}
						setState(567);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(573);
				match(RCURLY);
				setState(574);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualsExprContext extends ValueContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(myParser.LPAREN, 0); }
		public TerminalNode P() { return getToken(myParser.P, 0); }
		public TerminalNode ARROW() { return getToken(myParser.ARROW, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(myParser.RPAREN, 0); }
		public EqualsExprContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterEqualsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitEqualsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitEqualsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallfunContext extends ValueContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(myParser.LPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(myParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(myParser.RCURLY, 0); }
		public TerminalNode RPAREN() { return getToken(myParser.RPAREN, 0); }
		public List<TerminalNode> COLON() { return getTokens(myParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(myParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParser.COMMA, i);
		}
		public CallfunContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterCallfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitCallfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitCallfun(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends ValueContext {
		public TerminalNode BOOLEAN() { return getToken(myParser.BOOLEAN, 0); }
		public BooleanContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColorvalueContext extends ValueContext {
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public List<TerminalNode> HASH() { return getTokens(myParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(myParser.HASH, i);
		}
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParser.COMMA, i);
		}
		public ColorvalueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterColorvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitColorvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitColorvalue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringvalueContext extends ValueContext {
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public StringvalueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterStringvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitStringvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitStringvalue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ValueContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParser.COMMA, i);
		}
		public IdContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HashidContext extends ValueContext {
		public TerminalNode HASH() { return getToken(myParser.HASH, 0); }
		public TerminalNode ID() { return getToken(myParser.ID, 0); }
		public HashidContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterHashid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitHashid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitHashid(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LparenContext extends ValueContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(myParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(myParser.RPAREN, 0); }
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(myParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(myParser.SEMI, i);
		}
		public LparenContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterLparen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitLparen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitLparen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LpranqouteContext extends ValueContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(myParser.LPAREN, 0); }
		public TerminalNode LBRACK() { return getToken(myParser.LBRACK, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public TerminalNode SLASH() { return getToken(myParser.SLASH, 0); }
		public TerminalNode RBRACK() { return getToken(myParser.RBRACK, 0); }
		public TerminalNode RPAREN() { return getToken(myParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(myParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParser.COMMA, i);
		}
		public LpranqouteContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterLpranqoute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitLpranqoute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitLpranqoute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdcolonContext extends ValueContext {
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(myParser.COLON, 0); }
		public List<TerminalNode> SLASH() { return getTokens(myParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(myParser.SLASH, i);
		}
		public IdcolonContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterIdcolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitIdcolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitIdcolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_value);
		int _la;
		try {
			int _alt;
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				_localctx = new IdcolonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				match(QUOTE);
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(578);
					match(ID);
					setState(579);
					match(COLON);
					}
				}

				setState(584); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(582);
					match(SLASH);
					setState(583);
					match(ID);
					}
					}
					setState(586); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SLASH );
				setState(588);
				match(QUOTE);
				}
				break;
			case 2:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				match(BOOLEAN);
				}
				break;
			case 3:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(591); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(590);
						match(ID);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(593); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(595);
						match(COMMA);
						}
						} 
					}
					setState(600);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
				break;
			case 4:
				_localctx = new ColorvalueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(601);
				match(QUOTE);
				setState(604); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(602);
					match(HASH);
					setState(603);
					match(ID);
					}
					}
					setState(606); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==HASH );
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(608);
					match(COMMA);
					setState(609);
					match(ID);
					}
					}
					setState(614);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(615);
				match(QUOTE);
				}
				break;
			case 5:
				_localctx = new HashidContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(616);
				match(HASH);
				setState(617);
				match(ID);
				}
				break;
			case 6:
				_localctx = new EqualsExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(618);
				match(ID);
				setState(619);
				match(LPAREN);
				setState(620);
				match(P);
				setState(621);
				match(ARROW);
				setState(622);
				match(ID);
				setState(623);
				operation();
				setState(624);
				match(ID);
				setState(625);
				match(RPAREN);
				}
				break;
			case 7:
				_localctx = new LparenContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(627);
				match(ID);
				setState(628);
				match(LPAREN);
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 38654705669L) != 0)) {
					{
					setState(631);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						setState(629);
						match(ID);
						}
						break;
					case 2:
						{
						setState(630);
						parameterList();
						}
						break;
					}
					}
					setState(635);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(636);
				match(RPAREN);
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(637);
						match(SEMI);
						}
						} 
					}
					setState(642);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				}
				break;
			case 8:
				_localctx = new LpranqouteContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(643);
				match(ID);
				setState(644);
				match(LPAREN);
				setState(645);
				match(LBRACK);
				setState(646);
				match(QUOTE);
				setState(647);
				match(SLASH);
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(648);
					match(ID);
					}
					}
					setState(653);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(654);
				match(QUOTE);
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(655);
					match(COMMA);
					setState(656);
					match(ID);
					}
					}
					setState(661);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(662);
				match(RBRACK);
				setState(663);
				match(RPAREN);
				}
				break;
			case 9:
				_localctx = new CallfunContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(664);
				match(ID);
				setState(665);
				match(LPAREN);
				setState(666);
				match(LCURLY);
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(667);
					match(ID);
					setState(668);
					match(COLON);
					setState(669);
					match(ID);
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(670);
						match(COMMA);
						}
						}
						setState(675);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(680);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(681);
				match(RCURLY);
				setState(682);
				match(RPAREN);
				}
				break;
			case 10:
				_localctx = new StringvalueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(683);
				match(QUOTE);
				setState(685); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(684);
					match(ID);
					}
					}
					setState(687); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(689);
				match(QUOTE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(myParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(myParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(myParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(myParser.RBRACK, i);
		}
		public TerminalNode SEMI() { return getToken(myParser.SEMI, 0); }
		public List<TerminalNode> COLON() { return getTokens(myParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(myParser.COLON, i);
		}
		public TerminalNode TYPE() { return getToken(myParser.TYPE, 0); }
		public List<ArrayListContext> arrayList() {
			return getRuleContexts(ArrayListContext.class);
		}
		public ArrayListContext arrayList(int i) {
			return getRuleContext(ArrayListContext.class,i);
		}
		public TerminalNode CONST() { return getToken(myParser.CONST, 0); }
		public TerminalNode MODIFIER() { return getToken(myParser.MODIFIER, 0); }
		public ArrayDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterArrayDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitArrayDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitArrayDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDefinitionContext arrayDefinition() throws RecognitionException {
		ArrayDefinitionContext _localctx = new ArrayDefinitionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST || _la==MODIFIER) {
				{
				setState(692);
				_la = _input.LA(1);
				if ( !(_la==CONST || _la==MODIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(695);
			match(ID);
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(696);
				match(COLON);
				}
				}
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(702);
				match(TYPE);
				}
				break;
			case ID:
				{
				setState(703);
				match(ID);
				setState(704);
				match(LBRACK);
				setState(705);
				match(RBRACK);
				}
				break;
			case EQUAL:
				break;
			default:
				break;
			}
			setState(708);
			match(EQUAL);
			setState(709);
			match(LBRACK);
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 38654705677L) != 0)) {
				{
				{
				setState(710);
				arrayList();
				}
				}
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(716);
			match(RBRACK);
			setState(717);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayListContext extends ParserRuleContext {
		public ArrayListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayList; }
	 
		public ArrayListContext() { }
		public void copyFrom(ArrayListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncludearrayContext extends ArrayListContext {
		public TerminalNode LCURLY() { return getToken(myParser.LCURLY, 0); }
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(myParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(myParser.COLON, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(myParser.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(myParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParser.COMMA, i);
		}
		public IncludearrayContext(ArrayListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterIncludearray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitIncludearray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitIncludearray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValdataContext extends ArrayListContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParser.COMMA, i);
		}
		public ValdataContext(ArrayListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterValdata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitValdata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitValdata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayListContext arrayList() throws RecognitionException {
		ArrayListContext _localctx = new ArrayListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrayList);
		int _la;
		try {
			int _alt;
			setState(753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				_localctx = new IncludearrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(719);
				match(LCURLY);
				setState(720);
				match(ID);
				setState(721);
				match(COLON);
				setState(722);
				value();
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(723);
					match(COMMA);
					setState(724);
					match(ID);
					setState(725);
					match(COLON);
					setState(726);
					value();
					}
					}
					setState(731);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(732);
				match(RCURLY);
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(733);
					match(COMMA);
					}
					}
					setState(738);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case HASH:
			case QUOTE:
			case ID:
				_localctx = new ValdataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				value();
				setState(744);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(740);
						match(COMMA);
						setState(741);
						value();
						}
						} 
					}
					setState(746);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(747);
					match(COMMA);
					}
					}
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(myParser.CONSTRUCTOR, 0); }
		public TerminalNode LPAREN() { return getToken(myParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(myParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(myParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(myParser.RCURLY, 0); }
		public List<ParameterListconstructerContext> parameterListconstructer() {
			return getRuleContexts(ParameterListconstructerContext.class);
		}
		public ParameterListconstructerContext parameterListconstructer(int i) {
			return getRuleContext(ParameterListconstructerContext.class,i);
		}
		public List<MethodBodyContext> methodBody() {
			return getRuleContexts(MethodBodyContext.class);
		}
		public MethodBodyContext methodBody(int i) {
			return getRuleContext(MethodBodyContext.class,i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(CONSTRUCTOR);
			setState(756);
			match(LPAREN);
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(757);
				parameterListconstructer();
				}
				}
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(763);
			match(RPAREN);
			setState(764);
			match(LCURLY);
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20833683762192384L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 577L) != 0)) {
				{
				{
				setState(765);
				methodBody();
				}
				}
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(771);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListconstructerContext extends ParserRuleContext {
		public TerminalNode MODIFIER() { return getToken(myParser.MODIFIER, 0); }
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(myParser.COLON, 0); }
		public TerminalNode IMPORTLIST() { return getToken(myParser.IMPORTLIST, 0); }
		public List<TerminalNode> COMMA() { return getTokens(myParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParser.COMMA, i);
		}
		public ParameterListconstructerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterListconstructer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterParameterListconstructer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitParameterListconstructer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitParameterListconstructer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListconstructerContext parameterListconstructer() throws RecognitionException {
		ParameterListconstructerContext _localctx = new ParameterListconstructerContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_parameterListconstructer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(MODIFIER);
			setState(774);
			match(ID);
			setState(775);
			match(COLON);
			setState(776);
			_la = _input.LA(1);
			if ( !(_la==IMPORTLIST || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(777);
				match(COMMA);
				}
				}
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(myParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(myParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(myParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(myParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(myParser.RCURLY, 0); }
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public TerminalNode COLON() { return getToken(myParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public List<MethodBodyContext> methodBody() {
			return getRuleContexts(MethodBodyContext.class);
		}
		public MethodBodyContext methodBody(int i) {
			return getRuleContext(MethodBodyContext.class,i);
		}
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(ID);
			setState(784);
			match(LPAREN);
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 38654705669L) != 0)) {
				{
				{
				setState(785);
				parameterList();
				}
				}
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(791);
			match(RPAREN);
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(792);
				match(COLON);
				setState(793);
				typeAnnotation();
				}
			}

			setState(796);
			match(LCURLY);
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20833683762192384L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 577L) != 0)) {
				{
				{
				setState(797);
				methodBody();
				}
				}
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(803);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAnnotationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode LBRACK() { return getToken(myParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(myParser.RBRACK, 0); }
		public TerminalNode PIPE() { return getToken(myParser.PIPE, 0); }
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterTypeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitTypeAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitTypeAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(ID);
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(806);
				match(LBRACK);
				setState(807);
				match(RBRACK);
				}
			}

			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(810);
				match(PIPE);
				setState(811);
				match(ID);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	 
		public ParameterListContext() { }
		public void copyFrom(ParameterListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Type11Context extends ParameterListContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(myParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(myParser.TYPE, 0); }
		public TerminalNode TAG_OPEN() { return getToken(myParser.TAG_OPEN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(myParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParser.COMMA, i);
		}
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public TerminalNode TAG_CLOSE() { return getToken(myParser.TAG_CLOSE, 0); }
		public Type11Context(ParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterType11(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitType11(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitType11(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Type21Context extends ParameterListContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Type21Context(ParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterType21(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitType21(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitType21(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parameterList);
		int _la;
		try {
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				_localctx = new Type11Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
				match(ID);
				setState(815);
				match(COLON);
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(816);
					match(ID);
					}
				}

				setState(827);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(819);
					match(TYPE);
					}
					break;
				case TAG_OPEN:
					{
					setState(820);
					match(TAG_OPEN);
					setState(821);
					match(ID);
					setState(822);
					match(COMMA);
					setState(823);
					match(QUOTE);
					setState(824);
					match(ID);
					setState(825);
					match(QUOTE);
					setState(826);
					match(TAG_CLOSE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(829);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				_localctx = new Type21Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
				value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
	 
		public MethodBodyContext() { }
		public void copyFrom(MethodBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDefinitiondataContext extends MethodBodyContext {
		public ArrayDefinitionContext arrayDefinition() {
			return getRuleContext(ArrayDefinitionContext.class,0);
		}
		public ArrayDefinitiondataContext(MethodBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterArrayDefinitiondata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitArrayDefinitiondata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitArrayDefinitiondata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfstatementContext extends MethodBodyContext {
		public TerminalNode IF() { return getToken(myParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(myParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(myParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(myParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(myParser.RCURLY, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<MethodBodyContext> methodBody() {
			return getRuleContexts(MethodBodyContext.class);
		}
		public MethodBodyContext methodBody(int i) {
			return getRuleContext(MethodBodyContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(myParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(myParser.SEMI, i);
		}
		public IfstatementContext(MethodBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalcolorContext extends MethodBodyContext {
		public CalcualtecolorContext calcualtecolor() {
			return getRuleContext(CalcualtecolorContext.class,0);
		}
		public CalcolorContext(MethodBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterCalcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitCalcolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitCalcolor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends MethodBodyContext {
		public TerminalNode ID() { return getToken(myParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(myParser.SEMI, 0); }
		public VarContext(MethodBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDefinitiondataContext extends MethodBodyContext {
		public PropertyDefinitionContext propertyDefinition() {
			return getRuleContext(PropertyDefinitionContext.class,0);
		}
		public PropertyDefinitiondataContext(MethodBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterPropertyDefinitiondata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitPropertyDefinitiondata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitPropertyDefinitiondata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValuedataContext extends MethodBodyContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValuedataContext(MethodBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterValuedata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitValuedata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitValuedata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnExprContext extends MethodBodyContext {
		public TerminalNode SEMI() { return getToken(myParser.SEMI, 0); }
		public TerminalNode RETURN() { return getToken(myParser.RETURN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ReturnExprContext(MethodBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterReturnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitReturnExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitReturnExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends MethodBodyContext {
		public ObjectdefinetionContext objectdefinetion() {
			return getRuleContext(ObjectdefinetionContext.class,0);
		}
		public ObjectContext(MethodBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_methodBody);
		int _la;
		try {
			int _alt;
			setState(875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				_localctx = new ValuedataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(835);
				value();
				}
				break;
			case 2:
				_localctx = new CalcolorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(836);
				calcualtecolor();
				}
				break;
			case 3:
				_localctx = new ObjectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(837);
				objectdefinetion();
				}
				break;
			case 4:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(838);
				match(ID);
				setState(839);
				match(EQUAL);
				setState(840);
				value();
				setState(841);
				match(SEMI);
				}
				break;
			case 5:
				_localctx = new PropertyDefinitiondataContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(843);
				propertyDefinition();
				}
				break;
			case 6:
				_localctx = new ArrayDefinitiondataContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(844);
				arrayDefinition();
				}
				break;
			case 7:
				_localctx = new ReturnExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(845);
					match(RETURN);
					}
				}

				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 158329674551297L) != 0)) {
					{
					{
					setState(848);
					expression();
					}
					}
					setState(853);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(854);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new IfstatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(855);
				match(IF);
				setState(856);
				match(LPAREN);
				setState(857);
				condition();
				setState(858);
				match(RPAREN);
				setState(859);
				match(LCURLY);
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20833683762192384L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 577L) != 0)) {
					{
					setState(868);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
					case 1:
						{
						setState(860);
						value();
						setState(864);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(861);
								match(SEMI);
								}
								} 
							}
							setState(866);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(867);
						methodBody();
						}
						break;
					}
					}
					setState(872);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(873);
				match(RCURLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdcondContext extends ConditionContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(myParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(myParser.MINUS, 0); }
		public IdcondContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterIdcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitIdcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitIdcond(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperationcondContext extends ConditionContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public OperationcondContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterOperationcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitOperationcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitOperationcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_condition);
		int _la;
		try {
			setState(891);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				_localctx = new IdcondContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(877);
				match(ID);
				setState(878);
				operation();
				setState(879);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(880);
				match(ID);
				}
				break;
			case 2:
				_localctx = new OperationcondContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(882);
				match(ID);
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 1639L) != 0)) {
					{
					{
					setState(883);
					operation();
					setState(884);
					match(ID);
					}
					}
					setState(890);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoteqeqContext extends OperationContext {
		public TerminalNode NOTEQEQ() { return getToken(myParser.NOTEQEQ, 0); }
		public NoteqeqContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterNoteqeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitNoteqeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitNoteqeq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends OperationContext {
		public TerminalNode OR() { return getToken(myParser.OR, 0); }
		public OrContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqeqeqContext extends OperationContext {
		public TerminalNode EQEQEQ() { return getToken(myParser.EQEQEQ, 0); }
		public EqeqeqContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterEqeqeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitEqeqeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitEqeqeq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends OperationContext {
		public TerminalNode AND() { return getToken(myParser.AND, 0); }
		public AndContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqeqContext extends OperationContext {
		public TerminalNode EQEQ() { return getToken(myParser.EQEQ, 0); }
		public EqeqContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterEqeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitEqeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitEqeq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtContext extends OperationContext {
		public TerminalNode LT() { return getToken(myParser.LT, 0); }
		public LtContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitLt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtContext extends OperationContext {
		public TerminalNode GT() { return getToken(myParser.GT, 0); }
		public GtContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitGt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_operation);
		try {
			setState(900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQEQ:
				_localctx = new EqeqContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(893);
				match(EQEQ);
				}
				break;
			case EQEQEQ:
				_localctx = new EqeqeqContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(894);
				match(EQEQEQ);
				}
				break;
			case NOTEQEQ:
				_localctx = new NoteqeqContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(895);
				match(NOTEQEQ);
				}
				break;
			case LT:
				_localctx = new LtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(896);
				match(LT);
				}
				break;
			case GT:
				_localctx = new GtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(897);
				match(GT);
				}
				break;
			case AND:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(898);
				match(AND);
				}
				break;
			case OR:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(899);
				match(OR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SparedExprContext extends ExpressionContext {
		public TerminalNode LBRACK() { return getToken(myParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(myParser.RBRACK, 0); }
		public SpreadExpressionListContext spreadExpressionList() {
			return getRuleContext(SpreadExpressionListContext.class,0);
		}
		public SparedExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterSparedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitSparedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitSparedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleArrowContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(myParser.ID, 0); }
		public TerminalNode ARROW() { return getToken(myParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleArrowContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterSimpleArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitSimpleArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitSimpleArrow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisPropContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(myParser.ID, 0); }
		public ThisPropContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterThisProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitThisProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitThisProp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueexContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CONST() { return getToken(myParser.CONST, 0); }
		public TerminalNode ID() { return getToken(myParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public ValueexContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterValueex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitValueex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitValueex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expression);
		int _la;
		try {
			setState(917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				_localctx = new ValueexContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(902);
					match(CONST);
					setState(903);
					match(ID);
					setState(904);
					match(EQUAL);
					}
				}

				setState(907);
				value();
				}
				break;
			case 2:
				_localctx = new ThisPropContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
				match(ID);
				}
				break;
			case 3:
				_localctx = new SimpleArrowContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(909);
				match(ID);
				setState(910);
				match(ARROW);
				setState(911);
				expression();
				}
				break;
			case 4:
				_localctx = new SparedExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(912);
				match(LBRACK);
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 158346854420481L) != 0)) {
					{
					setState(913);
					spreadExpressionList();
					}
				}

				setState(916);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpreadExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParser.COMMA, i);
		}
		public List<TerminalNode> SPREAD() { return getTokens(myParser.SPREAD); }
		public TerminalNode SPREAD(int i) {
			return getToken(myParser.SPREAD, i);
		}
		public SpreadExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spreadExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterSpreadExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitSpreadExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitSpreadExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpreadExpressionListContext spreadExpressionList() throws RecognitionException {
		SpreadExpressionListContext _localctx = new SpreadExpressionListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_spreadExpressionList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPREAD) {
				{
				setState(919);
				match(SPREAD);
				}
			}

			setState(922);
			expression();
			}
			setState(931);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(924);
					match(COMMA);
					setState(926);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPREAD) {
						{
						setState(925);
						match(SPREAD);
						}
					}

					setState(928);
					expression();
					}
					} 
				}
				setState(933);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalcualtecolorContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public TerminalNode LPAREN() { return getToken(myParser.LPAREN, 0); }
		public ContenetcolorcalContext contenetcolorcal() {
			return getRuleContext(ContenetcolorcalContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(myParser.RPAREN, 0); }
		public TerminalNode LBRACK() { return getToken(myParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(myParser.RBRACK, 0); }
		public TerminalNode SEMI() { return getToken(myParser.SEMI, 0); }
		public CalcualtecolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcualtecolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterCalcualtecolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitCalcualtecolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitCalcualtecolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcualtecolorContext calcualtecolor() throws RecognitionException {
		CalcualtecolorContext _localctx = new CalcualtecolorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_calcualtecolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			match(ID);
			setState(935);
			match(EQUAL);
			setState(936);
			match(ID);
			setState(937);
			match(LPAREN);
			setState(938);
			contenetcolorcal();
			setState(939);
			match(RPAREN);
			setState(940);
			match(LBRACK);
			setState(941);
			match(ID);
			setState(942);
			match(RBRACK);
			setState(943);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContenetcolorcalContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(myParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(myParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(myParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(myParser.RPAREN, i);
		}
		public TerminalNode ARROW() { return getToken(myParser.ARROW, 0); }
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode CALCULAATE() { return getToken(myParser.CALCULAATE, 0); }
		public ContenetcolorcalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenetcolorcal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterContenetcolorcal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitContenetcolorcal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitContenetcolorcal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContenetcolorcalContext contenetcolorcal() throws RecognitionException {
		ContenetcolorcalContext _localctx = new ContenetcolorcalContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_contenetcolorcal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(LPAREN);
			setState(946);
			match(RPAREN);
			setState(947);
			match(ARROW);
			setState(948);
			match(ID);
			setState(949);
			match(LPAREN);
			setState(950);
			match(RPAREN);
			setState(951);
			match(CALCULAATE);
			setState(952);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(myParser.EXPORT, 0); }
		public TerminalNode INTERFACE() { return getToken(myParser.INTERFACE, 0); }
		public TerminalNode ID() { return getToken(myParser.ID, 0); }
		public TerminalNode LCURLY() { return getToken(myParser.LCURLY, 0); }
		public InterfacecontentContext interfacecontent() {
			return getRuleContext(InterfacecontentContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(myParser.RCURLY, 0); }
		public InterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceContext interface_() throws RecognitionException {
		InterfaceContext _localctx = new InterfaceContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_interface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(EXPORT);
			setState(955);
			match(INTERFACE);
			setState(956);
			match(ID);
			setState(957);
			match(LCURLY);
			setState(958);
			interfacecontent();
			setState(959);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfacecontentContext extends ParserRuleContext {
		public List<PropertyDefinitionContext> propertyDefinition() {
			return getRuleContexts(PropertyDefinitionContext.class);
		}
		public PropertyDefinitionContext propertyDefinition(int i) {
			return getRuleContext(PropertyDefinitionContext.class,i);
		}
		public InterfacecontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfacecontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterInterfacecontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitInterfacecontent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitInterfacecontent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacecontentContext interfacecontent() throws RecognitionException {
		InterfacecontentContext _localctx = new InterfacecontentContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_interfacecontent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 140737488355361L) != 0)) {
				{
				{
				setState(961);
				propertyDefinition();
				}
				}
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InjectableDefinitionContext extends ParserRuleContext {
		public TerminalNode INJECTABLE() { return getToken(myParser.INJECTABLE, 0); }
		public TerminalNode LPAREN() { return getToken(myParser.LPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(myParser.LCURLY, 0); }
		public TerminalNode PROVIDIN() { return getToken(myParser.PROVIDIN, 0); }
		public TerminalNode COLON() { return getToken(myParser.COLON, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public TerminalNode ID() { return getToken(myParser.ID, 0); }
		public TerminalNode RCURLY() { return getToken(myParser.RCURLY, 0); }
		public TerminalNode RPAREN() { return getToken(myParser.RPAREN, 0); }
		public InjectableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterInjectableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitInjectableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitInjectableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectableDefinitionContext injectableDefinition() throws RecognitionException {
		InjectableDefinitionContext _localctx = new InjectableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_injectableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(INJECTABLE);
			setState(968);
			match(LPAREN);
			setState(969);
			match(LCURLY);
			setState(970);
			match(PROVIDIN);
			setState(971);
			match(COLON);
			setState(972);
			match(QUOTE);
			setState(973);
			match(ID);
			setState(974);
			match(QUOTE);
			setState(975);
			match(RCURLY);
			setState(976);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectdefinetionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public TerminalNode LCURLY() { return getToken(myParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(myParser.RCURLY, 0); }
		public TerminalNode SEMI() { return getToken(myParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(myParser.COLON, 0); }
		public TerminalNode LBRACK() { return getToken(myParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(myParser.RBRACK, 0); }
		public List<TerminalNode> CONST() { return getTokens(myParser.CONST); }
		public TerminalNode CONST(int i) {
			return getToken(myParser.CONST, i);
		}
		public List<ContenttContext> contentt() {
			return getRuleContexts(ContenttContext.class);
		}
		public ContenttContext contentt(int i) {
			return getRuleContext(ContenttContext.class,i);
		}
		public ObjectdefinetionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectdefinetion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterObjectdefinetion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitObjectdefinetion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitObjectdefinetion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectdefinetionContext objectdefinetion() throws RecognitionException {
		ObjectdefinetionContext _localctx = new ObjectdefinetionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_objectdefinetion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(978);
				match(CONST);
				}
				}
				setState(983);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(984);
			match(ID);
			setState(990);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				{
				setState(985);
				match(COLON);
				setState(986);
				match(ID);
				}
				break;
			case LBRACK:
				{
				setState(987);
				match(LBRACK);
				setState(988);
				match(ID);
				setState(989);
				match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(992);
			match(EQUAL);
			setState(993);
			match(LCURLY);
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 158346854420481L) != 0)) {
				{
				{
				setState(994);
				contentt();
				}
				}
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1000);
			match(RCURLY);
			setState(1001);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContenttContext extends ParserRuleContext {
		public ContenttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentt; }
	 
		public ContenttContext() { }
		public void copyFrom(ContenttContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpareteddContext extends ContenttContext {
		public SpreadExpressionListContext spreadExpressionList() {
			return getRuleContext(SpreadExpressionListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(myParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParser.COMMA, i);
		}
		public SpareteddContext(ContenttContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterSparetedd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitSparetedd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitSparetedd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Type1Context extends ContenttContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(myParser.COLON, 0); }
		public List<TerminalNode> PLUS() { return getTokens(myParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(myParser.PLUS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParser.COMMA, i);
		}
		public Type1Context(ContenttContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterType1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitType1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitType1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContenttContext contentt() throws RecognitionException {
		ContenttContext _localctx = new ContenttContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_contentt);
		int _la;
		try {
			setState(1021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				_localctx = new Type1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1003);
				match(ID);
				setState(1004);
				match(COLON);
				setState(1005);
				match(ID);
				setState(1006);
				match(PLUS);
				setState(1007);
				match(PLUS);
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1008);
					match(COMMA);
					}
					}
					setState(1013);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new SpareteddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				spreadExpressionList();
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1015);
					match(COMMA);
					}
					}
					setState(1020);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001U\u0400\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0001"+
		"\u0000\u0004\u0000f\b\u0000\u000b\u0000\f\u0000g\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"q\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003|\b\u0003"+
		"\n\u0003\f\u0003\u007f\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004"+
		"\u0003\u0084\b\u0003\u000b\u0003\f\u0003\u0085\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u008e\b\u0004"+
		"\n\u0004\f\u0004\u0091\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u0096\b\u0004\n\u0004\f\u0004\u0099\t\u0004\u0003\u0004\u009b\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00a6\b\u0006\n"+
		"\u0006\f\u0006\u00a9\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00c4\b\u0007\n"+
		"\u0007\f\u0007\u00c7\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00d1"+
		"\b\u0007\n\u0007\f\u0007\u00d4\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00d8\b\u0007\u0001\b\u0001\b\u0005\b\u00dc\b\b\n\b\f\b\u00df\t\b\u0001"+
		"\b\u0001\b\u0005\b\u00e3\b\b\n\b\f\b\u00e6\t\b\u0001\t\u0001\t\u0001\t"+
		"\u0003\t\u00eb\b\t\u0001\n\u0001\n\u0005\n\u00ef\b\n\n\n\f\n\u00f2\t\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00f9"+
		"\b\u000b\n\u000b\f\u000b\u00fc\t\u000b\u0001\u000b\u0003\u000b\u00ff\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u0105\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u010b\b\r\n\r\f\r\u010e\t\r\u0001\r"+
		"\u0001\r\u0005\r\u0112\b\r\n\r\f\r\u0115\t\r\u0001\r\u0001\r\u0005\r\u0119"+
		"\b\r\n\r\f\r\u011c\t\r\u0001\r\u0003\r\u011f\b\r\u0001\r\u0003\r\u0122"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0127\b\u000e\n\u000e"+
		"\f\u000e\u012a\t\u000e\u0001\u000e\u0003\u000e\u012d\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u0137\b\u000f\n\u000f\f\u000f\u013a\t\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0142\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0152\b\u0011\n"+
		"\u0011\f\u0011\u0155\t\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0159"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u016a\b\u0013\u000b"+
		"\u0013\f\u0013\u016b\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u017e\b\u0015\n\u0015\f\u0015\u0181\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0004\u0016\u018e\b\u0016\u000b\u0016"+
		"\f\u0016\u018f\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u019d\b\u0017\u0001\u0018\u0001\u0018\u0004\u0018\u01a1\b"+
		"\u0018\u000b\u0018\f\u0018\u01a2\u0001\u0018\u0001\u0018\u0005\u0018\u01a7"+
		"\b\u0018\n\u0018\f\u0018\u01aa\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u01b1\b\u0018\n\u0018\f\u0018\u01b4"+
		"\t\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01b8\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0004\u0019\u01bd\b\u0019\u000b\u0019\f\u0019"+
		"\u01be\u0001\u0019\u0005\u0019\u01c2\b\u0019\n\u0019\f\u0019\u01c5\t\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01d1\b\u001a"+
		"\n\u001a\f\u001a\u01d4\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01dc\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01e3\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u01e7\b\u001b\n\u001b\f\u001b\u01ea\t\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u01f2\b\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u01f6\b"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01fc"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0207\b\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u020e"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0218\b\u001d\n\u001d\f\u001d"+
		"\u021b\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u0228\b\u001d\u0001\u001d\u0005\u001d\u022b\b\u001d\n\u001d"+
		"\f\u001d\u022e\t\u001d\u0001\u001d\u0003\u001d\u0231\b\u001d\u0001\u001d"+
		"\u0005\u001d\u0234\b\u001d\n\u001d\f\u001d\u0237\t\u001d\u0005\u001d\u0239"+
		"\b\u001d\n\u001d\f\u001d\u023c\t\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0240\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0245\b"+
		"\u001e\u0001\u001e\u0001\u001e\u0004\u001e\u0249\b\u001e\u000b\u001e\f"+
		"\u001e\u024a\u0001\u001e\u0001\u001e\u0001\u001e\u0004\u001e\u0250\b\u001e"+
		"\u000b\u001e\f\u001e\u0251\u0001\u001e\u0005\u001e\u0255\b\u001e\n\u001e"+
		"\f\u001e\u0258\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0004\u001e"+
		"\u025d\b\u001e\u000b\u001e\f\u001e\u025e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u0263\b\u001e\n\u001e\f\u001e\u0266\t\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u0278\b\u001e\n\u001e\f\u001e\u027b"+
		"\t\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u027f\b\u001e\n\u001e\f\u001e"+
		"\u0282\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0005\u001e\u028a\b\u001e\n\u001e\f\u001e\u028d\t\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0292\b\u001e\n\u001e\f\u001e"+
		"\u0295\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u02a0\b\u001e"+
		"\n\u001e\f\u001e\u02a3\t\u001e\u0005\u001e\u02a5\b\u001e\n\u001e\f\u001e"+
		"\u02a8\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0004\u001e"+
		"\u02ae\b\u001e\u000b\u001e\f\u001e\u02af\u0001\u001e\u0003\u001e\u02b3"+
		"\b\u001e\u0001\u001f\u0003\u001f\u02b6\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u02ba\b\u001f\n\u001f\f\u001f\u02bd\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u02c3\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u02c8\b\u001f\n\u001f\f\u001f\u02cb\t\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0005 \u02d8\b \n \f \u02db\t \u0001 \u0001 \u0005"+
		" \u02df\b \n \f \u02e2\t \u0001 \u0001 \u0001 \u0005 \u02e7\b \n \f \u02ea"+
		"\t \u0001 \u0005 \u02ed\b \n \f \u02f0\t \u0003 \u02f2\b \u0001!\u0001"+
		"!\u0001!\u0005!\u02f7\b!\n!\f!\u02fa\t!\u0001!\u0001!\u0001!\u0005!\u02ff"+
		"\b!\n!\f!\u0302\t!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0005\"\u030b\b\"\n\"\f\"\u030e\t\"\u0001#\u0001#\u0001#\u0005#\u0313"+
		"\b#\n#\f#\u0316\t#\u0001#\u0001#\u0001#\u0003#\u031b\b#\u0001#\u0001#"+
		"\u0005#\u031f\b#\n#\f#\u0322\t#\u0001#\u0001#\u0001$\u0001$\u0001$\u0003"+
		"$\u0329\b$\u0001$\u0001$\u0003$\u032d\b$\u0001%\u0001%\u0001%\u0003%\u0332"+
		"\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u033c"+
		"\b%\u0001%\u0003%\u033f\b%\u0001%\u0003%\u0342\b%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u034f"+
		"\b&\u0001&\u0005&\u0352\b&\n&\f&\u0355\t&\u0001&\u0001&\u0001&\u0001&"+
		"\u0001&\u0001&\u0001&\u0001&\u0005&\u035f\b&\n&\f&\u0362\t&\u0001&\u0005"+
		"&\u0365\b&\n&\f&\u0368\t&\u0001&\u0001&\u0003&\u036c\b&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u0377"+
		"\b\'\n\'\f\'\u037a\t\'\u0003\'\u037c\b\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0003(\u0385\b(\u0001)\u0001)\u0001)\u0003)\u038a\b)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0393\b)\u0001)\u0003"+
		")\u0396\b)\u0001*\u0003*\u0399\b*\u0001*\u0001*\u0001*\u0001*\u0003*\u039f"+
		"\b*\u0001*\u0005*\u03a2\b*\n*\f*\u03a5\t*\u0001+\u0001+\u0001+\u0001+"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001.\u0005.\u03c3\b.\n.\f.\u03c6\t.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"0\u00050\u03d4\b0\n0\f0\u03d7\t0\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00030\u03df\b0\u00010\u00010\u00010\u00050\u03e4\b0\n0\f0\u03e7\t0"+
		"\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u00011\u0005"+
		"1\u03f2\b1\n1\f1\u03f5\t1\u00011\u00011\u00051\u03f9\b1\n1\f1\u03fc\t"+
		"1\u00031\u03fe\b1\u00011\u0000\u00002\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`b\u0000\u0005\u0002\u0000\b\bPP\u0002\u0000\u0006\u0006"+
		"TT\u0002\u000000TT\u0002\u0000%%**\u0001\u0000=>\u0471\u0000e\u0001\u0000"+
		"\u0000\u0000\u0002p\u0001\u0000\u0000\u0000\u0004r\u0001\u0000\u0000\u0000"+
		"\u0006y\u0001\u0000\u0000\u0000\b\u009a\u0001\u0000\u0000\u0000\n\u009c"+
		"\u0001\u0000\u0000\u0000\f\u00a1\u0001\u0000\u0000\u0000\u000e\u00d7\u0001"+
		"\u0000\u0000\u0000\u0010\u00d9\u0001\u0000\u0000\u0000\u0012\u00ea\u0001"+
		"\u0000\u0000\u0000\u0014\u00ec\u0001\u0000\u0000\u0000\u0016\u00f5\u0001"+
		"\u0000\u0000\u0000\u0018\u0104\u0001\u0000\u0000\u0000\u001a\u0106\u0001"+
		"\u0000\u0000\u0000\u001c\u0123\u0001\u0000\u0000\u0000\u001e\u0130\u0001"+
		"\u0000\u0000\u0000 \u013d\u0001\u0000\u0000\u0000\"\u0158\u0001\u0000"+
		"\u0000\u0000$\u015a\u0001\u0000\u0000\u0000&\u0162\u0001\u0000\u0000\u0000"+
		"(\u016f\u0001\u0000\u0000\u0000*\u0175\u0001\u0000\u0000\u0000,\u0185"+
		"\u0001\u0000\u0000\u0000.\u019c\u0001\u0000\u0000\u00000\u01b7\u0001\u0000"+
		"\u0000\u00002\u01b9\u0001\u0000\u0000\u00004\u01db\u0001\u0000\u0000\u0000"+
		"6\u01dd\u0001\u0000\u0000\u00008\u01f1\u0001\u0000\u0000\u0000:\u023f"+
		"\u0001\u0000\u0000\u0000<\u02b2\u0001\u0000\u0000\u0000>\u02b5\u0001\u0000"+
		"\u0000\u0000@\u02f1\u0001\u0000\u0000\u0000B\u02f3\u0001\u0000\u0000\u0000"+
		"D\u0305\u0001\u0000\u0000\u0000F\u030f\u0001\u0000\u0000\u0000H\u0325"+
		"\u0001\u0000\u0000\u0000J\u0341\u0001\u0000\u0000\u0000L\u036b\u0001\u0000"+
		"\u0000\u0000N\u037b\u0001\u0000\u0000\u0000P\u0384\u0001\u0000\u0000\u0000"+
		"R\u0395\u0001\u0000\u0000\u0000T\u0398\u0001\u0000\u0000\u0000V\u03a6"+
		"\u0001\u0000\u0000\u0000X\u03b1\u0001\u0000\u0000\u0000Z\u03ba\u0001\u0000"+
		"\u0000\u0000\\\u03c4\u0001\u0000\u0000\u0000^\u03c7\u0001\u0000\u0000"+
		"\u0000`\u03d5\u0001\u0000\u0000\u0000b\u03fd\u0001\u0000\u0000\u0000d"+
		"f\u0003\u0002\u0001\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0001\u0001"+
		"\u0000\u0000\u0000iq\u0003\u0004\u0002\u0000jq\u0003\n\u0005\u0000kq\u0003"+
		"6\u001b\u0000lq\u0003Z-\u0000mq\u0003^/\u0000nq\u0003F#\u0000oq\u0003"+
		"\u0012\t\u0000pi\u0001\u0000\u0000\u0000pj\u0001\u0000\u0000\u0000pk\u0001"+
		"\u0000\u0000\u0000pl\u0001\u0000\u0000\u0000pm\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000q\u0003\u0001\u0000"+
		"\u0000\u0000rs\u0005\u0001\u0000\u0000st\u00054\u0000\u0000tu\u0003\b"+
		"\u0004\u0000uv\u00055\u0000\u0000vw\u0005\u000e\u0000\u0000wx\u0003\u0006"+
		"\u0003\u0000x\u0005\u0001\u0000\u0000\u0000y}\u0005Q\u0000\u0000z|\u0005"+
		"2\u0000\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0083\u0005T\u0000\u0000"+
		"\u0081\u0082\u0005J\u0000\u0000\u0082\u0084\u0005T\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005Q\u0000\u0000\u0088\u0089\u0005"+
		"K\u0000\u0000\u0089\u0007\u0001\u0000\u0000\u0000\u008a\u008f\u0005\u0006"+
		"\u0000\u0000\u008b\u008c\u0005M\u0000\u0000\u008c\u008e\u0005\u0006\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u009b\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0092\u0097\u0005T\u0000\u0000\u0093\u0094\u0005M\u0000\u0000\u0094"+
		"\u0096\u0005T\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0099"+
		"\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097"+
		"\u0001\u0000\u0000\u0000\u009a\u008a\u0001\u0000\u0000\u0000\u009a\u0092"+
		"\u0001\u0000\u0000\u0000\u009b\t\u0001\u0000\u0000\u0000\u009c\u009d\u0005"+
		"\u0002\u0000\u0000\u009d\u009e\u00058\u0000\u0000\u009e\u009f\u0003\f"+
		"\u0006\u0000\u009f\u00a0\u00059\u0000\u0000\u00a0\u000b\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u00054\u0000\u0000\u00a2\u00a7\u0003\u000e\u0007\u0000"+
		"\u00a3\u00a4\u0005M\u0000\u0000\u00a4\u00a6\u0003\u000e\u0007\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u00055\u0000\u0000\u00ab\r\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0005\u0013\u0000\u0000\u00ad\u00ae\u0005L\u0000\u0000\u00ae\u00af\u0005"+
		"Q\u0000\u0000\u00af\u00b0\u0005T\u0000\u0000\u00b0\u00d8\u0005Q\u0000"+
		"\u0000\u00b1\u00b2\u0005\u0014\u0000\u0000\u00b2\u00b3\u0005L\u0000\u0000"+
		"\u00b3\u00d8\u00051\u0000\u0000\u00b4\u00b5\u0005\u0015\u0000\u0000\u00b5"+
		"\u00b6\u0005L\u0000\u0000\u00b6\u00d8\u0003\u0010\b\u0000\u00b7\u00b8"+
		"\u0005\u0019\u0000\u0000\u00b8\u00b9\u0005L\u0000\u0000\u00b9\u00ba\u0005"+
		"6\u0000\u0000\u00ba\u00bb\u0003\b\u0004\u0000\u00bb\u00bc\u00057\u0000"+
		"\u0000\u00bc\u00d8\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u000b\u0000"+
		"\u0000\u00be\u00bf\u0005L\u0000\u0000\u00bf\u00c0\u0005Q\u0000\u0000\u00c0"+
		"\u00c5\u0005N\u0000\u0000\u00c1\u00c2\u0005J\u0000\u0000\u00c2\u00c4\u0005"+
		"T\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c8\u00d8\u0005Q\u0000\u0000\u00c9\u00ca\u0005\f\u0000"+
		"\u0000\u00ca\u00cb\u0005L\u0000\u0000\u00cb\u00cc\u00056\u0000\u0000\u00cc"+
		"\u00cd\u0005Q\u0000\u0000\u00cd\u00d2\u0005N\u0000\u0000\u00ce\u00cf\u0005"+
		"J\u0000\u0000\u00cf\u00d1\u0005T\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005Q\u0000\u0000"+
		"\u00d6\u00d8\u00057\u0000\u0000\u00d7\u00ac\u0001\u0000\u0000\u0000\u00d7"+
		"\u00b1\u0001\u0000\u0000\u0000\u00d7\u00b4\u0001\u0000\u0000\u0000\u00d7"+
		"\u00b7\u0001\u0000\u0000\u0000\u00d7\u00bd\u0001\u0000\u0000\u0000\u00d7"+
		"\u00c9\u0001\u0000\u0000\u0000\u00d8\u000f\u0001\u0000\u0000\u0000\u00d9"+
		"\u00dd\u0005R\u0000\u0000\u00da\u00dc\u0003\u0012\t\u0000\u00db\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e0"+
		"\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e4"+
		"\u0005R\u0000\u0000\u00e1\u00e3\u0005M\u0000\u0000\u00e2\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u0011\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00eb\u0003\u0014"+
		"\n\u0000\u00e8\u00eb\u00032\u0019\u0000\u00e9\u00eb\u0003\u0016\u000b"+
		"\u0000\u00ea\u00e7\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\u0013\u0001\u0000\u0000"+
		"\u0000\u00ec\u00f0\u0003\u001c\u000e\u0000\u00ed\u00ef\u00030\u0018\u0000"+
		"\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0003 \u0010\u0000\u00f4\u0015\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0005E\u0000\u0000\u00f6\u00fa\u0003\u0018\f\u0000\u00f7\u00f9"+
		"\u0003\u001a\r\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fd\u00ff\u0005J\u0000\u0000\u00fe\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0005F\u0000\u0000\u0101\u0017\u0001\u0000\u0000"+
		"\u0000\u0102\u0105\u0005\'\u0000\u0000\u0103\u0105\u0005\"\u0000\u0000"+
		"\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0103\u0001\u0000\u0000\u0000"+
		"\u0105\u0019\u0001\u0000\u0000\u0000\u0106\u0121\u0005.\u0000\u0000\u0107"+
		"\u0108\u0005P\u0000\u0000\u0108\u010c\u0005Q\u0000\u0000\u0109\u010b\u0005"+
		"T\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000"+
		"\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000"+
		"\u0000\u0000\u010d\u011e\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000"+
		"\u0000\u0000\u010f\u0113\u00058\u0000\u0000\u0110\u0112\u0005T\u0000\u0000"+
		"\u0111\u0110\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000"+
		"\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000"+
		"\u0114\u011a\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0005J\u0000\u0000\u0117\u0119\u0005T\u0000\u0000\u0118\u0116"+
		"\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011d"+
		"\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u011f"+
		"\u00059\u0000\u0000\u011e\u010f\u0001\u0000\u0000\u0000\u011e\u011f\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0122\u0005"+
		"Q\u0000\u0000\u0121\u0107\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000"+
		"\u0000\u0000\u0122\u001b\u0001\u0000\u0000\u0000\u0123\u012c\u0005E\u0000"+
		"\u0000\u0124\u0128\u0003.\u0017\u0000\u0125\u0127\u0003\"\u0011\u0000"+
		"\u0126\u0125\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000"+
		"\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000"+
		"\u0129\u012d\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000"+
		"\u012b\u012d\u0003\u001e\u000f\u0000\u012c\u0124\u0001\u0000\u0000\u0000"+
		"\u012c\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0005F\u0000\u0000\u012f\u001d\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0005!\u0000\u0000\u0131\u0132\u0005$\u0000\u0000\u0132\u0133\u0005"+
		"P\u0000\u0000\u0133\u0134\u0005Q\u0000\u0000\u0134\u0138\u0005J\u0000"+
		"\u0000\u0135\u0137\u0005T\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000"+
		"\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000"+
		"\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000\u0000\u0000"+
		"\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u013c\u0005Q\u0000\u0000\u013c"+
		"\u001f\u0001\u0000\u0000\u0000\u013d\u013e\u0005E\u0000\u0000\u013e\u0141"+
		"\u0005J\u0000\u0000\u013f\u0142\u0003.\u0017\u0000\u0140\u0142\u0005!"+
		"\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0140\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144\u0005F\u0000"+
		"\u0000\u0144!\u0001\u0000\u0000\u0000\u0145\u0159\u0003$\u0012\u0000\u0146"+
		"\u0159\u0003(\u0014\u0000\u0147\u0159\u0003&\u0013\u0000\u0148\u0159\u0003"+
		"*\u0015\u0000\u0149\u0159\u0003,\u0016\u0000\u014a\u0159\u0003\u001a\r"+
		"\u0000\u014b\u014c\u0005)\u0000\u0000\u014c\u014d\u0005P\u0000\u0000\u014d"+
		"\u014e\u0005Q\u0000\u0000\u014e\u014f\u0005T\u0000\u0000\u014f\u0153\u0005"+
		"8\u0000\u0000\u0150\u0152\u0005T\u0000\u0000\u0151\u0150\u0001\u0000\u0000"+
		"\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000"+
		"\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0156\u0001\u0000\u0000"+
		"\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u0157\u00059\u0000\u0000"+
		"\u0157\u0159\u0005Q\u0000\u0000\u0158\u0145\u0001\u0000\u0000\u0000\u0158"+
		"\u0146\u0001\u0000\u0000\u0000\u0158\u0147\u0001\u0000\u0000\u0000\u0158"+
		"\u0148\u0001\u0000\u0000\u0000\u0158\u0149\u0001\u0000\u0000\u0000\u0158"+
		"\u014a\u0001\u0000\u0000\u0000\u0158\u014b\u0001\u0000\u0000\u0000\u0159"+
		"#\u0001\u0000\u0000\u0000\u015a\u015b\u00056\u0000\u0000\u015b\u015c\u0005"+
		"/\u0000\u0000\u015c\u015d\u00057\u0000\u0000\u015d\u015e\u0005P\u0000"+
		"\u0000\u015e\u015f\u0005Q\u0000\u0000\u015f\u0160\u0005T\u0000\u0000\u0160"+
		"\u0161\u0005Q\u0000\u0000\u0161%\u0001\u0000\u0000\u0000\u0162\u0163\u0005"+
		"\u0017\u0000\u0000\u0163\u0164\u0005P\u0000\u0000\u0164\u0165\u0005Q\u0000"+
		"\u0000\u0165\u0169\u0005\u0007\u0000\u0000\u0166\u0167\u0005T\u0000\u0000"+
		"\u0167\u0168\u0007\u0000\u0000\u0000\u0168\u016a\u0005T\u0000\u0000\u0169"+
		"\u0166\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b"+
		"\u0169\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c"+
		"\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0005Q\u0000\u0000\u016e\'"+
		"\u0001\u0000\u0000\u0000\u016f\u0170\u0005\u0018\u0000\u0000\u0170\u0171"+
		"\u0005P\u0000\u0000\u0171\u0172\u0005Q\u0000\u0000\u0172\u0173\u0005T"+
		"\u0000\u0000\u0173\u0174\u0005Q\u0000\u0000\u0174)\u0001\u0000\u0000\u0000"+
		"\u0175\u0176\u00058\u0000\u0000\u0176\u0177\u0005&\u0000\u0000\u0177\u0178"+
		"\u00059\u0000\u0000\u0178\u0179\u0005P\u0000\u0000\u0179\u017a\u0005Q"+
		"\u0000\u0000\u017a\u017b\u0005T\u0000\u0000\u017b\u017f\u00058\u0000\u0000"+
		"\u017c\u017e\u0005T\u0000\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017e"+
		"\u0181\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f"+
		"\u0180\u0001\u0000\u0000\u0000\u0180\u0182\u0001\u0000\u0000\u0000\u0181"+
		"\u017f\u0001\u0000\u0000\u0000\u0182\u0183\u00059\u0000\u0000\u0183\u0184"+
		"\u0005Q\u0000\u0000\u0184+\u0001\u0000\u0000\u0000\u0185\u0186\u0005\u0016"+
		"\u0000\u0000\u0186\u0187\u0005P\u0000\u0000\u0187\u018d\u0005Q\u0000\u0000"+
		"\u0188\u0189\u0005,\u0000\u0000\u0189\u018a\u0005L\u0000\u0000\u018a\u018b"+
		"\u0003<\u001e\u0000\u018b\u018c\u0005K\u0000\u0000\u018c\u018e\u0001\u0000"+
		"\u0000\u0000\u018d\u0188\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000"+
		"\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000"+
		"\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u0005Q\u0000"+
		"\u0000\u0192-\u0001\u0000\u0000\u0000\u0193\u019d\u0005\u001b\u0000\u0000"+
		"\u0194\u019d\u0005+\u0000\u0000\u0195\u019d\u0005 \u0000\u0000\u0196\u019d"+
		"\u0005\u001f\u0000\u0000\u0197\u019d\u0005\u001e\u0000\u0000\u0198\u019d"+
		"\u0005\u001d\u0000\u0000\u0199\u019d\u0005\u001a\u0000\u0000\u019a\u019d"+
		"\u0005(\u0000\u0000\u019b\u019d\u0005#\u0000\u0000\u019c\u0193\u0001\u0000"+
		"\u0000\u0000\u019c\u0194\u0001\u0000\u0000\u0000\u019c\u0195\u0001\u0000"+
		"\u0000\u0000\u019c\u0196\u0001\u0000\u0000\u0000\u019c\u0197\u0001\u0000"+
		"\u0000\u0000\u019c\u0198\u0001\u0000\u0000\u0000\u019c\u0199\u0001\u0000"+
		"\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019b\u0001\u0000"+
		"\u0000\u0000\u019d/\u0001\u0000\u0000\u0000\u019e\u01b8\u0003\u0012\t"+
		"\u0000\u019f\u01a1\u0005T\u0000\u0000\u01a0\u019f\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01b8\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a5\u0005T\u0000\u0000\u01a5\u01a7\u0005L\u0000\u0000\u01a6\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab"+
		"\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u00054\u0000\u0000\u01ac\u01ad\u00054\u0000\u0000\u01ad\u01b2\u0005T"+
		"\u0000\u0000\u01ae\u01af\u0005N\u0000\u0000\u01af\u01b1\u0005T\u0000\u0000"+
		"\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b5\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b6\u00055\u0000\u0000\u01b6\u01b8\u00055\u0000\u0000\u01b7\u019e"+
		"\u0001\u0000\u0000\u0000\u01b7\u01a0\u0001\u0000\u0000\u0000\u01b7\u01a8"+
		"\u0001\u0000\u0000\u0000\u01b81\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005"+
		"E\u0000\u0000\u01ba\u01bc\u0005\u001c\u0000\u0000\u01bb\u01bd\u00034\u001a"+
		"\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000"+
		"\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c3\u0001\u0000\u0000\u0000\u01c0\u01c2\u0003\"\u0011\u0000"+
		"\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c6\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0005F\u0000\u0000\u01c73\u0001\u0000\u0000\u0000\u01c8\u01c9"+
		"\u00056\u0000\u0000\u01c9\u01ca\u0005-\u0000\u0000\u01ca\u01cb\u00057"+
		"\u0000\u0000\u01cb\u01cc\u0005P\u0000\u0000\u01cc\u01cd\u0005Q\u0000\u0000"+
		"\u01cd\u01d2\u0005T\u0000\u0000\u01ce\u01cf\u0005N\u0000\u0000\u01cf\u01d1"+
		"\u0005T\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d5\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d5\u01dc\u0005Q\u0000\u0000\u01d6\u01d7\u0005,\u0000"+
		"\u0000\u01d7\u01d8\u0005P\u0000\u0000\u01d8\u01d9\u0005Q\u0000\u0000\u01d9"+
		"\u01da\u0005T\u0000\u0000\u01da\u01dc\u0005Q\u0000\u0000\u01db\u01c8\u0001"+
		"\u0000\u0000\u0000\u01db\u01d6\u0001\u0000\u0000\u0000\u01dc5\u0001\u0000"+
		"\u0000\u0000\u01dd\u01de\u0005\u0004\u0000\u0000\u01de\u01df\u0005\u0010"+
		"\u0000\u0000\u01df\u01e2\u0005T\u0000\u0000\u01e0\u01e1\u0005\n\u0000"+
		"\u0000\u01e1\u01e3\u0007\u0001\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e8\u00054\u0000\u0000\u01e5\u01e7\u00038\u001c\u0000\u01e6"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9"+
		"\u01eb\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb"+
		"\u01ec\u00055\u0000\u0000\u01ec7\u0001\u0000\u0000\u0000\u01ed\u01f2\u0003"+
		":\u001d\u0000\u01ee\u01f2\u0003B!\u0000\u01ef\u01f2\u0003>\u001f\u0000"+
		"\u01f0\u01f2\u0003F#\u0000\u01f1\u01ed\u0001\u0000\u0000\u0000\u01f1\u01ee"+
		"\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f29\u0001\u0000\u0000\u0000\u01f3\u01f5\u0005"+
		"T\u0000\u0000\u01f4\u01f6\u0005A\u0000\u0000\u01f5\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f8\u0005L\u0000\u0000\u01f8\u01fb\u0007\u0002\u0000\u0000"+
		"\u01f9\u01fa\u0005P\u0000\u0000\u01fa\u01fc\u0003<\u001e\u0000\u01fb\u01f9"+
		"\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fd"+
		"\u0001\u0000\u0000\u0000\u01fd\u0240\u0005K\u0000\u0000\u01fe\u01ff\u0005"+
		"*\u0000\u0000\u01ff\u0200\u0005T\u0000\u0000\u0200\u0201\u0005P\u0000"+
		"\u0000\u0201\u0202\u0003<\u001e\u0000\u0202\u0203\u0005K\u0000\u0000\u0203"+
		"\u0240\u0001\u0000\u0000\u0000\u0204\u0206\u0005T\u0000\u0000\u0205\u0207"+
		"\u0005A\u0000\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0206\u0207\u0001"+
		"\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u0209\u0005"+
		"L\u0000\u0000\u0209\u020a\u0007\u0002\u0000\u0000\u020a\u020b\u0005P\u0000"+
		"\u0000\u020b\u020d\u0005Q\u0000\u0000\u020c\u020e\u0003<\u001e\u0000\u020d"+
		"\u020c\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e"+
		"\u020f\u0001\u0000\u0000\u0000\u020f\u0210\u0005Q\u0000\u0000\u0210\u0240"+
		"\u0005K\u0000\u0000\u0211\u0212\u0005%\u0000\u0000\u0212\u0213\u0005T"+
		"\u0000\u0000\u0213\u0214\u0005P\u0000\u0000\u0214\u0215\u0005T\u0000\u0000"+
		"\u0215\u0219\u00058\u0000\u0000\u0216\u0218\u0003J%\u0000\u0217\u0216"+
		"\u0001\u0000\u0000\u0000\u0218\u021b\u0001\u0000\u0000\u0000\u0219\u0217"+
		"\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021c"+
		"\u0001\u0000\u0000\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021c\u0240"+
		"\u00059\u0000\u0000\u021d\u021e\u0005T\u0000\u0000\u021e\u021f\u0005P"+
		"\u0000\u0000\u021f\u0220\u00051\u0000\u0000\u0220\u0240\u0005K\u0000\u0000"+
		"\u0221\u0222\u0005T\u0000\u0000\u0222\u0223\u0005P\u0000\u0000\u0223\u023a"+
		"\u00054\u0000\u0000\u0224\u0225\u0005T\u0000\u0000\u0225\u0227\u0005L"+
		"\u0000\u0000\u0226\u0228\u0005Q\u0000\u0000\u0227\u0226\u0001\u0000\u0000"+
		"\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u022c\u0001\u0000\u0000"+
		"\u0000\u0229\u022b\u0003<\u001e\u0000\u022a\u0229\u0001\u0000\u0000\u0000"+
		"\u022b\u022e\u0001\u0000\u0000\u0000\u022c\u022a\u0001\u0000\u0000\u0000"+
		"\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u0230\u0001\u0000\u0000\u0000"+
		"\u022e\u022c\u0001\u0000\u0000\u0000\u022f\u0231\u0005Q\u0000\u0000\u0230"+
		"\u022f\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231"+
		"\u0235\u0001\u0000\u0000\u0000\u0232\u0234\u0005M\u0000\u0000\u0233\u0232"+
		"\u0001\u0000\u0000\u0000\u0234\u0237\u0001\u0000\u0000\u0000\u0235\u0233"+
		"\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0239"+
		"\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0238\u0224"+
		"\u0001\u0000\u0000\u0000\u0239\u023c\u0001\u0000\u0000\u0000\u023a\u0238"+
		"\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023d"+
		"\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023d\u023e"+
		"\u00055\u0000\u0000\u023e\u0240\u0005K\u0000\u0000\u023f\u01f3\u0001\u0000"+
		"\u0000\u0000\u023f\u01fe\u0001\u0000\u0000\u0000\u023f\u0204\u0001\u0000"+
		"\u0000\u0000\u023f\u0211\u0001\u0000\u0000\u0000\u023f\u021d\u0001\u0000"+
		"\u0000\u0000\u023f\u0221\u0001\u0000\u0000\u0000\u0240;\u0001\u0000\u0000"+
		"\u0000\u0241\u0244\u0005Q\u0000\u0000\u0242\u0243\u0005T\u0000\u0000\u0243"+
		"\u0245\u0005L\u0000\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0244\u0245"+
		"\u0001\u0000\u0000\u0000\u0245\u0248\u0001\u0000\u0000\u0000\u0246\u0247"+
		"\u0005J\u0000\u0000\u0247\u0249\u0005T\u0000\u0000\u0248\u0246\u0001\u0000"+
		"\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000"+
		"\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000"+
		"\u0000\u0000\u024c\u02b3\u0005Q\u0000\u0000\u024d\u02b3\u00051\u0000\u0000"+
		"\u024e\u0250\u0005T\u0000\u0000\u024f\u024e\u0001\u0000\u0000\u0000\u0250"+
		"\u0251\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0251"+
		"\u0252\u0001\u0000\u0000\u0000\u0252\u0256\u0001\u0000\u0000\u0000\u0253"+
		"\u0255\u0005M\u0000\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0255\u0258"+
		"\u0001\u0000\u0000\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0256\u0257"+
		"\u0001\u0000\u0000\u0000\u0257\u02b3\u0001\u0000\u0000\u0000\u0258\u0256"+
		"\u0001\u0000\u0000\u0000\u0259\u025c\u0005Q\u0000\u0000\u025a\u025b\u0005"+
		"3\u0000\u0000\u025b\u025d\u0005T\u0000\u0000\u025c\u025a\u0001\u0000\u0000"+
		"\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u025c\u0001\u0000\u0000"+
		"\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0264\u0001\u0000\u0000"+
		"\u0000\u0260\u0261\u0005M\u0000\u0000\u0261\u0263\u0005T\u0000\u0000\u0262"+
		"\u0260\u0001\u0000\u0000\u0000\u0263\u0266\u0001\u0000\u0000\u0000\u0264"+
		"\u0262\u0001\u0000\u0000\u0000\u0264\u0265\u0001\u0000\u0000\u0000\u0265"+
		"\u0267\u0001\u0000\u0000\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0267"+
		"\u02b3\u0005Q\u0000\u0000\u0268\u0269\u00053\u0000\u0000\u0269\u02b3\u0005"+
		"T\u0000\u0000\u026a\u026b\u0005T\u0000\u0000\u026b\u026c\u00058\u0000"+
		"\u0000\u026c\u026d\u0005 \u0000\u0000\u026d\u026e\u0005H\u0000\u0000\u026e"+
		"\u026f\u0005T\u0000\u0000\u026f\u0270\u0003P(\u0000\u0270\u0271\u0005"+
		"T\u0000\u0000\u0271\u0272\u00059\u0000\u0000\u0272\u02b3\u0001\u0000\u0000"+
		"\u0000\u0273\u0274\u0005T\u0000\u0000\u0274\u0279\u00058\u0000\u0000\u0275"+
		"\u0278\u0005T\u0000\u0000\u0276\u0278\u0003J%\u0000\u0277\u0275\u0001"+
		"\u0000\u0000\u0000\u0277\u0276\u0001\u0000\u0000\u0000\u0278\u027b\u0001"+
		"\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u0279\u027a\u0001"+
		"\u0000\u0000\u0000\u027a\u027c\u0001\u0000\u0000\u0000\u027b\u0279\u0001"+
		"\u0000\u0000\u0000\u027c\u0280\u00059\u0000\u0000\u027d\u027f\u0005K\u0000"+
		"\u0000\u027e\u027d\u0001\u0000\u0000\u0000\u027f\u0282\u0001\u0000\u0000"+
		"\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000\u0000"+
		"\u0000\u0281\u02b3\u0001\u0000\u0000\u0000\u0282\u0280\u0001\u0000\u0000"+
		"\u0000\u0283\u0284\u0005T\u0000\u0000\u0284\u0285\u00058\u0000\u0000\u0285"+
		"\u0286\u00056\u0000\u0000\u0286\u0287\u0005Q\u0000\u0000\u0287\u028b\u0005"+
		"J\u0000\u0000\u0288\u028a\u0005T\u0000\u0000\u0289\u0288\u0001\u0000\u0000"+
		"\u0000\u028a\u028d\u0001\u0000\u0000\u0000\u028b\u0289\u0001\u0000\u0000"+
		"\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028c\u028e\u0001\u0000\u0000"+
		"\u0000\u028d\u028b\u0001\u0000\u0000\u0000\u028e\u0293\u0005Q\u0000\u0000"+
		"\u028f\u0290\u0005M\u0000\u0000\u0290\u0292\u0005T\u0000\u0000\u0291\u028f"+
		"\u0001\u0000\u0000\u0000\u0292\u0295\u0001\u0000\u0000\u0000\u0293\u0291"+
		"\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0296"+
		"\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0296\u0297"+
		"\u00057\u0000\u0000\u0297\u02b3\u00059\u0000\u0000\u0298\u0299\u0005T"+
		"\u0000\u0000\u0299\u029a\u00058\u0000\u0000\u029a\u02a6\u00054\u0000\u0000"+
		"\u029b\u029c\u0005T\u0000\u0000\u029c\u029d\u0005L\u0000\u0000\u029d\u02a1"+
		"\u0005T\u0000\u0000\u029e\u02a0\u0005M\u0000\u0000\u029f\u029e\u0001\u0000"+
		"\u0000\u0000\u02a0\u02a3\u0001\u0000\u0000\u0000\u02a1\u029f\u0001\u0000"+
		"\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2\u02a5\u0001\u0000"+
		"\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a4\u029b\u0001\u0000"+
		"\u0000\u0000\u02a5\u02a8\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001\u0000"+
		"\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7\u02a9\u0001\u0000"+
		"\u0000\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a9\u02aa\u00055\u0000"+
		"\u0000\u02aa\u02b3\u00059\u0000\u0000\u02ab\u02ad\u0005Q\u0000\u0000\u02ac"+
		"\u02ae\u0005T\u0000\u0000\u02ad\u02ac\u0001\u0000\u0000\u0000\u02ae\u02af"+
		"\u0001\u0000\u0000\u0000\u02af\u02ad\u0001\u0000\u0000\u0000\u02af\u02b0"+
		"\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000\u02b1\u02b3"+
		"\u0005Q\u0000\u0000\u02b2\u0241\u0001\u0000\u0000\u0000\u02b2\u024d\u0001"+
		"\u0000\u0000\u0000\u02b2\u024f\u0001\u0000\u0000\u0000\u02b2\u0259\u0001"+
		"\u0000\u0000\u0000\u02b2\u0268\u0001\u0000\u0000\u0000\u02b2\u026a\u0001"+
		"\u0000\u0000\u0000\u02b2\u0273\u0001\u0000\u0000\u0000\u02b2\u0283\u0001"+
		"\u0000\u0000\u0000\u02b2\u0298\u0001\u0000\u0000\u0000\u02b2\u02ab\u0001"+
		"\u0000\u0000\u0000\u02b3=\u0001\u0000\u0000\u0000\u02b4\u02b6\u0007\u0003"+
		"\u0000\u0000\u02b5\u02b4\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000"+
		"\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u02bb\u0005T\u0000"+
		"\u0000\u02b8\u02ba\u0005L\u0000\u0000\u02b9\u02b8\u0001\u0000\u0000\u0000"+
		"\u02ba\u02bd\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000\u0000"+
		"\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u02c2\u0001\u0000\u0000\u0000"+
		"\u02bd\u02bb\u0001\u0000\u0000\u0000\u02be\u02c3\u00050\u0000\u0000\u02bf"+
		"\u02c0\u0005T\u0000\u0000\u02c0\u02c1\u00056\u0000\u0000\u02c1\u02c3\u0005"+
		"7\u0000\u0000\u02c2\u02be\u0001\u0000\u0000\u0000\u02c2\u02bf\u0001\u0000"+
		"\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000"+
		"\u0000\u0000\u02c4\u02c5\u0005P\u0000\u0000\u02c5\u02c9\u00056\u0000\u0000"+
		"\u02c6\u02c8\u0003@ \u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c8\u02cb"+
		"\u0001\u0000\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02c9\u02ca"+
		"\u0001\u0000\u0000\u0000\u02ca\u02cc\u0001\u0000\u0000\u0000\u02cb\u02c9"+
		"\u0001\u0000\u0000\u0000\u02cc\u02cd\u00057\u0000\u0000\u02cd\u02ce\u0005"+
		"K\u0000\u0000\u02ce?\u0001\u0000\u0000\u0000\u02cf\u02d0\u00054\u0000"+
		"\u0000\u02d0\u02d1\u0005T\u0000\u0000\u02d1\u02d2\u0005L\u0000\u0000\u02d2"+
		"\u02d9\u0003<\u001e\u0000\u02d3\u02d4\u0005M\u0000\u0000\u02d4\u02d5\u0005"+
		"T\u0000\u0000\u02d5\u02d6\u0005L\u0000\u0000\u02d6\u02d8\u0003<\u001e"+
		"\u0000\u02d7\u02d3\u0001\u0000\u0000\u0000\u02d8\u02db\u0001\u0000\u0000"+
		"\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000"+
		"\u0000\u02da\u02dc\u0001\u0000\u0000\u0000\u02db\u02d9\u0001\u0000\u0000"+
		"\u0000\u02dc\u02e0\u00055\u0000\u0000\u02dd\u02df\u0005M\u0000\u0000\u02de"+
		"\u02dd\u0001\u0000\u0000\u0000\u02df\u02e2\u0001\u0000\u0000\u0000\u02e0"+
		"\u02de\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1"+
		"\u02f2\u0001\u0000\u0000\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e3"+
		"\u02e8\u0003<\u001e\u0000\u02e4\u02e5\u0005M\u0000\u0000\u02e5\u02e7\u0003"+
		"<\u001e\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e7\u02ea\u0001\u0000"+
		"\u0000\u0000\u02e8\u02e6\u0001\u0000\u0000\u0000\u02e8\u02e9\u0001\u0000"+
		"\u0000\u0000\u02e9\u02ee\u0001\u0000\u0000\u0000\u02ea\u02e8\u0001\u0000"+
		"\u0000\u0000\u02eb\u02ed\u0005M\u0000\u0000\u02ec\u02eb\u0001\u0000\u0000"+
		"\u0000\u02ed\u02f0\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000\u0000"+
		"\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef\u02f2\u0001\u0000\u0000"+
		"\u0000\u02f0\u02ee\u0001\u0000\u0000\u0000\u02f1\u02cf\u0001\u0000\u0000"+
		"\u0000\u02f1\u02e3\u0001\u0000\u0000\u0000\u02f2A\u0001\u0000\u0000\u0000"+
		"\u02f3\u02f4\u0005\u0005\u0000\u0000\u02f4\u02f8\u00058\u0000\u0000\u02f5"+
		"\u02f7\u0003D\"\u0000\u02f6\u02f5\u0001\u0000\u0000\u0000\u02f7\u02fa"+
		"\u0001\u0000\u0000\u0000\u02f8\u02f6\u0001\u0000\u0000\u0000\u02f8\u02f9"+
		"\u0001\u0000\u0000\u0000\u02f9\u02fb\u0001\u0000\u0000\u0000\u02fa\u02f8"+
		"\u0001\u0000\u0000\u0000\u02fb\u02fc\u00059\u0000\u0000\u02fc\u0300\u0005"+
		"4\u0000\u0000\u02fd\u02ff\u0003L&\u0000\u02fe\u02fd\u0001\u0000\u0000"+
		"\u0000\u02ff\u0302\u0001\u0000\u0000\u0000\u0300\u02fe\u0001\u0000\u0000"+
		"\u0000\u0300\u0301\u0001\u0000\u0000\u0000\u0301\u0303\u0001\u0000\u0000"+
		"\u0000\u0302\u0300\u0001\u0000\u0000\u0000\u0303\u0304\u00055\u0000\u0000"+
		"\u0304C\u0001\u0000\u0000\u0000\u0305\u0306\u0005*\u0000\u0000\u0306\u0307"+
		"\u0005T\u0000\u0000\u0307\u0308\u0005L\u0000\u0000\u0308\u030c\u0007\u0001"+
		"\u0000\u0000\u0309\u030b\u0005M\u0000\u0000\u030a\u0309\u0001\u0000\u0000"+
		"\u0000\u030b\u030e\u0001\u0000\u0000\u0000\u030c\u030a\u0001\u0000\u0000"+
		"\u0000\u030c\u030d\u0001\u0000\u0000\u0000\u030dE\u0001\u0000\u0000\u0000"+
		"\u030e\u030c\u0001\u0000\u0000\u0000\u030f\u0310\u0005T\u0000\u0000\u0310"+
		"\u0314\u00058\u0000\u0000\u0311\u0313\u0003J%\u0000\u0312\u0311\u0001"+
		"\u0000\u0000\u0000\u0313\u0316\u0001\u0000\u0000\u0000\u0314\u0312\u0001"+
		"\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0317\u0001"+
		"\u0000\u0000\u0000\u0316\u0314\u0001\u0000\u0000\u0000\u0317\u031a\u0005"+
		"9\u0000\u0000\u0318\u0319\u0005L\u0000\u0000\u0319\u031b\u0003H$\u0000"+
		"\u031a\u0318\u0001\u0000\u0000\u0000\u031a\u031b\u0001\u0000\u0000\u0000"+
		"\u031b\u031c\u0001\u0000\u0000\u0000\u031c\u0320\u00054\u0000\u0000\u031d"+
		"\u031f\u0003L&\u0000\u031e\u031d\u0001\u0000\u0000\u0000\u031f\u0322\u0001"+
		"\u0000\u0000\u0000\u0320\u031e\u0001\u0000\u0000\u0000\u0320\u0321\u0001"+
		"\u0000\u0000\u0000\u0321\u0323\u0001\u0000\u0000\u0000\u0322\u0320\u0001"+
		"\u0000\u0000\u0000\u0323\u0324\u00055\u0000\u0000\u0324G\u0001\u0000\u0000"+
		"\u0000\u0325\u0328\u0005T\u0000\u0000\u0326\u0327\u00056\u0000\u0000\u0327"+
		"\u0329\u00057\u0000\u0000\u0328\u0326\u0001\u0000\u0000\u0000\u0328\u0329"+
		"\u0001\u0000\u0000\u0000\u0329\u032c\u0001\u0000\u0000\u0000\u032a\u032b"+
		"\u0005O\u0000\u0000\u032b\u032d\u0005T\u0000\u0000\u032c\u032a\u0001\u0000"+
		"\u0000\u0000\u032c\u032d\u0001\u0000\u0000\u0000\u032dI\u0001\u0000\u0000"+
		"\u0000\u032e\u032f\u0005T\u0000\u0000\u032f\u0331\u0005L\u0000\u0000\u0330"+
		"\u0332\u0005T\u0000\u0000\u0331\u0330\u0001\u0000\u0000\u0000\u0331\u0332"+
		"\u0001\u0000\u0000\u0000\u0332\u033b\u0001\u0000\u0000\u0000\u0333\u033c"+
		"\u00050\u0000\u0000\u0334\u0335\u0005E\u0000\u0000\u0335\u0336\u0005T"+
		"\u0000\u0000\u0336\u0337\u0005M\u0000\u0000\u0337\u0338\u0005Q\u0000\u0000"+
		"\u0338\u0339\u0005T\u0000\u0000\u0339\u033a\u0005Q\u0000\u0000\u033a\u033c"+
		"\u0005F\u0000\u0000\u033b\u0333\u0001\u0000\u0000\u0000\u033b\u0334\u0001"+
		"\u0000\u0000\u0000\u033c\u033e\u0001\u0000\u0000\u0000\u033d\u033f\u0005"+
		"M\u0000\u0000\u033e\u033d\u0001\u0000\u0000\u0000\u033e\u033f\u0001\u0000"+
		"\u0000\u0000\u033f\u0342\u0001\u0000\u0000\u0000\u0340\u0342\u0003<\u001e"+
		"\u0000\u0341\u032e\u0001\u0000\u0000\u0000\u0341\u0340\u0001\u0000\u0000"+
		"\u0000\u0342K\u0001\u0000\u0000\u0000\u0343\u036c\u0003<\u001e\u0000\u0344"+
		"\u036c\u0003V+\u0000\u0345\u036c\u0003`0\u0000\u0346\u0347\u0005T\u0000"+
		"\u0000\u0347\u0348\u0005P\u0000\u0000\u0348\u0349\u0003<\u001e\u0000\u0349"+
		"\u034a\u0005K\u0000\u0000\u034a\u036c\u0001\u0000\u0000\u0000\u034b\u036c"+
		"\u0003:\u001d\u0000\u034c\u036c\u0003>\u001f\u0000\u034d\u034f\u0005\r"+
		"\u0000\u0000\u034e\u034d\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000"+
		"\u0000\u0000\u034f\u0353\u0001\u0000\u0000\u0000\u0350\u0352\u0003R)\u0000"+
		"\u0351\u0350\u0001\u0000\u0000\u0000\u0352\u0355\u0001\u0000\u0000\u0000"+
		"\u0353\u0351\u0001\u0000\u0000\u0000\u0353\u0354\u0001\u0000\u0000\u0000"+
		"\u0354\u0356\u0001\u0000\u0000\u0000\u0355\u0353\u0001\u0000\u0000\u0000"+
		"\u0356\u036c\u0005K\u0000\u0000\u0357\u0358\u0005\u0011\u0000\u0000\u0358"+
		"\u0359\u00058\u0000\u0000\u0359\u035a\u0003N\'\u0000\u035a\u035b\u0005"+
		"9\u0000\u0000\u035b\u0366\u00054\u0000\u0000\u035c\u0360\u0003<\u001e"+
		"\u0000\u035d\u035f\u0005K\u0000\u0000\u035e\u035d\u0001\u0000\u0000\u0000"+
		"\u035f\u0362\u0001\u0000\u0000\u0000\u0360\u035e\u0001\u0000\u0000\u0000"+
		"\u0360\u0361\u0001\u0000\u0000\u0000\u0361\u0365\u0001\u0000\u0000\u0000"+
		"\u0362\u0360\u0001\u0000\u0000\u0000\u0363\u0365\u0003L&\u0000\u0364\u035c"+
		"\u0001\u0000\u0000\u0000\u0364\u0363\u0001\u0000\u0000\u0000\u0365\u0368"+
		"\u0001\u0000\u0000\u0000\u0366\u0364\u0001\u0000\u0000\u0000\u0366\u0367"+
		"\u0001\u0000\u0000\u0000\u0367\u0369\u0001\u0000\u0000\u0000\u0368\u0366"+
		"\u0001\u0000\u0000\u0000\u0369\u036a\u00055\u0000\u0000\u036a\u036c\u0001"+
		"\u0000\u0000\u0000\u036b\u0343\u0001\u0000\u0000\u0000\u036b\u0344\u0001"+
		"\u0000\u0000\u0000\u036b\u0345\u0001\u0000\u0000\u0000\u036b\u0346\u0001"+
		"\u0000\u0000\u0000\u036b\u034b\u0001\u0000\u0000\u0000\u036b\u034c\u0001"+
		"\u0000\u0000\u0000\u036b\u034e\u0001\u0000\u0000\u0000\u036b\u0357\u0001"+
		"\u0000\u0000\u0000\u036cM\u0001\u0000\u0000\u0000\u036d\u036e\u0005T\u0000"+
		"\u0000\u036e\u036f\u0003P(\u0000\u036f\u0370\u0007\u0004\u0000\u0000\u0370"+
		"\u0371\u0005T\u0000\u0000\u0371\u037c\u0001\u0000\u0000\u0000\u0372\u0378"+
		"\u0005T\u0000\u0000\u0373\u0374\u0003P(\u0000\u0374\u0375\u0005T\u0000"+
		"\u0000\u0375\u0377\u0001\u0000\u0000\u0000\u0376\u0373\u0001\u0000\u0000"+
		"\u0000\u0377\u037a\u0001\u0000\u0000\u0000\u0378\u0376\u0001\u0000\u0000"+
		"\u0000\u0378\u0379\u0001\u0000\u0000\u0000\u0379\u037c\u0001\u0000\u0000"+
		"\u0000\u037a\u0378\u0001\u0000\u0000\u0000\u037b\u036d\u0001\u0000\u0000"+
		"\u0000\u037b\u0372\u0001\u0000\u0000\u0000\u037cO\u0001\u0000\u0000\u0000"+
		"\u037d\u0385\u0005:\u0000\u0000\u037e\u0385\u0005;\u0000\u0000\u037f\u0385"+
		"\u0005<\u0000\u0000\u0380\u0385\u0005C\u0000\u0000\u0381\u0385\u0005D"+
		"\u0000\u0000\u0382\u0385\u0005?\u0000\u0000\u0383\u0385\u0005@\u0000\u0000"+
		"\u0384\u037d\u0001\u0000\u0000\u0000\u0384\u037e\u0001\u0000\u0000\u0000"+
		"\u0384\u037f\u0001\u0000\u0000\u0000\u0384\u0380\u0001\u0000\u0000\u0000"+
		"\u0384\u0381\u0001\u0000\u0000\u0000\u0384\u0382\u0001\u0000\u0000\u0000"+
		"\u0384\u0383\u0001\u0000\u0000\u0000\u0385Q\u0001\u0000\u0000\u0000\u0386"+
		"\u0387\u0005%\u0000\u0000\u0387\u0388\u0005T\u0000\u0000\u0388\u038a\u0005"+
		"P\u0000\u0000\u0389\u0386\u0001\u0000\u0000\u0000\u0389\u038a\u0001\u0000"+
		"\u0000\u0000\u038a\u038b\u0001\u0000\u0000\u0000\u038b\u0396\u0003<\u001e"+
		"\u0000\u038c\u0396\u0005T\u0000\u0000\u038d\u038e\u0005T\u0000\u0000\u038e"+
		"\u038f\u0005H\u0000\u0000\u038f\u0396\u0003R)\u0000\u0390\u0392\u0005"+
		"6\u0000\u0000\u0391\u0393\u0003T*\u0000\u0392\u0391\u0001\u0000\u0000"+
		"\u0000\u0392\u0393\u0001\u0000\u0000\u0000\u0393\u0394\u0001\u0000\u0000"+
		"\u0000\u0394\u0396\u00057\u0000\u0000\u0395\u0389\u0001\u0000\u0000\u0000"+
		"\u0395\u038c\u0001\u0000\u0000\u0000\u0395\u038d\u0001\u0000\u0000\u0000"+
		"\u0395\u0390\u0001\u0000\u0000\u0000\u0396S\u0001\u0000\u0000\u0000\u0397"+
		"\u0399\u0005G\u0000\u0000\u0398\u0397\u0001\u0000\u0000\u0000\u0398\u0399"+
		"\u0001\u0000\u0000\u0000\u0399\u039a\u0001\u0000\u0000\u0000\u039a\u039b"+
		"\u0003R)\u0000\u039b\u03a3\u0001\u0000\u0000\u0000\u039c\u039e\u0005M"+
		"\u0000\u0000\u039d\u039f\u0005G\u0000\u0000\u039e\u039d\u0001\u0000\u0000"+
		"\u0000\u039e\u039f\u0001\u0000\u0000\u0000\u039f\u03a0\u0001\u0000\u0000"+
		"\u0000\u03a0\u03a2\u0003R)\u0000\u03a1\u039c\u0001\u0000\u0000\u0000\u03a2"+
		"\u03a5\u0001\u0000\u0000\u0000\u03a3\u03a1\u0001\u0000\u0000\u0000\u03a3"+
		"\u03a4\u0001\u0000\u0000\u0000\u03a4U\u0001\u0000\u0000\u0000\u03a5\u03a3"+
		"\u0001\u0000\u0000\u0000\u03a6\u03a7\u0005T\u0000\u0000\u03a7\u03a8\u0005"+
		"P\u0000\u0000\u03a8\u03a9\u0005T\u0000\u0000\u03a9\u03aa\u00058\u0000"+
		"\u0000\u03aa\u03ab\u0003X,\u0000\u03ab\u03ac\u00059\u0000\u0000\u03ac"+
		"\u03ad\u00056\u0000\u0000\u03ad\u03ae\u0005T\u0000\u0000\u03ae\u03af\u0005"+
		"7\u0000\u0000\u03af\u03b0\u0005K\u0000\u0000\u03b0W\u0001\u0000\u0000"+
		"\u0000\u03b1\u03b2\u00058\u0000\u0000\u03b2\u03b3\u00059\u0000\u0000\u03b3"+
		"\u03b4\u0005H\u0000\u0000\u03b4\u03b5\u0005T\u0000\u0000\u03b5\u03b6\u0005"+
		"8\u0000\u0000\u03b6\u03b7\u00059\u0000\u0000\u03b7\u03b8\u0005I\u0000"+
		"\u0000\u03b8\u03b9\u0005T\u0000\u0000\u03b9Y\u0001\u0000\u0000\u0000\u03ba"+
		"\u03bb\u0005\u0004\u0000\u0000\u03bb\u03bc\u0005\u0012\u0000\u0000\u03bc"+
		"\u03bd\u0005T\u0000\u0000\u03bd\u03be\u00054\u0000\u0000\u03be\u03bf\u0003"+
		"\\.\u0000\u03bf\u03c0\u00055\u0000\u0000\u03c0[\u0001\u0000\u0000\u0000"+
		"\u03c1\u03c3\u0003:\u001d\u0000\u03c2\u03c1\u0001\u0000\u0000\u0000\u03c3"+
		"\u03c6\u0001\u0000\u0000\u0000\u03c4\u03c2\u0001\u0000\u0000\u0000\u03c4"+
		"\u03c5\u0001\u0000\u0000\u0000\u03c5]\u0001\u0000\u0000\u0000\u03c6\u03c4"+
		"\u0001\u0000\u0000\u0000\u03c7\u03c8\u0005\u0003\u0000\u0000\u03c8\u03c9"+
		"\u00058\u0000\u0000\u03c9\u03ca\u00054\u0000\u0000\u03ca\u03cb\u0005\u000f"+
		"\u0000\u0000\u03cb\u03cc\u0005L\u0000\u0000\u03cc\u03cd\u0005Q\u0000\u0000"+
		"\u03cd\u03ce\u0005T\u0000\u0000\u03ce\u03cf\u0005Q\u0000\u0000\u03cf\u03d0"+
		"\u00055\u0000\u0000\u03d0\u03d1\u00059\u0000\u0000\u03d1_\u0001\u0000"+
		"\u0000\u0000\u03d2\u03d4\u0005%\u0000\u0000\u03d3\u03d2\u0001\u0000\u0000"+
		"\u0000\u03d4\u03d7\u0001\u0000\u0000\u0000\u03d5\u03d3\u0001\u0000\u0000"+
		"\u0000\u03d5\u03d6\u0001\u0000\u0000\u0000\u03d6\u03d8\u0001\u0000\u0000"+
		"\u0000\u03d7\u03d5\u0001\u0000\u0000\u0000\u03d8\u03de\u0005T\u0000\u0000"+
		"\u03d9\u03da\u0005L\u0000\u0000\u03da\u03df\u0005T\u0000\u0000\u03db\u03dc"+
		"\u00056\u0000\u0000\u03dc\u03dd\u0005T\u0000\u0000\u03dd\u03df\u00057"+
		"\u0000\u0000\u03de\u03d9\u0001\u0000\u0000\u0000\u03de\u03db\u0001\u0000"+
		"\u0000\u0000\u03df\u03e0\u0001\u0000\u0000\u0000\u03e0\u03e1\u0005P\u0000"+
		"\u0000\u03e1\u03e5\u00054\u0000\u0000\u03e2\u03e4\u0003b1\u0000\u03e3"+
		"\u03e2\u0001\u0000\u0000\u0000\u03e4\u03e7\u0001\u0000\u0000\u0000\u03e5"+
		"\u03e3\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001\u0000\u0000\u0000\u03e6"+
		"\u03e8\u0001\u0000\u0000\u0000\u03e7\u03e5\u0001\u0000\u0000\u0000\u03e8"+
		"\u03e9\u00055\u0000\u0000\u03e9\u03ea\u0005K\u0000\u0000\u03eaa\u0001"+
		"\u0000\u0000\u0000\u03eb\u03ec\u0005T\u0000\u0000\u03ec\u03ed\u0005L\u0000"+
		"\u0000\u03ed\u03ee\u0005T\u0000\u0000\u03ee\u03ef\u0005=\u0000\u0000\u03ef"+
		"\u03f3\u0005=\u0000\u0000\u03f0\u03f2\u0005M\u0000\u0000\u03f1\u03f0\u0001"+
		"\u0000\u0000\u0000\u03f2\u03f5\u0001\u0000\u0000\u0000\u03f3\u03f1\u0001"+
		"\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000\u0000\u03f4\u03fe\u0001"+
		"\u0000\u0000\u0000\u03f5\u03f3\u0001\u0000\u0000\u0000\u03f6\u03fa\u0003"+
		"T*\u0000\u03f7\u03f9\u0005M\u0000\u0000\u03f8\u03f7\u0001\u0000\u0000"+
		"\u0000\u03f9\u03fc\u0001\u0000\u0000\u0000\u03fa\u03f8\u0001\u0000\u0000"+
		"\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000\u03fb\u03fe\u0001\u0000\u0000"+
		"\u0000\u03fc\u03fa\u0001\u0000\u0000\u0000\u03fd\u03eb\u0001\u0000\u0000"+
		"\u0000\u03fd\u03f6\u0001\u0000\u0000\u0000\u03fec\u0001\u0000\u0000\u0000"+
		"qgp}\u0085\u008f\u0097\u009a\u00a7\u00c5\u00d2\u00d7\u00dd\u00e4\u00ea"+
		"\u00f0\u00fa\u00fe\u0104\u010c\u0113\u011a\u011e\u0121\u0128\u012c\u0138"+
		"\u0141\u0153\u0158\u016b\u017f\u018f\u019c\u01a2\u01a8\u01b2\u01b7\u01be"+
		"\u01c3\u01d2\u01db\u01e2\u01e8\u01f1\u01f5\u01fb\u0206\u020d\u0219\u0227"+
		"\u022c\u0230\u0235\u023a\u023f\u0244\u024a\u0251\u0256\u025e\u0264\u0277"+
		"\u0279\u0280\u028b\u0293\u02a1\u02a6\u02af\u02b2\u02b5\u02bb\u02c2\u02c9"+
		"\u02d9\u02e0\u02e8\u02ee\u02f1\u02f8\u0300\u030c\u0314\u031a\u0320\u0328"+
		"\u032c\u0331\u033b\u033e\u0341\u034e\u0353\u0360\u0364\u0366\u036b\u0378"+
		"\u037b\u0384\u0389\u0392\u0395\u0398\u039e\u03a3\u03c4\u03d5\u03de\u03e5"+
		"\u03f3\u03fa\u03fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}