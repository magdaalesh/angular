package AST.Nodes;

import java.util.HashMap;
import java.util.Map;

public class EqualsExprNode extends Value {
    private String functionName;
    private String lambdaVar;
    private String leftVar;
    private String operation;
    private String rightVar;

    public EqualsExprNode(String functionName, String lambdaVar, String leftVar, String operation, String rightVar) {
        this.functionName = functionName;
        this.lambdaVar = lambdaVar;
        this.leftVar = leftVar;
        this.operation = operation;
        this.rightVar = rightVar;
    }

    public String getFunctionName() { return functionName; }
    public String getLambdaVar()    { return lambdaVar; }
    public String getLeftVar()      { return leftVar; }
    public String getOperation()    { return operation; }
    public String getRightVar()     { return rightVar; }

    public Map<String, String> getArguments() {
        Map<String, String> args = new HashMap<>();
        args.put(leftVar, rightVar);
        return args;
    }

    @Override
    public String toString() {
        return "EqualsExprNode{" +
                "functionName='" + functionName + '\'' +
                ", lambdaVar='" + lambdaVar + '\'' +
                ", leftVar='" + leftVar + '\'' +
                ", operation='" + operation + '\'' +
                ", rightVar='" + rightVar + '\'' +
                '}';
    }

    @Override
    public String codegenerateInternal() {
        if (functionName != null && lambdaVar != null && leftVar != null && rightVar != null) {
            return functionName + "(" + lambdaVar + " => " + leftVar + " " + operation + " " + rightVar + ")";
        }
        return "";
    }
}
