lexer grammar lexicalanalysis;
IMPORT: 'import';
COMPONENT: '@Component';
EXPORT: 'export';
IMPORTLIST: 'EventEmitter'|'Component'|'CommonModule'|'Input'|'Output';
LET:'let';
OF:'of';
FROM: 'from';
CLASS: 'class';
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
CONST:'const';
CLICK:'click';

HEDEAR:'h1'|'h2'|'h3'|'h4'|'h5'|'h6';
ATTRBUTE:'border'|'margin'|'margin-bottom'
        |'display'|'flex-direction'|'background-color'
        | 'width' | 'max-width'|'border-left'
        | 'align-items'|'padding'|'cursor'
        |'border-right' |'height'|'justify-content'
        |'font-size'|'color'|'border-radius';
IMG_ATTRIBUTE:'src' | 'alt';
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
TAG_OPEN: '<';
TAG_CLOSE: '>';
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
