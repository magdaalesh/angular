package AST.Nodes;

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

    @Override
    public String codegenerate() {
        // توليد كود URL template كمثال
        return template != null ? template : "";
    }
}
