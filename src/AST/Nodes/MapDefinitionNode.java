package AST.Nodes;

import java.util.Map;
import java.util.LinkedHashMap;

public class MapDefinitionNode extends PropertyDefinitionNode {
    private String name;
    private Map<String, Value> mapEntries;

    public MapDefinitionNode(String name) {
        this.name = name;
        this.mapEntries = new LinkedHashMap<>();
    }

    public String getName() { return name; }
    public Map<String, Value> getMapEntries() { return mapEntries; }

    public void addEntry(String key, Value value) {
        mapEntries.put(key, value);
    }

    @Override
    public String toString() {
        return "MapDefinitionNode{" +
                "name='" + name + '\'' +
                ", mapEntries=" + mapEntries +
                '}';
    }

    @Override
    public String codegenerate() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" = {");

        if (mapEntries != null && !mapEntries.isEmpty()) {
            sb.append("\n");
            int i = 0;
            for (Map.Entry<String, Value> entry : mapEntries.entrySet()) {
                String key = entry.getKey();
                Value value = entry.getValue();

                sb.append("  ").append(key).append(": ");
                if (value != null) {
                    sb.append(value.codegenerate());
                } else {
                    sb.append("null");
                }

                if (i < mapEntries.size() - 1) sb.append(",");
                sb.append("\n");
                i++;
            }
        }

        sb.append("};");
        return sb.toString();
    }

    @Override
    public String codegenerae() {
        return "";
    }
}
