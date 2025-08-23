package AST.Visitor;

import AST.Nodes.*;
import gen.myParser;
import gen.myParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import sementicserror.*;
import AST.Nodes.ConditionNode;
import org.antlr.v4.runtime.tree.ParseTree;
import AST.Nodes.Expr;
import AST.Nodes.Value;
import AST.Nodes.ValueExpr;
import AST.Nodes.ValueStatement;
import AST.Nodes.CallExprNode;
import AST.Nodes.Expr;
import AST.Nodes.Node;




import java.util.*;


public class BaseVisitor extends myParserBaseVisitor<Object> {

    htmlopenandclosesame htmlopenandclosesamesymboletable = new htmlopenandclosesame();
    duplicatecomponentkeysymboltable selectorTable = new duplicatecomponentkeysymboltable();
    importslivalueinitbefor importlistiit = new importslivalueinitbefor();
    dublicatecsselement dublicatecsselementsymboltable = new dublicatecsselement();
    ngifandngforatsametime ngifngforsymboletable = new ngifandngforatsametime();

    //
    Componentuniqselector componentSymbolTable = new Componentuniqselector();
    variableSymbolTable variableTable = new variableSymbolTable();
    List<String> s;
    private final handleerror error = handleerror.getInstance();
String filename ;
    public BaseVisitor(List<String> symbole , String filename ,Componentuniqselector selectortable) {
        s = new ArrayList<>();
        s = symbole;
        this.filename=filename;
        this.componentSymbolTable  =selectortable;
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

        if (ctx.componentMetadata() != null) {
            Object result = visitComponentMetadata(ctx.componentMetadata());
            componentNode = new ComponentNode((ComponentMetadata) result);
        }
        return componentNode;
    }
    @Override
    public Object visitComponentMetadata(myParser.ComponentMetadataContext ctx) {
        List<MetadataEntry> metadataEntries = new ArrayList<>();

        // الحصول على selector من الـ metadata مباشرة
        String componentSelector = null;
        for (int i = 0; i < ctx.metadataEntry().size(); i++) {
            MetadataEntry m = (MetadataEntry) visit(ctx.metadataEntry(i));
            if (m != null) {
                String key = m.getKey();
                String value = m.getValue();
                int line = ctx.metadataEntry(i).getStart().getLine();


                if (key.contains("selector")) {
                    componentSelector = value;
                }

                try {

                    if (componentSelector != null) {
                        selectorTable.addTo(filename, componentSelector, key, value);


                        if (selectorTable.checkIfDuplicate(filename, componentSelector, key)) {
                            throw new sementicsexcep(
                                    "Duplicate entry: '" + key + "' in component with selector: "
                                            + componentSelector + " in file: " + filename
                            );
                        }
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
        int line = ctx.ID().getSymbol().getLine();
        String value = ctx.ID().getText();

        try {
            // إذا موجود مسبقاً → throw exception
            if (!componentSymbolTable.checkifselectorisuniqandadd(value, line, filename)) {
                throw new sementicsexcep("Selector must be unique in file: " + filename);
            }
        } catch (sementicsexcep e) {
            error.addError(e.getMessage(), line);
            s.add(componentSymbolTable.toString());
        }

        return new SelectorEntry(value);
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
    public Object visitHtmlpagenode(myParser.HtmlpagenodeContext ctx) {
       return visit(ctx.htmlpage());
    }
    @Override
    public HtmlTemplate visitHtmlTemplate(myParser.HtmlTemplateContext ctx) {
        HtmlTemplate template = new HtmlTemplate();
        List<HtmlNode> children = new ArrayList<>();


        for (myParser.HtmlpageContext pageCtx : ctx.htmlpage()) {
            HtmlNode node = (HtmlNode) visit(pageCtx);
            if (node != null) {
                children.add(node);
            }
        }

        template.setChildren(children);
        return template;
    }
    @Override
    public Object visitElementhtml(myParser.ElementhtmlContext ctx) {
        return visitElement(ctx.element());
    }
    @Override
    public Object visitImghtml(myParser.ImghtmlContext ctx) {
        return visitImg(ctx.img());
    }
    @Override
    public Object visitSelftag(myParser.SelftagContext ctx) {
        return visitVoidtag(ctx.voidtag());
    }
    @Override
    public Object visitElement(myParser.ElementContext ctx) {
        String name = "";
        List<HtmlAttribute> attributes = new ArrayList<>();
        List<HtmlNode> children = new ArrayList<>();

        if (ctx.htmlopen() != null) {
            Map<String, Object> res = (Map<String, Object>) visitHtmlopen(ctx.htmlopen());
            if (res != null && !res.isEmpty()) {
                name = (String) res.getOrDefault("name", "");
                Object attrsObj = res.get("attributes");
                if (attrsObj instanceof List) {
                    //noinspection unchecked
                    attributes = new ArrayList<>((List<HtmlAttribute>) attrsObj);
                }

                for (HtmlAttribute attr : attributes) {
                    String attrName = attr.getname();
                    int line = ctx.htmlopen().getStart().getLine();
                    if (dublicatecsselementsymboltable.addandcheckduplicate(name, attrName, line)) {
                        error.addError("Duplicate attribute '" + attrName + "' in element " + name, line);
                        s.add(dublicatecsselementsymboltable.toString());
                    }
                }
            }
        }

        dublicatecsselementsymboltable.closetag(name);

        String nameClose = "";
        if (ctx.htmlclose() != null) {
            nameClose = (String) visitHtmlclose(ctx.htmlclose());
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
            if (!htmlopenandclosesamesymboletable.checkhtmlendandstartname(name, nameClose))
                throw new sementicsexcep("error in your html code closing tag");
            if (ctx.htmlopen().name() != null) {
                htmlopenandclosesamesymboletable.add(
                        "html tags",
                        ctx.htmlopen().name().getText(),
                        ctx.htmlopen().getStart().getLine()
                );
            }
        } catch (sementicsexcep e) {
            error.addError(e.getMessage(), ctx.htmlclose().getStart().getLine());
            s.add(htmlopenandclosesamesymboletable.toString());
        }

        return new ElementNode(name, attributes, children);
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
    public Object visitSelfart(myParser.SelfartContext ctx) {
        return  visitArttiselftag(ctx.arttiselftag());
    }
    @Override
    public Object visitNgsubmit(myParser.NgsubmitContext ctx) {
        String functionName = ctx.ID(0).getText();
        List<String> args = new ArrayList<>();
        for (int i = 1; i < ctx.ID().size(); i++) {
            args.add(ctx.ID(i).getText());
        }
        return new NgSubmitAttribute(functionName, args);
    }
    @Override
    public Object visitVoidtag(myParser.VoidtagContext ctx) {
        String tagName = ctx.selftagname().getText();
        List<ArtSelfTagAttribute> attributes = new ArrayList<>();

        for (myParser.ArttiselftagContext attrCtx : ctx.arttiselftag()) {
            ArtSelfTagAttribute attr = (ArtSelfTagAttribute) visit(attrCtx);
            if (attr != null) attributes.add(attr);
        }

        return new VoidTagNode(tagName, attributes);
    }
    @Override
    public Object visitArttiselftag(myParser.ArttiselftagContext ctx) {
        String attrName = ctx.SELF_ATTRIBUTE().getText();
        List<String> ids = new ArrayList<>();

        if (ctx.ID() != null && !ctx.ID().isEmpty()) {

            for (int i = 0; i < ctx.ID().size(); i++) {
                ids.add(ctx.ID(i).getText());
            }
        }


        if (ctx.LPAREN() != null && ctx.RPAREN() != null) {

            for (int i = 0; i < ctx.ID().size(); i++) {
                ids.add(ctx.ID(i).getText());
            }

            if (ctx.SLASH() != null) {


            }
        }

        return new ArtSelfTagAttribute(attrName, ids);
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
    public Object visitAtbuterimg(myParser.AtbuterimgContext ctx) {
    String name = ctx.IMG_ATTRIBUTE().getText();
    List<String> ids = new ArrayList<>();
    ids.add(ctx.ID(0).getText());
    for (int i = 1; i < ctx.ID().size(); i++) {
        ids.add(ctx.ID(i).getText());
    }
    return new ImageAttribute(name, ids);
}
    @Override
    public Object visitArrti(myParser.ArrtiContext ctx) {
        String name = ctx.ATTRBUTE().getText();
        String value = ctx.ID().getText();
        return new SimpleAttributeNode(name, value);
    }
    @Override
    public Object visitHtmlopen(myParser.HtmlopenContext ctx) {
        Map<String, Object> result = new HashMap<>();
        int line = ctx.getStart().getLine();

        String tagName = (ctx.name() != null) ? ctx.name().getText() : ctx.artt().A().toString();

        List<HtmlAttribute> attributes = new ArrayList<>();


        for (int i = 0; i < ctx.csselement().size(); i++) {
            if (ctx.csselement(i) != null) {
                HtmlAttribute attr = (HtmlAttribute) visit(ctx.csselement(i));
                if (attr != null) attributes.add(attr);
            }
        }

        if (ctx.artt() != null) {
            HtmlAttribute art = (HtmlAttribute) visit(ctx.artt());
            if (art != null) attributes.add(art);
        }


        try {
            if (ngifngforsymboletable.checkngifandngfor(attributes)) {
                throw new sementicsexcep("Cannot use both *ngIf and *ngFor on the same element ");
            }
            for (HtmlAttribute attr : attributes) {
                ngifngforsymboletable.add(attr.getvalue(), attr.getname(), line);
            }
        } catch (sementicsexcep e) {
            error.addError(e.getMessage(), line);
            s.add(ngifngforsymboletable.toString());
        }

        result.put("name", tagName);
        result.put("attributes", attributes);
        return result;
    }
// visitType21
    @Override
    public Object visitArtt(myParser.ArttContext ctx) {
        List<String> ids = new ArrayList<>();
        for (int i = 0; i < ctx.ID().size(); i++) {
            ids.add(ctx.ID(i).getText());
        }
        return new ArtAttribute(ids);
    }
    @Override
    public Object visitHtmlpagecontent(myParser.HtmlpagecontentContext ctx) {
        return visit(ctx.htmlpage());
    }
    @Override
    public Object visitStringdata(myParser.StringdataContext ctx) {
        return new StringContent(ctx.getText());
    }
    @Override
    public Object visitVardata(myParser.VardataContext ctx) {
        return new StringContent(ctx.getText());
    }
    @Override
    public String visitHtmlclose(myParser.HtmlcloseContext ctx) {
        if (ctx.name() != null) {
            return ctx.name().getText();
        } else if (ctx.A() != null) {
            return ctx.A().getText();
        } else {
            return "";
        }
    }
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
    public Object visitMethoddata(gen.myParser.MethoddataContext ctx) {
        return visitMethodDefinition(ctx.methodDefinition());
    }
    @Override
    public Object visitVar(myParser.VarContext ctx) {
        String name  = ctx.ID().getText();
        Value value  = (Value) visit(ctx.value());
        return new VarAssignStatement(name, value);
    }







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
    public Object visitEqualsExpr(myParser.EqualsExprContext ctx) {

            String functionName = ctx.ID(0).getText();

            String lambdaVar = ctx.P().getText();
            String leftVar = ctx.ID(1).getText();


            String operation = ctx.operation().getText();

            String rightVar = ctx.ID(2).getText();


            EqualsExprNode node = new EqualsExprNode(functionName, lambdaVar, leftVar, operation, rightVar);

            return node;

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


        for (int i = 1; i < ctx.ID().size(); i++) {
            params.add(ctx.ID(i).getText());
        }

        return new LParenNode(name, params);
    }
    @Override
    public Object visitLpranqoute(myParser.LpranqouteContext ctx) {
        String functionName = ctx.ID(0).getText();


        List<String> pathIds = new ArrayList<>();
        for (int i = 1; i < ctx.ID().size(); i++) {
            pathIds.add(ctx.ID(i).getText());
        }


        List<String> extraIds = new ArrayList<>();
        if (ctx.COMMA() != null && !ctx.COMMA().isEmpty()) {

            int start = pathIds.size() + 1;
            for (int i = start; i < ctx.ID().size(); i++) {
                extraIds.add(ctx.ID(i).getText());
            }
        }

        return new LParenQuoteNode(functionName, pathIds, extraIds);
    }
    @Override
    public Object visitCallfun(myParser.CallfunContext ctx) {
        String functionName = ctx.ID(0).getText();

        Map<String, String> arguments = new LinkedHashMap<>();


        for (int i = 1; i < ctx.ID().size(); i += 2) {
            String key = ctx.ID(i).getText();
            String value = ctx.ID(i + 1).getText();
            arguments.put(key, value);
        }

        return new CallFunNode(functionName, arguments);
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
    @Override
    public Object visitArrayDefinitiondata(myParser.ArrayDefinitiondataContext ctx) {
        return visitArrayDefinition(ctx.arrayDefinition());
    }

    // visitMethodDefinition
    @Override
    public Object visitMethodDefinition(gen.myParser.MethodDefinitionContext ctx) {
        String name = ctx.ID().getText();

        java.util.List<AST.Nodes.ParameterNode> params = new java.util.ArrayList<>();
        for (gen.myParser.ParameterListContext pctx : ctx.parameterList()) {
            Object p = visit(pctx);
            if (p instanceof AST.Nodes.ParameterNode) {
                params.add((AST.Nodes.ParameterNode) p);
            } else if (p != null) {
                params.add(new AST.Nodes.ParameterNode(p.toString(), null));
            }
        }

        AST.Nodes.TypeAnnotationNode ret = null;
        if (ctx.typeAnnotation() != null) {
            Object t = visit(ctx.typeAnnotation());
            if (t instanceof AST.Nodes.TypeAnnotationNode) {
                ret = (AST.Nodes.TypeAnnotationNode) t;
            } else if (t != null) {
                ret = new AST.Nodes.TypeAnnotationNode(t.toString(), false, java.util.Collections.emptyList());
            }
        }

        java.util.List<Object> items = new java.util.ArrayList<>();
        for (gen.myParser.MethodBodyContext bctx : ctx.methodBody()) {
            Object node = visit(bctx);
            if (node instanceof AST.Nodes.Value) {
                node = new AST.Nodes.ValueStatement((AST.Nodes.Value) node);
            }
            items.add(node);
        }

        return new AST.Nodes.MethodDefinitionNode(name, params, ret, items);
    }





    //TypeAnnotation
    @Override
    public Object visitTypeAnnotation(gen.myParser.TypeAnnotationContext ctx) {
        String main = ctx.ID(0).getText();
        boolean isArray = ctx.LBRACK() != null && ctx.RBRACK() != null;
        java.util.List<String> unions = new java.util.ArrayList<>();
        if (ctx.PIPE() != null && ctx.ID().size() >= 2) {
            unions.add(ctx.ID(1).getText());
        }
        return new AST.Nodes.TypeAnnotationNode(main, isArray, unions);
    }




//visitType11
    @Override
    public Object visitType11(gen.myParser.Type11Context ctx) {
        String paramName = ctx.ID(0).getText();
        String type = null;
        if (ctx.ID().size() > 1) type = ctx.ID(1).getText();
        else if (ctx.TYPE() != null) type = ctx.TYPE().getText();
        else type = ctx.getText();
        return new AST.Nodes.ParameterNode(paramName, type);
    }
    @Override
    public Object visitType21(gen.myParser.Type21Context ctx) {
        return new AST.Nodes.ParameterNode(ctx.getText(), null);
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
// value  -> #valuedata
@Override
public AST.Nodes.MethodBody visitValuedata(gen.myParser.ValuedataContext ctx) {
    Object r = visit(ctx.value());
    AST.Nodes.Expr e = asExpr(r);
    return new AST.Nodes.ValueStatement(e);
}
// Expr asExpr
private Expr asExpr(Object o) {
    if (o == null) return null;
    if (o instanceof Expr) return (Expr) o;
    if (o instanceof Node) return ((Node) o).asExpr();
    throw new IllegalStateException("Cannot convert to Expr: " + o.getClass());
}




    // calcualtecolor -> #calcolor
   // @Override
   // public Object visitCalcolor(myParser.CalcolorContext ctx) {
       // return new CalculateColorNode(
                //(ColorValue) visit(ctx.contenetcolorcal())
      //  );
   // }//
    //objectdefintion
    // #object
    @Override
    public Object visitObject(myParser.ObjectContext ctx) {
        // لا ترجع null
        return visit(ctx.objectdefinetion());
    }

    // objectdefinetion
    @Override
    public Object visitObjectdefinetion(myParser.ObjectdefinetionContext ctx) {
        List<TerminalNode> ids = ctx.ID();
        String name = ids.get(0).getText();    //
        String explicitType = null;
        boolean arrayTyped  = false;
        String arrayType    = null;

        if (ctx.COLON() != null) {
            explicitType = ids.size() > 1 ? ids.get(1).getText() : null;
        } else if (ctx.LBRACK() != null) {
            arrayTyped = true;
            arrayType  = ids.size() > 1 ? ids.get(1).getText() : null;
        }

        List<String> entries = new ArrayList<>();
        for (myParser.ContenttContext cctx : ctx.contentt()) {
            entries.add(cctx.getText());
        }

        return new AST.Nodes.ObjectDefinitionStmt(name, explicitType, arrayTyped, arrayType, entries);
    }


//varstatment
//@Override
//public Object visitVarsta(myParser.VarContext ctx) {
   // String name  = ctx.ID().getText();
   // Value value  = (Value) visit(ctx.value());
   // return new VarAssignStatement(name, value); // ترجع كـ Object
//}



//returnstat
@Override
public Object visitReturnExpr(gen.myParser.ReturnExprContext ctx) {
    boolean hasReturn = ctx.RETURN() != null;

    java.util.List<AST.Nodes.Expr> exprs = new java.util.ArrayList<>();
    for (gen.myParser.ExpressionContext ectx : ctx.expression()) {
        AST.Nodes.Expr e = (AST.Nodes.Expr) visit(ectx);
        if (e != null) exprs.add(e);
    }

    return new AST.Nodes.ReturnStatement(hasReturn, exprs);
}

//ifstatment
@Override
public Object visitIfstatement(myParser.IfstatementContext ctx) {
    ConditionNode cond = (ConditionNode) visit(ctx.condition());

    List<MethodBody> body = new ArrayList<>();
    for (ParseTree ch : ctx.children) {
        if (ch instanceof myParser.MethodBodyContext) {
            body.add((MethodBody) visit(ch));
        } else if (ch instanceof myParser.ValueContext) {
            Value v = (Value) visit(ch);
            body.add(new ValueStatement(v));
        }
    }

    return new IfStatementNode(cond, body);
}
//idcond
@Override
public Object visitIdcond(gen.myParser.IdcondContext ctx) {
    String left  = ctx.ID(0).getText();
    String op    = ctx.operation().getText();
    String sign  = ctx.PLUS()!=null ? "+" : (ctx.MINUS()!=null ? "-" : "");
    String right = ctx.ID(1).getText();
    return new AST.Nodes.IdCondNode(left, op, sign, right);
}

    @Override
    public Object visitOperationcond(gen.myParser.OperationcondContext ctx) {
        String first = ctx.ID(0).getText();
        java.util.List<String> ops = new java.util.ArrayList<>();
        java.util.List<String> ids = new java.util.ArrayList<>();
        for (int i = 1; i < ctx.ID().size(); i++) {
            ops.add(ctx.operation(i-1).getText());
            ids.add(ctx.ID(i).getText());
        }
        return new AST.Nodes.OperationCondNode(first, ops, ids);
    }


//valueex
@Override
public Object visitValueex(gen.myParser.ValueexContext ctx) {
    String constName = null;

    if (ctx.CONST() != null && ctx.ID() != null) {
        constName = ctx.ID().getText();
    }

    Value v = (Value) visit(ctx.value());

    return new ValueExpr(constName, v);

    // return new ValueExpr(v);
}
//ThisProp
//visitSpreadExpressionList
@Override
public Object visitSpreadExpressionList(gen.myParser.SpreadExpressionListContext ctx) {
    java.util.List<AST.Nodes.SpreadItem> items = new java.util.ArrayList<>();
    boolean nextIsSpread = false;

    if (ctx.children != null) {
        for (org.antlr.v4.runtime.tree.ParseTree ch : ctx.children) {
            if (ch instanceof org.antlr.v4.runtime.tree.TerminalNode) {
                String t = ch.getText();
                if ("...".equals(t)) {
                    nextIsSpread = true;
                }
            } else if (ch instanceof gen.myParser.ExpressionContext) {
                AST.Nodes.Expr expr = (AST.Nodes.Expr) visit(ch);
                items.add(new AST.Nodes.SpreadItem(nextIsSpread, expr));
                nextIsSpread = false;
            }
        }
    }
    return items;
}
//visitSparedExpr
@Override
public Object visitSparedExpr(gen.myParser.SparedExprContext ctx) {
    java.util.List<AST.Nodes.SpreadItem> items = new java.util.ArrayList<>();
    if (ctx.spreadExpressionList() != null) {
        @SuppressWarnings("unchecked")
        java.util.List<AST.Nodes.SpreadItem> got =
                (java.util.List<AST.Nodes.SpreadItem>) visit(ctx.spreadExpressionList());
        items.addAll(got);
    }
    return new AST.Nodes.ArrayLiteralExpr(items); // لازم تكون عندك
}

//visitSpreadExpressionList













    //SimpleArrow
    @Override
    public Object visitSimpleArrow(gen.myParser.SimpleArrowContext ctx) {
        String param = ctx.ID().getText();
        Expr body = (Expr) visit(ctx.expression());
        return new ArrowExpr(param, body);
    }



    @Override
    public Object visitPropertyDefinitiondata(myParser.PropertyDefinitiondataContext ctx) {
        PropertyDefinitionNode prop = (PropertyDefinitionNode) visit(ctx.propertyDefinition());
        return new PropertyDefinitionStatement(prop);
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
    // VALUE
    private Value asValue(Object o) {
        if (o == null) return null;

        if (o instanceof Value) return (Value) o;

        if (o instanceof TerminalNode) {
            String txt = ((TerminalNode) o).getText();
            return new IdValue(java.util.Collections.singletonList(txt));
        }

        if (o instanceof Node) {
            Expr e = ((Node) o).asExpr();
            if (e instanceof ValueExpr) {
                return ((ValueExpr) e).getValue();
            }
        }

        throw new IllegalStateException("Cannot convert to Value: " + o.getClass());
    }

}


