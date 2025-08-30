package AST.Nodes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorNode extends ClassBodyEntry {
    private final List<ConstructorParam> parameters = new ArrayList<>();
    private final List<Node> body = new ArrayList<>();

    public void addParam(ConstructorParam p) { if (p != null) parameters.add(p); }
    public void addBodyNode(Node n)         { if (n != null) body.add(n); }

    public List<ConstructorParam> getParameters() { return parameters; }
    public List<Node> getBody()                   { return body; }

    @Override
    public String toString() {
        return "ConstructorNode{parameters=" + parameters + ", body=" + body + '}';
    }

    @Override
    public String codegenerae() {
        return "";
    }

    @Override
    public String codegenerate() {
        String params = parameters.stream()
                .map(ConstructorParam::getName)
                .collect(Collectors.joining(", "));

        StringBuilder js = new StringBuilder();
        js.append("constructor(").append(params).append(") {\n");

        // عيّن الديبندنسيز على this
        for (ConstructorParam p : parameters) {
            String n = p.getName();
            if (n != null && !n.isEmpty()) {
                js.append("  this.").append(n).append(" = ").append(n).append(";\n");
            }
        }

        // جسم الكونستركتر
        for (Node n : body) {
            if (n == null) continue;
            String line = n.codegenerate();
            if (line == null) continue;
            line = line.trim();
            if (line.isEmpty()) continue;

            boolean needsSemi = !(line.endsWith(";") || line.endsWith("{") || line.endsWith("}"));
            if (needsSemi) line += ";";
            js.append("  ").append(line).append("\n");
        }

        js.append("}");
        return js.toString();
    }
}
