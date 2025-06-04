parser grammar myParser;
options {tokenVocab = lexicalanalysis;}

program : node+;
node : importStatement       #imports
     | componentDefinition   #component
     | classDefinition       #class
     ;
importStatement: IMPORT LCURLY importList RCURLY FROM importpath;
importpath: QUOTE AT* ID (SLASH ID)+ QUOTE SEMI;
importList: IMPORTLIST (COMMA IMPORTLIST)*;
componentDefinition: COMPONENT LPAREN componentMetadata RPAREN ;
componentMetadata: LCURLY metadataEntry (COMMA metadataEntry)* RCURLY;
metadataEntry: SELECTOR COLON QUOTE ID QUOTE              #selectoredata
              | STANDALONE COLON BOOLEAN                  #standalonedata
              | TEMPLATE COLON htmlTemplate               #templetedata
              | IMPORTS COLON LBRACK importList RBRACK    #importsdata
              ;
htmlTemplate: TH (element |img )*  TH COMMA*;
element:htmlopen content* htmlclose ;
htmlopen:TAG_OPEN name csselement* TAG_CLOSE ;
htmlclose:TAG_OPEN SLASH name TAG_CLOSE;
csselement:stylback       #styleback
           |ngif          #ngifdata
           |ngfor         #ngfordata
           |click         #clickdata
           |style         #styledata
         ;
stylback: LBRACK STYLE_BACK RBRACK EQUAL QUOTE ID  QUOTE ;
ngfor:NGFOR EQUAL QUOTE LET (ID(OF| EQUAL)ID)+ QUOTE;
ngif:NGIF EQUAL QUOTE ID QUOTE;
click:LPAREN CLICK RPAREN EQUAL QUOTE ID LPAREN ID* RPAREN  QUOTE;
style:STYLE EQUAL QUOTE (ATTRBUTE COLON value SEMI)+ QUOTE;
name:  DIV     #divdata
      |HEDEAR  #headardata
      |P       #pdata
      |OL      #oldata
      |LI      #lidata
      |UL      #uldata
      |BUTTON  #buttondata
      ;
content :element                                                 #elementdata
         |img                                                    #imgdata
         |ID                                                     #stringdata
         |(ID COLON )* LCURLY LCURLY ID(DOT ID )* RCURLY RCURLY  #vardata;
img: TAG_OPEN IMG imgarti+ csselement* TAG_CLOSE;
imgarti:LBRACK IMG_ATTRIBUTE RBRACK EQUAL QUOTE  ID (DOT ID)* QUOTE ;
classDefinition: EXPORT CLASS ID LCURLY classBody* RCURLY;
classBody:   propertyDefinition    #propertydata
            |arrayDefinition       #arraydata
            |methodDefinition      #methoddata ;
propertyDefinition: ID COLON (TYPE EQUAL)* value SEMI ;
value:QUOTE (ID COLON)* (SLASH ID)+ QUOTE          #idcolon
     | BOOLEAN                                     #boolean
     | ID+                                         #id
     | QUOTE HASH* ID+ (COMMA ID)* QUOTE           #colorvalue
     | HASH ID                                     #hashid;
arrayDefinition:CONST* ID COLON* TYPE* EQUAL LBRACK arrayList* RBRACK SEMI;
arrayList: LCURLY ID COLON value (COMMA ID COLON value)* RCURLY COMMA    #includearray
         | value (COMMA value)*  COMMA*                                  #valdata;
///
methodDefinition: ID LPAREN parameterList* RPAREN LCURLY methodBody* RCURLY;
parameterList: ID COLON ID COMMA* ;
methodBody:calcualtecolor          #calcolor
          | ID EQUAL value SEMI    #var
          | value                  #valuedata
          |propertyDefinition      #propertyDefinitiondata
          |arrayDefinition         #arrayDefinitiondata;

calcualtecolor:ID EQUAL ID LPAREN contenetcolorcal RPAREN LBRACK ID RBRACK SEMI;
contenetcolorcal:LPAREN RPAREN ARROW ID LPAREN RPAREN CALCULAATE ID;