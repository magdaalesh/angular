package AST.Nodes;

public class TemplateEntry extends MetadataEntry {
    private HtmlTemplate template;

    public TemplateEntry(HtmlTemplate template) {
        this.template = template;
    }

    public HtmlTemplate getTemplate() {
        return template;
    }

    public void setTemplate(HtmlTemplate template) {
        this.template = template;
    }

    @Override
    public String toString() {
        return "TemplateEntry{template=" + template + "}";
    }

    @Override
    public String getValue() {
        return template != null ? template.toString() : "";
    }

    @Override
    public String codegenerate() {
        return template != null ? template.code() : "";
    }

    @Override
    public String getKey() {
        return "template:";
    }
}
