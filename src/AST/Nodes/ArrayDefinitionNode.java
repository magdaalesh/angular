package AST.Nodes;

import java.util.List;

public class ArrayDefinitionNode extends ClassBodyEntry   {
    private String name;
    private String type;
    private List<Object> values;

    public ArrayDefinitionNode(String name, String type, List<Object> values) {
        this.name = name;
        this.type = type;
        this.values = values;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public List<Object> getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "ArrayDefinitionNode{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", values=" + values +
                '}';
    }
}
