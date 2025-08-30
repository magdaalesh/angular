package AST.Nodes;

import codegenerate.codegenerate;

public class URLTemplateNode extends MetadataEntry {
    private String template;

    public URLTemplateNode(String template) {
        this.template = template;
    }

    public URLTemplateNode() {
        this.template = null;
    }

    public String getTemplate() { return template; }
    public void setTemplate(String template) { this.template = template; }

    @Override
    public String toString() {
        return "URLTemplateNode{" +
                "templateUrl='" + template + '\'' +
                '}';
    }

    @Override
    public String getKey() { return "templateUrl"; }

    @Override
    public String getValue() { return template != null ? template : ""; }
    codegenerate codegenerate =new codegenerate();
    @Override
    public String codegenerate() {
        String baseName = template.endsWith(".html")
                ? template.substring(0, template.length() - 5)
                : template;
        if(baseName.contains("product-list")){
            baseName = "product.server";
        }
     String content=   "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <title>" + template + "</title>\n</head>\n<body>\n"+"<script  src=\" " + baseName + ".js\"></script>\n";
        codegenerate.writehtmlpage(content,template);
        return "";}
    }

