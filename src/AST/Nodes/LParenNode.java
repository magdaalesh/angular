package AST.Nodes;

import java.util.ArrayList;
import java.util.List;

public class LParenNode extends Value {
    private String name;
    private List<Object> parameters;

    public LParenNode(String name, List<Object> parameters) {
        this.name = name;
        this.parameters = parameters != null ? parameters : new ArrayList<>();
    }

    public String getName() { return name; }
    public List<Object> getParameters() { return parameters; }

    @Override
    public String toString() {
        return "LParenNode{" +
                "name='" + name + '\'' +
                ", parameters=" + parameters +
                '}';
    }

    @Override
    public Expr asExpr() {
        List<Expr> args = new ArrayList<>();
        args.add(new ValueExpr(null, new IdValue(List.of(getName()))));

        for (Object param : parameters) {
            if (param instanceof Node) {
                args.add(((Node) param).asExpr());
            } else if (param instanceof String) {
                args.add(new ValueExpr(null, new IdValue(List.of((String) param))));
            }
        }

        return new CallExprNode(name, args);
    }

    @Override
    protected String codegenerateInternal() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("(");
        for (int i = 0; i < parameters.size(); i++) {
            sb.append("\"").append(parameters.get(i).toString()).append("\"");
            if (i < parameters.size() - 1) sb.append(", ");
        }
        sb.append(")");
        return sb.toString();
    }
}
