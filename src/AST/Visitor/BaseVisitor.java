package AST.Visitor;

import AST.Nodes.*;
import gen.myParser;
import gen.myParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import sementicserror.*;

import java.util.ArrayList;
import java.util.List;


public class BaseVisitor extends myParserBaseVisitor<Object> {

    htmlopenandclosesame htmlopenandclosesamesymboletable = new htmlopenandclosesame();
    duplicatecomponentkeysymboltable selectorTable = new duplicatecomponentkeysymboltable();
    importslivalueinitbefor importlistiit = new importslivalueinitbefor();
    dublicatecsselement dublicatecsselementsymboltable = new dublicatecsselement();
    ngifandngforatsametime ngifngforsymboletable = new ngifandngforatsametime();

    //
    onlyonecomponentsymboltyble componentSymbolTable = new onlyonecomponentsymboltyble();
    variableSymbolTable variableTable = new variableSymbolTable();
    List<String> s;
    private final handleerror error = handleerror.getInstance();

    public BaseVisitor(List<String> symbole) {
        s = new ArrayList<>();
        s = symbole;
    }

    @Override
    public Object visitProgram(myParser.ProgramContext ctx) {
        List<Node> prog = new ArrayList<>();
        for (int i = 0; i < ctx.node().size(); i++) {
            Node chil = (Node) visit(ctx.node(i));
            if (chil != null) prog.add(chil);
        }


        return new ProgramNode(prog);
    }

    @Override
    public Object visitImports(myParser.ImportsContext ctx) {
        return visit(ctx.importStatement());
    }

    @Override
    public Object visitImportStatement(myParser.ImportStatementContext ctx) {
        List<String> importsEntries = new ArrayList<>();
        String path = null;

        if (ctx.importList() != null) {
            importsEntries = (List<String>) visit(ctx.importList());


            for (int i = 0; i < importsEntries.size(); i++) {
                importlistiit.addto(importsEntries.get(i));
            }
        }

        if (ctx.importpath() != null) {
            path = (String) visit(ctx.importpath());
        }

        if (!importsEntries.isEmpty() && path != null) {
            return new ImportNode(importsEntries, path);
        } else if (!importsEntries.isEmpty()) {
            return new ImportNode(importsEntries);
        } else if (path != null) {
            return new ImportNode(path);
        } else {
            return new ImportNode();
        }
    }

    @Override
    public Object visitImportpath(myParser.ImportpathContext ctx) {
        return ctx.getText();

    }

    @Override
    public Object visitImportStateme(myParser.ImportStatemeContext ctx) {
        List<String> imports = new ArrayList<>();
        for (int i = 0; i < ctx.IMPORTLIST().size(); i++) {
            imports.add(ctx.IMPORTLIST(i).getText());
        }
        return imports;
    }

    @Override
    public Object visitImortid(myParser.ImortidContext ctx) {
        List<String> imports = new ArrayList<>();
        for (int i = 0; i < ctx.ID().size(); i++) {
            imports.add(ctx.ID(i).getText());
        }
        return imports;
    }

    @Override
    public Object visitComponent(myParser.ComponentContext ctx) {
        return visitComponentDefinition(ctx.componentDefinition());
    }

    @Override
    public Object visitComponentDefinition(myParser.ComponentDefinitionContext ctx) {

        int line = ctx.COMPONENT().getSymbol().getLine();

        ComponentNode componentNode = new ComponentNode();
        try {
            if (!componentSymbolTable.checkSingleComponent())

                throw new sementicsexcep("Multiple component definitions are not allowed ");
            componentSymbolTable.add(ctx.COMPONENT().toString(), ctx.COMPONENT().toString(), "component", line);
        } catch (sementicsexcep e) {

            error.addError(e.getMessage(), line);
//            s.add(componentSymbolTable.getSymbole());
//            System.err.println(e.getMessage());
//            System.out.println(componentSymbolTable.toString());
        }
        if (ctx.componentMetadata() != null) {
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
                        throw new sementicsexcep("duplicate entry: " + key);
                    }
                } catch (sementicsexcep e) {
                    error.addError(e.getMessage(), line);
                }

                metadataEntries.add(m);
            }
        }


        s.add(selectorTable.toString());

        return new ComponentMetadata(metadataEntries);
    }

    @Override
    public Object visitSelectoredata(myParser.SelectoredataContext ctx) {

        return new SelectorEntry(ctx.ID().getText());
    }

    @Override
    public Object visitStandalonedata(myParser.StandalonedataContext ctx) {
        String booleanText = ctx.BOOLEAN().getText();
        boolean value = Boolean.parseBoolean(booleanText);
        return new StandaloneEntry(value);
    }

    @Override
    public Object visitImportsdata(myParser.ImportsdataContext ctx) {
        List<String> imports = new ArrayList<>();
        if (ctx.importList() != null) {
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

                    error.addError(e.getMessage(), line);


                    s.add(importlistiit.toString());
                }
            }
        }
        return new ImportsEntry(imports);
    }

    @Override
    public Object visitUrlstyle(myParser.UrlstyleContext ctx) {

        String raw = ctx.getText();
        int start = raw.indexOf('\'') + 1;
        int end = raw.lastIndexOf('\'');
        String stylePath = raw.substring(start, end);
        return new StyleURLNode(stylePath);
    }

    @Override
    public Object visitUrltamplate(myParser.UrltamplateContext ctx) {

        String raw = ctx.getText();
        int start = raw.indexOf('\'') + 1;
        int end = raw.lastIndexOf('\'');
        String template = raw.substring(start, end);
        return new URLTemplateNode(template);
    }

    @Override
    public Object visitHtmlpagenode(myParser.HtmlpagenodeContext ctx) {
       return visit(ctx.htmlpage());
    }
    //    @Override
//    public Object visitTempletedata(myParser.TempletedataContext ctx) {
//            TemplateEntry templateEntry = null ;
//        if(ctx.htmlTemplate() !=null){
//            Object html =  visitHtmlTemplate(ctx.htmlTemplate());
//             templateEntry   = new TemplateEntry((HtmlTemplate) html);
//        }
//      //  System.out.println( htmlopenandclosesamesymboletable.toString());
//
//        return templateEntry  ;
//    }
//
//    @Override
//    public Object visitHtmlTemplate(myParser.HtmlTemplateContext ctx) {
//
//        List<HtmlNode> htmlNodes = new ArrayList<>();
//         for (int i=0 ; i<ctx.element().size(); i++){
//             Object res = visitElement(ctx.element(i));
//
//             if(res  !=null ){
//                 htmlNodes.add((HtmlNode) res);
//             }
//         }
//       // System.out.println( htmlopenandclosesamesymboletable.toString());
//         for (int i=0; i<ctx.img().size();i++){
//             Object resalt= visitImg(ctx.img(i));
//
//             if(resalt !=null){
//                 htmlNodes.add((HtmlNode) resalt);
//             }
//         }
//        HtmlTemplate htmlTemplate=new HtmlTemplate(htmlNodes);
//
//        return  htmlTemplate;
//    }
//
//    @Override
//    public Object visitElement(myParser.ElementContext ctx) {
//        String name = "";
//        List<HtmlAttribute> attributes = new ArrayList<>();
//        List<HtmlNode> children = new ArrayList<>();
//
//        if (ctx.htmlopen() != null) {
//            Map<String, List> res = (Map<String, List>) visitHtmlopen(ctx.htmlopen());
//            if (!res.isEmpty()) {
//                name = res.keySet().iterator().next();
//                attributes = res.get(name);
//
//                for (HtmlAttribute attr : attributes) {
//                    String attrName = attr.getname();
//                    int line = ctx.htmlopen().getStart().getLine();
//
//                    if (dublicatecsselementsymboltable.addandcheckduplicate(name, attrName,line)) {
//
//                        error.addError("Duplicate attribute '" + attrName + "' in element " + name, line);
//                        s.add(dublicatecsselementsymboltable.toString());
//
//                    }}
//            }
//        }
//        dublicatecsselementsymboltable.closetag(name);
//
//        String nameClose = "";
//        if (ctx.htmlclose() != null) {
//          nameClose  = (String) visitHtmlclose(ctx.htmlclose());
//
//        }
//
//        for (myParser.ContentContext content : ctx.content()) {
//            if (!content.isEmpty()) {
//                Object res = visit(content);
//                if (res instanceof HtmlNode) {
//                    children.add((HtmlNode) res);
//                }
//            }
//        }
//
//        try {
//            if(!htmlopenandclosesamesymboletable.checkhtmlendandstartname(name,nameClose))
//                throw new sementicsexcep("error in your html code closing tag  ");
//            htmlopenandclosesamesymboletable.add("html tags",
//                    ctx.htmlopen().name().getText()
//                    ,ctx.htmlopen().getStart().getLine());
//        } catch (sementicsexcep e) {
//            error.addError(e.getMessage(),ctx.htmlclose().getStart().getLine());
//
//            s.add(htmlopenandclosesamesymboletable.toString());
//        }
//
//
//        ElementNode elementNode =new ElementNode(name, attributes, children);
//
//        return elementNode;
//    }
//
//    @Override
//    public Object visitImg(myParser.ImgContext ctx) {
//        List<HtmlAttribute> attributes = new ArrayList<>();
//
//
//        if (ctx.imgarti() != null) {
//            for (myParser.ImgartiContext imgarti : ctx.imgarti()) {
//                Object res = visit(imgarti);
//                if (res instanceof HtmlAttribute) {
//                    attributes.add((HtmlAttribute) res);
//                }
//            }
//        }
//
//       if (ctx.csselement() != null) {
//           for (myParser.CsselementContext csselement : ctx.csselement()) {
//                Object res = visit(csselement);
//                if (res instanceof HtmlAttribute) {
//                    attributes.add((HtmlAttribute) res);
//               }
//           }
//        }
//
//        return new ImageNode(attributes);
//    }
//
//    @Override
//    public Object visitClickdata(myParser.ClickdataContext ctx) {
//        ClickAttribute clickAttribute = null;
//        if(ctx.click() !=null){
//            Object res = visitClick(ctx.click());
//            clickAttribute =(ClickAttribute) res;
//        }
//        return new ClickAttribute(clickAttribute.getMethodName(),clickAttribute.getArguments());
//    }
//
//    @Override
//    public Object visitClick(myParser.ClickContext ctx) {
//
//        String methodName = ctx.ID(0).getText();
//
//
//        List<String> arguments = new ArrayList<>();
//
//
//        for (int i = 1; i < ctx.ID().size(); i++) {
//            arguments.add(ctx.ID(i).getText());
//        }
//
//        return new ClickAttribute(methodName, arguments);
//    }
//
//    @Override
//    public Object visitNgfordata(myParser.NgfordataContext ctx) {
//        NgForAttribute ngForAttribute = null;
//        if(ctx.ngfor() !=null){
//            Object res = visitNgfor(ctx.ngfor());
//            ngForAttribute = (NgForAttribute) res;
//        }
//        return new NgForAttribute(ngForAttribute.getVariable(),ngForAttribute.getCollection());
//    }
//
//    @Override
//    public Object visitNgfor(myParser.NgforContext ctx) {
//        String variable = "", collection="";
//
//        if (ctx.LET() != null) {
//            variable = ctx.ID(0).getText();
//            collection = ctx.ID(1).getText();
//        }
//
//        return new NgForAttribute(variable, collection);
//    }
//
//    @Override
//    public Object visitNgif(myParser.NgifContext ctx) {
//        String condition = ctx.ID().getText();
//        return new NgIfAttribute(condition);
//    }
//
//    @Override
//    public Object visitNgifdata(myParser.NgifdataContext ctx) {
//        NgIfAttribute ngIfAttribute = null;
//        if(ctx.ngif()!=null){
//            Object res =  visitNgif(ctx.ngif());
//            ngIfAttribute=(NgIfAttribute) res;
//        }
//        return ngIfAttribute;
//    }
//
//    @Override
//    public Object visitStylback(myParser.StylbackContext ctx) {
//        String bgValue = ctx.ID().getText();
//        return new StyleBackAttribute(bgValue);
//    }
//
//    @Override
//    public Object visitStyleback(myParser.StylebackContext ctx) {
//        Object res =(StyleBackAttribute) visitStylback(ctx.stylback());
//        return res;
//    }
//
//    @Override
//    public Object visitStyle(myParser.StyleContext ctx) {
//        Map<String, String> styles = new HashMap<>();
//
//
//        int pairCount = ctx.ATTRBUTE().size();
//
//        for (int i = 0; i < pairCount; i++) {
//            String attr = ctx.ATTRBUTE(i).getText();
//            String val = ctx.value(i).getText();
//
//
//
//            styles.put(attr, val);
//        }
//
//        return new StyleAttribute(styles);
//    }
//
//    @Override
//    public Object visitStyledata(myParser.StyledataContext ctx) {
//        Object RES = (StyleAttribute)visitStyle(ctx.style());
//        return RES;
//    }
//
//    @Override
//    public Object visitImgarti(myParser.ImgartiContext ctx) {
//        List<String> imagearti = new ArrayList();
//          if(ctx.IMG_ATTRIBUTE()!= null ){
//              imagearti.add(ctx.getText());
//          }
//
//        return  new ImageAttribute(imagearti);
//    }
//
//    @Override
//    public Object visitImgdata(myParser.ImgdataContext ctx) {
//        ImageNode imageNode = null;
//         if(ctx.img() !=null){
//             Object res = visitImg(ctx.img());
//             imageNode = (ImageNode) res;
//         }
//        return  new ImageNode(imageNode.getAttributes());
//    }
//    @Override
//    public Object visitHtmlopen(myParser.HtmlopenContext ctx) {
//        String name = ctx.name().getText();
//
//
//        int line = ctx.getStart().getLine();
//
//        List<HtmlAttribute> attributes = new ArrayList<>();
//        for (int i = 0; i < ctx.csselement().size(); i++) {
//            if (ctx.csselement(i) != null) {
//                HtmlAttribute attr = (HtmlAttribute) visit(ctx.csselement(i));
//                attributes.add(attr);
//            }
//        }
//
//        try {
//            if (ngifngforsymboletable.checkngifandngfor(attributes)) {
//                throw new sementicsexcep(
//                        "Cannot use both *ngIf and *ngFor on the same element ");
//            }
//
//            for (HtmlAttribute attr : attributes) {
//                ngifngforsymboletable.add(
//
//                        attr.getvalue(),
//
//                        attr.getname(),
//                        ctx.getStart().getLine()
//                );
//            }
//        } catch (sementicsexcep e) {
//            error.addError(e.getMessage(), line);
//            s.add(ngifngforsymboletable.toString());
//        }
//
//        Map<String, List<HtmlAttribute>> result = new HashMap<>();
//        result.put(name, attributes);
//        return result;
//    }
//
//
//    @Override
//    public Object visitElementdata(myParser.ElementdataContext ctx) {
//        ElementNode elementNode = new ElementNode();
//        if(ctx.element() !=null){
//             Object  res = visitElement(ctx.element());
//             elementNode = (ElementNode) res;
//         }
//
//        return new ElementNode(elementNode.getTagName(),elementNode.getAttributes(),elementNode.getChildren());
//    }
//
//    @Override
//    public Object visitStringdata(myParser.StringdataContext ctx) {
//        return ctx.getText();
//    }
//
//    @Override
//    public Object visitVardata(myParser.VardataContext ctx) {
//        return ctx.getText();
//    }
//    @Override
//    public String visitHtmlclose(myParser.HtmlcloseContext ctx) {
//        return ctx.name().getText();
//    }

    @Override
    public Object visitClass(myParser.ClassContext ctx) {
        ClassNode classNode = (ClassNode) visitClassDefinition(ctx.classDefinition());
        return classNode;
    }

    @Override
    public Object visitClassDefinition(myParser.ClassDefinitionContext ctx) {

        String className = ctx.ID(0).getText();

        List<String> implementsList = new ArrayList<>();


        if (ctx.IMPLEMENT() != null && !(ctx.IMPLEMENT().toString() == null)) {
            for (int i = 0; i < ctx.getChildCount(); i++) {
                if (ctx.getChild(i).getText().equals("implements")) {
                    for (int j = i + 1; j < ctx.getChildCount(); j++) {
                        String childText = ctx.getChild(j).getText();
                        if (childText.equals("{")) break;

                        if (!childText.equals(",") && !childText.isEmpty()) {
                            implementsList.add(childText);
                        }
                    }
                    break;
                }
            }
        }

        List<ClassBodyEntry> bodyEntries = new ArrayList<>();
        for (myParser.ClassBodyContext bodyCtx : ctx.classBody()) {
            Object entry = visit(bodyCtx);
            if (entry instanceof ClassBodyEntry) {
                bodyEntries.add((ClassBodyEntry) entry);
            }
        }

        return new ClassNode(className, implementsList, bodyEntries);
    }

    @Override
    public Object visitPropertydata(myParser.PropertydataContext ctx) {
        return visit(ctx.propertyDefinition());
    }

    @Override
    public Object visitCconstruct(myParser.CconstructContext ctx) {
        return visitConstructor(ctx.constructor());
    }

    @Override
    public Object visitArraydata(myParser.ArraydataContext ctx) {
        return visitArrayDefinition(ctx.arrayDefinition());

    }

    @Override
    public Object visitMethoddata(myParser.MethoddataContext ctx) {
        return visitMethodDefinition(ctx.methodDefinition());
    }

    //    @Override
//    public Object visitVar(myParser.VarContext ctx) {
//
//       Object res = visit(ctx.value());
//
//       return res;
//    }
//
    @Override
    public Object visitIdcolon(myParser.IdcolonContext ctx) {

        String fullText = ctx.getText();
        fullText = fullText.substring(1, fullText.length() - 1);


        List<String> parts = new ArrayList<>();


        if (ctx.ID(0) != null && ctx.COLON() != null) {
            parts.add(ctx.ID(0).getText() + ":");
        }


        for (int i = 1; i < ctx.ID().size(); i++) {
            parts.add("/" + ctx.ID(i).getText());
        }

        return new IdValue(parts);
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
    public Object visitColorvalue(myParser.ColorvalueContext ctx) {
        StringBuilder colorBuilder = new StringBuilder();


        for (TerminalNode hash : ctx.HASH()) {
            colorBuilder.append(hash.getText());
        }


        List<String> colorParts = new ArrayList<>();
        for (TerminalNode id : ctx.ID()) {
            colorParts.add(id.getText());
        }


        return new ColorValue(colorBuilder.toString() + String.join(",", colorParts));
    }
    @Override
    public Object visitHashid(myParser.HashidContext ctx) {
        return ctx.getText();
    }
    @Override
    public Object visitLparen(myParser.LparenContext ctx) {
        String name = ctx.ID(0).getText();
        List<Object> params = new ArrayList<>();

        if (ctx.parameterList() != null) {
            for (int i = 0; i < ctx.parameterList().size(); i++) {
                params.add(visit(ctx.parameterList(i)));
            }
        }


        for (int i = 1; i < ctx.ID().size(); i++) { // ID(0) هو الاسم
            params.add(ctx.ID(i).getText());
        }

        return new LParenNode(name, params);
    }

    @Override
    public Object visitStringvalue(myParser.StringvalueContext ctx) {
        List<String> ids = new ArrayList<>();

        for (TerminalNode id : ctx.ID()) {
            ids.add(id.getText());
        }

        return new StringValueNode(ids);
    }
    @Override
    public Object visitArrayDefinition(myParser.ArrayDefinitionContext ctx) {
        String modifier = null;
        if (ctx.CONST() != null) modifier = ctx.CONST().getText();
        else if (ctx.MODIFIER() != null) modifier = ctx.MODIFIER().getText();

        String name = ctx.ID(0).toString();

        String type = null;
        if (ctx.TYPE() != null) {
            type = ctx.TYPE().getText();
        } else if (ctx.LBRACK() != null && ctx.RBRACK() != null) {
            type = ctx.ID(1).toString() + "[]";
        }

        List<ArrayItemNode> items = new ArrayList<>();
        for (myParser.ArrayListContext arr : ctx.arrayList()) {
            Object val = visit(arr);
            if (val instanceof List) {
                items.addAll((List<ArrayItemNode>) val);
            } else if (val instanceof ArrayItemNode) {
                items.add((ArrayItemNode) val);
            }
        }

        return new ArrayDefinitionNode(modifier, name, type, items);
    }
    @Override
    public Object visitIncludearray(myParser.IncludearrayContext ctx) {
        List<ArrayItemNode> items = new ArrayList<>();

        items.add(new ArrayItemNode(ctx.ID(0).getText(), (Value) visit(ctx.value(0))));
        for (int i = 1; i < ctx.ID().size(); i++) {
            items.add(new ArrayItemNode(ctx.ID(i).getText(), (Value) visit(ctx.value(i))));
        }
        return items;
    }
    @Override
    public Object visitValdata(myParser.ValdataContext ctx) {
        List<ArrayItemNode> items = new ArrayList<>();
        for (int i = 0; i < ctx.value().size(); i++) {
            items.add(new ArrayItemNode((Value) visit(ctx.value(i))));
        }
        return items;
    }
//    @Override
//    public Object visitIncludearray(myParser.IncludearrayContext ctx) {
//        Map<String, Object> objectMap = new HashMap<>();
//
//
//        String firstKey = ctx.ID(0).getText();
//        Object firstValue = visit(ctx.value(0));
//        objectMap.put(firstKey, firstValue);
//
//        for (int i = 1; i < ctx.ID().size(); i++) {
//            String key = ctx.ID(i).getText();
//            Object value = visit(ctx.value(i));
//            objectMap.put(key, value);
//        }
//
//        return objectMap;
//    }
//
//    @Override
//    public Object visitValdata(myParser.ValdataContext ctx) {
//        List<Object> values = new ArrayList<>();
//
//        for (myParser.ValueContext valueCtx : ctx.value()) {
//            Object value = visit(valueCtx);
//            if (value != null) {
//                values.add(value);
//            }
//        }
//
//        return values;
//    }
//


    @Override
    public Object visitArrayDefinitiondata(myParser.ArrayDefinitiondataContext ctx) {
        return visitArrayDefinition(ctx.arrayDefinition());
    }
//
//    @Override
//    public Object visitMethodDefinition(myParser.MethodDefinitionContext ctx) {
//        String name = ctx.ID().getText();
//        List<StatementNode> body = new ArrayList<>();
//        List<ParameterNode> psrmiter = new ArrayList<>();
//        List<ClassBodyEntry> classBodyEntries = new ArrayList<>();
//        List<ColorValue> colorValues = new ArrayList<>();
//        for (int i = 0; i < ctx.parameterList().size(); i++) {
//            Object res = visit(ctx.parameterList(i));
//            psrmiter.add((ParameterNode) res);
//        }
//
//
//        for (int i = 0; i < ctx.methodBody().size(); i++) {
//            Object res = visit(ctx.methodBody(i));
//            if (res instanceof StatementNode) {
//                body.add((StatementNode) res);
//            }
//             if(res instanceof ClassBodyEntry) {
//                classBodyEntries.add((ClassBodyEntry) res);
//
//            } else if (res instanceof ColorValue) {
//                colorValues.add((ColorValue) res);
//
//             }
//        }
//
//        return new MethodDefinitionNode(name, psrmiter, body ,classBodyEntries,colorValues);
//    }
//

    @Override
    public Object visitType11(myParser.Type11Context ctx) {
        String name = ctx.ID(0).getText();
        String type = null;
        if (ctx.TYPE() != null) {
            type = ctx.TYPE().getText();
        } else if (ctx.TAG_OPEN() != null) {
            type = ctx.ID(1).getText(); // النوع بين القوسين
        } else if (ctx.ID().size() > 1) {
            type = ctx.ID(1).getText();
        }

        return new ParameterNode(name, type);
    }

    @Override
    public Object visitType21(myParser.Type21Context ctx) {
        Object val = visit(ctx.value());
        return new ParameterNode((Value) val);
    }


//    @Override
//    public Object visitCalcolor(myParser.CalcolorContext ctx) {
//        return visitCalcualtecolor(ctx.calcualtecolor());
//    }
//
//    @Override
//    public Object visitCalcualtecolor(myParser.CalcualtecolorContext ctx) {
//ColorValue colorValue = null;
//         if(ctx.contenetcolorcal() !=null){
//             Object res = visitContenetcolorcal(ctx.contenetcolorcal());
//            colorValue = (ColorValue) res;
//         }
//        return colorValue;
//    }
//
//    @Override
//    public Object visitContenetcolorcal(myParser.ContenetcolorcalContext ctx) {
//        return new ColorValue(ctx.getText());
//    }
//
//    @Override
//    public Object visitValuedata(myParser.ValuedataContext ctx) {
//        Value value = null;
//        if(ctx.value() !=null ){
//            Object res = visit(ctx.value());
//            value = (Value) res;
//        }
//        return value ;
//    }
//

    @Override
    public Object visitPropertyDefinitiondata(myParser.PropertyDefinitiondataContext ctx) {
       return visit(ctx.propertyDefinition());
    }
    @Override
    public Object visitValue1(myParser.Value1Context ctx) {
        String name = ctx.ID(0).toString();
        boolean isOptional = ctx.QMARK() != null;


        String type = "";
        if (ctx.ID(1) != null) {
            type = ctx.ID(1).getText();
        } else if (ctx.TYPE() != null) {
            type = ctx.TYPE().getText();
        }

        Value defaultValue = null;
        if (ctx.value() != null) {
            defaultValue = (Value) visit(ctx.value());
        }

        return new value1(name, type, isOptional, defaultValue);
    }
    @Override
    public Object visitValue2(myParser.Value2Context ctx) {
        String modifier = ctx.MODIFIER().getText();
        String name = ctx.ID().getText();
        Value val = (Value) visit(ctx.value());
        return new value2(name, modifier, val);
    }
    @Override
    public Object visitDefinition(myParser.DefinitionContext ctx) {
        String name = ctx.ID(0).getText();
        boolean optional = ctx.QMARK() != null;
        String type = ctx.ID().size() > 1 ? ctx.ID(1).getText() : ctx.TYPE().getText();
        Value value = null;

        if (ctx.value() != null) {
            Object val = visit(ctx.value());
            if (val instanceof Value) {
                value = (Value) val;
            }
        }

        return new DefinitionNode(name, optional, type, value);
    }
    @Override
    public Object visitConstpro(myParser.ConstproContext ctx) {
        String name = ctx.ID(0).getText();          // اسم الـ const
        String typeOrValue = ctx.ID(1).getText();   // القيمة أو النوع بعد =

        List<ParameterNode> params = new ArrayList<>();
        if (ctx.parameterList() != null) {
            for (int i = 0; i < ctx.parameterList().size(); i++) {
                params.add((ParameterNode) visit(ctx.parameterList(i)));
            }
        }

        return new ConstNode(name, typeOrValue, params);
    }

    @Override
    public Object visitMapdefinition(myParser.MapdefinitionContext ctx) {
        String name = ctx.ID(0).getText();
        MapDefinitionNode mapNode = new MapDefinitionNode(name);

        for (int i = 0; i < ctx.ID().size(); i++) {
            String key = ctx.ID(i).getText();
            Value value = null;

            if (ctx.value(i) != null) {
                Object val = visit(ctx.value(i));
                value = val != null ? (Value) val : null;
            }

            mapNode.addEntry(key, value);
        }

        return mapNode;
    }
    @Override
    public Object visitBooleanvalue(myParser.BooleanvalueContext ctx) {
        String name = ctx.ID().getText();
        boolean value = Boolean.parseBoolean(ctx.BOOLEAN().getText());
        return new BooleanValueNode(name, value);
    }
    @Override
    public Object visitInterfaces(myParser.InterfacesContext ctx) {
        return visitInterface(ctx.interface_());
    }
    @Override
    public Object visitInterface(myParser.InterfaceContext ctx) {
        String interfaceName = ctx.ID().getText();
        interfacescontent content = (interfacescontent) visit(ctx.interfacecontent());

        return new InterfaceNode(interfaceName, content);
    }
    @Override
    public Object visitInterfacecontent(myParser.InterfacecontentContext ctx) {
        List<PropertyDefinitionNode> props = new ArrayList<>();
        for (myParser.PropertyDefinitionContext pctx : ctx.propertyDefinition()) {
            Object res = visit(pctx);
            if (res instanceof PropertyDefinitionNode) {
                props.add((PropertyDefinitionNode) res);
            }
        }
        return new interfacescontent(props);
    }
    @Override
    public Object visitInjectableDefinition(myParser.InjectableDefinitionContext ctx) {
        String id = ctx.ID().getText();

        String providin = ctx.PROVIDIN() != null ? ctx.PROVIDIN().getText() : null;

        return new injectableDefination(id, providin);
    }
    @Override
    public Object visitInjectable(myParser.InjectableContext ctx) {
        return visitInjectableDefinition(ctx.injectableDefinition());
    }
}


