package AST.Visitor;

import AST.Nodes.*;
import gen.myParser;
import gen.myParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import sementicserror.*;
import symboletable.symboletable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BaseVisitor extends myParserBaseVisitor<Object> {

    htmlopenandclosesame htmlopenandclosesamesymboletable = new htmlopenandclosesame();
    duplicatecomponentkeysymboltable selectorTable = new duplicatecomponentkeysymboltable();
    importslivalueinitbefor importlistiit = new importslivalueinitbefor();
    dublicatecsselement dublicatecsselementsymboltable = new dublicatecsselement();

    //
    onlyonecomponentsymboltyble componentSymbolTable = new onlyonecomponentsymboltyble();
    ngifandngforatsametime ngifngforsymboletable = new ngifandngforatsametime();
    variableSymbolTable variableTable =new variableSymbolTable();
    List<symboletable> s;
    private final handleerror error = handleerror.getInstance();
    public BaseVisitor(List<symboletable> symbole){
        s= new ArrayList<>();
        s=symbole;
    }

    @Override
    public Object visitProgram(myParser.ProgramContext ctx) {
        List <Node> prog = new ArrayList<>();
        for(int i =0;i<ctx.node().size();i++){
            Node chil = (Node) visit(ctx.node(i));
           if( chil != null) prog.add(chil) ;
        }


     return new ProgramNode(prog);
    }

    @Override
    public Object visitImports(myParser.ImportsContext ctx) {
        List<String> importsEntries = new ArrayList<>();
        String path = "";

        if(ctx.importStatement().importList() != null) {
            Object result = visitImportList(ctx.importStatement().importList());

                importsEntries = (List<String>) result;

for (int i = 0 ;i<importsEntries.size(); i ++ ){
    importlistiit.addto(importsEntries.get(i));
}

        if(ctx.importStatement().importpath() != null) {
            Object res = visitImportpath(ctx.importStatement().importpath());

                path = (String) res;




            return new ImportNode(importsEntries, path);
        }
        else {
        return  new ImportNode(importsEntries);
        }}
        else{

            if(ctx.importStatement().importpath() != null) {
                Object res = visitImportpath(ctx.importStatement().importpath());

                    path = (String) res;



                return new ImportNode(path);
            }
            }

        return new ImportNode();

    }

    @Override
    public Object visitImportList(myParser.ImportListContext ctx) {
        List<String> entries = new ArrayList<>();
         for(int i=0 ; i<ctx.IMPORTLIST().size();i++){
             entries.add(ctx.IMPORTLIST(i).getText());

         }
        return entries;
    }

    @Override
    public Object visitImportpath(myParser.ImportpathContext ctx) {
        return  ctx.getText();

    }

    @Override
    public Object visitComponentDefinition(myParser.ComponentDefinitionContext ctx) {

        int line = ctx.COMPONENT().getSymbol().getLine();

        ComponentNode componentNode = new ComponentNode();
        try
        {
           if(!componentSymbolTable.checkSingleComponent())

               throw  new sementicsexcep("Multiple component definitions are not allowed " );
           componentSymbolTable.add(ctx.COMPONENT().toString() ,ctx.COMPONENT().toString(), "component",line);
        }catch (sementicsexcep e){

            error.addError(e.getMessage(),line);
            s.add(componentSymbolTable.getSymbole());
//            System.err.println(e.getMessage());
//            System.out.println(componentSymbolTable.toString());
        }
        if(ctx.componentMetadata() !=null){
            Object result = visitComponentMetadata(ctx.componentMetadata());
            componentNode = new ComponentNode((ComponentMetadata) result);
        }
        return componentNode;
    }

    @Override
    public Object visitComponentMetadata(myParser.ComponentMetadataContext ctx) {
        List<MetadataEntry> metadataEntries = new ArrayList<>();

        for (int i = 0; i < ctx.metadataEntry().size(); i++) {
            MetadataEntry m = (MetadataEntry) visit(ctx.metadataEntry(i));

            if (m != null) {


                    String Value = m.getValue();
                    String key = m.getKey();
                    int line = ctx.metadataEntry(i).getStart().getLine();

                    try {
                        selectorTable.addto(key, Value);
                        if (selectorTable.checkifduplicate(key)) {

                            throw new sementicsexcep (" duplicate entry:  " +key);
                        }
                    } catch (sementicsexcep e) {
                        error.addError(e.getMessage(),line);

                        System.out.println(selectorTable.toString());
//                        System.out.println(selectorTable.toString());

                    }


                metadataEntries.add(m);
            }
        }

        return new ComponentMetadata(metadataEntries);
    }

    @Override
    public Object visitSelectoredata(myParser.SelectoredataContext ctx) {

        return new SelectorEntry(ctx.ID().getText()) ;
    }

    @Override
    public Object visitStandalonedata(myParser.StandalonedataContext ctx) {
        String booleanText = ctx.BOOLEAN().getText();
        boolean value = Boolean.parseBoolean(booleanText);
        return new StandaloneEntry(value);
    }

    @Override
    public Object visitTempletedata(myParser.TempletedataContext ctx) {
            TemplateEntry templateEntry = null ;
        if(ctx.htmlTemplate() !=null){
            Object html =  visitHtmlTemplate(ctx.htmlTemplate());
             templateEntry   = new TemplateEntry((HtmlTemplate) html);
        }
      //  System.out.println( htmlopenandclosesamesymboletable.toString());

        return templateEntry  ;
    }

    @Override
    public Object visitHtmlTemplate(myParser.HtmlTemplateContext ctx) {

        List<HtmlNode> htmlNodes = new ArrayList<>();
         for (int i=0 ; i<ctx.element().size(); i++){
             Object res = visitElement(ctx.element(i));

             if(res  !=null ){
                 htmlNodes.add((HtmlNode) res);
             }
         }
       // System.out.println( htmlopenandclosesamesymboletable.toString());
         for (int i=0; i<ctx.img().size();i++){
             Object resalt= visitImg(ctx.img(i));

             if(resalt !=null){
                 htmlNodes.add((HtmlNode) resalt);
             }
         }
        HtmlTemplate htmlTemplate=new HtmlTemplate(htmlNodes);

        return  htmlTemplate;
    }

    @Override
    public Object visitElement(myParser.ElementContext ctx) {
        String name = "";
        List<HtmlAttribute> attributes = new ArrayList<>();
        List<HtmlNode> children = new ArrayList<>();

        if (ctx.htmlopen() != null) {
            Map<String, List> res = (Map<String, List>) visitHtmlopen(ctx.htmlopen());
            if (!res.isEmpty()) {
                name = res.keySet().iterator().next();
                attributes = res.get(name);

                for (HtmlAttribute attr : attributes) {
                    String attrName = attr.getname();
                    int line = ctx.htmlopen().getStart().getLine();

                    if (dublicatecsselementsymboltable.addandcheckduplicate(name, attrName,line)) {

                        error.addError("Duplicate attribute '" + attrName + "' in element " + name, line);
                        System.out.println(dublicatecsselementsymboltable.toString());
                    }}
            }
        }
        dublicatecsselementsymboltable.closetag(name);
        String nameClose = "";
        if (ctx.htmlclose() != null) {
          nameClose  = (String) visitHtmlclose(ctx.htmlclose());

        }

        for (myParser.ContentContext content : ctx.content()) {
            if (!content.isEmpty()) {
                Object res = visit(content);
                if (res instanceof HtmlNode) {
                    children.add((HtmlNode) res);
                }
            }
        }

        try {
            if(!htmlopenandclosesamesymboletable.checkhtmlendandstartname(name,nameClose))
                throw new sementicsexcep("error in your html code closing tag  ");
            htmlopenandclosesamesymboletable.add("html tags","Html tages",
                    ctx.getText()
                    ,ctx.htmlopen().getStart().getLine());
        } catch (sementicsexcep e) {
            error.addError(e.getMessage(),ctx.htmlclose().getStart().getLine());

            System.out.println(htmlopenandclosesamesymboletable.toString());
        }


        ElementNode elementNode =new ElementNode(name, attributes, children);

        return elementNode;
    }

    @Override
    public Object visitImg(myParser.ImgContext ctx) {
        List<HtmlAttribute> attributes = new ArrayList<>();


        if (ctx.imgarti() != null) {
            for (myParser.ImgartiContext imgarti : ctx.imgarti()) {
                Object res = visit(imgarti);
                if (res instanceof HtmlAttribute) {
                    attributes.add((HtmlAttribute) res);
                }
            }
        }

       if (ctx.csselement() != null) {
           for (myParser.CsselementContext csselement : ctx.csselement()) {
                Object res = visit(csselement);
                if (res instanceof HtmlAttribute) {
                    attributes.add((HtmlAttribute) res);
               }
           }
        }

        return new ImageNode(attributes);
    }

    @Override
    public Object visitClickdata(myParser.ClickdataContext ctx) {
        ClickAttribute clickAttribute = null;
        if(ctx.click() !=null){
            Object res = visitClick(ctx.click());
            clickAttribute =(ClickAttribute) res;
        }
        return new ClickAttribute(clickAttribute.getMethodName(),clickAttribute.getArguments());
    }

    @Override
    public Object visitClick(myParser.ClickContext ctx) {

        String methodName = ctx.ID(0).getText();


        List<String> arguments = new ArrayList<>();


        for (int i = 1; i < ctx.ID().size(); i++) {
            arguments.add(ctx.ID(i).getText());
        }

        return new ClickAttribute(methodName, arguments);
    }

    @Override
    public Object visitNgfordata(myParser.NgfordataContext ctx) {
        NgForAttribute ngForAttribute = null;
        if(ctx.ngfor() !=null){
            Object res = visitNgfor(ctx.ngfor());
            ngForAttribute = (NgForAttribute) res;
        }
        return new NgForAttribute(ngForAttribute.getVariable(),ngForAttribute.getCollection());
    }

    @Override
    public Object visitNgfor(myParser.NgforContext ctx) {
        String variable = "", collection="";

        if (ctx.LET() != null) {
            variable = ctx.ID(0).getText();
            collection = ctx.ID(1).getText();
        }

        return new NgForAttribute(variable, collection);
    }

    @Override
    public Object visitNgif(myParser.NgifContext ctx) {
        String condition = ctx.ID().getText();
        return new NgIfAttribute(condition);
    }

    @Override
    public Object visitNgifdata(myParser.NgifdataContext ctx) {
        NgIfAttribute ngIfAttribute = null;
        if(ctx.ngif()!=null){
            Object res =  visitNgif(ctx.ngif());
            ngIfAttribute=(NgIfAttribute) res;
        }
        return ngIfAttribute;
    }

    @Override
    public Object visitStylback(myParser.StylbackContext ctx) {
        String bgValue = ctx.ID().getText();
        return new StyleBackAttribute(bgValue);
    }

    @Override
    public Object visitStyleback(myParser.StylebackContext ctx) {
        Object res =(StyleBackAttribute) visitStylback(ctx.stylback());
        return res;
    }

    @Override
    public Object visitStyle(myParser.StyleContext ctx) {
        Map<String, String> styles = new HashMap<>();


        int pairCount = ctx.ATTRBUTE().size();

        for (int i = 0; i < pairCount; i++) {
            String attr = ctx.ATTRBUTE(i).getText();
            String val = ctx.value(i).getText();



            styles.put(attr, val);
        }

        return new StyleAttribute(styles);
    }

    @Override
    public Object visitStyledata(myParser.StyledataContext ctx) {
        Object RES = (StyleAttribute)visitStyle(ctx.style());
        return RES;
    }

    @Override
    public Object visitImgarti(myParser.ImgartiContext ctx) {
        List<String> imagearti = new ArrayList();
          if(ctx.IMG_ATTRIBUTE()!= null ){
              imagearti.add(ctx.getText());
          }

        return  new ImageAttribute(imagearti);
    }

    @Override
    public Object visitImgdata(myParser.ImgdataContext ctx) {
        ImageNode imageNode = null;
         if(ctx.img() !=null){
             Object res = visitImg(ctx.img());
             imageNode = (ImageNode) res;
         }
        return  new ImageNode(imageNode.getAttributes());
    }
    @Override
    public Object visitHtmlopen(myParser.HtmlopenContext ctx) {
        String name = ctx.name().getText();


        int line = ctx.getStart().getLine();

        List<HtmlAttribute> attributes = new ArrayList<>();
        for (int i = 0; i < ctx.csselement().size(); i++) {
            if (ctx.csselement(i) != null) {
                HtmlAttribute attr = (HtmlAttribute) visit(ctx.csselement(i));
                attributes.add(attr);
            }
        }

        try {
            if (ngifngforsymboletable.checkngifandngfor(attributes)) {
                throw new sementicsexcep(
                        "Cannot use both *ngIf and *ngFor on the same element ");
            }

            for (HtmlAttribute attr : attributes) {
                ngifngforsymboletable.add(
                        name, // استخدم اسم العنصر الصحيح
                        attr.getname(), // اسم الـ attribute
                        attr.toString(),
                        ctx.getStart().getLine()
                );
            }
        } catch (sementicsexcep e) {
            error.addError(e.getMessage(), line);
        }

        Map<String, List<HtmlAttribute>> result = new HashMap<>();
        result.put(name, attributes);
        return result;
    }


    @Override
    public Object visitElementdata(myParser.ElementdataContext ctx) {
        ElementNode elementNode = new ElementNode();
        if(ctx.element() !=null){
             Object  res = visitElement(ctx.element());
             elementNode = (ElementNode) res;
         }

        return new ElementNode(elementNode.getTagName(),elementNode.getAttributes(),elementNode.getChildren());
    }

    @Override
    public Object visitStringdata(myParser.StringdataContext ctx) {
        return ctx.getText();
    }

    @Override
    public Object visitVardata(myParser.VardataContext ctx) {
        return ctx.getText();
    }
    @Override
    public String visitHtmlclose(myParser.HtmlcloseContext ctx) {
        return ctx.name().getText();
    }
    @Override
    public Object visitImportsdata(myParser.ImportsdataContext ctx) {
        List<String> imports = new ArrayList<>();
        if(ctx.importList() != null) {
            Object importlist = visit(ctx.importList());
            imports = (List<String>) importlist;

            int line = ctx.start.getLine();
            for (String componentImport : imports) {
                try {

                    if (!importlistiit.check(componentImport)) {

                        throw new sementicsexcep(
                                "Module '" + componentImport + "' is not imported. It must be at the top of the file.");
                    }
                } catch (sementicsexcep e) {

                    error.addError(e.getMessage(),line );

//                     s.add(importlistiit.());
                    System.out.println(importlistiit.toString());
                }
            }
        }
        return new ImportsEntry(imports);
    }

    @Override
    public Object visitClass(myParser.ClassContext ctx) {
        ClassNode classNode = (ClassNode)visitClassDefinition(ctx.classDefinition());
        return  classNode;
    }

    @Override
    public Object visitClassDefinition(myParser.ClassDefinitionContext ctx) {
        String className = ctx.ID().getText();
        List<ClassBodyEntry> bodyEntries = new ArrayList<>();

        for (myParser.ClassBodyContext bodyCtx : ctx.classBody()) {
            ClassBodyEntry entry = (ClassBodyEntry) visit(bodyCtx);

            bodyEntries.add(entry);
        }


        ClassNode classnode =new ClassNode(className, bodyEntries);
        return classnode;
    }

    @Override
    public Object visitPropertydata(myParser.PropertydataContext ctx) {
        return (PropertyDefinitionNode) visitPropertyDefinition(ctx.propertyDefinition());
    }

    @Override
    public Object visitPropertyDefinition(myParser.PropertyDefinitionContext ctx) {
        String propertyName = ctx.ID().getText();

        String type = null;
        String val = null;
        if (ctx.TYPE() != null) {
            type = ctx.TYPE().toString();
            val = ctx.value().toString();        }

        int line = ctx.getStart().getLine();

        try {
            if (!variableTable.checkAndAddv(propertyName,type,val, line)) {
                throw new sementicsexcep(propertyName );
            }
        } catch (sementicsexcep e) {
            error.addError(e.getMessage(),line);
            s.add(variableTable.symbole);
//            System.err.println("Semantic error" + e);


            return null;
        }

        Object value = visit(ctx.value());


        return new PropertyDefinitionNode(propertyName, type, value);
    }
///
    @Override
    public Object visitColorvalue(myParser.ColorvalueContext ctx) {
        StringBuilder colorBuilder = new StringBuilder();


        for (TerminalNode hash : ctx.HASH()) {
            colorBuilder.append(hash.getText());
        }


        List<String> colorParts = new ArrayList<>();
        for (TerminalNode id : ctx.ID()) {
            colorParts.add(id.getText());
        }


//        String colorCode = );

        return new ColorValue(colorBuilder.toString() + String.join(",", colorParts));
    }

    @Override
    public Object visitBoolean(myParser.BooleanContext ctx) {
        return ctx.BOOLEAN();
    }

    @Override
    public Object visitId(myParser.IdContext ctx) {
        List<String> identifiers = new ArrayList<>();


        for (int i = 0; i < ctx.ID().size(); i++) {
            identifiers.add(ctx.ID(i).getText());
        }


        return new IdValue(identifiers);
    }

    @Override
    public Object visitVar(myParser.VarContext ctx) {

       Object res = visit(ctx.value());

       return res;
    }

    @Override
    public Object visitIdcolon(myParser.IdcolonContext ctx) {
        List<String> identifiers = new ArrayList<>();
        for (int i = 0; i < ctx.ID().size(); i++) {
            identifiers.add(ctx.ID(i).getText());
        }

        return new IdValue(identifiers);
    }

    @Override
    public Object visitHashid(myParser.HashidContext ctx) {
        return ctx.getText();
    }

    @Override
    public Object visitArraydata(myParser.ArraydataContext ctx) {
        return visitArrayDefinition(ctx.arrayDefinition());

    }

    @Override
    public Object visitArrayDefinition(myParser.ArrayDefinitionContext ctx) {
        String arrayName = ctx.ID().getText();


        String arrayType = ctx.TYPE() != null ? ctx.TYPE().toString(): null;

        List<Object> arrayValues = new ArrayList<>();
        if (ctx.arrayList() != null) {
            for (myParser.ArrayListContext arrayCtx : ctx.arrayList()) {
                Object value = visit(arrayCtx);
                if (value != null) {
                    arrayValues.add(value);
                }
            }
        }

        return new ArrayDefinitionNode(arrayName, arrayType, arrayValues);
    }

    @Override
    public Object visitIncludearray(myParser.IncludearrayContext ctx) {
        Map<String, Object> objectMap = new HashMap<>();


        String firstKey = ctx.ID(0).getText();
        Object firstValue = visit(ctx.value(0));
        objectMap.put(firstKey, firstValue);

        for (int i = 1; i < ctx.ID().size(); i++) {
            String key = ctx.ID(i).getText();
            Object value = visit(ctx.value(i));
            objectMap.put(key, value);
        }

        return objectMap;
    }

    @Override
    public Object visitValdata(myParser.ValdataContext ctx) {
        List<Object> values = new ArrayList<>();

        for (myParser.ValueContext valueCtx : ctx.value()) {
            Object value = visit(valueCtx);
            if (value != null) {
                values.add(value);
            }
        }

        return values;
    }

    @Override
    public Object visitMethoddata(myParser.MethoddataContext ctx) {
        return visitMethodDefinition(ctx.methodDefinition());
    }


    @Override
    public Object visitMethodDefinition(myParser.MethodDefinitionContext ctx) {
        String name = ctx.ID().getText();
        List<StatementNode> body = new ArrayList<>();
        List<ParameterNode> psrmiter = new ArrayList<>();
        List<ClassBodyEntry> classBodyEntries = new ArrayList<>();
        List<ColorValue> colorValues = new ArrayList<>();
        for (int i = 0; i < ctx.parameterList().size(); i++) {
            Object res = visit(ctx.parameterList(i));
            psrmiter.add((ParameterNode) res);
        }


        for (int i = 0; i < ctx.methodBody().size(); i++) {
            Object res = visit(ctx.methodBody(i));
            if (res instanceof StatementNode) {
                body.add((StatementNode) res);
            }
             if(res instanceof ClassBodyEntry) {
                classBodyEntries.add((ClassBodyEntry) res);

            } else if (res instanceof ColorValue) {
                colorValues.add((ColorValue) res);

             }
        }

        return new MethodDefinitionNode(name, psrmiter, body ,classBodyEntries,colorValues);
    }

    @Override
    public Object visitParameterList(myParser.ParameterListContext ctx) {
        String paramName = ctx.ID(0).getText();
        String paramType = ctx.ID(1).getText();
        return new ParameterNode(paramName, paramType);
    }

    @Override
    public Object visitCalcolor(myParser.CalcolorContext ctx) {
        return visitCalcualtecolor(ctx.calcualtecolor());
    }

    @Override
    public Object visitCalcualtecolor(myParser.CalcualtecolorContext ctx) {
ColorValue colorValue = null;
         if(ctx.contenetcolorcal() !=null){
             Object res = visitContenetcolorcal(ctx.contenetcolorcal());
            colorValue = (ColorValue) res;
         }
        return colorValue;
    }

    @Override
    public Object visitContenetcolorcal(myParser.ContenetcolorcalContext ctx) {
        return new ColorValue(ctx.getText());
    }

    @Override
    public Object visitValuedata(myParser.ValuedataContext ctx) {
        Value value = null;
        if(ctx.value() !=null ){
            Object res = visit(ctx.value());
            value = (Value) res;
        }
        return value ;
    }

    @Override
    public Object visitPropertyDefinitiondata(myParser.PropertyDefinitiondataContext ctx) {
       return visitPropertyDefinition(ctx.propertyDefinition());
    }

    @Override
    public Object visitArrayDefinitiondata(myParser.ArrayDefinitiondataContext ctx) {
        return visitArrayDefinition(ctx.arrayDefinition());
    }
}


