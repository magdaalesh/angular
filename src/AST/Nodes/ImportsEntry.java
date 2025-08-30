package AST.Nodes;

import java.util.List;

public class ImportsEntry extends MetadataEntry {
    private List<String> imports;

    public ImportsEntry(List<String> imports) {
        this.imports = imports;
    }

    public List<String> getImports() {
        return imports;
    }

    public void setImports(List<String> imports) {
        this.imports = imports;
    }

    @Override
    public String toString() {
        return "ImportsEntry{imports=" + imports + "}";
    }

    @Override
    public String getKey() {
        return "imports:";
    }

    @Override
    public String getValue() {
        return imports != null ? imports.toString() : "";
    }
    @Override
    public String codegenerate() {
        if (imports == null || imports.isEmpty()) return "";
        return "// imports: [" + String.join(", ", imports) + "]";
    }


}
