package AST.Nodes;

public class SelectorEntry extends MetadataEntry {
    private String selector;

    public SelectorEntry(String selector) { this.selector = selector; }

    public String getSelector() { return selector; }
    public void setSelector(String selector) { this.selector = selector; }

    @Override
    public String toString() { return "SelectorEntry{selector='" + selector + "'}"; }

    @Override
    public String getValue() { return selector; }

    @Override
    public String codegenerate() {
        String s = (selector == null || selector.isEmpty()) ? "app-component" : selector;
        return "// component: " + s;
    }

    @Override
    public String getKey() { return "selector:"; }
}
