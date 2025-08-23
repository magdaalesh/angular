package AST.Nodes;

import java.util.ArrayList;
import java.util.List;
import AST.Nodes.Expr;
import AST.Nodes.CallExprNode;
import AST.Nodes.ValueExpr;
import AST.Nodes.IdValue;
import java.util.ArrayList;
import java.util.List;


public class LParenNode extends Value {
    private String name;
    private List<Object> parameters;

    public LParenNode(String name, List<Object> parameters) {
        this.name = name;
        this.parameters = parameters;
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

        for (Object param : getParameters()) {
            if (param instanceof Node) {
                args.add(((Node) param).asExpr());
            } else if (param instanceof String) {
                args.add(new ValueExpr(null, new IdValue(List.of((String) param))));
            }
        }

        return new CallExprNode(getName(), args);
    }






}
