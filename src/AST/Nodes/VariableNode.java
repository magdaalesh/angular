package AST.Nodes;

import java.util.List;

public class VariableNode extends HtmlNode {
    private List<String> variablePath; // مثلاً [user, name]

    public VariableNode(List<String> variablePath) {
        this.variablePath = variablePath;
    }

    public List<String> getVariablePath() {
        return variablePath;
    }

    @Override
    public String toString() {
        return "VariableNode{variablePath=" + variablePath + '}';
    }
}
