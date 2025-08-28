package AST.Nodes;

import java.util.List;

public class CallExprNode extends Expr {
    private String functionName;
    private List<Expr> arguments;

    public CallExprNode(String functionName, List<Expr> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<Expr> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        return "CallExprNode{" +
                "functionName='" + functionName + '\'' +
                ", arguments=" + arguments +
                '}';
    }

    /**
     * @return
     */
    public String codegenerate() {
        return "";
    }
}
