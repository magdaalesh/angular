package AST.Nodes;

public class ParameterNode extends Node {
    private String name;
    private String type;
    private  Value value;

    public ParameterNode(String name, String type) {
        this.name = name;
        this.type = type;
        this.value = null;
    }

    public ParameterNode(Value value) {
        this.name = null;
        this.type = null;
        this.value = value;
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public Value getValue() { return value; }

    @Override
    public String toString() {
        if (value != null) {
            return "ParameterNode{value=" + value + "}";
        }
        return "ParameterNode{name='" + name + "', type='" + type + "'}";
    }

    @Override
    public String codegenerate() {
        if (value != null) {
            return value.codegenerate();
        } else if (name != null) {
            return name;}
        return "";
    }

}
