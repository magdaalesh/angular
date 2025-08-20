lexer grammar lexicalanalysis;
IMPORT: 'import';
COMPONENT: '@Component';
INJECTABLE:'@Injectable';
EXPORT: 'export';
CONSTRUCTOR :'constructor';
IMPORTLIST: 'ActivatedRoute'|'FormsModule'|'Router'|'OnInit'| 'Injectable'|'EventEmitter'|'Component'|'CommonModule'|'Input'|'Output';
LET:'let';
OF:'of';
THIS:'this';
IMPLEMENT:'implements';
URLTEMPLATE:'templateUrl';
STYLEURL:'styleUrls';
RETURN:'return';
FROM: 'from';
PROVIDIN:'providedIn';
CLASS: 'class';
IF:'if';
INTERFACE :'interface';
SELECTOR: 'selector';
STANDALONE: 'standalone';
TEMPLATE: 'template';
STYLE: 'style';
NGFOR: '*ngFor';
NGIF: '*ngIf';
IMPORTS: 'imports';
BUTTON:'button';
DIV:'div';
IMG:'img';
UL:'ul';
LI:'li';
OL:'ol';
P:'p';
A:'a';
BR :'br';
FORM :'form';
AARTT:'routerLink';
CONST:'const';
CLICK:'click';
INPUT :'input';
TEXTERA :'textarea';
NGSUBMIT:'(ngSubmit)';
MODIFIER: 'private' | 'public'|'protected';
HEDEAR:'h1'|'h2'|'h3'|'h4'|'h5'|'h6';
ATTRBUTE:'border'|'margin'|'margin-bottom'
        |'display'|'flex-direction'|'background-color'
        | 'width' | 'max-width'|'border-left'
        | 'align-items'|'padding'|'cursor'
        |'border-right' |'height'|'justify-content'
        |'font-size'|'color'|'border-radius';
IMG_ATTRIBUTE:'src' | 'alt';
SELF_ATTRIBUTE:'required'|' name'|'[(ngModel)]' |'placeholder'|'type' ;
STYLE_BACK:'style.background';
TYPE:'number' |'string'|'boolean';
BOOLEAN : 'true'|'false' ;
AT: '@';
HASH:'#';
LCURLY: '{';
RCURLY: '}';
LBRACK: '[';
RBRACK: ']';
LPAREN: '(';
RPAREN: ')';
 EQEQ  :  '==';
 EQEQEQ:'===';
 NOTEQEQ : '!==';
  PLUS  : '+';
  MINUS  : ' -';
 AND : '&&';
  OR:'||';
  QMARK : '?';
  MUL    : '*';
LT     : ' <';
 GT     : ' >';
TAG_OPEN: '<';
TAG_CLOSE: '>';
 SPREAD : '...';
ARROW:'=>';
CALCULAATE:'+' |'-' |'\\'|'*';
SLASH: '/';
//DASH: '-';
SEMI: ';';
COLON: ':';
COMMA: ',';
DOT: '.';
PIPE: '|';
EQUAL: '=';
QUOTE: '\'' | '"';
TH: '`';
// هوامش
WHITESPACE: [ \t\r\n]+ -> skip;
//نصوص
ID: [.a-zA-Z0-9_-_-%!]+ ;

COMMENT: '//' ~[\r\n]* -> skip;// التعليقات
