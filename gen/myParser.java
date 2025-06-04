// Generated from C:/Users/USER/Desktop/angular/src/myParser.g4 by ANTLR 4.13.2
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
		IMPORT=1, COMPONENT=2, EXPORT=3, IMPORTLIST=4, LET=5, OF=6, FROM=7, CLASS=8, 
		SELECTOR=9, STANDALONE=10, TEMPLATE=11, STYLE=12, NGFOR=13, NGIF=14, IMPORTS=15, 
		BUTTON=16, DIV=17, IMG=18, UL=19, LI=20, OL=21, P=22, CONST=23, CLICK=24, 
		HEDEAR=25, ATTRBUTE=26, IMG_ATTRIBUTE=27, STYLE_BACK=28, TYPE=29, BOOLEAN=30, 
		AT=31, HASH=32, LCURLY=33, RCURLY=34, LBRACK=35, RBRACK=36, LPAREN=37, 
		RPAREN=38, TAG_OPEN=39, TAG_CLOSE=40, ARROW=41, CALCULAATE=42, SLASH=43, 
		SEMI=44, COLON=45, COMMA=46, DOT=47, PIPE=48, EQUAL=49, QUOTE=50, TH=51, 
		WHITESPACE=52, ID=53, COMMENT=54;
	public static final int
		RULE_program = 0, RULE_node = 1, RULE_importStatement = 2, RULE_importpath = 3, 
		RULE_importList = 4, RULE_componentDefinition = 5, RULE_componentMetadata = 6, 
		RULE_metadataEntry = 7, RULE_htmlTemplate = 8, RULE_element = 9, RULE_htmlopen = 10, 
		RULE_htmlclose = 11, RULE_csselement = 12, RULE_stylback = 13, RULE_ngfor = 14, 
		RULE_ngif = 15, RULE_click = 16, RULE_style = 17, RULE_name = 18, RULE_content = 19, 
		RULE_img = 20, RULE_imgarti = 21, RULE_classDefinition = 22, RULE_classBody = 23, 
		RULE_propertyDefinition = 24, RULE_value = 25, RULE_arrayDefinition = 26, 
		RULE_arrayList = 27, RULE_methodDefinition = 28, RULE_parameterList = 29, 
		RULE_methodBody = 30, RULE_calcualtecolor = 31, RULE_contenetcolorcal = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "node", "importStatement", "importpath", "importList", "componentDefinition", 
			"componentMetadata", "metadataEntry", "htmlTemplate", "element", "htmlopen", 
			"htmlclose", "csselement", "stylback", "ngfor", "ngif", "click", "style", 
			"name", "content", "img", "imgarti", "classDefinition", "classBody", 
			"propertyDefinition", "value", "arrayDefinition", "arrayList", "methodDefinition", 
			"parameterList", "methodBody", "calcualtecolor", "contenetcolorcal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'@Component'", "'export'", null, "'let'", "'of'", 
			"'from'", "'class'", "'selector'", "'standalone'", "'template'", "'style'", 
			"'*ngFor'", "'*ngIf'", "'imports'", "'button'", "'div'", "'img'", "'ul'", 
			"'li'", "'ol'", "'p'", "'const'", "'click'", null, null, null, "'style.background'", 
			null, null, "'@'", "'#'", "'{'", "'}'", "'['", "']'", "'('", "')'", "'<'", 
			"'>'", "'=>'", null, "'/'", "';'", "':'", "','", "'.'", "'|'", "'='", 
			null, "'`'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "COMPONENT", "EXPORT", "IMPORTLIST", "LET", "OF", "FROM", 
			"CLASS", "SELECTOR", "STANDALONE", "TEMPLATE", "STYLE", "NGFOR", "NGIF", 
			"IMPORTS", "BUTTON", "DIV", "IMG", "UL", "LI", "OL", "P", "CONST", "CLICK", 
			"HEDEAR", "ATTRBUTE", "IMG_ATTRIBUTE", "STYLE_BACK", "TYPE", "BOOLEAN", 
			"AT", "HASH", "LCURLY", "RCURLY", "LBRACK", "RBRACK", "LPAREN", "RPAREN", 
			"TAG_OPEN", "TAG_CLOSE", "ARROW", "CALCULAATE", "SLASH", "SEMI", "COLON", 
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
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				node();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0) );
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
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				_localctx = new ImportsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				importStatement();
				}
				break;
			case COMPONENT:
				_localctx = new ComponentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				componentDefinition();
				}
				break;
			case EXPORT:
				_localctx = new ClassContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				classDefinition();
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
			setState(76);
			match(IMPORT);
			setState(77);
			match(LCURLY);
			setState(78);
			importList();
			setState(79);
			match(RCURLY);
			setState(80);
			match(FROM);
			setState(81);
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
			setState(83);
			match(QUOTE);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(84);
				match(AT);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(ID);
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				match(SLASH);
				setState(92);
				match(ID);
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SLASH );
			setState(97);
			match(QUOTE);
			setState(98);
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
		public List<TerminalNode> IMPORTLIST() { return getTokens(myParser.IMPORTLIST); }
		public TerminalNode IMPORTLIST(int i) {
			return getToken(myParser.IMPORTLIST, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParser.COMMA, i);
		}
		public ImportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterImportList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitImportList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitImportList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportListContext importList() throws RecognitionException {
		ImportListContext _localctx = new ImportListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(IMPORTLIST);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(101);
				match(COMMA);
				setState(102);
				match(IMPORTLIST);
				}
				}
				setState(107);
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
			setState(108);
			match(COMPONENT);
			setState(109);
			match(LPAREN);
			setState(110);
			componentMetadata();
			setState(111);
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
			setState(113);
			match(LCURLY);
			setState(114);
			metadataEntry();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(115);
				match(COMMA);
				setState(116);
				metadataEntry();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
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

	public final MetadataEntryContext metadataEntry() throws RecognitionException {
		MetadataEntryContext _localctx = new MetadataEntryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_metadataEntry);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectoredataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(SELECTOR);
				setState(125);
				match(COLON);
				setState(126);
				match(QUOTE);
				setState(127);
				match(ID);
				setState(128);
				match(QUOTE);
				}
				break;
			case STANDALONE:
				_localctx = new StandalonedataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(STANDALONE);
				setState(130);
				match(COLON);
				setState(131);
				match(BOOLEAN);
				}
				break;
			case TEMPLATE:
				_localctx = new TempletedataContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(TEMPLATE);
				setState(133);
				match(COLON);
				setState(134);
				htmlTemplate();
				}
				break;
			case IMPORTS:
				_localctx = new ImportsdataContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(IMPORTS);
				setState(136);
				match(COLON);
				setState(137);
				match(LBRACK);
				setState(138);
				importList();
				setState(139);
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
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<ImgContext> img() {
			return getRuleContexts(ImgContext.class);
		}
		public ImgContext img(int i) {
			return getRuleContext(ImgContext.class,i);
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
			setState(143);
			match(TH);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_OPEN) {
				{
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(144);
					element();
					}
					break;
				case 2:
					{
					setState(145);
					img();
					}
					break;
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(TH);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					match(COMMA);
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 18, RULE_element);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			htmlopen();
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					content();
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(165);
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
	public static class HtmlopenContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(myParser.TAG_OPEN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode TAG_CLOSE() { return getToken(myParser.TAG_CLOSE, 0); }
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
		enterRule(_localctx, 20, RULE_htmlopen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(TAG_OPEN);
			setState(168);
			name();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 171798720512L) != 0)) {
				{
				{
				setState(169);
				csselement();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
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
	public static class HtmlcloseContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(myParser.TAG_OPEN, 0); }
		public TerminalNode SLASH() { return getToken(myParser.SLASH, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode TAG_CLOSE() { return getToken(myParser.TAG_CLOSE, 0); }
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
		enterRule(_localctx, 22, RULE_htmlclose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(TAG_OPEN);
			setState(178);
			match(SLASH);
			setState(179);
			name();
			setState(180);
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

	public final CsselementContext csselement() throws RecognitionException {
		CsselementContext _localctx = new CsselementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_csselement);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				_localctx = new StylebackContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				stylback();
				}
				break;
			case NGIF:
				_localctx = new NgifdataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				ngif();
				}
				break;
			case NGFOR:
				_localctx = new NgfordataContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				ngfor();
				}
				break;
			case LPAREN:
				_localctx = new ClickdataContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				click();
				}
				break;
			case STYLE:
				_localctx = new StyledataContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				style();
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
		enterRule(_localctx, 26, RULE_stylback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(LBRACK);
			setState(190);
			match(STYLE_BACK);
			setState(191);
			match(RBRACK);
			setState(192);
			match(EQUAL);
			setState(193);
			match(QUOTE);
			setState(194);
			match(ID);
			setState(195);
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
		enterRule(_localctx, 28, RULE_ngfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(NGFOR);
			setState(198);
			match(EQUAL);
			setState(199);
			match(QUOTE);
			setState(200);
			match(LET);
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				match(ID);
				setState(202);
				_la = _input.LA(1);
				if ( !(_la==OF || _la==EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(203);
				match(ID);
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(208);
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
		enterRule(_localctx, 30, RULE_ngif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(NGIF);
			setState(211);
			match(EQUAL);
			setState(212);
			match(QUOTE);
			setState(213);
			match(ID);
			setState(214);
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
		enterRule(_localctx, 32, RULE_click);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(LPAREN);
			setState(217);
			match(CLICK);
			setState(218);
			match(RPAREN);
			setState(219);
			match(EQUAL);
			setState(220);
			match(QUOTE);
			setState(221);
			match(ID);
			setState(222);
			match(LPAREN);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(223);
				match(ID);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(RPAREN);
			setState(230);
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
		enterRule(_localctx, 34, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(STYLE);
			setState(233);
			match(EQUAL);
			setState(234);
			match(QUOTE);
			setState(240); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(235);
				match(ATTRBUTE);
				setState(236);
				match(COLON);
				setState(237);
				value();
				setState(238);
				match(SEMI);
				}
				}
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ATTRBUTE );
			setState(244);
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
		enterRule(_localctx, 36, RULE_name);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIV:
				_localctx = new DivdataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(DIV);
				}
				break;
			case HEDEAR:
				_localctx = new HeadardataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(HEDEAR);
				}
				break;
			case P:
				_localctx = new PdataContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				match(P);
				}
				break;
			case OL:
				_localctx = new OldataContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				match(OL);
				}
				break;
			case LI:
				_localctx = new LidataContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				match(LI);
				}
				break;
			case UL:
				_localctx = new UldataContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				match(UL);
				}
				break;
			case BUTTON:
				_localctx = new ButtondataContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(252);
				match(BUTTON);
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
	public static class ElementdataContext extends ContentContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ElementdataContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterElementdata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitElementdata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitElementdata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImgdataContext extends ContentContext {
		public ImgContext img() {
			return getRuleContext(ImgContext.class,0);
		}
		public ImgdataContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterImgdata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitImgdata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitImgdata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringdataContext extends ContentContext {
		public TerminalNode ID() { return getToken(myParser.ID, 0); }
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
		enterRule(_localctx, 38, RULE_content);
		int _la;
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ElementdataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				element();
				}
				break;
			case 2:
				_localctx = new ImgdataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				img();
				}
				break;
			case 3:
				_localctx = new StringdataContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				match(ID);
				}
				break;
			case 4:
				_localctx = new VardataContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(258);
					match(ID);
					setState(259);
					match(COLON);
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(265);
				match(LCURLY);
				setState(266);
				match(LCURLY);
				setState(267);
				match(ID);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(268);
					match(DOT);
					setState(269);
					match(ID);
					}
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(275);
				match(RCURLY);
				setState(276);
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
		enterRule(_localctx, 40, RULE_img);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(TAG_OPEN);
			setState(280);
			match(IMG);
			setState(282); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(281);
					imgarti();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(284); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 171798720512L) != 0)) {
				{
				{
				setState(286);
				csselement();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
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
		public ImgartiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imgarti; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterImgarti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitImgarti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitImgarti(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgartiContext imgarti() throws RecognitionException {
		ImgartiContext _localctx = new ImgartiContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_imgarti);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(LBRACK);
			setState(295);
			match(IMG_ATTRIBUTE);
			setState(296);
			match(RBRACK);
			setState(297);
			match(EQUAL);
			setState(298);
			match(QUOTE);
			setState(299);
			match(ID);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(300);
				match(DOT);
				setState(301);
				match(ID);
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
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
	public static class ClassDefinitionContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(myParser.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(myParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(myParser.ID, 0); }
		public TerminalNode LCURLY() { return getToken(myParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(myParser.RCURLY, 0); }
		public List<ClassBodyContext> classBody() {
			return getRuleContexts(ClassBodyContext.class);
		}
		public ClassBodyContext classBody(int i) {
			return getRuleContext(ClassBodyContext.class,i);
		}
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
		enterRule(_localctx, 44, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(EXPORT);
			setState(310);
			match(CLASS);
			setState(311);
			match(ID);
			setState(312);
			match(LCURLY);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST || _la==ID) {
				{
				{
				setState(313);
				classBody();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
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
		enterRule(_localctx, 46, RULE_classBody);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new PropertydataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				propertyDefinition();
				}
				break;
			case 2:
				_localctx = new ArraydataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				arrayDefinition();
				}
				break;
			case 3:
				_localctx = new MethoddataContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
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
		public TerminalNode ID() { return getToken(myParser.ID, 0); }
		public TerminalNode COLON() { return getToken(myParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(myParser.SEMI, 0); }
		public List<TerminalNode> TYPE() { return getTokens(myParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(myParser.TYPE, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(myParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(myParser.EQUAL, i);
		}
		public PropertyDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterPropertyDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitPropertyDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitPropertyDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDefinitionContext propertyDefinition() throws RecognitionException {
		PropertyDefinitionContext _localctx = new PropertyDefinitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_propertyDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(ID);
			setState(327);
			match(COLON);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(328);
				match(TYPE);
				setState(329);
				match(EQUAL);
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			value();
			setState(336);
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
	public static class IdContext extends ValueContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
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
	public static class IdcolonContext extends ValueContext {
		public List<TerminalNode> QUOTE() { return getTokens(myParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(myParser.QUOTE, i);
		}
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(myParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(myParser.COLON, i);
		}
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
		enterRule(_localctx, 50, RULE_value);
		int _la;
		try {
			int _alt;
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new IdcolonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(QUOTE);
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(339);
					match(ID);
					setState(340);
					match(COLON);
					}
					}
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(348); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(346);
					match(SLASH);
					setState(347);
					match(ID);
					}
					}
					setState(350); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SLASH );
				setState(352);
				match(QUOTE);
				}
				break;
			case 2:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(BOOLEAN);
				}
				break;
			case 3:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(355); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(354);
						match(ID);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(357); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				_localctx = new ColorvalueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(359);
				match(QUOTE);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==HASH) {
					{
					{
					setState(360);
					match(HASH);
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(367); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(366);
					match(ID);
					}
					}
					setState(369); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(371);
					match(COMMA);
					setState(372);
					match(ID);
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(378);
				match(QUOTE);
				}
				break;
			case 5:
				_localctx = new HashidContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(379);
				match(HASH);
				setState(380);
				match(ID);
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
		public TerminalNode ID() { return getToken(myParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(myParser.EQUAL, 0); }
		public TerminalNode LBRACK() { return getToken(myParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(myParser.RBRACK, 0); }
		public TerminalNode SEMI() { return getToken(myParser.SEMI, 0); }
		public List<TerminalNode> CONST() { return getTokens(myParser.CONST); }
		public TerminalNode CONST(int i) {
			return getToken(myParser.CONST, i);
		}
		public List<TerminalNode> COLON() { return getTokens(myParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(myParser.COLON, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(myParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(myParser.TYPE, i);
		}
		public List<ArrayListContext> arrayList() {
			return getRuleContexts(ArrayListContext.class);
		}
		public ArrayListContext arrayList(int i) {
			return getRuleContext(ArrayListContext.class,i);
		}
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
		enterRule(_localctx, 52, RULE_arrayDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(383);
				match(CONST);
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			match(ID);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(390);
				match(COLON);
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(396);
				match(TYPE);
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(EQUAL);
			setState(403);
			match(LBRACK);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10133113120227328L) != 0)) {
				{
				{
				setState(404);
				arrayList();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410);
			match(RBRACK);
			setState(411);
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
		enterRule(_localctx, 54, RULE_arrayList);
		int _la;
		try {
			int _alt;
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				_localctx = new IncludearrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(LCURLY);
				setState(414);
				match(ID);
				setState(415);
				match(COLON);
				setState(416);
				value();
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(417);
					match(COMMA);
					setState(418);
					match(ID);
					setState(419);
					match(COLON);
					setState(420);
					value();
					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(426);
				match(RCURLY);
				setState(427);
				match(COMMA);
				}
				break;
			case BOOLEAN:
			case HASH:
			case QUOTE:
			case ID:
				_localctx = new ValdataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				value();
				setState(434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(430);
						match(COMMA);
						setState(431);
						value();
						}
						} 
					}
					setState(436);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(437);
					match(COMMA);
					}
					}
					setState(442);
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
		enterRule(_localctx, 56, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(ID);
			setState(446);
			match(LPAREN);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(447);
				parameterList();
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(453);
			match(RPAREN);
			setState(454);
			match(LCURLY);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10133104538681344L) != 0)) {
				{
				{
				setState(455);
				methodBody();
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(461);
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(myParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(myParser.COLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(myParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myParserListener ) ((myParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof myParserVisitor ) return ((myParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(ID);
			setState(464);
			match(COLON);
			setState(465);
			match(ID);
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(466);
				match(COMMA);
				}
				}
				setState(471);
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

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodBody);
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new CalcolorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				calcualtecolor();
				}
				break;
			case 2:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(ID);
				setState(474);
				match(EQUAL);
				setState(475);
				value();
				setState(476);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new ValuedataContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				value();
				}
				break;
			case 4:
				_localctx = new PropertyDefinitiondataContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				propertyDefinition();
				}
				break;
			case 5:
				_localctx = new ArrayDefinitiondataContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(480);
				arrayDefinition();
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
		enterRule(_localctx, 62, RULE_calcualtecolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(ID);
			setState(484);
			match(EQUAL);
			setState(485);
			match(ID);
			setState(486);
			match(LPAREN);
			setState(487);
			contenetcolorcal();
			setState(488);
			match(RPAREN);
			setState(489);
			match(LBRACK);
			setState(490);
			match(ID);
			setState(491);
			match(RBRACK);
			setState(492);
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
		enterRule(_localctx, 64, RULE_contenetcolorcal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(LPAREN);
			setState(495);
			match(RPAREN);
			setState(496);
			match(ARROW);
			setState(497);
			match(ID);
			setState(498);
			match(LPAREN);
			setState(499);
			match(RPAREN);
			setState(500);
			match(CALCULAATE);
			setState(501);
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

	public static final String _serializedATN =
		"\u0004\u00016\u01f8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0004\u0000D\b\u0000"+
		"\u000b\u0000\f\u0000E\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"K\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003V\b\u0003"+
		"\n\u0003\f\u0003Y\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003"+
		"^\b\u0003\u000b\u0003\f\u0003_\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004h\b\u0004\n\u0004\f\u0004k\t"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006v\b\u0006\n\u0006"+
		"\f\u0006y\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008e\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u0093\b\b\n\b\f\b\u0096\t\b\u0001\b\u0001\b\u0005\b"+
		"\u009a\b\b\n\b\f\b\u009d\t\b\u0001\t\u0001\t\u0005\t\u00a1\b\t\n\t\f\t"+
		"\u00a4\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u00ab\b\n\n"+
		"\n\f\n\u00ae\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00bc"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0004\u000e\u00cd\b\u000e\u000b\u000e\f\u000e\u00ce\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00e1\b\u0010\n\u0010"+
		"\f\u0010\u00e4\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0004\u0011\u00f1\b\u0011\u000b\u0011\f\u0011\u00f2\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00fe\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0105\b\u0013\n"+
		"\u0013\f\u0013\u0108\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u010f\b\u0013\n\u0013\f\u0013\u0112\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0116\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0004\u0014\u011b\b\u0014\u000b\u0014\f\u0014\u011c\u0001"+
		"\u0014\u0005\u0014\u0120\b\u0014\n\u0014\f\u0014\u0123\t\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u012f\b\u0015\n\u0015"+
		"\f\u0015\u0132\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u013b\b\u0016\n\u0016"+
		"\f\u0016\u013e\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u0145\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u014b\b\u0018\n\u0018\f\u0018\u014e\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u0156\b\u0019\n\u0019\f\u0019\u0159\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0004\u0019\u015d\b\u0019\u000b\u0019\f\u0019\u015e\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0004\u0019\u0164\b\u0019\u000b\u0019\f\u0019\u0165"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u016a\b\u0019\n\u0019\f\u0019\u016d"+
		"\t\u0019\u0001\u0019\u0004\u0019\u0170\b\u0019\u000b\u0019\f\u0019\u0171"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u0176\b\u0019\n\u0019\f\u0019\u0179"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u017e\b\u0019"+
		"\u0001\u001a\u0005\u001a\u0181\b\u001a\n\u001a\f\u001a\u0184\t\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u0188\b\u001a\n\u001a\f\u001a\u018b\t\u001a"+
		"\u0001\u001a\u0005\u001a\u018e\b\u001a\n\u001a\f\u001a\u0191\t\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0196\b\u001a\n\u001a\f\u001a"+
		"\u0199\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0005\u001b\u01a6\b\u001b\n\u001b\f\u001b\u01a9\t\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01b1"+
		"\b\u001b\n\u001b\f\u001b\u01b4\t\u001b\u0001\u001b\u0005\u001b\u01b7\b"+
		"\u001b\n\u001b\f\u001b\u01ba\t\u001b\u0003\u001b\u01bc\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u01c1\b\u001c\n\u001c\f\u001c\u01c4"+
		"\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01c9\b\u001c"+
		"\n\u001c\f\u001c\u01cc\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01d4\b\u001d\n\u001d\f\u001d"+
		"\u01d7\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01e2\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0000\u0000"+
		"!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@\u0000\u0001\u0002\u0000\u0006\u000611\u0217"+
		"\u0000C\u0001\u0000\u0000\u0000\u0002J\u0001\u0000\u0000\u0000\u0004L"+
		"\u0001\u0000\u0000\u0000\u0006S\u0001\u0000\u0000\u0000\bd\u0001\u0000"+
		"\u0000\u0000\nl\u0001\u0000\u0000\u0000\fq\u0001\u0000\u0000\u0000\u000e"+
		"\u008d\u0001\u0000\u0000\u0000\u0010\u008f\u0001\u0000\u0000\u0000\u0012"+
		"\u009e\u0001\u0000\u0000\u0000\u0014\u00a7\u0001\u0000\u0000\u0000\u0016"+
		"\u00b1\u0001\u0000\u0000\u0000\u0018\u00bb\u0001\u0000\u0000\u0000\u001a"+
		"\u00bd\u0001\u0000\u0000\u0000\u001c\u00c5\u0001\u0000\u0000\u0000\u001e"+
		"\u00d2\u0001\u0000\u0000\u0000 \u00d8\u0001\u0000\u0000\u0000\"\u00e8"+
		"\u0001\u0000\u0000\u0000$\u00fd\u0001\u0000\u0000\u0000&\u0115\u0001\u0000"+
		"\u0000\u0000(\u0117\u0001\u0000\u0000\u0000*\u0126\u0001\u0000\u0000\u0000"+
		",\u0135\u0001\u0000\u0000\u0000.\u0144\u0001\u0000\u0000\u00000\u0146"+
		"\u0001\u0000\u0000\u00002\u017d\u0001\u0000\u0000\u00004\u0182\u0001\u0000"+
		"\u0000\u00006\u01bb\u0001\u0000\u0000\u00008\u01bd\u0001\u0000\u0000\u0000"+
		":\u01cf\u0001\u0000\u0000\u0000<\u01e1\u0001\u0000\u0000\u0000>\u01e3"+
		"\u0001\u0000\u0000\u0000@\u01ee\u0001\u0000\u0000\u0000BD\u0003\u0002"+
		"\u0001\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u0001\u0001\u0000\u0000"+
		"\u0000GK\u0003\u0004\u0002\u0000HK\u0003\n\u0005\u0000IK\u0003,\u0016"+
		"\u0000JG\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000"+
		"\u0000\u0000K\u0003\u0001\u0000\u0000\u0000LM\u0005\u0001\u0000\u0000"+
		"MN\u0005!\u0000\u0000NO\u0003\b\u0004\u0000OP\u0005\"\u0000\u0000PQ\u0005"+
		"\u0007\u0000\u0000QR\u0003\u0006\u0003\u0000R\u0005\u0001\u0000\u0000"+
		"\u0000SW\u00052\u0000\u0000TV\u0005\u001f\u0000\u0000UT\u0001\u0000\u0000"+
		"\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z]\u0005"+
		"5\u0000\u0000[\\\u0005+\u0000\u0000\\^\u00055\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u00052\u0000\u0000bc\u0005"+
		",\u0000\u0000c\u0007\u0001\u0000\u0000\u0000di\u0005\u0004\u0000\u0000"+
		"ef\u0005.\u0000\u0000fh\u0005\u0004\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000j\t\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\u0002"+
		"\u0000\u0000mn\u0005%\u0000\u0000no\u0003\f\u0006\u0000op\u0005&\u0000"+
		"\u0000p\u000b\u0001\u0000\u0000\u0000qr\u0005!\u0000\u0000rw\u0003\u000e"+
		"\u0007\u0000st\u0005.\u0000\u0000tv\u0003\u000e\u0007\u0000us\u0001\u0000"+
		"\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"+
		"z{\u0005\"\u0000\u0000{\r\u0001\u0000\u0000\u0000|}\u0005\t\u0000\u0000"+
		"}~\u0005-\u0000\u0000~\u007f\u00052\u0000\u0000\u007f\u0080\u00055\u0000"+
		"\u0000\u0080\u008e\u00052\u0000\u0000\u0081\u0082\u0005\n\u0000\u0000"+
		"\u0082\u0083\u0005-\u0000\u0000\u0083\u008e\u0005\u001e\u0000\u0000\u0084"+
		"\u0085\u0005\u000b\u0000\u0000\u0085\u0086\u0005-\u0000\u0000\u0086\u008e"+
		"\u0003\u0010\b\u0000\u0087\u0088\u0005\u000f\u0000\u0000\u0088\u0089\u0005"+
		"-\u0000\u0000\u0089\u008a\u0005#\u0000\u0000\u008a\u008b\u0003\b\u0004"+
		"\u0000\u008b\u008c\u0005$\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000"+
		"\u008d|\u0001\u0000\u0000\u0000\u008d\u0081\u0001\u0000\u0000\u0000\u008d"+
		"\u0084\u0001\u0000\u0000\u0000\u008d\u0087\u0001\u0000\u0000\u0000\u008e"+
		"\u000f\u0001\u0000\u0000\u0000\u008f\u0094\u00053\u0000\u0000\u0090\u0093"+
		"\u0003\u0012\t\u0000\u0091\u0093\u0003(\u0014\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001"+
		"\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0097\u009b\u00053\u0000\u0000\u0098\u009a\u0005.\u0000"+
		"\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u0011\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009e\u00a2\u0003\u0014\n\u0000\u009f\u00a1\u0003&\u0013\u0000"+
		"\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0003\u0016\u000b\u0000\u00a6\u0013\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0005\'\u0000\u0000\u00a8\u00ac\u0003$\u0012\u0000\u00a9"+
		"\u00ab\u0003\u0018\f\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0005(\u0000\u0000\u00b0\u0015\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0005\'\u0000\u0000\u00b2\u00b3\u0005+"+
		"\u0000\u0000\u00b3\u00b4\u0003$\u0012\u0000\u00b4\u00b5\u0005(\u0000\u0000"+
		"\u00b5\u0017\u0001\u0000\u0000\u0000\u00b6\u00bc\u0003\u001a\r\u0000\u00b7"+
		"\u00bc\u0003\u001e\u000f\u0000\u00b8\u00bc\u0003\u001c\u000e\u0000\u00b9"+
		"\u00bc\u0003 \u0010\u0000\u00ba\u00bc\u0003\"\u0011\u0000\u00bb\u00b6"+
		"\u0001\u0000\u0000\u0000\u00bb\u00b7\u0001\u0000\u0000\u0000\u00bb\u00b8"+
		"\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bc\u0019\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0005#\u0000\u0000\u00be\u00bf\u0005\u001c\u0000\u0000\u00bf\u00c0\u0005"+
		"$\u0000\u0000\u00c0\u00c1\u00051\u0000\u0000\u00c1\u00c2\u00052\u0000"+
		"\u0000\u00c2\u00c3\u00055\u0000\u0000\u00c3\u00c4\u00052\u0000\u0000\u00c4"+
		"\u001b\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\r\u0000\u0000\u00c6\u00c7"+
		"\u00051\u0000\u0000\u00c7\u00c8\u00052\u0000\u0000\u00c8\u00cc\u0005\u0005"+
		"\u0000\u0000\u00c9\u00ca\u00055\u0000\u0000\u00ca\u00cb\u0007\u0000\u0000"+
		"\u0000\u00cb\u00cd\u00055\u0000\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u00052\u0000\u0000\u00d1\u001d\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0005\u000e\u0000\u0000\u00d3\u00d4\u00051\u0000\u0000\u00d4\u00d5"+
		"\u00052\u0000\u0000\u00d5\u00d6\u00055\u0000\u0000\u00d6\u00d7\u00052"+
		"\u0000\u0000\u00d7\u001f\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005%\u0000"+
		"\u0000\u00d9\u00da\u0005\u0018\u0000\u0000\u00da\u00db\u0005&\u0000\u0000"+
		"\u00db\u00dc\u00051\u0000\u0000\u00dc\u00dd\u00052\u0000\u0000\u00dd\u00de"+
		"\u00055\u0000\u0000\u00de\u00e2\u0005%\u0000\u0000\u00df\u00e1\u00055"+
		"\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0005&\u0000\u0000\u00e6\u00e7\u00052\u0000\u0000"+
		"\u00e7!\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\f\u0000\u0000\u00e9"+
		"\u00ea\u00051\u0000\u0000\u00ea\u00f0\u00052\u0000\u0000\u00eb\u00ec\u0005"+
		"\u001a\u0000\u0000\u00ec\u00ed\u0005-\u0000\u0000\u00ed\u00ee\u00032\u0019"+
		"\u0000\u00ee\u00ef\u0005,\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f0\u00eb\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u00052\u0000\u0000\u00f5"+
		"#\u0001\u0000\u0000\u0000\u00f6\u00fe\u0005\u0011\u0000\u0000\u00f7\u00fe"+
		"\u0005\u0019\u0000\u0000\u00f8\u00fe\u0005\u0016\u0000\u0000\u00f9\u00fe"+
		"\u0005\u0015\u0000\u0000\u00fa\u00fe\u0005\u0014\u0000\u0000\u00fb\u00fe"+
		"\u0005\u0013\u0000\u0000\u00fc\u00fe\u0005\u0010\u0000\u0000\u00fd\u00f6"+
		"\u0001\u0000\u0000\u0000\u00fd\u00f7\u0001\u0000\u0000\u0000\u00fd\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fd\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fe%\u0001\u0000\u0000\u0000\u00ff\u0116\u0003"+
		"\u0012\t\u0000\u0100\u0116\u0003(\u0014\u0000\u0101\u0116\u00055\u0000"+
		"\u0000\u0102\u0103\u00055\u0000\u0000\u0103\u0105\u0005-\u0000\u0000\u0104"+
		"\u0102\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106"+
		"\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107"+
		"\u0109\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0005!\u0000\u0000\u010a\u010b\u0005!\u0000\u0000\u010b\u0110\u0005"+
		"5\u0000\u0000\u010c\u010d\u0005/\u0000\u0000\u010d\u010f\u00055\u0000"+
		"\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000\u0000"+
		"\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000"+
		"\u0000\u0111\u0113\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0005\"\u0000\u0000\u0114\u0116\u0005\"\u0000\u0000"+
		"\u0115\u00ff\u0001\u0000\u0000\u0000\u0115\u0100\u0001\u0000\u0000\u0000"+
		"\u0115\u0101\u0001\u0000\u0000\u0000\u0115\u0106\u0001\u0000\u0000\u0000"+
		"\u0116\'\u0001\u0000\u0000\u0000\u0117\u0118\u0005\'\u0000\u0000\u0118"+
		"\u011a\u0005\u0012\u0000\u0000\u0119\u011b\u0003*\u0015\u0000\u011a\u0119"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011a"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u0121"+
		"\u0001\u0000\u0000\u0000\u011e\u0120\u0003\u0018\f\u0000\u011f\u011e\u0001"+
		"\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0124\u0001"+
		"\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0125\u0005"+
		"(\u0000\u0000\u0125)\u0001\u0000\u0000\u0000\u0126\u0127\u0005#\u0000"+
		"\u0000\u0127\u0128\u0005\u001b\u0000\u0000\u0128\u0129\u0005$\u0000\u0000"+
		"\u0129\u012a\u00051\u0000\u0000\u012a\u012b\u00052\u0000\u0000\u012b\u0130"+
		"\u00055\u0000\u0000\u012c\u012d\u0005/\u0000\u0000\u012d\u012f\u00055"+
		"\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000"+
		"\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000"+
		"\u0000\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u00052\u0000\u0000\u0134+\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0005\u0003\u0000\u0000\u0136\u0137\u0005\b\u0000\u0000\u0137"+
		"\u0138\u00055\u0000\u0000\u0138\u013c\u0005!\u0000\u0000\u0139\u013b\u0003"+
		".\u0017\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013b\u013e\u0001\u0000"+
		"\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000"+
		"\u0000\u0000\u013d\u013f\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0005\"\u0000\u0000\u0140-\u0001\u0000\u0000"+
		"\u0000\u0141\u0145\u00030\u0018\u0000\u0142\u0145\u00034\u001a\u0000\u0143"+
		"\u0145\u00038\u001c\u0000\u0144\u0141\u0001\u0000\u0000\u0000\u0144\u0142"+
		"\u0001\u0000\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145/\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u00055\u0000\u0000\u0147\u014c\u0005-\u0000"+
		"\u0000\u0148\u0149\u0005\u001d\u0000\u0000\u0149\u014b\u00051\u0000\u0000"+
		"\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000"+
		"\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000"+
		"\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u00032\u0019\u0000\u0150\u0151\u0005,\u0000\u0000\u01511"+
		"\u0001\u0000\u0000\u0000\u0152\u0157\u00052\u0000\u0000\u0153\u0154\u0005"+
		"5\u0000\u0000\u0154\u0156\u0005-\u0000\u0000\u0155\u0153\u0001\u0000\u0000"+
		"\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015c\u0001\u0000\u0000"+
		"\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015b\u0005+\u0000\u0000"+
		"\u015b\u015d\u00055\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e"+
		"\u015f\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160"+
		"\u017e\u00052\u0000\u0000\u0161\u017e\u0005\u001e\u0000\u0000\u0162\u0164"+
		"\u00055\u0000\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001"+
		"\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166\u0001"+
		"\u0000\u0000\u0000\u0166\u017e\u0001\u0000\u0000\u0000\u0167\u016b\u0005"+
		"2\u0000\u0000\u0168\u016a\u0005 \u0000\u0000\u0169\u0168\u0001\u0000\u0000"+
		"\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016f\u0001\u0000\u0000"+
		"\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u0170\u00055\u0000\u0000"+
		"\u016f\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000"+
		"\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000"+
		"\u0172\u0177\u0001\u0000\u0000\u0000\u0173\u0174\u0005.\u0000\u0000\u0174"+
		"\u0176\u00055\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0179"+
		"\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178"+
		"\u0001\u0000\u0000\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0177"+
		"\u0001\u0000\u0000\u0000\u017a\u017e\u00052\u0000\u0000\u017b\u017c\u0005"+
		" \u0000\u0000\u017c\u017e\u00055\u0000\u0000\u017d\u0152\u0001\u0000\u0000"+
		"\u0000\u017d\u0161\u0001\u0000\u0000\u0000\u017d\u0163\u0001\u0000\u0000"+
		"\u0000\u017d\u0167\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000"+
		"\u0000\u017e3\u0001\u0000\u0000\u0000\u017f\u0181\u0005\u0017\u0000\u0000"+
		"\u0180\u017f\u0001\u0000\u0000\u0000\u0181\u0184\u0001\u0000\u0000\u0000"+
		"\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000"+
		"\u0183\u0185\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000"+
		"\u0185\u0189\u00055\u0000\u0000\u0186\u0188\u0005-\u0000\u0000\u0187\u0186"+
		"\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u0187"+
		"\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018f"+
		"\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u018e"+
		"\u0005\u001d\u0000\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018e\u0191"+
		"\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u0190"+
		"\u0001\u0000\u0000\u0000\u0190\u0192\u0001\u0000\u0000\u0000\u0191\u018f"+
		"\u0001\u0000\u0000\u0000\u0192\u0193\u00051\u0000\u0000\u0193\u0197\u0005"+
		"#\u0000\u0000\u0194\u0196\u00036\u001b\u0000\u0195\u0194\u0001\u0000\u0000"+
		"\u0000\u0196\u0199\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000"+
		"\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u019a\u0001\u0000\u0000"+
		"\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a\u019b\u0005$\u0000\u0000"+
		"\u019b\u019c\u0005,\u0000\u0000\u019c5\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0005!\u0000\u0000\u019e\u019f\u00055\u0000\u0000\u019f\u01a0\u0005-"+
		"\u0000\u0000\u01a0\u01a7\u00032\u0019\u0000\u01a1\u01a2\u0005.\u0000\u0000"+
		"\u01a2\u01a3\u00055\u0000\u0000\u01a3\u01a4\u0005-\u0000\u0000\u01a4\u01a6"+
		"\u00032\u0019\u0000\u01a5\u01a1\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001"+
		"\u0000\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0005\"\u0000\u0000\u01ab\u01ac\u0005."+
		"\u0000\u0000\u01ac\u01bc\u0001\u0000\u0000\u0000\u01ad\u01b2\u00032\u0019"+
		"\u0000\u01ae\u01af\u0005.\u0000\u0000\u01af\u01b1\u00032\u0019\u0000\u01b0"+
		"\u01ae\u0001\u0000\u0000\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b7\u0005.\u0000\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7\u01ba"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01b8"+
		"\u0001\u0000\u0000\u0000\u01bb\u019d\u0001\u0000\u0000\u0000\u01bb\u01ad"+
		"\u0001\u0000\u0000\u0000\u01bc7\u0001\u0000\u0000\u0000\u01bd\u01be\u0005"+
		"5\u0000\u0000\u01be\u01c2\u0005%\u0000\u0000\u01bf\u01c1\u0003:\u001d"+
		"\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c5\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c6\u0005&\u0000\u0000\u01c6\u01ca\u0005!\u0000\u0000\u01c7"+
		"\u01c9\u0003<\u001e\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c9\u01cc"+
		"\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cb\u01cd\u0001\u0000\u0000\u0000\u01cc\u01ca"+
		"\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005\"\u0000\u0000\u01ce9\u0001"+
		"\u0000\u0000\u0000\u01cf\u01d0\u00055\u0000\u0000\u01d0\u01d1\u0005-\u0000"+
		"\u0000\u01d1\u01d5\u00055\u0000\u0000\u01d2\u01d4\u0005.\u0000\u0000\u01d3"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d7\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6"+
		";\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d8\u01e2"+
		"\u0003>\u001f\u0000\u01d9\u01da\u00055\u0000\u0000\u01da\u01db\u00051"+
		"\u0000\u0000\u01db\u01dc\u00032\u0019\u0000\u01dc\u01dd\u0005,\u0000\u0000"+
		"\u01dd\u01e2\u0001\u0000\u0000\u0000\u01de\u01e2\u00032\u0019\u0000\u01df"+
		"\u01e2\u00030\u0018\u0000\u01e0\u01e2\u00034\u001a\u0000\u01e1\u01d8\u0001"+
		"\u0000\u0000\u0000\u01e1\u01d9\u0001\u0000\u0000\u0000\u01e1\u01de\u0001"+
		"\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e2=\u0001\u0000\u0000\u0000\u01e3\u01e4\u00055\u0000"+
		"\u0000\u01e4\u01e5\u00051\u0000\u0000\u01e5\u01e6\u00055\u0000\u0000\u01e6"+
		"\u01e7\u0005%\u0000\u0000\u01e7\u01e8\u0003@ \u0000\u01e8\u01e9\u0005"+
		"&\u0000\u0000\u01e9\u01ea\u0005#\u0000\u0000\u01ea\u01eb\u00055\u0000"+
		"\u0000\u01eb\u01ec\u0005$\u0000\u0000\u01ec\u01ed\u0005,\u0000\u0000\u01ed"+
		"?\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005%\u0000\u0000\u01ef\u01f0\u0005"+
		"&\u0000\u0000\u01f0\u01f1\u0005)\u0000\u0000\u01f1\u01f2\u00055\u0000"+
		"\u0000\u01f2\u01f3\u0005%\u0000\u0000\u01f3\u01f4\u0005&\u0000\u0000\u01f4"+
		"\u01f5\u0005*\u0000\u0000\u01f5\u01f6\u00055\u0000\u0000\u01f6A\u0001"+
		"\u0000\u0000\u0000-EJW_iw\u008d\u0092\u0094\u009b\u00a2\u00ac\u00bb\u00ce"+
		"\u00e2\u00f2\u00fd\u0106\u0110\u0115\u011c\u0121\u0130\u013c\u0144\u014c"+
		"\u0157\u015e\u0165\u016b\u0171\u0177\u017d\u0182\u0189\u018f\u0197\u01a7"+
		"\u01b2\u01b8\u01bb\u01c2\u01ca\u01d5\u01e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}