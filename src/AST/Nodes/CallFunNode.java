package AST.Nodes;

import java.util.Map;

public class CallFunNode extends Node {
    private String functionName;
    private Map<String, String> arguments;

    public CallFunNode(String functionName, Map<String, String> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    public String getFunctionName() {
        return functionName;
    }

    public Map<String, String> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        return "CallFunNode{" +
                "functionName='" + functionName + '\'' +
                ", arguments=" + arguments +
                '}';
    }
}
