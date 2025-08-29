package AST.Nodes;

import java.util.List;

public class ProgramNode {
    private List<Node> nodes;

    public ProgramNode(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProgramNode{\n");
        for (Node node : nodes) {
            sb.append("  ").append(node.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    public String codegenerate() {
        StringBuilder sb = new StringBuilder();
        if (nodes != null) {
            for (Node node : nodes) {
                sb.append(node.codegenerate()).append("\n");
            }
        }
        return sb.toString();
    }
}
