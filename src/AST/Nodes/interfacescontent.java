package AST.Nodes;

import java.util.ArrayList;
import java.util.List;

public class interfacescontent {
    private List<PropertyDefinitionNode> properties;

    public interfacescontent(List<PropertyDefinitionNode> properties) {
        this.properties = properties != null ? properties : new ArrayList<>();
    }

    public interfacescontent() {
        this.properties = new ArrayList<>();
    }

    public List<PropertyDefinitionNode> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyDefinitionNode> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        if (properties.isEmpty()) return "InterfacesContent{empty}";
        StringBuilder sb = new StringBuilder();
        sb.append("InterfacesContent{\n");
        for (PropertyDefinitionNode prop : properties) {
            sb.append("  ").append(prop.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    public String codegenerate() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for (PropertyDefinitionNode prop : properties) {
            sb.append("  ").append(prop.codegenerate()).append(";\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
