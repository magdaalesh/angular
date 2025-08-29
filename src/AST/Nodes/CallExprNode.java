package AST.Nodes;

import java.util.List;

public class CallExprNode extends Expr {
    private String functionName;
    private List<Expr> arguments;

    public CallExprNode(String functionName, List<Expr> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    public String getFunctionName() { return functionName; }
    public List<Expr> getArguments() { return arguments; }

    @Override
    public String toString() {
        return "CallExprNode{" + "functionName='" + functionName + '\'' + ", arguments=" + arguments + '}';
    }

    @Override
    protected String codegenerateInternal() {
        StringBuilder sb = new StringBuilder();
        sb.append(functionName).append("(");

        if (arguments != null && !arguments.isEmpty()) {
            for (int i = 0; i < arguments.size(); i++) {
                Expr arg = arguments.get(i);
                sb.append(arg.codegenerate());
                if (i < arguments.size() - 1) sb.append(", ");
            }
        }

        sb.append(")");
        return sb.toString();
    }
}
