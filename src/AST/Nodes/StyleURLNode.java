package AST.Nodes;

public class StyleURLNode extends MetadataEntry {
    private String stylePath;

    public StyleURLNode(String stylePath) {
        this.stylePath = stylePath;
    }

    public StyleURLNode() {
        this.stylePath = null;
    }

    public String getStylePath() {
        return stylePath;
    }

    public void setStylePath(String stylePath) {
        this.stylePath = stylePath;
    }

    @Override
    public String toString() {
        return "StyleURLNode{stylePath='" + stylePath + "'}";
    }

    @Override
    public String getKey() {
        return "styleUrls";
    }

    @Override
    public String getValue() {
        return stylePath;
    }

    @Override
    public String codegenerate() {
        return stylePath != null ? "<link rel=\"stylesheet\" href=\"" + stylePath + "\">" : "";
    }
}
