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

    @Override
    public String codegeneratre() {
        // ✅ special case for navigate
        if (functionName.equals("this.router.navigate")) {
            String page = "";
            String param = null;

            if (!pathIds.isEmpty()) {

                page = pathIds.get(0).replaceAll("[\\[\\]'\" ]", "");
            }

            if (!extraIds.isEmpty()) {

                param = extraIds.get(0);
            }

            StringBuilder sb = new StringBuilder();
            sb.append("window.location.href = \"/").append(page).append(".html\"");
            if (param != null && !param.isEmpty()) {
                sb.append(" + \"?id=\" + encodeURIComponent(").append(param).append(")");
            }

            return sb.toString();
        }

        // ✅ default case لأي دالة عادية
        StringBuilder sb = new StringBuilder();
        sb.append(functionName).append("(");

        List<String> allIds = new ArrayList<>();
        allIds.addAll(pathIds);
        allIds.addAll(extraIds);

        for (int i = 0; i < allIds.size(); i++) {
            sb.append(allIds.get(i));
            if (i < allIds.size() - 1) sb.append(", ");
        }
        sb.append(");");
        return sb.toString();
    }
}
