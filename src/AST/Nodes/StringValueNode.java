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

    @Override
    public String codegenerateInternal() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.size(); i++) {
            sb.append(parts.get(i));
            if (i < parts.size() - 1) sb.append(" ");
        }
        return sb.toString();
    }
}
