parser grammar myParser;
options {tokenVocab = lexicalanalysis;}

program : node+  ;
node : importStatement       #imports
     | componentDefinition   #component
     | classDefinition       #class
     | interface             #interfaces
     | injectableDefinition  #injectable
     | methodDefinition      #methode
     | htmlpage              #htmlpagenode

     ;


importStatement: IMPORT LCURLY importList RCURLY FROM importpath;
importpath: QUOTE AT* ID (SLASH ID)+ QUOTE SEMI;
importList: IMPORTLIST (COMMA IMPORTLIST)*  #importStateme
          |  ID (COMMA ID)*                  #imortid
          ;
componentDefinition: COMPONENT LPAREN componentMetadata RPAREN ;
componentMetadata: LCURLY metadataEntry (COMMA metadataEntry)* RCURLY;
metadataEntry:  SELECTOR COLON QUOTE ID QUOTE                              #selectoredata
              | STANDALONE COLON BOOLEAN                                   #standalonedata
              | TEMPLATE COLON htmlTemplate                                #templetedata
              | IMPORTS COLON LBRACK importList RBRACK                     #importsdata
              | URLTEMPLATE COLON QUOTE DOT (SLASH ID)* QUOTE              #urltamplate
              | STYLEURL  COLON LBRACK QUOTE DOT (SLASH ID)* QUOTE RBRACK  #urlstyle
              ;
htmlTemplate: TH htmlpage*  TH COMMA*;
htmlpage :element  #elementhtml |img  #imghtml |voidtag #selftag ;
element:htmlopen content* htmlclose ;
voidtag : TAG_OPEN  selftagname  arttiselftag* SLASH? TAG_CLOSE ;
selftagname :  INPUT   #inputele
                    |BR      #brdata
                    ;
arttiselftag :  SELF_ATTRIBUTE  (EQUAL QUOTE ID* ( LPAREN ID* (SLASH ID)* RPAREN )? QUOTE ) ?  ;
htmlopen:TAG_OPEN (name csselement*|artt ) TAG_CLOSE ;
artt :A  AARTT EQUAL QUOTE SLASH ID* QUOTE     ;
htmlclose:TAG_OPEN SLASH (name |A) TAG_CLOSE;
csselement:stylback       #styleback
           |ngif          #ngifdata
           |ngfor         #ngfordata
           |click         #clickdata
           |style         #styledata
           |arttiselftag  #selfart
           |NGSUBMIT EQUAL QUOTE   ID LPAREN ID* RPAREN   QUOTE #ngsubmit
         ;
stylback: LBRACK STYLE_BACK RBRACK EQUAL QUOTE ID  QUOTE ;
ngfor:NGFOR EQUAL QUOTE LET (ID(OF| EQUAL)ID)+ QUOTE;
ngif:NGIF EQUAL QUOTE ID QUOTE;
click:LPAREN CLICK RPAREN EQUAL QUOTE ID LPAREN ID* RPAREN  QUOTE;
style:STYLE EQUAL QUOTE (ATTRBUTE COLON value SEMI)+ QUOTE;
//////////////


name:  DIV     #divdata
      |HEDEAR  #headardata
      |P       #pdata
      |OL      #oldata
      |LI      #lidata
      |UL      #uldata
      |BUTTON  #buttondata
      |TEXTERA  #textarea
      |FORM     #formm
      ;
content : htmlpage                                               #htmlpagecontent
         |ID+                                                     #stringdata
         |(ID COLON )* LCURLY LCURLY ID(DOT ID )* RCURLY RCURLY  #vardata
         ;
    img: TAG_OPEN IMG imgarti+ csselement* TAG_CLOSE;
imgarti:LBRACK IMG_ATTRIBUTE RBRACK EQUAL QUOTE  ID (DOT ID)* QUOTE #atbuterimg
        | ATTRBUTE EQUAL QUOTE ID QUOTE #arrti ;
classDefinition: EXPORT CLASS ID (IMPLEMENT (ID|IMPORTLIST))? LCURLY classBody* RCURLY;
classBody:   propertyDefinition    #propertydata
            |constructor           #cconstruct
            |arrayDefinition       #arraydata
            |methodDefinition      #methoddata

            ;
propertyDefinition: ID QMARK? COLON  (ID |TYPE) ( EQUAL value)? SEMI              #value1
                  | MODIFIER ID EQUAL value SEMI                                   #value2
                  |  ID QMARK? COLON  (ID |TYPE) EQUAL QUOTE value?  QUOTE SEMI   #definition
                  |CONST ID EQUAL ID LPAREN parameterList*  RPAREN                 #constpro
                  | ID EQUAL BOOLEAN SEMI                                          #booleanvalue
                  |ID EQUAL LCURLY (ID COLON QUOTE? value* QUOTE? COMMA*)* RCURLY SEMI #mapdefinition
                  ;

value:QUOTE (ID COLON)? (SLASH ID)+ QUOTE          #idcolon
     | BOOLEAN                                     #boolean
     | ID+  COMMA*                                        #id
     | QUOTE (HASH ID)+ (COMMA ID)* QUOTE           #colorvalue
     | HASH ID                                     #hashid
        | ID LPAREN  P ARROW ID operation ID RPAREN   #equalsExpr
     | ID  LPAREN (ID|parameterList)*  RPAREN  SEMI*  #lparen
     | ID LPAREN LBRACK QUOTE SLASH ID* QUOTE (COMMA ID)* RBRACK RPAREN #lpranqoute
      |ID LPAREN LCURLY (ID COLON ID  COMMA*)* RCURLY RPAREN    #callfun
      |QUOTE  ID+ QUOTE                         #stringvalue
     ;
arrayDefinition:(CONST|MODIFIER)? ID COLON* (TYPE|ID LBRACK  RBRACK) ?EQUAL LBRACK arrayList* RBRACK SEMI;
arrayList: LCURLY ID COLON value (COMMA ID COLON value)* RCURLY COMMA*   #includearray
         | value (COMMA value)*  COMMA*                                  #valdata
         ;
constructor: CONSTRUCTOR LPAREN parameterListconstructer* RPAREN LCURLY methodBody* RCURLY ;
parameterListconstructer: MODIFIER ID COLON (ID | IMPORTLIST) COMMA*;

methodDefinition: ID LPAREN parameterList* RPAREN (COLON typeAnnotation)? LCURLY methodBody* RCURLY;
typeAnnotation
    : ID (LBRACK RBRACK)? (PIPE ID)?
    ;
parameterList: ID COLON ID? (TYPE| TAG_OPEN ID COMMA QUOTE ID QUOTE  TAG_CLOSE) COMMA? #type11
             | value  #type21;
methodBody :value                   #valuedata
     |calcualtecolor          #calcolor
     | objectdefinetion       #object
    | ID EQUAL value SEMI       #var
    | propertyDefinition        #propertyDefinitiondata
    | arrayDefinition           #arrayDefinitiondata
    |RETURN? expression* SEMI    #returnExpr
    |IF LPAREN  condition RPAREN LCURLY (value SEMI* | methodBody)* RCURLY           #ifstatement;
    condition :  ID operation (PLUS|MINUS) ID  #idcond
               |ID(operation ID)*    #operationcond ;
  operation : EQEQ #eqeq|EQEQEQ #eqeqeq|NOTEQEQ #noteqeq|LT #lt|GT #gt |AND #and |OR #or;
  expression
      :(CONST ID EQUAL)? value                    #valueex
       | ID                               #thisProp
      | ID ARROW expression  #simpleArrow
      | LBRACK spreadExpressionList? RBRACK       #sparedExpr
;
spreadExpressionList
    : (SPREAD? expression) (COMMA SPREAD? expression)*
    ;
calcualtecolor:ID EQUAL ID LPAREN contenetcolorcal RPAREN LBRACK ID RBRACK SEMI;
contenetcolorcal:LPAREN RPAREN ARROW ID LPAREN RPAREN CALCULAATE ID;

interface: EXPORT INTERFACE ID LCURLY interfacecontent  RCURLY ;

interfacecontent :  (propertyDefinition)*;

injectableDefinition : INJECTABLE LPAREN LCURLY PROVIDIN  COLON  QUOTE ID QUOTE RCURLY RPAREN ;

objectdefinetion : CONST* ID (COLON ID|LBRACK ID RBRACK) EQUAL LCURLY contentt * RCURLY SEMI;
contentt: ID COLON ID PLUS PLUS COMMA* #type1
        |  spreadExpressionList COMMA*  #sparetedd;