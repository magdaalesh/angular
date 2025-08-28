package AST.Nodes;

public class SpareteddNode extends ContenttNode {
    private String expression;

    public SpareteddNode(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "SpareteddNode{" +
                "expression='" + expression + '\'' +
                '}';
    }
}
