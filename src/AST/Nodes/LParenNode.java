package AST.Nodes;

import java.util.List;

public class LParenNode extends Value {
    private String name;
    private List<Object> parameters;

    public LParenNode(String name, List<Object> parameters) {
        this.name = name;
        this.parameters = parameters;
    }

    public String getName() { return name; }
    public List<Object> getParameters() { return parameters; }

    @Override
    public String toString() {
        return "LParenNode{" +
                "name='" + name + '\'' +
                ", parameters=" + parameters +
                '}';
    }
}
