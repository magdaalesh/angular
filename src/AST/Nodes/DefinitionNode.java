package AST.Nodes;

public class DefinitionNode extends PropertyDefinitionNode {
    private String name;
    private boolean optional;
    private String type;
    private Value value;

    public DefinitionNode(String name, boolean optional, String type, Value value) {
        this.name = name;
        this.optional = optional;
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public boolean isOptional() {
        return optional;
    }

    public String getType() {
        return type;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PropertyDefinitionNode{" +
                "name='" + name + '\'' +
                ", optional=" + optional +
                ", type='" + type + '\'' +
                ", value=" + value +
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
