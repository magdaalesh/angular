package AST.Nodes;

import java.util.*;

public class ArrayItemNode {
    private Map<String, Value> properties;

    public ArrayItemNode(Map<String, Value> properties) {
        this.properties = properties;
    }

    public String codegenerate() {
        if (properties == null || properties.isEmpty()) return "{}";

        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        int i = 0;
        for (Map.Entry<String, Value> entry : properties.entrySet()) {
            sb.append(entry.getKey()).append(": ");

            Object valObj = entry.getValue().codegenerate();
            if (valObj instanceof String) sb.append("\"").append(valObj).append("\"");
            else sb.append(valObj);

            if (i < properties.size() - 1) sb.append(", ");
            i++;
        }
        sb.append(" }");
        return sb.toString();
    }
}
