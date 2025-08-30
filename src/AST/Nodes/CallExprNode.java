package AST.Nodes;

import java.util.*;

public class CallExprNode extends Expr {
    private String functionName;
    private List<Expr> arguments;

    public CallExprNode(String functionName, List<Expr> arguments) {
        this.functionName = functionName;
        this.arguments = arguments != null ? arguments : List.of();
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


    @Override
    public String codegenerateInternal() {

        if (functionName.contains("navigate")) {
            String page = "";
            String param = null;

            if (!arguments.isEmpty()) {
                // أول argument يعتبر اسم الصفحة
                page = arguments.get(0).codegenerate().replaceAll("[\\[\\]'\" ]", "");


                if (arguments.size() > 1) {
                    param = arguments.get(1).codegenerate();
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append("window.location.href = \"/").append(page).append(".html\"");
            if (param != null && !param.isEmpty()) {
                sb.append(" + \"?id=\" + encodeURIComponent(").append(param).append(")");
            }

            return sb.toString();
        }

        StringBuilder sb = new StringBuilder();
        sb.append(functionName).append("(");

        for (int i = 0; i < arguments.size(); i++) {
            sb.append(arguments.get(i).codegenerate());
            if (i < arguments.size() - 1) sb.append(", ");
        }

        sb.append(")");
        return sb.toString();
    }
}
