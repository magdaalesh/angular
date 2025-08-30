package AST.Nodes;

import java.util.ArrayList;
import java.util.List;

public class CallFunNode extends Node {
    private String functionName;
    private List<String> arguments;

    public CallFunNode(String functionName, List<String> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    public String getFunctionName() { return functionName; }
    public List<String> getArguments() { return arguments; }

    @Override
    public String toString() {
        return "CallFunNode{" + "functionName='" + functionName + '\'' + ", arguments=" + arguments + '}';
    }

    @Override
    public Expr asExpr() {
        List<Expr> args = new ArrayList<>();
        for (String arg : arguments) {
            args.add(new ValueExpr(null, new IdValue(List.of(arg))));
        }
        return new CallExprNode(functionName, args);
    }

    @Override
    public String codegenerate() {

        StringBuilder sb = new StringBuilder();
        sb.append(functionName).append("(");
        if (arguments != null && !arguments.isEmpty()) {
            sb.append(String.join(", ", arguments));
        }
        sb.append(");");
        return sb.toString();
    }
}
