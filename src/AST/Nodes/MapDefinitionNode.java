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

    public String getName() {
        return name;
    }

    public Map<String, Value> getMapEntries() {
        return mapEntries;
    }

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

    /**
     * @return
     */
    @Override
    public String codegenerate() {
        return "";
    }
}
