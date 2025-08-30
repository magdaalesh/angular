package AST.Nodes;

import java.util.List;
import java.util.Objects;

public final class CallExprNode extends Expr {
    private final String functionName;
    private final List<Expr> arguments;

    public CallExprNode(String functionName, List<Expr> arguments) {
        this.functionName = Objects.requireNonNull(functionName, "functionName");
        this.arguments    = arguments;
    }

    public String getFunctionName() { return functionName; }
    public List<Expr> getArguments() { return arguments; }

    @Override
    public String toString() {
        return "CallExprNode{functionName='" + functionName + "', arguments=" + arguments + '}';
    }

    @Override
    public String codegenerae() {
        if (functionName.endsWith(".navigate")) return generateNavigateCall();
        StringBuilder sb = new StringBuilder();
        sb.append(functionName).append("(");
        if (arguments != null && !arguments.isEmpty()) {
            for (int i = 0; i < arguments.size(); i++) {
                String a = arguments.get(i) == null ? "" : arguments.get(i).codegenerate();
                if (a == null) a = "";
                sb.append(a.trim());
                if (i < arguments.size() - 1) sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }


    private String generateNavigateCall() {
        if (arguments == null || arguments.isEmpty()) {
            return functionName + "([])";
        }
        String first = safe(arguments.get(0));
        if (first.startsWith("[") && first.endsWith("]")) {
            return normalCall();
        }
        String route = stripQuotes(first);
        if (!route.startsWith("/")) route = "/" + route;

        String routeArray;
        if (arguments.size() >= 2) {
            String second = safe(arguments.get(1));
            routeArray = "['" + route + "', " + second + "]";
        } else {
            routeArray = "['" + route + "']";
        }
        return functionName + "(" + routeArray + ")";
    }


    private String normalCall() {
        StringBuilder sb = new StringBuilder();
        sb.append(functionName).append("(");
        for (int i = 0; i < arguments.size(); i++) {
            sb.append(safe(arguments.get(i)));
            if (i < arguments.size() - 1) sb.append(", ");
        }
        sb.append(")");
        return sb.toString();
    }

    private static String safe(Expr e) {
        if (e == null) return "";
        String s = e.codegenerate();
        return s == null ? "" : s.trim();
    }

    private static String stripQuotes(String s) {
        if (s == null) return "";
        String t = s.trim();
        if ((t.startsWith("\"") && t.endsWith("\"")) || (t.startsWith("'") && t.endsWith("'"))) {
            return t.substring(1, t.length() - 1);
        }
        return t;
    }

    @Override
    protected String codegenerateInternal() {
        return "";
    }
}
