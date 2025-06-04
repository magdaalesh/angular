package AST.Nodes;

public class ParameterNode {
    private String name;
    private String type;

    public ParameterNode(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ParameterNode{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

