package AST.Nodes;

import java.util.ArrayList;
import java.util.List;

public class LParenQuoteNode extends Value {
    private String functionName;
    private List<String> pathIds;
    private List<String> extraIds;

    public LParenQuoteNode(String functionName, List<String> pathIds, List<String> extraIds) {
        this.functionName = functionName;
        this.pathIds = pathIds != null ? pathIds : new ArrayList<>();
        this.extraIds = extraIds != null ? extraIds : new ArrayList<>();
    }

    public String getFunctionName() { return functionName; }
    public List<String> getPathIds() { return pathIds; }
    public List<String> getExtraIds() { return extraIds; }

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
        for (String id : pathIds) args.add(new ValueExpr(null, new IdValue(List.of(id))));
        for (String id : extraIds) args.add(new ValueExpr(null, new IdValue(List.of(id))));
        return new CallExprNode(functionName, args);
    }

    @Override
    protected String codegenerateInternal() {
        StringBuilder sb = new StringBuilder();
        sb.append(functionName).append("(");
        List<String> allIds = new ArrayList<>();
        allIds.addAll(pathIds);
        allIds.addAll(extraIds);
        for (int i = 0; i < allIds.size(); i++) {
            sb.append("\"").append(allIds.get(i)).append("\"");
            if (i < allIds.size() - 1) sb.append(", ");
        }
        sb.append(")");
        return sb.toString();
    }
}
