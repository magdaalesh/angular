package AST.Nodes;

import java.util.List;

public class StringValueNode extends Value {
    private List<String> parts;

    public StringValueNode(List<String> parts) {
        this.parts = parts;
    }

    public List<String> getParts() {
        return parts;
    }

    @Override
    public String toString() {
        return "StringValueNode{" +
                "parts=" + parts +
                '}';
    }
}
