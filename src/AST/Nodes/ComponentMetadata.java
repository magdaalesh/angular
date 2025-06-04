package AST.Nodes;

import java.util.List;

public class ComponentMetadata {
    private List<MetadataEntry> entries;

    public ComponentMetadata(List<MetadataEntry> entries) {
        this.entries = entries;
    }

    public List<MetadataEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<MetadataEntry> entries) {
        this.entries = entries;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ComponentMetadata{\n");
        for (MetadataEntry entry : entries) {
            sb.append("  ").append(entry.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}

