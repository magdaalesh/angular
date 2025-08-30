package AST.Nodes;

import java.util.List;

public class ParameterNode extends Node {
    private String name;
    private String type;
    private Value value;

    public ParameterNode(List<String> name, String type) {
        // نخزن الاسم كنص مفصول بمسافات وملفوف بعلامات ''
        this.name = name.stream()
                .map(n -> "'" + n + "'")
                .reduce((a, b) -> a + " " + b)
                .orElse("");
        this.type = type;
        this.value = null;
    }

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
        if (value != null) return "ParameterNode{value=" + value + "}";
        return "ParameterNode{name='" + name + "', type='" + type + "'}";
    }

    @Override
    public String codegenerate() {
        if (value != null) {
            return value.codegenerate();
        } else if (name != null && !name.isEmpty()) {
            return name; // الاسم هنا مفصول بالفعل بمسافات وملفوف بعلامات ''
        }
        return "";
    }
}
