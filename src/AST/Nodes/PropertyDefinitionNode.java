package AST.Nodes;

public class PropertyDefinitionNode extends ClassBodyEntry {
    private String name;
    private String type;
    private Object value;

    public PropertyDefinitionNode(String name, String type, Object value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PropertyDefinitionNode{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
