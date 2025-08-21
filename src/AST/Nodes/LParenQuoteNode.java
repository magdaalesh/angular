package AST.Nodes;

import java.util.List;

public class LParenQuoteNode extends Node {
    private String functionName;
    private List<String> pathIds;
    private List<String> extraIds;

    public LParenQuoteNode(String functionName, List<String> pathIds, List<String> extraIds) {
        this.functionName = functionName;
        this.pathIds = pathIds;
        this.extraIds = extraIds;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<String> getPathIds() {
        return pathIds;
    }

    public List<String> getExtraIds() {
        return extraIds;
    }

    @Override
    public String toString() {
        return "LParenQuoteNode{" +
                "functionName='" + functionName + '\'' +
                ", pathIds=" + pathIds +
                ", extraIds=" + extraIds +
                '}';
    }
}
