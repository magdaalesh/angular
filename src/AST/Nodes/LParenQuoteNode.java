package AST.Nodes;

import java.util.ArrayList;
import java.util.List;

public class LParenQuoteNode extends Value {
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

    @Override
    public Expr asExpr() {
        List<Expr> args = new ArrayList<>();

        for (String id : pathIds) {
            args.add(new ValueExpr(null, new IdValue(List.of(id))));
        }

        for (String id : extraIds) {
            args.add(new ValueExpr(null, new IdValue(List.of(id))));
        }

        return new CallExprNode(functionName, args);
    }

    /**
     * @return
     */
    @Override
    public String codegenerate() {
        return "";
    }
}


